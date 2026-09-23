package org.apache.commons.math3.optimization.linear;

import java.lang.Throwable;
import java.lang.IllegalStateException;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import org.apache.commons.math3.exception.MaxCountExceededException;
import static org.apache.commons.math3.optimization.linear.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.String;

public class SimplexSolver_doIteration_43098773011 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2577;
     Object term2605;

    public SimplexSolver_doIteration_43098773011() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term9428 = Class.forName((String) "org.apache.commons.math3.optimization.linear.Relationship");
        Field term9427 = ((Class) term9428).getDeclaredField((String) "LEQ");
        ((Field) term9427).setAccessible(true);
        Object enum23 = ((Field) term9427).get((Object) null);
        Object term2584 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.LinearConstraint"));
        setField(term2584, term2584.getClass(), "coefficients", null);
        setField(term2584, term2584.getClass(), "relationship", enum23);
        setDoubleField(term2584, term2584.getClass(), "value", 0.7633268466829064);
        ArrayList term2582 = new ArrayList();
        ((ArrayList) term2582).add(term2584);
        Class<? extends Object> term9729 = Class.forName((String) "org.apache.commons.math3.optimization.GoalType");
        Field term9728 = ((Class) term9729).getDeclaredField((String) "MAXIMIZE");
        ((Field) term9728).setAccessible(true);
        Object enum24 = ((Field) term9728).get((Object) null);
        term2577 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.SimplexSolver"));
        Object term2580 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.LinearObjectiveFunction"));
        setDoubleField(term2577, term2577.getClass(), "epsilon", 1.0E-6);
        setIntField(term2577, term2577.getClass(), "maxUlps", 10);
        setField(term2580, term2580.getClass(), "coefficients", null);
        setDoubleField(term2580, term2580.getClass(), "constantTerm", 0.43692187681405226);
        setField(term2577, term2577.getClass(), "function", term2580);
        setField(term2577, term2577.getClass(), "linearConstraints", term2582);
        setField(term2577, term2577.getClass(), "goal", enum24);
        setBooleanField(term2577, term2577.getClass(), "nonNegative", true);
        setIntField(term2577, term2577.getClass(), "maxIterations", 100);
        setIntField(term2577, term2577.getClass(), "iterations", 1227103734);
        Class<? extends Object> term9990 = Class.forName((String) "org.apache.commons.math3.optimization.linear.Relationship");
        Field term9989 = ((Class) term9990).getDeclaredField((String) "GEQ");
        ((Field) term9989).setAccessible(true);
        Object enum25 = ((Field) term9989).get((Object) null);
        Object term2610 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.LinearConstraint"));
        setField(term2610, term2610.getClass(), "coefficients", null);
        setField(term2610, term2610.getClass(), "relationship", enum25);
        setDoubleField(term2610, term2610.getClass(), "value", 0.3800088629986428);
        Object term2614 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.LinearConstraint"));
        setField(term2614, term2614.getClass(), "coefficients", null);
        setField(term2614, term2614.getClass(), "relationship", enum25);
        setDoubleField(term2614, term2614.getClass(), "value", 0.5840714198152577);
        Object term2616 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.LinearConstraint"));
        setField(term2616, term2616.getClass(), "coefficients", null);
        setField(term2616, term2616.getClass(), "relationship", enum23);
        setDoubleField(term2616, term2616.getClass(), "value", 0.7559240768573477);
        Object term2618 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.LinearConstraint"));
        setField(term2618, term2618.getClass(), "coefficients", null);
        setField(term2618, term2618.getClass(), "relationship", enum23);
        setDoubleField(term2618, term2618.getClass(), "value", 0.10667076642995188);
        Object term2620 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.LinearConstraint"));
        setField(term2620, term2620.getClass(), "coefficients", null);
        setField(term2620, term2620.getClass(), "relationship", enum25);
        setDoubleField(term2620, term2620.getClass(), "value", 0.11493000848982304);
        Object term2622 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.LinearConstraint"));
        setField(term2622, term2622.getClass(), "coefficients", null);
        setField(term2622, term2622.getClass(), "relationship", enum25);
        setDoubleField(term2622, term2622.getClass(), "value", 0.37161417339133307);
        ArrayList term2608 = new ArrayList();
        ((ArrayList) term2608).add(term2610);
        ((ArrayList) term2608).add(term2614);
        ((ArrayList) term2608).add(term2616);
        ((ArrayList) term2608).add(term2618);
        ((ArrayList) term2608).add(term2620);
        ((ArrayList) term2608).add(term2622);
        ArrayList term2627 = new ArrayList();
        ((ArrayList) term2627).add("xxtlPwDYFs");
        ((ArrayList) term2627).add("jJCZpVmanW");
        ((ArrayList) term2627).add("EGtDIRbSSb");
        ((ArrayList) term2627).add("SzjVpOQTyS");
        ((ArrayList) term2627).add("MjGYSRKTNF");
        term2605 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.SimplexTableau"));
        Object term2606 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.LinearObjectiveFunction"));
        setField(term2606, term2606.getClass(), "coefficients", null);
        setDoubleField(term2606, term2606.getClass(), "constantTerm", 0.13481025392611334);
        setField(term2605, term2605.getClass(), "f", term2606);
        setField(term2605, term2605.getClass(), "constraints", term2608);
        setBooleanField(term2605, term2605.getClass(), "restrictToNonNegative", true);
        setField(term2605, term2605.getClass(), "columnLabels", term2627);
        setField(term2605, term2605.getClass(), "tableau", null);
        setIntField(term2605, term2605.getClass(), "numDecisionVariables", -1339778481);
        setIntField(term2605, term2605.getClass(), "numSlackVariables", 1725571209);
        setIntField(term2605, term2605.getClass(), "numArtificialVariables", -522618178);
        setDoubleField(term2605, term2605.getClass(), "epsilon", 0.6805867182029153);
        setIntField(term2605, term2605.getClass(), "maxUlps", 1134449235);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optimization.linear.SimplexSolver");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math3.optimization.linear.SimplexTableau");
        Object[] args = new Object[1];
        args[0] = term2605;
        try {
            callMethod(klass, "doIteration", argTypes, term2577, args);
            assertTrue(false);
        }
        catch (MaxCountExceededException e) {
        }

    }

};


