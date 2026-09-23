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

public class OpenMapRealVector_append_517582264125 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term120190;
     Object term120400;

    public OpenMapRealVector_append_517582264125() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term120190 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealVector"));
        Object term120298 = newInstance(Class.forName("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] term118497 = (int[]) newIntArray(129);
        setIntField(term120190, term120190.getClass(), "virtualSize", 0);
        setField(term120298, term120298.getClass(), "keys", term118497);
        setField(term120298, term120298.getClass(), "values", null);
        setField(term120298, term120298.getClass(), "states", null);
        setDoubleField(term120298, term120298.getClass(), "missingEntries", 0.0);
        setIntField(term120298, term120298.getClass(), "size", 0);
        setIntField(term120298, term120298.getClass(), "mask", 0);
        setIntField(term120298, term120298.getClass(), "count", 0);
        setField(term120190, term120190.getClass(), "entries", term120298);
        setDoubleField(term120190, term120190.getClass(), "epsilon", 0.0);
        term120400 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealVector"));
        Object term120508 = newInstance(Class.forName("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] term119545 = (byte[]) newByteArray(489);
        setIntField(term120400, term120400.getClass(), "virtualSize", 0);
        setIntField(term120508, term120508.getClass(), "count", 0);
        setByteElement(term119545, 0, (byte) 1);
        setField(term120508, term120508.getClass(), "states", term119545);
        setField(term120400, term120400.getClass(), "entries", term120508);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.OpenMapRealVector");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.linear.OpenMapRealVector");
        Object[] args = new Object[1];
        args[0] = term120400;
        callMethod(klass, "append", argTypes, term120190, args);
    }

};


