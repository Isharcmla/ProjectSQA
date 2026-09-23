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
     Object term50096;

    public SimplexTableau_getNumArtificialVariables_167961526656() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term50103 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term50102 = ((Class) term50103).getDeclaredField((String) "LEQ");
        ((Field) term50102).setAccessible(true);
        Object enum129 = ((Field) term50102).get((Object) null);
        Object term14806 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term14806, term14806.getClass(), "coefficients", null);
        setField(term14806, term14806.getClass(), "relationship", enum129);
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
        Class<? extends Object> term50399 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term50398 = ((Class) term50399).getDeclaredField((String) "EQ");
        ((Field) term50398).setAccessible(true);
        Object enum130 = ((Field) term50398).get((Object) null);
        Object term50100 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term50100, term50100.getClass(), "coefficients", null);
        setField(term50100, term50100.getClass(), "relationship", enum130);
        setDoubleField(term50100, term50100.getClass(), "value", 0.5725602309856443);
        ArrayList term50098 = new ArrayList();
        ((ArrayList) term50098).add(term50100);
        term50096 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term50097 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearObjectiveFunction"));
        setField(term50097, term50097.getClass(), "coefficients", null);
        setDoubleField(term50097, term50097.getClass(), "constantTerm", 0.5335953039331021);
        setField(term50096, term50096.getClass(), "f", term50097);
        setField(term50096, term50096.getClass(), "constraints", term50098);
        setBooleanField(term50096, term50096.getClass(), "restrictToNonNegative", true);
        setField(term50096, term50096.getClass(), "tableau", null);
        setIntField(term50096, term50096.getClass(), "numDecisionVariables", 933028652);
        setIntField(term50096, term50096.getClass(), "numSlackVariables", 287287233);
        setIntField(term50096, term50096.getClass(), "numArtificialVariables", 962840079);
        setDoubleField(term50096, term50096.getClass(), "epsilon", 0.5310967137636303);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getNumArtificialVariables", argTypes, term14801, args);
        assertTrue(recursiveEquals(term14801, term50096));
        assertTrue(recursiveEquals(retValue, 962840079));
    }

};


