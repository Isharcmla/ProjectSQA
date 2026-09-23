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

public class OpenMapRealMatrix_subtract_86327686051 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28121;

    public OpenMapRealMatrix_subtract_86327686051() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28121 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setIntField(term28121, term28121.getClass(), "rows", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.OpenMapRealMatrix");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.linear.OpenMapRealMatrix");
        Object[] args = new Object[1];
        args[0] = term28121;
        try {
            callMethod(klass, "subtract", argTypes, term28121, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


