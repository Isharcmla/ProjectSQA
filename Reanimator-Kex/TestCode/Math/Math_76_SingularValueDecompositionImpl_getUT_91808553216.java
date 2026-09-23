package org.apache.commons.math.linear;

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
import static org.apache.commons.math.linear.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class SingularValueDecompositionImpl_getUT_91808553216 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term120;

    public SingularValueDecompositionImpl_getUT_91808553216() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term120 = newInstance(Class.forName("org.apache.commons.math.linear.SingularValueDecompositionImpl"));
        Object term123 = newInstance(Class.forName("org.apache.commons.math.linear.BiDiagonalTransformer"));
        Object[] term124 = (Object[]) newArray("[D", 2);
        double[] term125 = (double[]) newDoubleArray(3);
        double[] term129 = (double[]) newDoubleArray(1);
        double[] term131 = (double[]) newDoubleArray(0);
        double[] term132 = (double[]) newDoubleArray(2);
        double[] term135 = (double[]) newDoubleArray(8);
        double[] term144 = (double[]) newDoubleArray(6);
        double[] term151 = (double[]) newDoubleArray(2);
        double[] term154 = (double[]) newDoubleArray(1);
        double[] term156 = (double[]) newDoubleArray(9);
        setIntField(term120, term120.getClass(), "m", 391863371);
        setIntField(term120, term120.getClass(), "n", -1922583790);
        setDoubleElement(term125, 0, 0.6862221294683138);
        setDoubleElement(term125, 1, 0.15917839663695388);
        setDoubleElement(term125, 2, 0.9374115574082594);
        setElement(term124, 0, term125);
        setDoubleElement(term129, 0, 0.8454723071922143);
        setElement(term124, 1, term129);
        setField(term123, term123.getClass(), "householderVectors", term124);
        setField(term123, term123.getClass(), "main", term131);
        setDoubleElement(term132, 0, 0.8566567697571895);
        setDoubleElement(term132, 1, 0.9203805380592256);
        setField(term123, term123.getClass(), "secondary", term132);
        setField(term123, term123.getClass(), "cachedU", null);
        setField(term123, term123.getClass(), "cachedB", null);
        setField(term123, term123.getClass(), "cachedV", null);
        setField(term120, term120.getClass(), "transformer", term123);
        setDoubleElement(term135, 0, 0.5804948995371725);
        setDoubleElement(term135, 1, 0.20737514139742264);
        setDoubleElement(term135, 2, 0.7919370314903882);
        setDoubleElement(term135, 3, 0.2109867221632754);
        setDoubleElement(term135, 4, 0.3227335400819148);
        setDoubleElement(term135, 5, 0.43337207054070237);
        setDoubleElement(term135, 6, 0.13246999699526574);
        setDoubleElement(term135, 7, 0.9126850255993704);
        setField(term120, term120.getClass(), "mainBidiagonal", term135);
        setDoubleElement(term144, 0, 0.11179067076100713);
        setDoubleElement(term144, 1, 0.5306473989087822);
        setDoubleElement(term144, 2, 0.022483645678509023);
        setDoubleElement(term144, 3, 0.025133051616627267);
        setDoubleElement(term144, 4, 0.016575281023182953);
        setDoubleElement(term144, 5, 0.5308350402051779);
        setField(term120, term120.getClass(), "secondaryBidiagonal", term144);
        setDoubleElement(term151, 0, 0.7154795600170818);
        setDoubleElement(term151, 1, 0.6355029654528058);
        setField(term120, term120.getClass(), "mainTridiagonal", term151);
        setDoubleElement(term154, 0, 0.0022646783892913414);
        setField(term120, term120.getClass(), "secondaryTridiagonal", term154);
        setField(term120, term120.getClass(), "eigenDecomposition", null);
        setDoubleElement(term156, 0, 0.36226058076369927);
        setDoubleElement(term156, 1, 0.03699061125289671);
        setDoubleElement(term156, 2, 0.6047137830113202);
        setDoubleElement(term156, 3, 0.6767213143579776);
        setDoubleElement(term156, 4, 0.48862955528902696);
        setDoubleElement(term156, 5, 0.426231085465289);
        setDoubleElement(term156, 6, 0.0027299293098262956);
        setDoubleElement(term156, 7, 0.29874017652881824);
        setDoubleElement(term156, 8, 0.32554480512985284);
        setField(term120, term120.getClass(), "singularValues", term156);
        setField(term120, term120.getClass(), "cachedU", null);
        setField(term120, term120.getClass(), "cachedUt", null);
        setField(term120, term120.getClass(), "cachedS", null);
        setField(term120, term120.getClass(), "cachedV", null);
        setField(term120, term120.getClass(), "cachedVt", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.SingularValueDecompositionImpl");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getUT", argTypes, term120, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


