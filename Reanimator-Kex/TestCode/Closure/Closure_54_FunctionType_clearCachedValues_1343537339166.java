package com.google.javascript.rhino.jstype;

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
import static com.google.javascript.rhino.jstype.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class FunctionType_clearCachedValues_1343537339166 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term80620;

    public FunctionType_clearCachedValues_1343537339166() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term81170 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term81169 = ((Class) term81170).getDeclaredField((String) "ORDINARY");
        ((Field) term81169).setAccessible(true);
        Object enum176 = ((Field) term81169).get((Object) null);
        term80620 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term81168 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        setBooleanField(term80620, term80620.getClass(), "unknown", false);
        setField(term80620, term80620.getClass(), "subTypes", null);
        setBooleanField(term80620, term80620.getClass(), "nativeType", false);
        setField(term80620, term80620.getClass(), "kind", enum176);
        setField(term80620, term80620.getClass(), "prototype", term81168);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "clearCachedValues", argTypes, term80620, args);
    }

};


