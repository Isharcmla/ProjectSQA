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

public class OpenMapRealMatrix_multiplyEntry_585908895111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term55958;

    public OpenMapRealMatrix_multiplyEntry_585908895111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term55958 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealMatrix"));
        Object term56066 = newInstance(Class.forName("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        setIntField(term55958, term55958.getClass(), "rows", 311281664);
        setIntField(term55958, term55958.getClass(), "columns", 1809833327);
        setIntField(term56066, term56066.getClass(), "mask", 0);
        setField(term55958, term55958.getClass(), "entries", term56066);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.OpenMapRealMatrix");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        argTypes[2] = double.class;
        Object[] args = new Object[3];
        args[0] = 311281663;
        args[1] = 536870912;
        args[2] = 0.0;
        try {
            callMethod(klass, "multiplyEntry", argTypes, term55958, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


