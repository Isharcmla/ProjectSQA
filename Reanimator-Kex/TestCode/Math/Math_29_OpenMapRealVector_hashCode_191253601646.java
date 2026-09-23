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

public class OpenMapRealVector_hashCode_191253601646 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8810;

    public OpenMapRealVector_hashCode_191253601646() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8810 = newInstance(Class.forName("org.apache.commons.math3.linear.OpenMapRealVector"));
        Object term8811 = newInstance(Class.forName("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] term8812 = (int[]) newIntArray(32);
        double[] term8845 = (double[]) newDoubleArray(32);
        byte[] term8878 = (byte[]) newByteArray(32);
        setField(term8811, term8811.getClass(), "keys", term8812);
        setField(term8811, term8811.getClass(), "values", term8845);
        setField(term8811, term8811.getClass(), "states", term8878);
        setDoubleField(term8811, term8811.getClass(), "missingEntries", 0.0);
        setIntField(term8811, term8811.getClass(), "size", 0);
        setIntField(term8811, term8811.getClass(), "mask", 31);
        setIntField(term8811, term8811.getClass(), "count", 0);
        setField(term8810, term8810.getClass(), "entries", term8811);
        setIntField(term8810, term8810.getClass(), "virtualSize", 292681826);
        setDoubleField(term8810, term8810.getClass(), "epsilon", 1.0E-12);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.linear.OpenMapRealVector");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term8810, args);
    }

};


