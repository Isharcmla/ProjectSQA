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

public class OpenMapRealVector_append_517582264147 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term149135;
     Object term149345;

    public OpenMapRealVector_append_517582264147() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term149135 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealVector"));
        Object term149243 = newInstance(Class.forName("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] term147470 = (int[]) newIntArray(0);
        setIntField(term149135, term149135.getClass(), "virtualSize", 0);
        setField(term149243, term149243.getClass(), "keys", term147470);
        setField(term149243, term149243.getClass(), "values", null);
        setField(term149243, term149243.getClass(), "states", null);
        setDoubleField(term149243, term149243.getClass(), "missingEntries", 0.0);
        setIntField(term149243, term149243.getClass(), "size", 0);
        setIntField(term149243, term149243.getClass(), "mask", 0);
        setIntField(term149243, term149243.getClass(), "count", 0);
        setField(term149135, term149135.getClass(), "entries", term149243);
        setDoubleField(term149135, term149135.getClass(), "epsilon", 0.0);
        term149345 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealVector"));
        Object term149453 = newInstance(Class.forName("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] term147486 = (byte[]) newByteArray(493);
        setIntField(term149345, term149345.getClass(), "virtualSize", 0);
        setIntField(term149453, term149453.getClass(), "count", 0);
        setByteElement(term147486, 0, (byte) -128);
        setByteElement(term147486, 1, (byte) -128);
        setByteElement(term147486, 2, (byte) 1);
        setField(term149453, term149453.getClass(), "states", term147486);
        setField(term149345, term149345.getClass(), "entries", term149453);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.OpenMapRealVector");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.linear.OpenMapRealVector");
        Object[] args = new Object[1];
        args[0] = term149345;
        callMethod(klass, "append", argTypes, term149135, args);
    }

};


