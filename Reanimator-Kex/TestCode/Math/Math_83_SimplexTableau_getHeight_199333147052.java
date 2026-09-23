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

public class SimplexTableau_getHeight_199333147052 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9595;

    public SimplexTableau_getHeight_199333147052() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term46982 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term46981 = ((Class) term46982).getDeclaredField((String) "GEQ");
        ((Field) term46981).setAccessible(true);
        Object enum115 = ((Field) term46981).get((Object) null);
        Object term9600 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term9600, term9600.getClass(), "coefficients", null);
        setField(term9600, term9600.getClass(), "relationship", enum115);
        setDoubleField(term9600, term9600.getClass(), "value", 0.12764449157430724);
        Class<? extends Object> term47278 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term47277 = ((Class) term47278).getDeclaredField((String) "LEQ");
        ((Field) term47277).setAccessible(true);
        Object enum116 = ((Field) term47277).get((Object) null);
        Object term9604 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term9604, term9604.getClass(), "coefficients", null);
        setField(term9604, term9604.getClass(), "relationship", enum116);
        setDoubleField(term9604, term9604.getClass(), "value", 0.39446728256884744);
        Object term9608 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term9608, term9608.getClass(), "coefficients", null);
        setField(term9608, term9608.getClass(), "relationship", enum115);
        setDoubleField(term9608, term9608.getClass(), "value", 0.7865909711092062);
        Object term9610 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term9610, term9610.getClass(), "coefficients", null);
        setField(term9610, term9610.getClass(), "relationship", enum116);
        setDoubleField(term9610, term9610.getClass(), "value", 0.06587158449170749);
        Object term9612 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term9612, term9612.getClass(), "coefficients", null);
        setField(term9612, term9612.getClass(), "relationship", enum115);
        setDoubleField(term9612, term9612.getClass(), "value", 0.0865998004187658);
        ArrayList term9598 = new ArrayList();
        ((ArrayList) term9598).add(term9600);
        ((ArrayList) term9598).add(term9604);
        ((ArrayList) term9598).add(term9608);
        ((ArrayList) term9598).add(term9610);
        ((ArrayList) term9598).add(term9612);
        term9595 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term9596 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearObjectiveFunction"));
        setField(term9596, term9596.getClass(), "coefficients", null);
        setDoubleField(term9596, term9596.getClass(), "constantTerm", 0.686293604788188);
        setField(term9595, term9595.getClass(), "f", term9596);
        setField(term9595, term9595.getClass(), "constraints", term9598);
        setBooleanField(term9595, term9595.getClass(), "restrictToNonNegative", false);
        setField(term9595, term9595.getClass(), "tableau", null);
        setIntField(term9595, term9595.getClass(), "numDecisionVariables", -1786399638);
        setIntField(term9595, term9595.getClass(), "numSlackVariables", 2055867847);
        setIntField(term9595, term9595.getClass(), "numArtificialVariables", -1048298087);
        setDoubleField(term9595, term9595.getClass(), "epsilon", 0.9628647861255637);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getHeight", argTypes, term9595, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


