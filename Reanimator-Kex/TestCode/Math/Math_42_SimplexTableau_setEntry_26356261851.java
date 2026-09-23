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

public class SimplexTableau_setEntry_26356261851 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10234;
     Object term10271;
     Object term10273;
     Object term10275;

    public SimplexTableau_setEntry_26356261851() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term43331 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term43330 = ((Class) term43331).getDeclaredField((String) "EQ");
        ((Field) term43330).setAccessible(true);
        Object enum99 = ((Field) term43330).get((Object) null);
        Object term10239 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term10239, term10239.getClass(), "coefficients", null);
        setField(term10239, term10239.getClass(), "relationship", enum99);
        setDoubleField(term10239, term10239.getClass(), "value", 0.0865998004187658);
        Class<? extends Object> term43624 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term43623 = ((Class) term43624).getDeclaredField((String) "EQ");
        ((Field) term43623).setAccessible(true);
        Object enum100 = ((Field) term43623).get((Object) null);
        Object term10243 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term10243, term10243.getClass(), "coefficients", null);
        setField(term10243, term10243.getClass(), "relationship", enum100);
        setDoubleField(term10243, term10243.getClass(), "value", 0.9628647861255637);
        ArrayList term10237 = new ArrayList();
        ((ArrayList) term10237).add(term10239);
        ((ArrayList) term10237).add(term10243);
        ArrayList term10250 = new ArrayList();
        ((ArrayList) term10250).add("nHXjMycHlU");
        term10234 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term10235 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearObjectiveFunction"));
        setField(term10235, term10235.getClass(), "coefficients", null);
        setDoubleField(term10235, term10235.getClass(), "constantTerm", 0.06587158449170749);
        setField(term10234, term10234.getClass(), "f", term10235);
        setField(term10234, term10234.getClass(), "constraints", term10237);
        setBooleanField(term10234, term10234.getClass(), "restrictToNonNegative", true);
        setField(term10234, term10234.getClass(), "columnLabels", term10250);
        setField(term10234, term10234.getClass(), "tableau", null);
        setIntField(term10234, term10234.getClass(), "numDecisionVariables", -1371869594);
        setIntField(term10234, term10234.getClass(), "numSlackVariables", -2095575670);
        setIntField(term10234, term10234.getClass(), "numArtificialVariables", 1225272962);
        setDoubleField(term10234, term10234.getClass(), "epsilon", 0.623231822150205);
        setIntField(term10234, term10234.getClass(), "maxUlps", 1324040357);
        term10271 = new Integer(-1588772968);
        term10273 = new Integer(-93135961);
        term10275 = new Double(0.09037487793444521);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        argTypes[2] = double.class;
        Object[] args = new Object[3];
        args[0] = term10271;
        args[1] = term10273;
        args[2] = term10275;
        try {
            callMethod(klass, "setEntry", argTypes, term10234, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


