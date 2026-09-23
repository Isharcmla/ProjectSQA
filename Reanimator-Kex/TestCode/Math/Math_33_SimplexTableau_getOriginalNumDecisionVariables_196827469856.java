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

public class SimplexTableau_getOriginalNumDecisionVariables_196827469856 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13295;

    public SimplexTableau_getOriginalNumDecisionVariables_196827469856() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term49514 = Class.forName((String) "org.apache.commons.math3.optimization.linear.Relationship");
        Field term49513 = ((Class) term49514).getDeclaredField((String) "LEQ");
        ((Field) term49513).setAccessible(true);
        Object enum108 = ((Field) term49513).get((Object) null);
        Object term13300 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.LinearConstraint"));
        setField(term13300, term13300.getClass(), "coefficients", null);
        setField(term13300, term13300.getClass(), "relationship", enum108);
        setDoubleField(term13300, term13300.getClass(), "value", 0.9123572866833729);
        Class<? extends Object> term49815 = Class.forName((String) "org.apache.commons.math3.optimization.linear.Relationship");
        Field term49814 = ((Class) term49815).getDeclaredField((String) "LEQ");
        ((Field) term49814).setAccessible(true);
        Object enum109 = ((Field) term49814).get((Object) null);
        Object term13304 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.LinearConstraint"));
        setField(term13304, term13304.getClass(), "coefficients", null);
        setField(term13304, term13304.getClass(), "relationship", enum109);
        setDoubleField(term13304, term13304.getClass(), "value", 0.40635376375558196);
        Class<? extends Object> term50116 = Class.forName((String) "org.apache.commons.math3.optimization.linear.Relationship");
        Field term50115 = ((Class) term50116).getDeclaredField((String) "EQ");
        ((Field) term50115).setAccessible(true);
        Object enum110 = ((Field) term50115).get((Object) null);
        Object term13308 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.LinearConstraint"));
        setField(term13308, term13308.getClass(), "coefficients", null);
        setField(term13308, term13308.getClass(), "relationship", enum110);
        setDoubleField(term13308, term13308.getClass(), "value", 0.4772043271031934);
        Object term13312 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.LinearConstraint"));
        setField(term13312, term13312.getClass(), "coefficients", null);
        setField(term13312, term13312.getClass(), "relationship", enum110);
        setDoubleField(term13312, term13312.getClass(), "value", 0.2446504549754045);
        ArrayList term13298 = new ArrayList();
        ((ArrayList) term13298).add(term13300);
        ((ArrayList) term13298).add(term13304);
        ((ArrayList) term13298).add(term13308);
        ((ArrayList) term13298).add(term13312);
        ArrayList term13317 = new ArrayList();
        ((ArrayList) term13317).add("oVgzLbrsFr");
        ((ArrayList) term13317).add("vQVyKLdtaz");
        ((ArrayList) term13317).add("OWKQODBLzb");
        ((ArrayList) term13317).add("wGmYcqUkgE");
        ((ArrayList) term13317).add("idgaQsnJpQ");
        ((ArrayList) term13317).add("VgZnGoIFwQ");
        ((ArrayList) term13317).add("jUbSRrkrYZ");
        ((ArrayList) term13317).add("bWWfajKbEX");
        term13295 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.SimplexTableau"));
        Object term13296 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.LinearObjectiveFunction"));
        setField(term13296, term13296.getClass(), "coefficients", null);
        setDoubleField(term13296, term13296.getClass(), "constantTerm", 0.04640022995603543);
        setField(term13295, term13295.getClass(), "f", term13296);
        setField(term13295, term13295.getClass(), "constraints", term13298);
        setBooleanField(term13295, term13295.getClass(), "restrictToNonNegative", true);
        setField(term13295, term13295.getClass(), "columnLabels", term13317);
        setField(term13295, term13295.getClass(), "tableau", null);
        setIntField(term13295, term13295.getClass(), "numDecisionVariables", -1465035361);
        setIntField(term13295, term13295.getClass(), "numSlackVariables", 1090617576);
        setIntField(term13295, term13295.getClass(), "numArtificialVariables", -1547384488);
        setDoubleField(term13295, term13295.getClass(), "epsilon", 0.6142723998707854);
        setIntField(term13295, term13295.getClass(), "maxUlps", 1442160736);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optimization.linear.SimplexTableau");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getOriginalNumDecisionVariables", argTypes, term13295, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


