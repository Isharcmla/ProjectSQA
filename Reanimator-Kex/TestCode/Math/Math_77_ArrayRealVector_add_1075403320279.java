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

public class ArrayRealVector_add_1075403320279 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term69928;
     Object term70030;

    public ArrayRealVector_add_1075403320279() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term69928 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        term70030 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealVector"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.ArrayRealVector");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.linear.RealVector");
        Object[] args = new Object[1];
        args[0] = term70030;
        try {
            callMethod(klass, "add", argTypes, term69928, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


