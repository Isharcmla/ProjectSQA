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

public class SimplexTableau_equals_145006127930 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16947;
     Object term16967;

    public SimplexTableau_equals_145006127930() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term16969 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term16968 = ((Class) term16969).getDeclaredField((String) "GEQ");
        ((Field) term16968).setAccessible(true);
        Object enum55 = ((Field) term16968).get((Object) null);
        Object term16952 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term16952, term16952.getClass(), "coefficients", null);
        setField(term16952, term16952.getClass(), "relationship", enum55);
        setDoubleField(term16952, term16952.getClass(), "value", 0.2440697646709713);
        Class<? extends Object> term17265 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term17264 = ((Class) term17265).getDeclaredField((String) "LEQ");
        ((Field) term17264).setAccessible(true);
        Object enum56 = ((Field) term17264).get((Object) null);
        Object term16956 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term16956, term16956.getClass(), "coefficients", null);
        setField(term16956, term16956.getClass(), "relationship", enum56);
        setDoubleField(term16956, term16956.getClass(), "value", 0.7977455176064363);
        ArrayList term16950 = new ArrayList();
        ((ArrayList) term16950).add(term16952);
        ((ArrayList) term16950).add(term16956);
        term16947 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term16948 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearObjectiveFunction"));
        setField(term16948, term16948.getClass(), "coefficients", null);
        setDoubleField(term16948, term16948.getClass(), "constantTerm", 0.1858089882752998);
        setField(term16947, term16947.getClass(), "f", term16948);
        setField(term16947, term16947.getClass(), "constraints", term16950);
        setBooleanField(term16947, term16947.getClass(), "restrictToNonNegative", true);
        setField(term16947, term16947.getClass(), "tableau", null);
        setIntField(term16947, term16947.getClass(), "numDecisionVariables", -1547384488);
        setIntField(term16947, term16947.getClass(), "numSlackVariables", 1442160736);
        setIntField(term16947, term16947.getClass(), "numArtificialVariables", 1114000454);
        setDoubleField(term16947, term16947.getClass(), "epsilon", 0.5329919447422633);
        term16967 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term16967;
        callMethod(klass, "equals", argTypes, term16947, args);
    }

};


