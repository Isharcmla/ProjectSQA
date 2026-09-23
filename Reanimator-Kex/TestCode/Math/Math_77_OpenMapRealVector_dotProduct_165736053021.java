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
import static org.apache.commons.math.linear.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class OpenMapRealVector_dotProduct_165736053021 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2705;
     Object term2812;

    public OpenMapRealVector_dotProduct_165736053021() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2705 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealVector"));
        Object term2706 = newInstance(Class.forName("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] term2707 = (int[]) newIntArray(32);
        double[] term2740 = (double[]) newDoubleArray(32);
        byte[] term2773 = (byte[]) newByteArray(32);
        setField(term2706, term2706.getClass(), "keys", term2707);
        setField(term2706, term2706.getClass(), "values", term2740);
        setField(term2706, term2706.getClass(), "states", term2773);
        setDoubleField(term2706, term2706.getClass(), "missingEntries", 0.0);
        setIntField(term2706, term2706.getClass(), "size", 0);
        setIntField(term2706, term2706.getClass(), "mask", 31);
        setIntField(term2706, term2706.getClass(), "count", 0);
        setField(term2705, term2705.getClass(), "entries", term2706);
        setIntField(term2705, term2705.getClass(), "virtualSize", -655067527);
        setDoubleField(term2705, term2705.getClass(), "epsilon", 1.0E-12);
        term2812 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealVector"));
        Object term2813 = newInstance(Class.forName("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] term2814 = (int[]) newIntArray(32);
        double[] term2847 = (double[]) newDoubleArray(32);
        byte[] term2880 = (byte[]) newByteArray(32);
        setField(term2813, term2813.getClass(), "keys", term2814);
        setField(term2813, term2813.getClass(), "values", term2847);
        setField(term2813, term2813.getClass(), "states", term2880);
        setDoubleField(term2813, term2813.getClass(), "missingEntries", 0.0);
        setIntField(term2813, term2813.getClass(), "size", 0);
        setIntField(term2813, term2813.getClass(), "mask", 31);
        setIntField(term2813, term2813.getClass(), "count", 0);
        setField(term2812, term2812.getClass(), "entries", term2813);
        setIntField(term2812, term2812.getClass(), "virtualSize", -6029667);
        setDoubleField(term2812, term2812.getClass(), "epsilon", 1.0E-12);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.OpenMapRealVector");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.linear.OpenMapRealVector");
        Object[] args = new Object[1];
        args[0] = term2812;
        callMethod(klass, "dotProduct", argTypes, term2705, args);
    }

};


