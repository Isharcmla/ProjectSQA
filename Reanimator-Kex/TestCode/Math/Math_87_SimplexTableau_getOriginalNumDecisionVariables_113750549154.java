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

public class SimplexTableau_getOriginalNumDecisionVariables_113750549154 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12978;
     Object term48305;

    public SimplexTableau_getOriginalNumDecisionVariables_113750549154() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term48316 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term48315 = ((Class) term48316).getDeclaredField((String) "GEQ");
        ((Field) term48315).setAccessible(true);
        Object enum122 = ((Field) term48315).get((Object) null);
        Object term12983 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term12983, term12983.getClass(), "coefficients", null);
        setField(term12983, term12983.getClass(), "relationship", enum122);
        setDoubleField(term12983, term12983.getClass(), "value", 0.4355627280318103);
        Class<? extends Object> term48612 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term48611 = ((Class) term48612).getDeclaredField((String) "LEQ");
        ((Field) term48611).setAccessible(true);
        Object enum123 = ((Field) term48611).get((Object) null);
        Object term12987 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term12987, term12987.getClass(), "coefficients", null);
        setField(term12987, term12987.getClass(), "relationship", enum123);
        setDoubleField(term12987, term12987.getClass(), "value", 0.841460835734741);
        Object term12991 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term12991, term12991.getClass(), "coefficients", null);
        setField(term12991, term12991.getClass(), "relationship", enum123);
        setDoubleField(term12991, term12991.getClass(), "value", 0.7859316615744082);
        Class<? extends Object> term48908 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term48907 = ((Class) term48908).getDeclaredField((String) "EQ");
        ((Field) term48907).setAccessible(true);
        Object enum124 = ((Field) term48907).get((Object) null);
        Object term12993 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term12993, term12993.getClass(), "coefficients", null);
        setField(term12993, term12993.getClass(), "relationship", enum124);
        setDoubleField(term12993, term12993.getClass(), "value", 0.6428742553484879);
        ArrayList term12981 = new ArrayList();
        ((ArrayList) term12981).add(term12983);
        ((ArrayList) term12981).add(term12987);
        ((ArrayList) term12981).add(term12991);
        ((ArrayList) term12981).add(term12993);
        term12978 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term12979 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearObjectiveFunction"));
        setField(term12979, term12979.getClass(), "coefficients", null);
        setDoubleField(term12979, term12979.getClass(), "constantTerm", 0.6142723998707854);
        setField(term12978, term12978.getClass(), "f", term12979);
        setField(term12978, term12978.getClass(), "constraints", term12981);
        setBooleanField(term12978, term12978.getClass(), "restrictToNonNegative", true);
        setField(term12978, term12978.getClass(), "tableau", null);
        setIntField(term12978, term12978.getClass(), "numDecisionVariables", -2095575670);
        setIntField(term12978, term12978.getClass(), "numSlackVariables", 1225272962);
        setIntField(term12978, term12978.getClass(), "numArtificialVariables", 1324040357);
        setDoubleField(term12978, term12978.getClass(), "epsilon", 0.6584165706677267);
        Class<? extends Object> term49212 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term49211 = ((Class) term49212).getDeclaredField((String) "EQ");
        ((Field) term49211).setAccessible(true);
        Object enum125 = ((Field) term49211).get((Object) null);
        Object term48309 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term48309, term48309.getClass(), "coefficients", null);
        setField(term48309, term48309.getClass(), "relationship", enum125);
        setDoubleField(term48309, term48309.getClass(), "value", 0.4355627280318103);
        Class<? extends Object> term49628 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term49627 = ((Class) term49628).getDeclaredField((String) "GEQ");
        ((Field) term49627).setAccessible(true);
        Object enum127 = ((Field) term49627).get((Object) null);
        Object term48311 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term48311, term48311.getClass(), "coefficients", null);
        setField(term48311, term48311.getClass(), "relationship", enum127);
        setDoubleField(term48311, term48311.getClass(), "value", 0.841460835734741);
        Object term48313 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term48313, term48313.getClass(), "coefficients", null);
        setField(term48313, term48313.getClass(), "relationship", enum127);
        setDoubleField(term48313, term48313.getClass(), "value", 0.7859316615744082);
        Object term48314 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term48314, term48314.getClass(), "coefficients", null);
        setField(term48314, term48314.getClass(), "relationship", enum127);
        setDoubleField(term48314, term48314.getClass(), "value", 0.6428742553484879);
        ArrayList term48307 = new ArrayList();
        ((ArrayList) term48307).add(term48309);
        ((ArrayList) term48307).add(term48311);
        ((ArrayList) term48307).add(term48313);
        ((ArrayList) term48307).add(term48314);
        term48305 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term48306 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearObjectiveFunction"));
        setField(term48306, term48306.getClass(), "coefficients", null);
        setDoubleField(term48306, term48306.getClass(), "constantTerm", 0.6142723998707854);
        setField(term48305, term48305.getClass(), "f", term48306);
        setField(term48305, term48305.getClass(), "constraints", term48307);
        setBooleanField(term48305, term48305.getClass(), "restrictToNonNegative", true);
        setField(term48305, term48305.getClass(), "tableau", null);
        setIntField(term48305, term48305.getClass(), "numDecisionVariables", -2095575670);
        setIntField(term48305, term48305.getClass(), "numSlackVariables", 1225272962);
        setIntField(term48305, term48305.getClass(), "numArtificialVariables", 1324040357);
        setDoubleField(term48305, term48305.getClass(), "epsilon", 0.6584165706677267);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getOriginalNumDecisionVariables", argTypes, term12978, args);
        assertTrue(recursiveEquals(term12978, term48305));
        assertTrue(recursiveEquals(retValue, -2095575670));
    }

};


