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

public class SimplexTableau_getOriginalNumDecisionVariables_113750549156 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13110;

    public SimplexTableau_getOriginalNumDecisionVariables_113750549156() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term48077 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term48076 = ((Class) term48077).getDeclaredField((String) "LEQ");
        ((Field) term48076).setAccessible(true);
        Object enum110 = ((Field) term48076).get((Object) null);
        Object term13115 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term13115, term13115.getClass(), "coefficients", null);
        setField(term13115, term13115.getClass(), "relationship", enum110);
        setDoubleField(term13115, term13115.getClass(), "value", 0.9123572866833729);
        Class<? extends Object> term48373 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term48372 = ((Class) term48373).getDeclaredField((String) "LEQ");
        ((Field) term48372).setAccessible(true);
        Object enum111 = ((Field) term48372).get((Object) null);
        Object term13119 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term13119, term13119.getClass(), "coefficients", null);
        setField(term13119, term13119.getClass(), "relationship", enum111);
        setDoubleField(term13119, term13119.getClass(), "value", 0.40635376375558196);
        Class<? extends Object> term48669 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term48668 = ((Class) term48669).getDeclaredField((String) "EQ");
        ((Field) term48668).setAccessible(true);
        Object enum112 = ((Field) term48668).get((Object) null);
        Object term13123 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term13123, term13123.getClass(), "coefficients", null);
        setField(term13123, term13123.getClass(), "relationship", enum112);
        setDoubleField(term13123, term13123.getClass(), "value", 0.4772043271031934);
        Object term13127 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term13127, term13127.getClass(), "coefficients", null);
        setField(term13127, term13127.getClass(), "relationship", enum112);
        setDoubleField(term13127, term13127.getClass(), "value", 0.2446504549754045);
        ArrayList term13113 = new ArrayList();
        ((ArrayList) term13113).add(term13115);
        ((ArrayList) term13113).add(term13119);
        ((ArrayList) term13113).add(term13123);
        ((ArrayList) term13113).add(term13127);
        ArrayList term13132 = new ArrayList();
        ((ArrayList) term13132).add("oVgzLbrsFr");
        ((ArrayList) term13132).add("vQVyKLdtaz");
        ((ArrayList) term13132).add("OWKQODBLzb");
        ((ArrayList) term13132).add("wGmYcqUkgE");
        ((ArrayList) term13132).add("idgaQsnJpQ");
        ((ArrayList) term13132).add("VgZnGoIFwQ");
        ((ArrayList) term13132).add("jUbSRrkrYZ");
        ((ArrayList) term13132).add("bWWfajKbEX");
        term13110 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term13111 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearObjectiveFunction"));
        setField(term13111, term13111.getClass(), "coefficients", null);
        setDoubleField(term13111, term13111.getClass(), "constantTerm", 0.04640022995603543);
        setField(term13110, term13110.getClass(), "f", term13111);
        setField(term13110, term13110.getClass(), "constraints", term13113);
        setBooleanField(term13110, term13110.getClass(), "restrictToNonNegative", true);
        setField(term13110, term13110.getClass(), "columnLabels", term13132);
        setField(term13110, term13110.getClass(), "tableau", null);
        setIntField(term13110, term13110.getClass(), "numDecisionVariables", -1465035361);
        setIntField(term13110, term13110.getClass(), "numSlackVariables", 1090617576);
        setIntField(term13110, term13110.getClass(), "numArtificialVariables", -1547384488);
        setDoubleField(term13110, term13110.getClass(), "epsilon", 0.6142723998707854);
        setIntField(term13110, term13110.getClass(), "maxUlps", 1442160736);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getOriginalNumDecisionVariables", argTypes, term13110, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


