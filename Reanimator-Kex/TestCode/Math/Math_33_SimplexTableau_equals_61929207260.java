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
import static org.apache.commons.math3.optimization.linear.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.math3.optimization.linear.EqualityUtils.*;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.String;

public class SimplexTableau_equals_61929207260 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16741;
     Object term16808;
     Object term53364;
     Object term53382;

    public SimplexTableau_equals_61929207260() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term53385 = Class.forName((String) "org.apache.commons.math3.optimization.linear.Relationship");
        Field term53384 = ((Class) term53385).getDeclaredField((String) "EQ");
        ((Field) term53384).setAccessible(true);
        Object enum119 = ((Field) term53384).get((Object) null);
        Object term16746 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.LinearConstraint"));
        setField(term16746, term16746.getClass(), "coefficients", null);
        setField(term16746, term16746.getClass(), "relationship", enum119);
        setDoubleField(term16746, term16746.getClass(), "value", 0.23129126164078717);
        Class<? extends Object> term53683 = Class.forName((String) "org.apache.commons.math3.optimization.linear.Relationship");
        Field term53682 = ((Class) term53683).getDeclaredField((String) "GEQ");
        ((Field) term53682).setAccessible(true);
        Object enum120 = ((Field) term53682).get((Object) null);
        Object term16750 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.LinearConstraint"));
        setField(term16750, term16750.getClass(), "coefficients", null);
        setField(term16750, term16750.getClass(), "relationship", enum120);
        setDoubleField(term16750, term16750.getClass(), "value", 0.6047138318674447);
        Object term16754 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.LinearConstraint"));
        setField(term16754, term16754.getClass(), "coefficients", null);
        setField(term16754, term16754.getClass(), "relationship", enum120);
        setDoubleField(term16754, term16754.getClass(), "value", 0.5597136413549945);
        Class<? extends Object> term53984 = Class.forName((String) "org.apache.commons.math3.optimization.linear.Relationship");
        Field term53983 = ((Class) term53984).getDeclaredField((String) "LEQ");
        ((Field) term53983).setAccessible(true);
        Object enum121 = ((Field) term53983).get((Object) null);
        Object term16756 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.LinearConstraint"));
        setField(term16756, term16756.getClass(), "coefficients", null);
        setField(term16756, term16756.getClass(), "relationship", enum121);
        setDoubleField(term16756, term16756.getClass(), "value", 0.28292420012823627);
        ArrayList term16744 = new ArrayList();
        ((ArrayList) term16744).add(term16746);
        ((ArrayList) term16744).add(term16750);
        ((ArrayList) term16744).add(term16754);
        ((ArrayList) term16744).add(term16756);
        ArrayList term16763 = new ArrayList();
        ((ArrayList) term16763).add("xOcJIiQQDu");
        ((ArrayList) term16763).add("GVizqqzXpy");
        ((ArrayList) term16763).add("JqXGgAhZPl");
        term16741 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.SimplexTableau"));
        Object term16742 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.LinearObjectiveFunction"));
        setField(term16742, term16742.getClass(), "coefficients", null);
        setDoubleField(term16742, term16742.getClass(), "constantTerm", 0.8490790645379176);
        setField(term16741, term16741.getClass(), "f", term16742);
        setField(term16741, term16741.getClass(), "constraints", term16744);
        setBooleanField(term16741, term16741.getClass(), "restrictToNonNegative", false);
        setField(term16741, term16741.getClass(), "columnLabels", term16763);
        setField(term16741, term16741.getClass(), "tableau", null);
        setIntField(term16741, term16741.getClass(), "numDecisionVariables", -1347665717);
        setIntField(term16741, term16741.getClass(), "numSlackVariables", -1888585309);
        setIntField(term16741, term16741.getClass(), "numArtificialVariables", 683666002);
        setDoubleField(term16741, term16741.getClass(), "epsilon", 0.5407563152320285);
        setIntField(term16741, term16741.getClass(), "maxUlps", 1596213415);
        term16808 = newInstance(Class.forName("java.lang.Object"));
        Class<? extends Object> term54315 = Class.forName((String) "org.apache.commons.math3.optimization.linear.Relationship");
        Field term54314 = ((Class) term54315).getDeclaredField((String) "GEQ");
        ((Field) term54314).setAccessible(true);
        Object enum122 = ((Field) term54314).get((Object) null);
        Object term53368 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.LinearConstraint"));
        setField(term53368, term53368.getClass(), "coefficients", null);
        setField(term53368, term53368.getClass(), "relationship", enum122);
        setDoubleField(term53368, term53368.getClass(), "value", 0.23129126164078717);
        Class<? extends Object> term54616 = Class.forName((String) "org.apache.commons.math3.optimization.linear.Relationship");
        Field term54615 = ((Class) term54616).getDeclaredField((String) "GEQ");
        ((Field) term54615).setAccessible(true);
        Object enum123 = ((Field) term54615).get((Object) null);
        Object term53370 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.LinearConstraint"));
        setField(term53370, term53370.getClass(), "coefficients", null);
        setField(term53370, term53370.getClass(), "relationship", enum123);
        setDoubleField(term53370, term53370.getClass(), "value", 0.6047138318674447);
        Object term53372 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.LinearConstraint"));
        setField(term53372, term53372.getClass(), "coefficients", null);
        setField(term53372, term53372.getClass(), "relationship", enum123);
        setDoubleField(term53372, term53372.getClass(), "value", 0.5597136413549945);
        Object term53373 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.LinearConstraint"));
        setField(term53373, term53373.getClass(), "coefficients", null);
        setField(term53373, term53373.getClass(), "relationship", enum123);
        setDoubleField(term53373, term53373.getClass(), "value", 0.28292420012823627);
        ArrayList term53366 = new ArrayList();
        ((ArrayList) term53366).add(term53368);
        ((ArrayList) term53366).add(term53370);
        ((ArrayList) term53366).add(term53372);
        ((ArrayList) term53366).add(term53373);
        ArrayList term53374 = new ArrayList();
        ((ArrayList) term53374).add("xOcJIiQQDu");
        ((ArrayList) term53374).add("GVizqqzXpy");
        ((ArrayList) term53374).add("JqXGgAhZPl");
        term53364 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.SimplexTableau"));
        Object term53365 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.LinearObjectiveFunction"));
        setField(term53365, term53365.getClass(), "coefficients", null);
        setDoubleField(term53365, term53365.getClass(), "constantTerm", 0.8490790645379176);
        setField(term53364, term53364.getClass(), "f", term53365);
        setField(term53364, term53364.getClass(), "constraints", term53366);
        setBooleanField(term53364, term53364.getClass(), "restrictToNonNegative", false);
        setField(term53364, term53364.getClass(), "columnLabels", term53374);
        setField(term53364, term53364.getClass(), "tableau", null);
        setIntField(term53364, term53364.getClass(), "numDecisionVariables", -1347665717);
        setIntField(term53364, term53364.getClass(), "numSlackVariables", -1888585309);
        setIntField(term53364, term53364.getClass(), "numArtificialVariables", 683666002);
        setDoubleField(term53364, term53364.getClass(), "epsilon", 0.5407563152320285);
        setIntField(term53364, term53364.getClass(), "maxUlps", 1596213415);
        term53382 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optimization.linear.SimplexTableau");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term16808;
        Object retValue = callMethod(klass, "equals", argTypes, term16741, args);
        assertTrue(recursiveEquals(term16741, term53364));
        assertTrue(recursiveEquals(term16808, term53382));
        assertTrue(recursiveEquals(retValue, false));
    }

};


