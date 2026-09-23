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
import java.lang.Integer;
import java.lang.Double;

public class OpenMapRealVector_setEntry_111564701638 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6975;
     Object term7082;
     Object term7084;

    public OpenMapRealVector_setEntry_111564701638() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6975 = newInstance(Class.forName("org.apache.commons.math3.linear.OpenMapRealVector"));
        Object term6976 = newInstance(Class.forName("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] term6977 = (int[]) newIntArray(32);
        double[] term7010 = (double[]) newDoubleArray(32);
        byte[] term7043 = (byte[]) newByteArray(32);
        setField(term6976, term6976.getClass(), "keys", term6977);
        setField(term6976, term6976.getClass(), "values", term7010);
        setField(term6976, term6976.getClass(), "states", term7043);
        setDoubleField(term6976, term6976.getClass(), "missingEntries", 0.0);
        setIntField(term6976, term6976.getClass(), "size", 0);
        setIntField(term6976, term6976.getClass(), "mask", 31);
        setIntField(term6976, term6976.getClass(), "count", 0);
        setField(term6975, term6975.getClass(), "entries", term6976);
        setIntField(term6975, term6975.getClass(), "virtualSize", 1876565163);
        setDoubleField(term6975, term6975.getClass(), "epsilon", 1.0E-12);
        term7082 = new Integer(-817164822);
        term7084 = new Double(0.2779719046761513);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.linear.OpenMapRealVector");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = double.class;
        Object[] args = new Object[2];
        args[0] = term7082;
        args[1] = term7084;
        callMethod(klass, "setEntry", argTypes, term6975, args);
    }

};


