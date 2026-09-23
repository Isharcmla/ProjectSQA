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
import org.apache.commons.math3.exception.NotStrictlyPositiveException;
import static org.apache.commons.math3.optimization.linear.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.String;
import java.lang.Boolean;

public class SimplexTableau_createTableau_147643722635 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1063;
     Object term1096;

    public SimplexTableau_createTableau_147643722635() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term29934 = Class.forName((String) "org.apache.commons.math3.optimization.linear.Relationship");
        Field term29933 = ((Class) term29934).getDeclaredField((String) "LEQ");
        ((Field) term29933).setAccessible(true);
        Object enum60 = ((Field) term29933).get((Object) null);
        Object term1068 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.LinearConstraint"));
        setField(term1068, term1068.getClass(), "coefficients", null);
        setField(term1068, term1068.getClass(), "relationship", enum60);
        setDoubleField(term1068, term1068.getClass(), "value", 0.8474802076607362);
        Class<? extends Object> term30235 = Class.forName((String) "org.apache.commons.math3.optimization.linear.Relationship");
        Field term30234 = ((Class) term30235).getDeclaredField((String) "EQ");
        ((Field) term30234).setAccessible(true);
        Object enum61 = ((Field) term30234).get((Object) null);
        Object term1072 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.LinearConstraint"));
        setField(term1072, term1072.getClass(), "coefficients", null);
        setField(term1072, term1072.getClass(), "relationship", enum61);
        setDoubleField(term1072, term1072.getClass(), "value", 0.5183269973490326);
        Class<? extends Object> term30533 = Class.forName((String) "org.apache.commons.math3.optimization.linear.Relationship");
        Field term30532 = ((Class) term30533).getDeclaredField((String) "EQ");
        ((Field) term30532).setAccessible(true);
        Object enum62 = ((Field) term30532).get((Object) null);
        Object term1076 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.LinearConstraint"));
        setField(term1076, term1076.getClass(), "coefficients", null);
        setField(term1076, term1076.getClass(), "relationship", enum62);
        setDoubleField(term1076, term1076.getClass(), "value", 0.7655020693602768);
        Object term1080 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.LinearConstraint"));
        setField(term1080, term1080.getClass(), "coefficients", null);
        setField(term1080, term1080.getClass(), "relationship", enum62);
        setDoubleField(term1080, term1080.getClass(), "value", 0.1374549299694151);
        Object term1082 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.LinearConstraint"));
        setField(term1082, term1082.getClass(), "coefficients", null);
        setField(term1082, term1082.getClass(), "relationship", enum62);
        setDoubleField(term1082, term1082.getClass(), "value", 0.7031006357544823);
        ArrayList term1066 = new ArrayList();
        ((ArrayList) term1066).add(term1068);
        ((ArrayList) term1066).add(term1072);
        ((ArrayList) term1066).add(term1076);
        ((ArrayList) term1066).add(term1080);
        ((ArrayList) term1066).add(term1082);
        ArrayList term1087 = new ArrayList();
        term1063 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.SimplexTableau"));
        Object term1064 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.LinearObjectiveFunction"));
        setField(term1064, term1064.getClass(), "coefficients", null);
        setDoubleField(term1064, term1064.getClass(), "constantTerm", 0.37773193782763337);
        setField(term1063, term1063.getClass(), "f", term1064);
        setField(term1063, term1063.getClass(), "constraints", term1066);
        setBooleanField(term1063, term1063.getClass(), "restrictToNonNegative", false);
        setField(term1063, term1063.getClass(), "columnLabels", term1087);
        setField(term1063, term1063.getClass(), "tableau", null);
        setIntField(term1063, term1063.getClass(), "numDecisionVariables", -1922583790);
        setIntField(term1063, term1063.getClass(), "numSlackVariables", -616727354);
        setIntField(term1063, term1063.getClass(), "numArtificialVariables", -1955890973);
        setDoubleField(term1063, term1063.getClass(), "epsilon", 0.9527281779865117);
        setIntField(term1063, term1063.getClass(), "maxUlps", -2038273078);
        term1096 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optimization.linear.SimplexTableau");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term1096;
        try {
            callMethod(klass, "createTableau", argTypes, term1063, args);
            assertTrue(false);
        }
        catch (NotStrictlyPositiveException e) {
        }

    }

};


