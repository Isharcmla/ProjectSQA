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
import java.lang.Integer;
import java.lang.Double;

public class SimplexTableau_setEntry_26356261849 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9603;
     Object term9629;
     Object term9631;
     Object term9633;

    public SimplexTableau_setEntry_26356261849() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term44733 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term44732 = ((Class) term44733).getDeclaredField((String) "GEQ");
        ((Field) term44732).setAccessible(true);
        Object enum112 = ((Field) term44732).get((Object) null);
        Object term9608 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term9608, term9608.getClass(), "coefficients", null);
        setField(term9608, term9608.getClass(), "relationship", enum112);
        setDoubleField(term9608, term9608.getClass(), "value", 0.7865909711092062);
        Class<? extends Object> term45029 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term45028 = ((Class) term45029).getDeclaredField((String) "EQ");
        ((Field) term45028).setAccessible(true);
        Object enum113 = ((Field) term45028).get((Object) null);
        Object term9612 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term9612, term9612.getClass(), "coefficients", null);
        setField(term9612, term9612.getClass(), "relationship", enum113);
        setDoubleField(term9612, term9612.getClass(), "value", 0.06587158449170749);
        Object term9616 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term9616, term9616.getClass(), "coefficients", null);
        setField(term9616, term9616.getClass(), "relationship", enum112);
        setDoubleField(term9616, term9616.getClass(), "value", 0.0865998004187658);
        Object term9618 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term9618, term9618.getClass(), "coefficients", null);
        setField(term9618, term9618.getClass(), "relationship", enum113);
        setDoubleField(term9618, term9618.getClass(), "value", 0.9628647861255637);
        Object term9620 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term9620, term9620.getClass(), "coefficients", null);
        setField(term9620, term9620.getClass(), "relationship", enum112);
        setDoubleField(term9620, term9620.getClass(), "value", 0.623231822150205);
        ArrayList term9606 = new ArrayList();
        ((ArrayList) term9606).add(term9608);
        ((ArrayList) term9606).add(term9612);
        ((ArrayList) term9606).add(term9616);
        ((ArrayList) term9606).add(term9618);
        ((ArrayList) term9606).add(term9620);
        term9603 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term9604 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearObjectiveFunction"));
        setField(term9604, term9604.getClass(), "coefficients", null);
        setDoubleField(term9604, term9604.getClass(), "constantTerm", 0.39446728256884744);
        setField(term9603, term9603.getClass(), "f", term9604);
        setField(term9603, term9603.getClass(), "constraints", term9606);
        setBooleanField(term9603, term9603.getClass(), "restrictToNonNegative", true);
        setField(term9603, term9603.getClass(), "tableau", null);
        setIntField(term9603, term9603.getClass(), "numDecisionVariables", -1786399638);
        setIntField(term9603, term9603.getClass(), "numSlackVariables", 2055867847);
        setIntField(term9603, term9603.getClass(), "numArtificialVariables", -1048298087);
        setDoubleField(term9603, term9603.getClass(), "epsilon", 0.09037487793444521);
        term9629 = new Integer(292681826);
        term9631 = new Integer(458147407);
        term9633 = new Double(0.6561919196821765);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        argTypes[2] = double.class;
        Object[] args = new Object[3];
        args[0] = term9629;
        args[1] = term9631;
        args[2] = term9633;
        try {
            callMethod(klass, "setEntry", argTypes, term9603, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


