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
import java.lang.Double;

public class OpenMapRealVector_mapAdd_15826410742 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7835;
     Object term7942;

    public OpenMapRealVector_mapAdd_15826410742() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7835 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealVector"));
        Object term7836 = newInstance(Class.forName("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] term7837 = (int[]) newIntArray(32);
        double[] term7870 = (double[]) newDoubleArray(32);
        byte[] term7903 = (byte[]) newByteArray(32);
        setField(term7836, term7836.getClass(), "keys", term7837);
        setField(term7836, term7836.getClass(), "values", term7870);
        setField(term7836, term7836.getClass(), "states", term7903);
        setDoubleField(term7836, term7836.getClass(), "missingEntries", 0.0);
        setIntField(term7836, term7836.getClass(), "size", 0);
        setIntField(term7836, term7836.getClass(), "mask", 31);
        setIntField(term7836, term7836.getClass(), "count", 0);
        setField(term7835, term7835.getClass(), "entries", term7836);
        setIntField(term7835, term7835.getClass(), "virtualSize", 579005622);
        setDoubleField(term7835, term7835.getClass(), "epsilon", 1.0E-12);
        term7942 = new Double(0.5279279537140873);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.OpenMapRealVector");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = term7942;
        callMethod(klass, "mapAdd", argTypes, term7835, args);
    }

};


