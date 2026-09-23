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

public class SimplexTableau_getOriginalNumDecisionVariables_113750549160 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15109;
     Object term55287;

    public SimplexTableau_getOriginalNumDecisionVariables_113750549160() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term55297 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term55296 = ((Class) term55297).getDeclaredField((String) "EQ");
        ((Field) term55296).setAccessible(true);
        Object enum140 = ((Field) term55296).get((Object) null);
        Object term15114 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term15114, term15114.getClass(), "coefficients", null);
        setField(term15114, term15114.getClass(), "relationship", enum140);
        setDoubleField(term15114, term15114.getClass(), "value", 0.5310967137636303);
        Object term15118 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term15118, term15118.getClass(), "coefficients", null);
        setField(term15118, term15118.getClass(), "relationship", enum140);
        setDoubleField(term15118, term15118.getClass(), "value", 0.6054109236809134);
        Class<? extends Object> term55590 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term55589 = ((Class) term55590).getDeclaredField((String) "GEQ");
        ((Field) term55589).setAccessible(true);
        Object enum141 = ((Field) term55589).get((Object) null);
        Object term15120 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term15120, term15120.getClass(), "coefficients", null);
        setField(term15120, term15120.getClass(), "relationship", enum141);
        setDoubleField(term15120, term15120.getClass(), "value", 0.9165240441138934);
        ArrayList term15112 = new ArrayList();
        ((ArrayList) term15112).add(term15114);
        ((ArrayList) term15112).add(term15118);
        ((ArrayList) term15112).add(term15120);
        term15109 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term15110 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearObjectiveFunction"));
        setField(term15110, term15110.getClass(), "coefficients", null);
        setDoubleField(term15110, term15110.getClass(), "constantTerm", 0.5725602309856443);
        setField(term15109, term15109.getClass(), "f", term15110);
        setField(term15109, term15109.getClass(), "constraints", term15112);
        setBooleanField(term15109, term15109.getClass(), "restrictToNonNegative", false);
        setField(term15109, term15109.getClass(), "tableau", null);
        setIntField(term15109, term15109.getClass(), "numDecisionVariables", 335112684);
        setIntField(term15109, term15109.getClass(), "numSlackVariables", 1551099402);
        setIntField(term15109, term15109.getClass(), "numArtificialVariables", -2027534003);
        setDoubleField(term15109, term15109.getClass(), "epsilon", 0.22227423914231126);
        Class<? extends Object> term55886 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term55885 = ((Class) term55886).getDeclaredField((String) "GEQ");
        ((Field) term55885).setAccessible(true);
        Object enum142 = ((Field) term55885).get((Object) null);
        Object term55291 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term55291, term55291.getClass(), "coefficients", null);
        setField(term55291, term55291.getClass(), "relationship", enum142);
        setDoubleField(term55291, term55291.getClass(), "value", 0.5310967137636303);
        Object term55293 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term55293, term55293.getClass(), "coefficients", null);
        setField(term55293, term55293.getClass(), "relationship", enum142);
        setDoubleField(term55293, term55293.getClass(), "value", 0.6054109236809134);
        Class<? extends Object> term56183 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term56182 = ((Class) term56183).getDeclaredField((String) "LEQ");
        ((Field) term56182).setAccessible(true);
        Object enum143 = ((Field) term56182).get((Object) null);
        Object term55294 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term55294, term55294.getClass(), "coefficients", null);
        setField(term55294, term55294.getClass(), "relationship", enum143);
        setDoubleField(term55294, term55294.getClass(), "value", 0.9165240441138934);
        ArrayList term55289 = new ArrayList();
        ((ArrayList) term55289).add(term55291);
        ((ArrayList) term55289).add(term55293);
        ((ArrayList) term55289).add(term55294);
        term55287 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term55288 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearObjectiveFunction"));
        setField(term55288, term55288.getClass(), "coefficients", null);
        setDoubleField(term55288, term55288.getClass(), "constantTerm", 0.5725602309856443);
        setField(term55287, term55287.getClass(), "f", term55288);
        setField(term55287, term55287.getClass(), "constraints", term55289);
        setBooleanField(term55287, term55287.getClass(), "restrictToNonNegative", false);
        setField(term55287, term55287.getClass(), "tableau", null);
        setIntField(term55287, term55287.getClass(), "numDecisionVariables", 335112684);
        setIntField(term55287, term55287.getClass(), "numSlackVariables", 1551099402);
        setIntField(term55287, term55287.getClass(), "numArtificialVariables", -2027534003);
        setDoubleField(term55287, term55287.getClass(), "epsilon", 0.22227423914231126);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getOriginalNumDecisionVariables", argTypes, term15109, args);
        assertTrue(recursiveEquals(term15109, term55287));
        assertTrue(recursiveEquals(retValue, 335112683));
    }

};


