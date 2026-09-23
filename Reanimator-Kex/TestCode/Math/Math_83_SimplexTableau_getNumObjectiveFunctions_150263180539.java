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
import static org.apache.commons.math.optimization.linear.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.math.optimization.linear.EqualityUtils.*;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.String;

public class SimplexTableau_getNumObjectiveFunctions_150263180539 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3393;
     Object term35713;

    public SimplexTableau_getNumObjectiveFunctions_150263180539() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term35722 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term35721 = ((Class) term35722).getDeclaredField((String) "GEQ");
        ((Field) term35721).setAccessible(true);
        Object enum87 = ((Field) term35721).get((Object) null);
        Object term3398 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term3398, term3398.getClass(), "coefficients", null);
        setField(term3398, term3398.getClass(), "relationship", enum87);
        setDoubleField(term3398, term3398.getClass(), "value", 0.2852810965221698);
        Object term3402 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term3402, term3402.getClass(), "coefficients", null);
        setField(term3402, term3402.getClass(), "relationship", enum87);
        setDoubleField(term3402, term3402.getClass(), "value", 0.6300849762307866);
        Class<? extends Object> term36032 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term36031 = ((Class) term36032).getDeclaredField((String) "EQ");
        ((Field) term36031).setAccessible(true);
        Object enum88 = ((Field) term36031).get((Object) null);
        Object term3404 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term3404, term3404.getClass(), "coefficients", null);
        setField(term3404, term3404.getClass(), "relationship", enum88);
        setDoubleField(term3404, term3404.getClass(), "value", 0.9737083944266686);
        ArrayList term3396 = new ArrayList();
        ((ArrayList) term3396).add(term3398);
        ((ArrayList) term3396).add(term3402);
        ((ArrayList) term3396).add(term3404);
        term3393 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term3394 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearObjectiveFunction"));
        setField(term3394, term3394.getClass(), "coefficients", null);
        setDoubleField(term3394, term3394.getClass(), "constantTerm", 0.6805867182029153);
        setField(term3393, term3393.getClass(), "f", term3394);
        setField(term3393, term3393.getClass(), "constraints", term3396);
        setBooleanField(term3393, term3393.getClass(), "restrictToNonNegative", true);
        setField(term3393, term3393.getClass(), "tableau", null);
        setIntField(term3393, term3393.getClass(), "numDecisionVariables", -1339778481);
        setIntField(term3393, term3393.getClass(), "numSlackVariables", 1725571209);
        setIntField(term3393, term3393.getClass(), "numArtificialVariables", -522618178);
        setDoubleField(term3393, term3393.getClass(), "epsilon", 0.0668892744806211);
        Class<? extends Object> term36334 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term36333 = ((Class) term36334).getDeclaredField((String) "EQ");
        ((Field) term36333).setAccessible(true);
        Object enum89 = ((Field) term36333).get((Object) null);
        Object term35717 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term35717, term35717.getClass(), "coefficients", null);
        setField(term35717, term35717.getClass(), "relationship", enum89);
        setDoubleField(term35717, term35717.getClass(), "value", 0.2852810965221698);
        Object term35719 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term35719, term35719.getClass(), "coefficients", null);
        setField(term35719, term35719.getClass(), "relationship", enum89);
        setDoubleField(term35719, term35719.getClass(), "value", 0.6300849762307866);
        Object term35720 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term35720, term35720.getClass(), "coefficients", null);
        setField(term35720, term35720.getClass(), "relationship", enum89);
        setDoubleField(term35720, term35720.getClass(), "value", 0.9737083944266686);
        ArrayList term35715 = new ArrayList();
        ((ArrayList) term35715).add(term35717);
        ((ArrayList) term35715).add(term35719);
        ((ArrayList) term35715).add(term35720);
        term35713 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term35714 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearObjectiveFunction"));
        setField(term35714, term35714.getClass(), "coefficients", null);
        setDoubleField(term35714, term35714.getClass(), "constantTerm", 0.6805867182029153);
        setField(term35713, term35713.getClass(), "f", term35714);
        setField(term35713, term35713.getClass(), "constraints", term35715);
        setBooleanField(term35713, term35713.getClass(), "restrictToNonNegative", true);
        setField(term35713, term35713.getClass(), "tableau", null);
        setIntField(term35713, term35713.getClass(), "numDecisionVariables", -1339778481);
        setIntField(term35713, term35713.getClass(), "numSlackVariables", 1725571209);
        setIntField(term35713, term35713.getClass(), "numArtificialVariables", -522618178);
        setDoubleField(term35713, term35713.getClass(), "epsilon", 0.0668892744806211);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getNumObjectiveFunctions", argTypes, term3393, args);
        assertTrue(recursiveEquals(term3393, term35713));
        assertTrue(recursiveEquals(retValue, 1));
    }

};


