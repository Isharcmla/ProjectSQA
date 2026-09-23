package org.apache.commons.math3.linear;

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
import static org.apache.commons.math3.linear.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class OpenMapRealVector_projection_154928892237 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6772;

    public OpenMapRealVector_projection_154928892237() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6772 = newInstance(Class.forName("org.apache.commons.math3.linear.OpenMapRealVector"));
        Object term6773 = newInstance(Class.forName("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] term6774 = (int[]) newIntArray(32);
        double[] term6807 = (double[]) newDoubleArray(32);
        byte[] term6840 = (byte[]) newByteArray(32);
        setField(term6773, term6773.getClass(), "keys", term6774);
        setField(term6773, term6773.getClass(), "values", term6807);
        setField(term6773, term6773.getClass(), "states", term6840);
        setDoubleField(term6773, term6773.getClass(), "missingEntries", 0.0);
        setIntField(term6773, term6773.getClass(), "size", 0);
        setIntField(term6773, term6773.getClass(), "mask", 31);
        setIntField(term6773, term6773.getClass(), "count", 0);
        setField(term6772, term6772.getClass(), "entries", term6773);
        setIntField(term6772, term6772.getClass(), "virtualSize", -157887805);
        setDoubleField(term6772, term6772.getClass(), "epsilon", 1.0E-12);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.linear.OpenMapRealVector");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math3.linear.RealVector");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "projection", argTypes, term6772, args);
    }

};


