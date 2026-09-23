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
import static org.apache.commons.math.linear.EqualityUtils.*;
import java.lang.Object;

public class OpenMapRealMatrix_setEntry_95500957107 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term51018;
     Object term52630;

    public OpenMapRealMatrix_setEntry_95500957107() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term51018 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealMatrix"));
        Object term51126 = newInstance(Class.forName("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] term50386 = (byte[]) newByteArray(489);
        setIntField(term51018, term51018.getClass(), "rows", 1681942558);
        setIntField(term51018, term51018.getClass(), "columns", 1143128766);
        setIntField(term51126, term51126.getClass(), "mask", 0);
        setField(term51126, term51126.getClass(), "states", term50386);
        setField(term51018, term51018.getClass(), "entries", term51126);
        term52630 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealMatrix"));
        Object term52631 = newInstance(Class.forName("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] term52632 = (byte[]) newByteArray(489);
        setIntField(term52630, term52630.getClass(), "rows", 1681942558);
        setIntField(term52630, term52630.getClass(), "columns", 1143128766);
        setField(term52631, term52631.getClass(), "keys", null);
        setField(term52631, term52631.getClass(), "values", null);
        setField(term52631, term52631.getClass(), "states", term52632);
        setDoubleField(term52631, term52631.getClass(), "missingEntries", 0.0);
        setIntField(term52631, term52631.getClass(), "size", 0);
        setIntField(term52631, term52631.getClass(), "mask", 0);
        setIntField(term52631, term52631.getClass(), "count", 0);
        setField(term52630, term52630.getClass(), "entries", term52631);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.OpenMapRealMatrix");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        argTypes[2] = double.class;
        Object[] args = new Object[3];
        args[0] = 1681942557;
        args[1] = 1098039418;
        args[2] = 0.0;
        callMethod(klass, "setEntry", argTypes, term51018, args);
        assertTrue(recursiveEquals(term51018, term52630));
    }

};


