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

public class OpenMapRealMatrix_getEntry_913737541101 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47592;

    public OpenMapRealMatrix_getEntry_913737541101() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term47592 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealMatrix"));
        Object term47700 = newInstance(Class.forName("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        setIntField(term47592, term47592.getClass(), "rows", 311281664);
        setIntField(term47592, term47592.getClass(), "columns", 1809833327);
        setIntField(term47700, term47700.getClass(), "mask", 0);
        setField(term47592, term47592.getClass(), "entries", term47700);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.OpenMapRealMatrix");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = 311281663;
        args[1] = 536870912;
        try {
            callMethod(klass, "getEntry", argTypes, term47592, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


