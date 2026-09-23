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
import java.lang.NullPointerException;
import static org.apache.commons.math.linear.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class OpenMapRealMatrix_subtract_86327686083 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39142;
     Object term39352;

    public OpenMapRealMatrix_subtract_86327686083() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term39142 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealMatrix"));
        Object term39250 = newInstance(Class.forName("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] term39014 = (int[]) newIntArray(0);
        setIntField(term39142, term39142.getClass(), "rows", 0);
        setIntField(term39142, term39142.getClass(), "columns", 0);
        setField(term39250, term39250.getClass(), "keys", term39014);
        setField(term39142, term39142.getClass(), "entries", term39250);
        term39352 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setIntField(term39352, term39352.getClass(), "rows", 0);
        setIntField(term39352, term39352.getClass(), "columns", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.OpenMapRealMatrix");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.linear.OpenMapRealMatrix");
        Object[] args = new Object[1];
        args[0] = term39352;
        try {
            callMethod(klass, "subtract", argTypes, term39142, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


