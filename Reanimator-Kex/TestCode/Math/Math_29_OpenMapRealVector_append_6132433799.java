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

public class OpenMapRealVector_append_6132433799 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term119555;
     Object term119769;

    public OpenMapRealVector_append_6132433799() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term119555 = newInstance(Class.forName("org.apache.commons.math3.linear.OpenMapRealVector"));
        Object term119665 = newInstance(Class.forName("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] term114825 = (int[]) newIntArray(516);
        setIntField(term119555, term119555.getClass(), "virtualSize", 0);
        setField(term119665, term119665.getClass(), "keys", term114825);
        setField(term119665, term119665.getClass(), "values", null);
        setField(term119665, term119665.getClass(), "states", null);
        setDoubleField(term119665, term119665.getClass(), "missingEntries", 0.0);
        setIntField(term119665, term119665.getClass(), "size", 0);
        setIntField(term119665, term119665.getClass(), "mask", 0);
        setIntField(term119665, term119665.getClass(), "count", 0);
        setField(term119555, term119555.getClass(), "entries", term119665);
        setDoubleField(term119555, term119555.getClass(), "epsilon", 0.0);
        term119769 = newInstance(Class.forName("org.apache.commons.math3.linear.OpenMapRealVector"));
        Object term119879 = newInstance(Class.forName("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        byte[] term118969 = (byte[]) newByteArray(17);
        setIntField(term119769, term119769.getClass(), "virtualSize", 0);
        setIntField(term119879, term119879.getClass(), "count", 0);
        setByteElement(term118969, 0, (byte) -128);
        setByteElement(term118969, 1, (byte) -128);
        setByteElement(term118969, 2, (byte) -128);
        setByteElement(term118969, 3, (byte) -128);
        setByteElement(term118969, 4, (byte) -128);
        setByteElement(term118969, 5, (byte) -128);
        setByteElement(term118969, 6, (byte) -128);
        setByteElement(term118969, 7, (byte) -128);
        setByteElement(term118969, 8, (byte) -128);
        setByteElement(term118969, 9, (byte) -128);
        setByteElement(term118969, 10, (byte) -128);
        setByteElement(term118969, 11, (byte) -128);
        setByteElement(term118969, 12, (byte) -128);
        setByteElement(term118969, 13, (byte) -128);
        setByteElement(term118969, 14, (byte) -128);
        setByteElement(term118969, 15, (byte) -128);
        setByteElement(term118969, 16, (byte) -128);
        setField(term119879, term119879.getClass(), "states", term118969);
        setField(term119769, term119769.getClass(), "entries", term119879);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.linear.OpenMapRealVector");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math3.linear.OpenMapRealVector");
        Object[] args = new Object[1];
        args[0] = term119769;
        callMethod(klass, "append", argTypes, term119555, args);
    }

};


