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

public class OpenMapRealVector_append_517582264135 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term140546;
     Object term140756;

    public OpenMapRealVector_append_517582264135() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term140546 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealVector"));
        Object term140654 = newInstance(Class.forName("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] term136397 = (int[]) newIntArray(0);
        setIntField(term140546, term140546.getClass(), "virtualSize", 0);
        setField(term140654, term140654.getClass(), "keys", term136397);
        setField(term140654, term140654.getClass(), "values", null);
        setField(term140654, term140654.getClass(), "states", null);
        setDoubleField(term140654, term140654.getClass(), "missingEntries", 0.0);
        setIntField(term140654, term140654.getClass(), "size", 0);
        setIntField(term140654, term140654.getClass(), "mask", 0);
        setIntField(term140654, term140654.getClass(), "count", 0);
        setField(term140546, term140546.getClass(), "entries", term140654);
        setDoubleField(term140546, term140546.getClass(), "epsilon", 0.0);
        term140756 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealVector"));
        Object term140864 = newInstance(Class.forName("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] term136413 = (byte[]) newByteArray(491);
        setIntField(term140756, term140756.getClass(), "virtualSize", 0);
        setIntField(term140864, term140864.getClass(), "count", 0);
        setByteElement(term136413, 0, (byte) -128);
        setByteElement(term136413, 1, (byte) -128);
        setByteElement(term136413, 2, (byte) -128);
        setByteElement(term136413, 3, (byte) -128);
        setByteElement(term136413, 4, (byte) -128);
        setByteElement(term136413, 5, (byte) -128);
        setByteElement(term136413, 6, (byte) -128);
        setByteElement(term136413, 7, (byte) 1);
        setField(term140864, term140864.getClass(), "states", term136413);
        setField(term140756, term140756.getClass(), "entries", term140864);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.OpenMapRealVector");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.linear.OpenMapRealVector");
        Object[] args = new Object[1];
        args[0] = term140756;
        callMethod(klass, "append", argTypes, term140546, args);
    }

};


