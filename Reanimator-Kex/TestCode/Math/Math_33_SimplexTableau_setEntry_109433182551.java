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
import java.lang.NullPointerException;
import static org.apache.commons.math3.optimization.linear.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.String;
import java.lang.Integer;
import java.lang.Double;

public class SimplexTableau_setEntry_109433182551 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10379;
     Object term10416;
     Object term10418;
     Object term10420;

    public SimplexTableau_setEntry_109433182551() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term45114 = Class.forName((String) "org.apache.commons.math3.optimization.linear.Relationship");
        Field term45113 = ((Class) term45114).getDeclaredField((String) "EQ");
        ((Field) term45113).setAccessible(true);
        Object enum97 = ((Field) term45113).get((Object) null);
        Object term10384 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.LinearConstraint"));
        setField(term10384, term10384.getClass(), "coefficients", null);
        setField(term10384, term10384.getClass(), "relationship", enum97);
        setDoubleField(term10384, term10384.getClass(), "value", 0.0865998004187658);
        Class<? extends Object> term45412 = Class.forName((String) "org.apache.commons.math3.optimization.linear.Relationship");
        Field term45411 = ((Class) term45412).getDeclaredField((String) "EQ");
        ((Field) term45411).setAccessible(true);
        Object enum98 = ((Field) term45411).get((Object) null);
        Object term10388 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.LinearConstraint"));
        setField(term10388, term10388.getClass(), "coefficients", null);
        setField(term10388, term10388.getClass(), "relationship", enum98);
        setDoubleField(term10388, term10388.getClass(), "value", 0.9628647861255637);
        ArrayList term10382 = new ArrayList();
        ((ArrayList) term10382).add(term10384);
        ((ArrayList) term10382).add(term10388);
        ArrayList term10395 = new ArrayList();
        ((ArrayList) term10395).add("nHXjMycHlU");
        term10379 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.SimplexTableau"));
        Object term10380 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.LinearObjectiveFunction"));
        setField(term10380, term10380.getClass(), "coefficients", null);
        setDoubleField(term10380, term10380.getClass(), "constantTerm", 0.06587158449170749);
        setField(term10379, term10379.getClass(), "f", term10380);
        setField(term10379, term10379.getClass(), "constraints", term10382);
        setBooleanField(term10379, term10379.getClass(), "restrictToNonNegative", true);
        setField(term10379, term10379.getClass(), "columnLabels", term10395);
        setField(term10379, term10379.getClass(), "tableau", null);
        setIntField(term10379, term10379.getClass(), "numDecisionVariables", -1371869594);
        setIntField(term10379, term10379.getClass(), "numSlackVariables", -2095575670);
        setIntField(term10379, term10379.getClass(), "numArtificialVariables", 1225272962);
        setDoubleField(term10379, term10379.getClass(), "epsilon", 0.623231822150205);
        setIntField(term10379, term10379.getClass(), "maxUlps", 1324040357);
        term10416 = new Integer(-1588772968);
        term10418 = new Integer(-93135961);
        term10420 = new Double(0.09037487793444521);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optimization.linear.SimplexTableau");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        argTypes[2] = double.class;
        Object[] args = new Object[3];
        args[0] = term10416;
        args[1] = term10418;
        args[2] = term10420;
        try {
            callMethod(klass, "setEntry", argTypes, term10379, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


