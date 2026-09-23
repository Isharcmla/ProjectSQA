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
import java.lang.NullPointerException;
import static org.apache.commons.math.optimization.linear.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.String;

public class SimplexTableau_getWidth_111858425548 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8340;

    public SimplexTableau_getWidth_111858425548() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term40960 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term40959 = ((Class) term40960).getDeclaredField((String) "GEQ");
        ((Field) term40959).setAccessible(true);
        Object enum94 = ((Field) term40959).get((Object) null);
        Object term8345 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term8345, term8345.getClass(), "coefficients", null);
        setField(term8345, term8345.getClass(), "relationship", enum94);
        setDoubleField(term8345, term8345.getClass(), "value", 0.5412182593116958);
        Class<? extends Object> term41256 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term41255 = ((Class) term41256).getDeclaredField((String) "GEQ");
        ((Field) term41255).setAccessible(true);
        Object enum95 = ((Field) term41255).get((Object) null);
        Object term8349 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term8349, term8349.getClass(), "coefficients", null);
        setField(term8349, term8349.getClass(), "relationship", enum95);
        setDoubleField(term8349, term8349.getClass(), "value", 0.16988691727397487);
        Class<? extends Object> term41552 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term41551 = ((Class) term41552).getDeclaredField((String) "EQ");
        ((Field) term41551).setAccessible(true);
        Object enum96 = ((Field) term41551).get((Object) null);
        Object term8353 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term8353, term8353.getClass(), "coefficients", null);
        setField(term8353, term8353.getClass(), "relationship", enum96);
        setDoubleField(term8353, term8353.getClass(), "value", 0.39286935532362843);
        Object term8357 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term8357, term8357.getClass(), "coefficients", null);
        setField(term8357, term8357.getClass(), "relationship", enum94);
        setDoubleField(term8357, term8357.getClass(), "value", 0.11577948268926874);
        Object term8359 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term8359, term8359.getClass(), "coefficients", null);
        setField(term8359, term8359.getClass(), "relationship", enum94);
        setDoubleField(term8359, term8359.getClass(), "value", 0.5617009352394552);
        Object term8361 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term8361, term8361.getClass(), "coefficients", null);
        setField(term8361, term8361.getClass(), "relationship", enum96);
        setDoubleField(term8361, term8361.getClass(), "value", 0.09067063848644474);
        Object term8363 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term8363, term8363.getClass(), "coefficients", null);
        setField(term8363, term8363.getClass(), "relationship", enum96);
        setDoubleField(term8363, term8363.getClass(), "value", 0.268304014379393);
        Object term8365 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term8365, term8365.getClass(), "coefficients", null);
        setField(term8365, term8365.getClass(), "relationship", null);
        setDoubleField(term8365, term8365.getClass(), "value", 0.0);
        Object term8367 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term8367, term8367.getClass(), "coefficients", null);
        setField(term8367, term8367.getClass(), "relationship", null);
        setDoubleField(term8367, term8367.getClass(), "value", 0.0);
        ArrayList term8343 = new ArrayList();
        ((ArrayList) term8343).add(term8345);
        ((ArrayList) term8343).add(term8349);
        ((ArrayList) term8343).add(term8353);
        ((ArrayList) term8343).add(term8357);
        ((ArrayList) term8343).add(term8359);
        ((ArrayList) term8343).add(term8361);
        ((ArrayList) term8343).add(term8363);
        ((ArrayList) term8343).add(term8365);
        ((ArrayList) term8343).add(term8367);
        ArrayList term8372 = new ArrayList();
        ((ArrayList) term8372).add("BndsHwAFMv");
        ((ArrayList) term8372).add("GzFkzHGYFt");
        ((ArrayList) term8372).add("tShwQLRGNe");
        ((ArrayList) term8372).add("LvtrsXUliU");
        term8340 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term8341 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearObjectiveFunction"));
        setField(term8341, term8341.getClass(), "coefficients", null);
        setDoubleField(term8341, term8341.getClass(), "constantTerm", 0.8819646072665548);
        setField(term8340, term8340.getClass(), "f", term8341);
        setField(term8340, term8340.getClass(), "constraints", term8343);
        setBooleanField(term8340, term8340.getClass(), "restrictToNonNegative", false);
        setField(term8340, term8340.getClass(), "columnLabels", term8372);
        setField(term8340, term8340.getClass(), "tableau", null);
        setIntField(term8340, term8340.getClass(), "numDecisionVariables", 0);
        setIntField(term8340, term8340.getClass(), "numSlackVariables", 0);
        setIntField(term8340, term8340.getClass(), "numArtificialVariables", 0);
        setDoubleField(term8340, term8340.getClass(), "epsilon", 0.0);
        setIntField(term8340, term8340.getClass(), "maxUlps", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getWidth", argTypes, term8340, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


