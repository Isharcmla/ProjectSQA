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

public class OpenMapRealVector_append_6132433796 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term98546;
     Object term98760;

    public OpenMapRealVector_append_6132433796() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term98546 = newInstance(Class.forName("org.apache.commons.math3.linear.OpenMapRealVector"));
        Object term98656 = newInstance(Class.forName("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] term92857 = (int[]) newIntArray(0);
        setIntField(term98546, term98546.getClass(), "virtualSize", 0);
        setField(term98656, term98656.getClass(), "keys", term92857);
        setField(term98656, term98656.getClass(), "values", null);
        setField(term98656, term98656.getClass(), "states", null);
        setDoubleField(term98656, term98656.getClass(), "missingEntries", 0.0);
        setIntField(term98656, term98656.getClass(), "size", 0);
        setIntField(term98656, term98656.getClass(), "mask", 0);
        setIntField(term98656, term98656.getClass(), "count", 0);
        setField(term98546, term98546.getClass(), "entries", term98656);
        setDoubleField(term98546, term98546.getClass(), "epsilon", 0.0);
        term98760 = newInstance(Class.forName("org.apache.commons.math3.linear.OpenMapRealVector"));
        Object term98870 = newInstance(Class.forName("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        byte[] term92873 = (byte[]) newByteArray(495);
        setIntField(term98760, term98760.getClass(), "virtualSize", 0);
        setIntField(term98870, term98870.getClass(), "count", 0);
        setByteElement(term92873, 0, (byte) -128);
        setByteElement(term92873, 1, (byte) -128);
        setByteElement(term92873, 2, (byte) -128);
        setByteElement(term92873, 3, (byte) -128);
        setByteElement(term92873, 4, (byte) -128);
        setByteElement(term92873, 5, (byte) -128);
        setByteElement(term92873, 6, (byte) -128);
        setByteElement(term92873, 7, (byte) -128);
        setByteElement(term92873, 8, (byte) -128);
        setByteElement(term92873, 9, (byte) -128);
        setByteElement(term92873, 10, (byte) 1);
        setField(term98870, term98870.getClass(), "states", term92873);
        setField(term98760, term98760.getClass(), "entries", term98870);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.linear.OpenMapRealVector");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math3.linear.OpenMapRealVector");
        Object[] args = new Object[1];
        args[0] = term98760;
        callMethod(klass, "append", argTypes, term98546, args);
    }

};


