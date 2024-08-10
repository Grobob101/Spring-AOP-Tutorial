# Spring-AOP-Tutorial
​
## 定义切面：
``` @Aspect
@Component
public class MyService {
    @Pointcut("execution(void com.aop.demo.service.Target.helloAround())")
    public void helloAround() {}

    @Before("execution(void com.aop.demo.service.Target.helloBefore())")
    public void before() {
        System.out.println("MyService叠加Buffer");
        System.out.println("MyService叠加Buffer");
        System.out.println("MyService叠加Buffer");
        System.out.println("MyService叠加Buffer");
    }

    @After("execution(void com.aop.demo.service.Target.helloAfter())")
    public void after() {
        System.out.println("MyService叠加Buffer");
        System.out.println("MyService叠加Buffer");
        System.out.println("MyService叠加Buffer");
        System.out.println("MyService叠加Buffer");
    }
    @Around("helloAround()")
    public void doSomething(ProceedingJoinPoint pjp) throws Throwable {

        System.out.println("MyService叠加Buffer");
        System.out.println("MyService叠加Buffer");
        pjp.proceed();
        System.out.println("MyService叠加Buffer");
        System.out.println("MyService叠加Buffer");
    }
}
```
## 通知方式：
通知用于控制通知类的通知方法作用于切点也就是待增强方法的执行位置，具体含义如下：

定义：在方法调用之前执行。
用途：通常用于执行一些初始化工作，比如打开资源、设置事务等。
示例注解：@Before。

定义：无论方法是否成功执行，都会在方法调用之后执行。
用途：通常用于释放资源、关闭连接等。
示例注解：@After。

定义：仅在方法成功执行并返回结果之后执行。
用途：通常用于记录返回值或清理工作。
示例注解：@AfterReturning。

定义：仅在方法抛出异常后执行。
用途：通常用于记录异常或进行异常处理。
示例注解：@AfterThrowing。

定义：在方法调用前后都可以执行，甚至可以完全替代方法的执行。
用途：通常用于实现性能监控、事务控制等。
示例注解：@Around。
## 切点表达式：
切点表达式是描述切点的一种方式，它允许我们精确地指定哪些连接点应该被一个切面所影响。Spring AOP 使用 AspectJ 的切点表达式语法，这种语法非常灵活，能够让我们根据多种条件来选择连接点。

用法： 
execution()：匹配特定签名的方法调用 
execution(* com.example.service.*.*(..))

这个切点表达式会匹配 com.example.service 包下所有类的所有方法。

this()：匹配代理对象自身。
this(com.example.service.MyService)

这个切点表达式会匹配当代理对象是 MyService 实例时的方法调用。

target()：匹配目标对象。
target(com.example.service.MyService)

这个切点表达式会匹配当目标对象是 MyService 实例时的方法调用。

args()：匹配参数。
args(java.lang.String, ..)

这个切点表达式会匹配至少包含一个 String 类型参数的方法调用。

​
