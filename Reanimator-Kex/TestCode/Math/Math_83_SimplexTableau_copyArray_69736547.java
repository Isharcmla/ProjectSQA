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

public class SimplexTableau_copyArray_69736547 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6484;
     Object term6500;
     Object term6510;
     Object term6514;

    public SimplexTableau_copyArray_69736547() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term42148 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term42147 = ((Class) term42148).getDeclaredField((String) "GEQ");
        ((Field) term42147).setAccessible(true);
        Object enum103 = ((Field) term42147).get((Object) null);
        Object term6489 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term6489, term6489.getClass(), "coefficients", null);
        setField(term6489, term6489.getClass(), "relationship", enum103);
        setDoubleField(term6489, term6489.getClass(), "value", 0.43337207054070237);
        ArrayList term6487 = new ArrayList();
        ((ArrayList) term6487).add(term6489);
        term6484 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term6485 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearObjectiveFunction"));
        setField(term6485, term6485.getClass(), "coefficients", null);
        setDoubleField(term6485, term6485.getClass(), "constantTerm", 0.3227335400819148);
        setField(term6484, term6484.getClass(), "f", term6485);
        setField(term6484, term6484.getClass(), "constraints", term6487);
        setBooleanField(term6484, term6484.getClass(), "restrictToNonNegative", true);
        setField(term6484, term6484.getClass(), "tableau", null);
        setIntField(term6484, term6484.getClass(), "numDecisionVariables", -226514366);
        setIntField(term6484, term6484.getClass(), "numSlackVariables", 1193880199);
        setIntField(term6484, term6484.getClass(), "numArtificialVariables", -1087774327);
        setDoubleField(term6484, term6484.getClass(), "epsilon", 0.13246999699526574);
        term6500 = (double[]) newDoubleArray(9);
        setDoubleElement(term6500, 0, 0.9126850255993704);
        setDoubleElement(term6500, 1, 0.11179067076100713);
        setDoubleElement(term6500, 2, 0.5306473989087822);
        setDoubleElement(term6500, 3, 0.022483645678509023);
        setDoubleElement(term6500, 4, 0.025133051616627267);
        setDoubleElement(term6500, 5, 0.016575281023182953);
        setDoubleElement(term6500, 6, 0.5308350402051779);
        setDoubleElement(term6500, 7, 0.7154795600170818);
        setDoubleElement(term6500, 8, 0.6355029654528058);
        term6510 = (double[]) newDoubleArray(3);
        setDoubleElement(term6510, 0, 0.0022646783892913414);
        setDoubleElement(term6510, 1, 0.36226058076369927);
        setDoubleElement(term6510, 2, 0.03699061125289671);
        term6514 = new Integer(-1530420153);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        argTypes[1] = Array.newInstance(double.class, 0).getClass();
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term6500;
        args[1] = term6510;
        args[2] = term6514;
        try {
            callMethod(klass, "copyArray", argTypes, term6484, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


