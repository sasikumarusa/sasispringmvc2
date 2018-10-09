package com.hexa.employee.logger;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class EmpLogger2 {
	private static Log log = LogFactory.getLog(EmpLogger2.class);


	@Before("execution(* com.hexa..*Service.*(..))")
	public void beforeMethodCallLogger(JoinPoint.StaticPart tjpsp) {
		log.info("@Before method execution log called");
	
	}

	@After("execution(* com.hexa..*Service.*(..))")
	public void afterMethodCallLogger() {
		log.info("@After method execution log called");
	}

	@AfterReturning(pointcut = "execution(* com.hexa..*(..))", returning = "retVal")
	public void afterReturningMethodCallLogger(JoinPoint joinPoint, Object retVal)
			throws Throwable {
		log.info("@AfterReturning method execution log called " + joinPoint.getSignature().getName() +" return value:"+retVal);		
	}

	@AfterThrowing(pointcut = "execution(* com.hexa..*Service.*(..)))", throwing = "ex")
	public void afterThrowingMethodCallLogger(JoinPoint joinPoint, Throwable ex)
			throws Throwable {
		log.info("@AfterThrowing method execution log called --> Exception : " + ex);
	}

	@Around("execution(* com.hexa..*Service.*(..))")
	public Object aroundMethodCallLogger(ProceedingJoinPoint pjp) throws Throwable {
		long t1 = System.currentTimeMillis();
		Object retVal = pjp.proceed();
		log.info("@Around  method execution log called -->"+pjp.getStaticPart().getSignature().getName() + " Took :"+ (System.currentTimeMillis() - t1) + "secs");
		return retVal;
	}
	
	@Pointcut("within(com.hexa.employee.dao.*)")
	public void allMethodsPointcut(){}
	/*<aop:config>
	<aop:pointcut id="fooServiceOperation"
		expression="execution(* com.hexa.employee.service..*(..))" />
	<aop:advisor advice-ref="txAdvice"
		pointcut-ref="fooServiceOperation" />
</aop:config> */
}
