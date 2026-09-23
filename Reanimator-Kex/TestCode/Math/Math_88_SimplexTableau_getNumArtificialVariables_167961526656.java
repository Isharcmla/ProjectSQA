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

public class SimplexTableau_getNumArtificialVariables_167961526656 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14801;
     Object term51649;

    public SimplexTableau_getNumArtificialVariables_167961526656() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term51656 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term51655 = ((Class) term51656).getDeclaredField((String) "EQ");
        ((Field) term51655).setAccessible(true);
        Object enum132 = ((Field) term51655).get((Object) null);
        Object term14806 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term14806, term14806.getClass(), "coefficients", null);
        setField(term14806, term14806.getClass(), "relationship", enum132);
        setDoubleField(term14806, term14806.getClass(), "value", 0.5725602309856443);
        ArrayList term14804 = new ArrayList();
        ((ArrayList) term14804).add(term14806);
        term14801 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term14802 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearObjectiveFunction"));
        setField(term14802, term14802.getClass(), "coefficients", null);
        setDoubleField(term14802, term14802.getClass(), "constantTerm", 0.5335953039331021);
        setField(term14801, term14801.getClass(), "f", term14802);
        setField(term14801, term14801.getClass(), "constraints", term14804);
        setBooleanField(term14801, term14801.getClass(), "restrictToNonNegative", true);
        setField(term14801, term14801.getClass(), "tableau", null);
        setIntField(term14801, term14801.getClass(), "numDecisionVariables", 933028652);
        setIntField(term14801, term14801.getClass(), "numSlackVariables", 287287233);
        setIntField(term14801, term14801.getClass(), "numArtificialVariables", 962840079);
        setDoubleField(term14801, term14801.getClass(), "epsilon", 0.5310967137636303);
        Class<? extends Object> term51949 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term51948 = ((Class) term51949).getDeclaredField((String) "EQ");
        ((Field) term51948).setAccessible(true);
        Object enum133 = ((Field) term51948).get((Object) null);
        Object term51653 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term51653, term51653.getClass(), "coefficients", null);
        setField(term51653, term51653.getClass(), "relationship", enum133);
        setDoubleField(term51653, term51653.getClass(), "value", 0.5725602309856443);
        ArrayList term51651 = new ArrayList();
        ((ArrayList) term51651).add(term51653);
        term51649 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term51650 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearObjectiveFunction"));
        setField(term51650, term51650.getClass(), "coefficients", null);
        setDoubleField(term51650, term51650.getClass(), "constantTerm", 0.5335953039331021);
        setField(term51649, term51649.getClass(), "f", term51650);
        setField(term51649, term51649.getClass(), "constraints", term51651);
        setBooleanField(term51649, term51649.getClass(), "restrictToNonNegative", true);
        setField(term51649, term51649.getClass(), "tableau", null);
        setIntField(term51649, term51649.getClass(), "numDecisionVariables", 933028652);
        setIntField(term51649, term51649.getClass(), "numSlackVariables", 287287233);
        setIntField(term51649, term51649.getClass(), "numArtificialVariables", 962840079);
        setDoubleField(term51649, term51649.getClass(), "epsilon", 0.5310967137636303);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getNumArtificialVariables", argTypes, term14801, args);
        assertTrue(recursiveEquals(term14801, term51649));
        assertTrue(recursiveEquals(retValue, 962840079));
    }

};


