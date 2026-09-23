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
import java.lang.Object;
import java.util.ArrayList;
import java.lang.String;

public class SimplexTableau_equals_145006127927 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15724;
     Object term15744;

    public SimplexTableau_equals_145006127927() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term15746 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term15745 = ((Class) term15746).getDeclaredField((String) "EQ");
        ((Field) term15745).setAccessible(true);
        Object enum51 = ((Field) term15745).get((Object) null);
        Object term15729 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term15729, term15729.getClass(), "coefficients", null);
        setField(term15729, term15729.getClass(), "relationship", enum51);
        setDoubleField(term15729, term15729.getClass(), "value", 0.6047138318674447);
        Class<? extends Object> term16039 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term16038 = ((Class) term16039).getDeclaredField((String) "EQ");
        ((Field) term16038).setAccessible(true);
        Object enum52 = ((Field) term16038).get((Object) null);
        Object term15733 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term15733, term15733.getClass(), "coefficients", null);
        setField(term15733, term15733.getClass(), "relationship", enum52);
        setDoubleField(term15733, term15733.getClass(), "value", 0.5597136413549945);
        ArrayList term15727 = new ArrayList();
        ((ArrayList) term15727).add(term15729);
        ((ArrayList) term15727).add(term15733);
        term15724 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term15725 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearObjectiveFunction"));
        setField(term15725, term15725.getClass(), "coefficients", null);
        setDoubleField(term15725, term15725.getClass(), "constantTerm", 0.23129126164078717);
        setField(term15724, term15724.getClass(), "f", term15725);
        setField(term15724, term15724.getClass(), "constraints", term15727);
        setBooleanField(term15724, term15724.getClass(), "restrictToNonNegative", false);
        setField(term15724, term15724.getClass(), "tableau", null);
        setIntField(term15724, term15724.getClass(), "numDecisionVariables", 1551099402);
        setIntField(term15724, term15724.getClass(), "numSlackVariables", -2027534003);
        setIntField(term15724, term15724.getClass(), "numArtificialVariables", 1063420942);
        setDoubleField(term15724, term15724.getClass(), "epsilon", 0.28292420012823627);
        term15744 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term15744;
        callMethod(klass, "equals", argTypes, term15724, args);
    }

};


