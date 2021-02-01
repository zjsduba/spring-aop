package com.example.springaop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @Author: lsp
 * @Date: 2020/12/11 15:49
 * @Version 1.0
 * @Description:
 */
@Aspect
@EnableAspectJAutoProxy
public class LogAspect {

    //抽取公共的切入点表达式
    //1.本来引用：pointcut()
    //2.其他类引用：com.example.springaop.LogAspect.pointcut()
    @Pointcut("execution(public int com.example.springaop.Math.*(..))")
    public void pointcut() {
    }

    ;

    //@Before在目标方法之前切入，切入点表达式
    /*@Before("pointcut()")
    public void logStart(JoinPoint joinPoint){
        System.out.println(joinPoint.getSignature().getName()+"加法运行...参数列表是{"+joinPoint.getArgs()+"}");
    }
    @After("pointcut()")
    public void logEnd(JoinPoint joinPoint){
        System.out.println(joinPoint.getSignature().getName()+"加法结束...");
    }

    @AfterReturning(value = "pointcut()",returning = "result")
    public void logReturn(JoinPoint joinPoint,Object result){
        System.out.println("加法正常返回...运行结果是{"+result+"}");
    }

    @AfterThrowing(value = "pointcut()",throwing = "exception")
    public void logException(Exception exception){
        System.out.println("加法异常...异常信息是{"+exception+"}");
    }*/

    @Around(value = "pointcut()")
    public Object logAround(ProceedingJoinPoint joinPoint) {
        System.out.println(joinPoint.getSignature().getName() + "加法运行...参数列表是{" + joinPoint.getArgs() + "}");
        Object target = joinPoint.getTarget();
        Integer result = 5;
        try {
            //result = joinPoint.proceed();
            System.out.println("加法正常返回...运行结果是{" + result + "}");
        } catch (Throwable throwable) {
            System.out.println("加法异常...异常信息是{" + throwable + "}");
        } finally {
            System.out.println(joinPoint.getSignature().getName() + "加法结束...");
        }
        return result;
    }

}
