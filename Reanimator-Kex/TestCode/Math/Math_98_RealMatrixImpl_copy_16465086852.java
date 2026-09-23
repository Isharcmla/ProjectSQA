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
import java.lang.ArrayIndexOutOfBoundsException;
import static org.apache.commons.math.linear.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class RealMatrixImpl_copy_16465086852 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term81;

    public RealMatrixImpl_copy_16465086852() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term81 = newInstance(Class.forName("org.apache.commons.math.linear.RealMatrixImpl"));
        Object[] term82 = (Object[]) newArray("[D", 6);
        double[] term83 = (double[]) newDoubleArray(5);
        double[] term89 = (double[]) newDoubleArray(5);
        double[] term95 = (double[]) newDoubleArray(2);
        double[] term98 = (double[]) newDoubleArray(3);
        double[] term102 = (double[]) newDoubleArray(1);
        double[] term104 = (double[]) newDoubleArray(0);
        Object[] term105 = (Object[]) newArray("[D", 2);
        double[] term106 = (double[]) newDoubleArray(8);
        double[] term115 = (double[]) newDoubleArray(6);
        int[] term122 = (int[]) newIntArray(2);
        setDoubleElement(term83, 0, 0.2852810965221698);
        setDoubleElement(term83, 1, 0.6300849762307866);
        setDoubleElement(term83, 2, 0.9737083944266686);
        setDoubleElement(term83, 3, 0.0668892744806211);
        setDoubleElement(term83, 4, 0.3587267442738795);
        setElement(term82, 0, term83);
        setDoubleElement(term89, 0, 0.07802449704920456);
        setDoubleElement(term89, 1, 0.5279279537140873);
        setDoubleElement(term89, 2, 0.3202192021706908);
        setDoubleElement(term89, 3, 0.22651340641904605);
        setDoubleElement(term89, 4, 0.8878841294187743);
        setElement(term82, 1, term89);
        setDoubleElement(term95, 0, 0.6588948704887806);
        setDoubleElement(term95, 1, 0.6397214730945112);
        setElement(term82, 2, term95);
        setDoubleElement(term98, 0, 0.25937345430928016);
        setDoubleElement(term98, 1, 0.5873228247510078);
        setDoubleElement(term98, 2, 0.8823181080774973);
        setElement(term82, 3, term98);
        setDoubleElement(term102, 0, 0.2192450926212024);
        setElement(term82, 4, term102);
        setElement(term82, 5, term104);
        setField(term81, term81.getClass(), "data", term82);
        setDoubleElement(term106, 0, 0.7591353014991907);
        setDoubleElement(term106, 1, 0.791695029600875);
        setDoubleElement(term106, 2, 0.6862221294683138);
        setDoubleElement(term106, 3, 0.15917839663695388);
        setDoubleElement(term106, 4, 0.9374115574082594);
        setDoubleElement(term106, 5, 0.8454723071922143);
        setDoubleElement(term106, 6, 0.8566567697571895);
        setDoubleElement(term106, 7, 0.9203805380592256);
        setElement(term105, 0, term106);
        setDoubleElement(term115, 0, 0.5804948995371725);
        setDoubleElement(term115, 1, 0.20737514139742264);
        setDoubleElement(term115, 2, 0.7919370314903882);
        setDoubleElement(term115, 3, 0.2109867221632754);
        setDoubleElement(term115, 4, 0.3227335400819148);
        setDoubleElement(term115, 5, 0.43337207054070237);
        setElement(term105, 1, term115);
        setField(term81, term81.getClass(), "lu", term105);
        setIntElement(term122, 0, 1484323161);
        setIntElement(term122, 1, 391863371);
        setField(term81, term81.getClass(), "permutation", term122);
        setIntField(term81, term81.getClass(), "parity", 1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.RealMatrixImpl");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "copy", argTypes, term81, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


