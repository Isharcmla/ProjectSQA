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

public class FunctionType_getTopMostDefiningType_1569120663169 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term83037;

    public FunctionType_getTopMostDefiningType_1569120663169() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term83187 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term83186 = ((Class) term83187).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term83186).setAccessible(true);
        Object enum179 = ((Field) term83186).get((Object) null);
        term83037 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term83037, term83037.getClass(), "kind", enum179);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "getTopMostDefiningType", argTypes, term83037, args);
    }

};


