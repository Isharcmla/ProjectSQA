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

public class FunctionType_clearCachedValues_1343537339164 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term79370;

    public FunctionType_clearCachedValues_1343537339164() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term79520 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term79519 = ((Class) term79520).getDeclaredField((String) "INTERFACE");
        ((Field) term79519).setAccessible(true);
        Object enum174 = ((Field) term79519).get((Object) null);
        term79370 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setBooleanField(term79370, term79370.getClass(), "unknown", false);
        setField(term79370, term79370.getClass(), "subTypes", null);
        setBooleanField(term79370, term79370.getClass(), "nativeType", false);
        setField(term79370, term79370.getClass(), "kind", enum174);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "clearCachedValues", argTypes, term79370, args);
    }

};


