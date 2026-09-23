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
import org.apache.commons.math.exception.NotStrictlyPositiveException;
import static org.apache.commons.math.optimization.linear.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.String;
import java.lang.Boolean;

public class SimplexTableau_createTableau_21948956035 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1048;
     Object term1081;

    public SimplexTableau_createTableau_21948956035() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term28336 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term28335 = ((Class) term28336).getDeclaredField((String) "LEQ");
        ((Field) term28335).setAccessible(true);
        Object enum62 = ((Field) term28335).get((Object) null);
        Object term1053 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term1053, term1053.getClass(), "coefficients", null);
        setField(term1053, term1053.getClass(), "relationship", enum62);
        setDoubleField(term1053, term1053.getClass(), "value", 0.8474802076607362);
        Class<? extends Object> term28632 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term28631 = ((Class) term28632).getDeclaredField((String) "EQ");
        ((Field) term28631).setAccessible(true);
        Object enum63 = ((Field) term28631).get((Object) null);
        Object term1057 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term1057, term1057.getClass(), "coefficients", null);
        setField(term1057, term1057.getClass(), "relationship", enum63);
        setDoubleField(term1057, term1057.getClass(), "value", 0.5183269973490326);
        Class<? extends Object> term28925 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term28924 = ((Class) term28925).getDeclaredField((String) "EQ");
        ((Field) term28924).setAccessible(true);
        Object enum64 = ((Field) term28924).get((Object) null);
        Object term1061 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term1061, term1061.getClass(), "coefficients", null);
        setField(term1061, term1061.getClass(), "relationship", enum64);
        setDoubleField(term1061, term1061.getClass(), "value", 0.7655020693602768);
        Object term1065 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term1065, term1065.getClass(), "coefficients", null);
        setField(term1065, term1065.getClass(), "relationship", enum64);
        setDoubleField(term1065, term1065.getClass(), "value", 0.1374549299694151);
        Object term1067 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term1067, term1067.getClass(), "coefficients", null);
        setField(term1067, term1067.getClass(), "relationship", enum64);
        setDoubleField(term1067, term1067.getClass(), "value", 0.7031006357544823);
        ArrayList term1051 = new ArrayList();
        ((ArrayList) term1051).add(term1053);
        ((ArrayList) term1051).add(term1057);
        ((ArrayList) term1051).add(term1061);
        ((ArrayList) term1051).add(term1065);
        ((ArrayList) term1051).add(term1067);
        ArrayList term1072 = new ArrayList();
        term1048 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term1049 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearObjectiveFunction"));
        setField(term1049, term1049.getClass(), "coefficients", null);
        setDoubleField(term1049, term1049.getClass(), "constantTerm", 0.37773193782763337);
        setField(term1048, term1048.getClass(), "f", term1049);
        setField(term1048, term1048.getClass(), "constraints", term1051);
        setBooleanField(term1048, term1048.getClass(), "restrictToNonNegative", false);
        setField(term1048, term1048.getClass(), "columnLabels", term1072);
        setField(term1048, term1048.getClass(), "tableau", null);
        setIntField(term1048, term1048.getClass(), "numDecisionVariables", -1922583790);
        setIntField(term1048, term1048.getClass(), "numSlackVariables", -616727354);
        setIntField(term1048, term1048.getClass(), "numArtificialVariables", -1955890973);
        setDoubleField(term1048, term1048.getClass(), "epsilon", 0.9527281779865117);
        setIntField(term1048, term1048.getClass(), "maxUlps", -2038273078);
        term1081 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term1081;
        try {
            callMethod(klass, "createTableau", argTypes, term1048, args);
            assertTrue(false);
        }
        catch (NotStrictlyPositiveException e) {
        }

    }

};


