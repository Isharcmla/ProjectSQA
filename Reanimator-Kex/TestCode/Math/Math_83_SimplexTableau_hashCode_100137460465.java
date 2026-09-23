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

public class SimplexTableau_hashCode_100137460465 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17560;

    public SimplexTableau_hashCode_100137460465() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term59153 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term59152 = ((Class) term59153).getDeclaredField((String) "EQ");
        ((Field) term59152).setAccessible(true);
        Object enum150 = ((Field) term59152).get((Object) null);
        Object term17565 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term17565, term17565.getClass(), "coefficients", null);
        setField(term17565, term17565.getClass(), "relationship", enum150);
        setDoubleField(term17565, term17565.getClass(), "value", 0.6896952303224777);
        Object term17569 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term17569, term17569.getClass(), "coefficients", null);
        setField(term17569, term17569.getClass(), "relationship", enum150);
        setDoubleField(term17569, term17569.getClass(), "value", 0.6693176553622628);
        Class<? extends Object> term59446 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term59445 = ((Class) term59446).getDeclaredField((String) "GEQ");
        ((Field) term59445).setAccessible(true);
        Object enum151 = ((Field) term59445).get((Object) null);
        Object term17571 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term17571, term17571.getClass(), "coefficients", null);
        setField(term17571, term17571.getClass(), "relationship", enum151);
        setDoubleField(term17571, term17571.getClass(), "value", 0.2962868255626906);
        Object term17575 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term17575, term17575.getClass(), "coefficients", null);
        setField(term17575, term17575.getClass(), "relationship", enum151);
        setDoubleField(term17575, term17575.getClass(), "value", 0.25474180574060834);
        Object term17577 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term17577, term17577.getClass(), "coefficients", null);
        setField(term17577, term17577.getClass(), "relationship", enum151);
        setDoubleField(term17577, term17577.getClass(), "value", 0.9957585718901875);
        Object term17579 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term17579, term17579.getClass(), "coefficients", null);
        setField(term17579, term17579.getClass(), "relationship", enum150);
        setDoubleField(term17579, term17579.getClass(), "value", 0.16755811343784477);
        Object term17581 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term17581, term17581.getClass(), "coefficients", null);
        setField(term17581, term17581.getClass(), "relationship", enum150);
        setDoubleField(term17581, term17581.getClass(), "value", 0.9090793968999221);
        ArrayList term17563 = new ArrayList();
        ((ArrayList) term17563).add(term17565);
        ((ArrayList) term17563).add(term17569);
        ((ArrayList) term17563).add(term17571);
        ((ArrayList) term17563).add(term17575);
        ((ArrayList) term17563).add(term17577);
        ((ArrayList) term17563).add(term17579);
        ((ArrayList) term17563).add(term17581);
        term17560 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term17561 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearObjectiveFunction"));
        setField(term17561, term17561.getClass(), "coefficients", null);
        setDoubleField(term17561, term17561.getClass(), "constantTerm", 0.7046974927834232);
        setField(term17560, term17560.getClass(), "f", term17561);
        setField(term17560, term17560.getClass(), "constraints", term17563);
        setBooleanField(term17560, term17560.getClass(), "restrictToNonNegative", true);
        setField(term17560, term17560.getClass(), "tableau", null);
        setIntField(term17560, term17560.getClass(), "numDecisionVariables", -556405712);
        setIntField(term17560, term17560.getClass(), "numSlackVariables", -1772434990);
        setIntField(term17560, term17560.getClass(), "numArtificialVariables", -1845499264);
        setDoubleField(term17560, term17560.getClass(), "epsilon", 0.25997329921466494);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "hashCode", argTypes, term17560, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


