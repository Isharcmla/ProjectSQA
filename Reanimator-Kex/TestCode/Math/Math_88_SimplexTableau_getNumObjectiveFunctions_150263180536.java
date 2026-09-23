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

public class SimplexTableau_getNumObjectiveFunctions_150263180536 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3393;
     Object term32267;

    public SimplexTableau_getNumObjectiveFunctions_150263180536() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term32276 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term32275 = ((Class) term32276).getDeclaredField((String) "EQ");
        ((Field) term32275).setAccessible(true);
        Object enum80 = ((Field) term32275).get((Object) null);
        Object term3398 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term3398, term3398.getClass(), "coefficients", null);
        setField(term3398, term3398.getClass(), "relationship", enum80);
        setDoubleField(term3398, term3398.getClass(), "value", 0.2852810965221698);
        Object term3402 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term3402, term3402.getClass(), "coefficients", null);
        setField(term3402, term3402.getClass(), "relationship", enum80);
        setDoubleField(term3402, term3402.getClass(), "value", 0.6300849762307866);
        Class<? extends Object> term32569 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term32568 = ((Class) term32569).getDeclaredField((String) "LEQ");
        ((Field) term32568).setAccessible(true);
        Object enum81 = ((Field) term32568).get((Object) null);
        Object term3404 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term3404, term3404.getClass(), "coefficients", null);
        setField(term3404, term3404.getClass(), "relationship", enum81);
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
        Class<? extends Object> term32869 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term32868 = ((Class) term32869).getDeclaredField((String) "GEQ");
        ((Field) term32868).setAccessible(true);
        Object enum82 = ((Field) term32868).get((Object) null);
        Object term32271 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term32271, term32271.getClass(), "coefficients", null);
        setField(term32271, term32271.getClass(), "relationship", enum82);
        setDoubleField(term32271, term32271.getClass(), "value", 0.2852810965221698);
        Object term32273 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term32273, term32273.getClass(), "coefficients", null);
        setField(term32273, term32273.getClass(), "relationship", enum82);
        setDoubleField(term32273, term32273.getClass(), "value", 0.6300849762307866);
        Object term32274 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term32274, term32274.getClass(), "coefficients", null);
        setField(term32274, term32274.getClass(), "relationship", enum82);
        setDoubleField(term32274, term32274.getClass(), "value", 0.9737083944266686);
        ArrayList term32269 = new ArrayList();
        ((ArrayList) term32269).add(term32271);
        ((ArrayList) term32269).add(term32273);
        ((ArrayList) term32269).add(term32274);
        term32267 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term32268 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearObjectiveFunction"));
        setField(term32268, term32268.getClass(), "coefficients", null);
        setDoubleField(term32268, term32268.getClass(), "constantTerm", 0.6805867182029153);
        setField(term32267, term32267.getClass(), "f", term32268);
        setField(term32267, term32267.getClass(), "constraints", term32269);
        setBooleanField(term32267, term32267.getClass(), "restrictToNonNegative", true);
        setField(term32267, term32267.getClass(), "tableau", null);
        setIntField(term32267, term32267.getClass(), "numDecisionVariables", -1339778481);
        setIntField(term32267, term32267.getClass(), "numSlackVariables", 1725571209);
        setIntField(term32267, term32267.getClass(), "numArtificialVariables", -522618178);
        setDoubleField(term32267, term32267.getClass(), "epsilon", 0.0668892744806211);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getNumObjectiveFunctions", argTypes, term3393, args);
        assertTrue(recursiveEquals(term3393, term32267));
        assertTrue(recursiveEquals(retValue, 1));
    }

};


