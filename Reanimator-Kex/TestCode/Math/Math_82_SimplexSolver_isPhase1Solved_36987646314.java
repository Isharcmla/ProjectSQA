package org.apache.commons.math.optimization.linear;

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
import java.lang.NullPointerException;
import static org.apache.commons.math.optimization.linear.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.String;

public class SimplexSolver_isPhase1Solved_36987646314 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3351;
     Object term3390;

    public SimplexSolver_isPhase1Solved_36987646314() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term12786 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term12785 = ((Class) term12786).getDeclaredField((String) "LEQ");
        ((Field) term12785).setAccessible(true);
        Object enum38 = ((Field) term12785).get((Object) null);
        Object term3359 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term3359, term3359.getClass(), "coefficients", null);
        setField(term3359, term3359.getClass(), "relationship", enum38);
        setDoubleField(term3359, term3359.getClass(), "value", 0.6805867182029153);
        Object term3363 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term3363, term3363.getClass(), "coefficients", null);
        setField(term3363, term3363.getClass(), "relationship", enum38);
        setDoubleField(term3363, term3363.getClass(), "value", 0.2852810965221698);
        Class<? extends Object> term13082 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term13081 = ((Class) term13082).getDeclaredField((String) "EQ");
        ((Field) term13081).setAccessible(true);
        Object enum39 = ((Field) term13081).get((Object) null);
        Object term3365 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term3365, term3365.getClass(), "coefficients", null);
        setField(term3365, term3365.getClass(), "relationship", enum39);
        setDoubleField(term3365, term3365.getClass(), "value", 0.6300849762307866);
        Object term3369 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term3369, term3369.getClass(), "coefficients", null);
        setField(term3369, term3369.getClass(), "relationship", enum39);
        setDoubleField(term3369, term3369.getClass(), "value", 0.9737083944266686);
        Object term3371 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term3371, term3371.getClass(), "coefficients", null);
        setField(term3371, term3371.getClass(), "relationship", enum38);
        setDoubleField(term3371, term3371.getClass(), "value", 0.0668892744806211);
        Object term3373 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term3373, term3373.getClass(), "coefficients", null);
        setField(term3373, term3373.getClass(), "relationship", enum38);
        setDoubleField(term3373, term3373.getClass(), "value", 0.3587267442738795);
        ArrayList term3357 = new ArrayList();
        ((ArrayList) term3357).add(term3359);
        ((ArrayList) term3357).add(term3363);
        ((ArrayList) term3357).add(term3365);
        ((ArrayList) term3357).add(term3369);
        ((ArrayList) term3357).add(term3371);
        ((ArrayList) term3357).add(term3373);
        Class<? extends Object> term13375 = Class.forName((String) "org.apache.commons.math.optimization.GoalType");
        Field term13374 = ((Class) term13375).getDeclaredField((String) "MAXIMIZE");
        ((Field) term13374).setAccessible(true);
        Object enum40 = ((Field) term13374).get((Object) null);
        term3351 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexSolver"));
        Object term3355 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearObjectiveFunction"));
        setDoubleField(term3351, term3351.getClass(), "epsilon", 1.0E-6);
        setIntField(term3351, term3351.getClass(), "maxIterations", 100);
        setIntField(term3351, term3351.getClass(), "iterations", 1725571209);
        setField(term3355, term3355.getClass(), "coefficients", null);
        setDoubleField(term3355, term3355.getClass(), "constantTerm", 0.37161417339133307);
        setField(term3351, term3351.getClass(), "f", term3355);
        setField(term3351, term3351.getClass(), "constraints", term3357);
        setField(term3351, term3351.getClass(), "goalType", enum40);
        setBooleanField(term3351, term3351.getClass(), "restrictToNonNegative", true);
        Object term3395 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term3395, term3395.getClass(), "coefficients", null);
        setField(term3395, term3395.getClass(), "relationship", enum38);
        setDoubleField(term3395, term3395.getClass(), "value", 0.5279279537140873);
        Object term3397 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term3397, term3397.getClass(), "coefficients", null);
        setField(term3397, term3397.getClass(), "relationship", enum39);
        setDoubleField(term3397, term3397.getClass(), "value", 0.3202192021706908);
        Class<? extends Object> term13631 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term13630 = ((Class) term13631).getDeclaredField((String) "EQ");
        ((Field) term13630).setAccessible(true);
        Object enum41 = ((Field) term13630).get((Object) null);
        Object term3399 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term3399, term3399.getClass(), "coefficients", null);
        setField(term3399, term3399.getClass(), "relationship", enum41);
        setDoubleField(term3399, term3399.getClass(), "value", 0.22651340641904605);
        Object term3403 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term3403, term3403.getClass(), "coefficients", null);
        setField(term3403, term3403.getClass(), "relationship", enum41);
        setDoubleField(term3403, term3403.getClass(), "value", 0.8878841294187743);
        Object term3405 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term3405, term3405.getClass(), "coefficients", null);
        setField(term3405, term3405.getClass(), "relationship", enum39);
        setDoubleField(term3405, term3405.getClass(), "value", 0.6588948704887806);
        ArrayList term3393 = new ArrayList();
        ((ArrayList) term3393).add(term3395);
        ((ArrayList) term3393).add(term3397);
        ((ArrayList) term3393).add(term3399);
        ((ArrayList) term3393).add(term3403);
        ((ArrayList) term3393).add(term3405);
        term3390 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term3391 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearObjectiveFunction"));
        setField(term3391, term3391.getClass(), "coefficients", null);
        setDoubleField(term3391, term3391.getClass(), "constantTerm", 0.07802449704920456);
        setField(term3390, term3390.getClass(), "f", term3391);
        setField(term3390, term3390.getClass(), "constraints", term3393);
        setBooleanField(term3390, term3390.getClass(), "restrictToNonNegative", true);
        setField(term3390, term3390.getClass(), "tableau", null);
        setIntField(term3390, term3390.getClass(), "numDecisionVariables", -522618178);
        setIntField(term3390, term3390.getClass(), "numSlackVariables", 1134449235);
        setIntField(term3390, term3390.getClass(), "numArtificialVariables", -883034806);
        setDoubleField(term3390, term3390.getClass(), "epsilon", 0.6397214730945112);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.linear.SimplexSolver");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Object[] args = new Object[1];
        args[0] = term3390;
        try {
            callMethod(klass, "isPhase1Solved", argTypes, term3351, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


