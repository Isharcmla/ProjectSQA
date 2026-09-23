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
import java.lang.ArrayIndexOutOfBoundsException;
import static org.apache.commons.math.optimization.linear.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.String;
import java.lang.Integer;

public class SimplexTableau_copyArray_69736542 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5252;
     Object term5272;
     Object term5281;
     Object term5288;

    public SimplexTableau_copyArray_69736542() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term36698 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term36697 = ((Class) term36698).getDeclaredField((String) "LEQ");
        ((Field) term36697).setAccessible(true);
        Object enum91 = ((Field) term36697).get((Object) null);
        Object term5257 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term5257, term5257.getClass(), "coefficients", null);
        setField(term5257, term5257.getClass(), "relationship", enum91);
        setDoubleField(term5257, term5257.getClass(), "value", 0.791695029600875);
        Class<? extends Object> term36994 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term36993 = ((Class) term36994).getDeclaredField((String) "GEQ");
        ((Field) term36993).setAccessible(true);
        Object enum92 = ((Field) term36993).get((Object) null);
        Object term5261 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term5261, term5261.getClass(), "coefficients", null);
        setField(term5261, term5261.getClass(), "relationship", enum92);
        setDoubleField(term5261, term5261.getClass(), "value", 0.6862221294683138);
        ArrayList term5255 = new ArrayList();
        ((ArrayList) term5255).add(term5257);
        ((ArrayList) term5255).add(term5261);
        term5252 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term5253 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearObjectiveFunction"));
        setField(term5253, term5253.getClass(), "coefficients", null);
        setDoubleField(term5253, term5253.getClass(), "constantTerm", 0.7591353014991907);
        setField(term5252, term5252.getClass(), "f", term5253);
        setField(term5252, term5252.getClass(), "constraints", term5255);
        setBooleanField(term5252, term5252.getClass(), "restrictToNonNegative", false);
        setField(term5252, term5252.getClass(), "tableau", null);
        setIntField(term5252, term5252.getClass(), "numDecisionVariables", 1135664017);
        setIntField(term5252, term5252.getClass(), "numSlackVariables", 590364439);
        setIntField(term5252, term5252.getClass(), "numArtificialVariables", 865208305);
        setDoubleField(term5252, term5252.getClass(), "epsilon", 0.15917839663695388);
        term5272 = (double[]) newDoubleArray(8);
        setDoubleElement(term5272, 0, 0.9374115574082594);
        setDoubleElement(term5272, 1, 0.8454723071922143);
        setDoubleElement(term5272, 2, 0.8566567697571895);
        setDoubleElement(term5272, 3, 0.9203805380592256);
        setDoubleElement(term5272, 4, 0.5804948995371725);
        setDoubleElement(term5272, 5, 0.20737514139742264);
        setDoubleElement(term5272, 6, 0.7919370314903882);
        setDoubleElement(term5272, 7, 0.2109867221632754);
        term5281 = (double[]) newDoubleArray(6);
        setDoubleElement(term5281, 0, 0.3227335400819148);
        setDoubleElement(term5281, 1, 0.43337207054070237);
        setDoubleElement(term5281, 2, 0.13246999699526574);
        setDoubleElement(term5281, 3, 0.9126850255993704);
        setDoubleElement(term5281, 4, 0.11179067076100713);
        setDoubleElement(term5281, 5, 0.5306473989087822);
        term5288 = new Integer(-1275173084);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        argTypes[1] = Array.newInstance(double.class, 0).getClass();
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term5272;
        args[1] = term5281;
        args[2] = term5288;
        try {
            callMethod(klass, "copyArray", argTypes, term5252, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


