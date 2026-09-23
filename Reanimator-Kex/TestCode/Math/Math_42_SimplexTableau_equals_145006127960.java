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

public class SimplexTableau_equals_145006127960 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16506;
     Object term16573;
     Object term52321;
     Object term52339;

    public SimplexTableau_equals_145006127960() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term52342 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term52341 = ((Class) term52342).getDeclaredField((String) "GEQ");
        ((Field) term52341).setAccessible(true);
        Object enum124 = ((Field) term52341).get((Object) null);
        Object term16511 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term16511, term16511.getClass(), "coefficients", null);
        setField(term16511, term16511.getClass(), "relationship", enum124);
        setDoubleField(term16511, term16511.getClass(), "value", 0.23129126164078717);
        Class<? extends Object> term52638 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term52637 = ((Class) term52638).getDeclaredField((String) "GEQ");
        ((Field) term52637).setAccessible(true);
        Object enum125 = ((Field) term52637).get((Object) null);
        Object term16515 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term16515, term16515.getClass(), "coefficients", null);
        setField(term16515, term16515.getClass(), "relationship", enum125);
        setDoubleField(term16515, term16515.getClass(), "value", 0.6047138318674447);
        Object term16519 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term16519, term16519.getClass(), "coefficients", null);
        setField(term16519, term16519.getClass(), "relationship", enum125);
        setDoubleField(term16519, term16519.getClass(), "value", 0.5597136413549945);
        Class<? extends Object> term52934 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term52933 = ((Class) term52934).getDeclaredField((String) "EQ");
        ((Field) term52933).setAccessible(true);
        Object enum126 = ((Field) term52933).get((Object) null);
        Object term16521 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term16521, term16521.getClass(), "coefficients", null);
        setField(term16521, term16521.getClass(), "relationship", enum126);
        setDoubleField(term16521, term16521.getClass(), "value", 0.28292420012823627);
        ArrayList term16509 = new ArrayList();
        ((ArrayList) term16509).add(term16511);
        ((ArrayList) term16509).add(term16515);
        ((ArrayList) term16509).add(term16519);
        ((ArrayList) term16509).add(term16521);
        ArrayList term16528 = new ArrayList();
        ((ArrayList) term16528).add("xOcJIiQQDu");
        ((ArrayList) term16528).add("GVizqqzXpy");
        ((ArrayList) term16528).add("JqXGgAhZPl");
        term16506 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term16507 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearObjectiveFunction"));
        setField(term16507, term16507.getClass(), "coefficients", null);
        setDoubleField(term16507, term16507.getClass(), "constantTerm", 0.8490790645379176);
        setField(term16506, term16506.getClass(), "f", term16507);
        setField(term16506, term16506.getClass(), "constraints", term16509);
        setBooleanField(term16506, term16506.getClass(), "restrictToNonNegative", false);
        setField(term16506, term16506.getClass(), "columnLabels", term16528);
        setField(term16506, term16506.getClass(), "tableau", null);
        setIntField(term16506, term16506.getClass(), "numDecisionVariables", -1347665717);
        setIntField(term16506, term16506.getClass(), "numSlackVariables", -1888585309);
        setIntField(term16506, term16506.getClass(), "numArtificialVariables", 683666002);
        setDoubleField(term16506, term16506.getClass(), "epsilon", 0.5407563152320285);
        setIntField(term16506, term16506.getClass(), "maxUlps", 1596213415);
        term16573 = newInstance(Class.forName("java.lang.Object"));
        Class<? extends Object> term53257 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term53256 = ((Class) term53257).getDeclaredField((String) "GEQ");
        ((Field) term53256).setAccessible(true);
        Object enum127 = ((Field) term53256).get((Object) null);
        Object term52325 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term52325, term52325.getClass(), "coefficients", null);
        setField(term52325, term52325.getClass(), "relationship", enum127);
        setDoubleField(term52325, term52325.getClass(), "value", 0.23129126164078717);
        Class<? extends Object> term53706 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term53705 = ((Class) term53706).getDeclaredField((String) "EQ");
        ((Field) term53705).setAccessible(true);
        Object enum128 = ((Field) term53705).get((Object) null);
        Object term52327 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term52327, term52327.getClass(), "coefficients", null);
        setField(term52327, term52327.getClass(), "relationship", enum128);
        setDoubleField(term52327, term52327.getClass(), "value", 0.6047138318674447);
        Object term52329 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term52329, term52329.getClass(), "coefficients", null);
        setField(term52329, term52329.getClass(), "relationship", enum128);
        setDoubleField(term52329, term52329.getClass(), "value", 0.5597136413549945);
        Object term52330 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term52330, term52330.getClass(), "coefficients", null);
        setField(term52330, term52330.getClass(), "relationship", enum128);
        setDoubleField(term52330, term52330.getClass(), "value", 0.28292420012823627);
        ArrayList term52323 = new ArrayList();
        ((ArrayList) term52323).add(term52325);
        ((ArrayList) term52323).add(term52327);
        ((ArrayList) term52323).add(term52329);
        ((ArrayList) term52323).add(term52330);
        ArrayList term52331 = new ArrayList();
        ((ArrayList) term52331).add("xOcJIiQQDu");
        ((ArrayList) term52331).add("GVizqqzXpy");
        ((ArrayList) term52331).add("JqXGgAhZPl");
        term52321 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term52322 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearObjectiveFunction"));
        setField(term52322, term52322.getClass(), "coefficients", null);
        setDoubleField(term52322, term52322.getClass(), "constantTerm", 0.8490790645379176);
        setField(term52321, term52321.getClass(), "f", term52322);
        setField(term52321, term52321.getClass(), "constraints", term52323);
        setBooleanField(term52321, term52321.getClass(), "restrictToNonNegative", false);
        setField(term52321, term52321.getClass(), "columnLabels", term52331);
        setField(term52321, term52321.getClass(), "tableau", null);
        setIntField(term52321, term52321.getClass(), "numDecisionVariables", -1347665717);
        setIntField(term52321, term52321.getClass(), "numSlackVariables", -1888585309);
        setIntField(term52321, term52321.getClass(), "numArtificialVariables", 683666002);
        setDoubleField(term52321, term52321.getClass(), "epsilon", 0.5407563152320285);
        setIntField(term52321, term52321.getClass(), "maxUlps", 1596213415);
        term52339 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term16573;
        Object retValue = callMethod(klass, "equals", argTypes, term16506, args);
        assertTrue(recursiveEquals(term16506, term52321));
        assertTrue(recursiveEquals(term16573, term52339));
        assertTrue(recursiveEquals(retValue, false));
    }

};


