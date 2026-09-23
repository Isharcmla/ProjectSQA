package org.apache.commons.math.stat.descriptive.moment;

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
import org.apache.commons.math.exception.DimensionMismatchException;
import static org.apache.commons.math.stat.descriptive.moment.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Double;
import java.lang.Integer;

public class Variance_evaluate_13770333132 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term187;
     Object term202;
     Object term208;
     Object term211;
     Object term213;

    public Variance_evaluate_13770333132() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term187 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.Variance"));
        Object term188 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.SecondMoment"));
        double[] term196 = (double[]) newDoubleArray(5);
        setDoubleField(term188, term188.getClass(), "m2", Double.NaN);
        setLongField(term188, term188.getClass(), "n", 0L);
        setDoubleField(term188, term188.getClass(), "m1", Double.NaN);
        setDoubleField(term188, term188.getClass(), "dev", Double.NaN);
        setDoubleField(term188, term188.getClass(), "nDev", Double.NaN);
        setField(term188, term188.getClass(), "storedData", null);
        setField(term187, term187.getClass(), "moment", term188);
        setBooleanField(term187, term187.getClass(), "incMoment", true);
        setBooleanField(term187, term187.getClass(), "isBiasCorrected", true);
        setDoubleElement(term196, 0, 0.8823181080774973);
        setDoubleElement(term196, 1, 0.2192450926212024);
        setDoubleElement(term196, 2, 0.7591353014991907);
        setDoubleElement(term196, 3, 0.791695029600875);
        setDoubleElement(term196, 4, 0.6862221294683138);
        setField(term187, term187.getClass(), "storedData", term196);
        term202 = (double[]) newDoubleArray(5);
        setDoubleElement(term202, 0, 0.15917839663695388);
        setDoubleElement(term202, 1, 0.9374115574082594);
        setDoubleElement(term202, 2, 0.8454723071922143);
        setDoubleElement(term202, 3, 0.8566567697571895);
        setDoubleElement(term202, 4, 0.9203805380592256);
        term208 = (double[]) newDoubleArray(2);
        setDoubleElement(term208, 0, 0.5804948995371725);
        setDoubleElement(term208, 1, 0.20737514139742264);
        term211 = new Integer(1484323161);
        term213 = new Integer(391863371);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.descriptive.moment.Variance");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        argTypes[1] = Array.newInstance(double.class, 0).getClass();
        argTypes[2] = int.class;
        argTypes[3] = int.class;
        Object[] args = new Object[4];
        args[0] = term202;
        args[1] = term208;
        args[2] = term211;
        args[3] = term213;
        try {
            callMethod(klass, "evaluate", argTypes, term187, args);
            assertTrue(false);
        }
        catch (DimensionMismatchException e) {
        }

    }

};


