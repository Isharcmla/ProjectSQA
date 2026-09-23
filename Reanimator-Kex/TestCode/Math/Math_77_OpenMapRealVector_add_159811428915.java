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

public class OpenMapRealVector_add_159811428915 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1076;
     Object term1183;

    public OpenMapRealVector_add_159811428915() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1076 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealVector"));
        Object term1077 = newInstance(Class.forName("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] term1078 = (int[]) newIntArray(32);
        double[] term1111 = (double[]) newDoubleArray(32);
        byte[] term1144 = (byte[]) newByteArray(32);
        setField(term1077, term1077.getClass(), "keys", term1078);
        setField(term1077, term1077.getClass(), "values", term1111);
        setField(term1077, term1077.getClass(), "states", term1144);
        setDoubleField(term1077, term1077.getClass(), "missingEntries", 0.0);
        setIntField(term1077, term1077.getClass(), "size", 0);
        setIntField(term1077, term1077.getClass(), "mask", 31);
        setIntField(term1077, term1077.getClass(), "count", 0);
        setField(term1076, term1076.getClass(), "entries", term1077);
        setIntField(term1076, term1076.getClass(), "virtualSize", 1134449235);
        setDoubleField(term1076, term1076.getClass(), "epsilon", 1.0E-12);
        term1183 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealVector"));
        Object term1184 = newInstance(Class.forName("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] term1185 = (int[]) newIntArray(32);
        double[] term1218 = (double[]) newDoubleArray(32);
        byte[] term1251 = (byte[]) newByteArray(32);
        setField(term1184, term1184.getClass(), "keys", term1185);
        setField(term1184, term1184.getClass(), "values", term1218);
        setField(term1184, term1184.getClass(), "states", term1251);
        setDoubleField(term1184, term1184.getClass(), "missingEntries", 0.0);
        setIntField(term1184, term1184.getClass(), "size", 0);
        setIntField(term1184, term1184.getClass(), "mask", 31);
        setIntField(term1184, term1184.getClass(), "count", 0);
        setField(term1183, term1183.getClass(), "entries", term1184);
        setIntField(term1183, term1183.getClass(), "virtualSize", -883034806);
        setDoubleField(term1183, term1183.getClass(), "epsilon", 1.0E-12);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.OpenMapRealVector");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.linear.OpenMapRealVector");
        Object[] args = new Object[1];
        args[0] = term1183;
        callMethod(klass, "add", argTypes, term1076, args);
    }

};


