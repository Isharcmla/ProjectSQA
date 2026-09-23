package org.jfree.data.xy;

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
import static org.jfree.data.xy.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class XYSeries_init_161753470267 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum0;

    public XYSeries_init_161753470267() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term7979 = newInstance(Class.forName("org.jfree.data.xy.XYSeries"));
        Class<? extends Object> term11005 = Class.forName((String) "java.lang.invoke.LambdaForm$Kind");
        Field term11004 = ((Class) term11005).getDeclaredField((String) "GENERIC");
        ((Field) term11004).setAccessible(true);
        enum0 = ((Field) term11004).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.xy.XYSeries");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Comparable");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = enum0;
        args[1] = false;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


