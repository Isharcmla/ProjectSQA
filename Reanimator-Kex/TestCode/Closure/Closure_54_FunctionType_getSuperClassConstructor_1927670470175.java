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

public class FunctionType_getSuperClassConstructor_1927670470175 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term86448;

    public FunctionType_getSuperClassConstructor_1927670470175() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term86598 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term86597 = ((Class) term86598).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term86597).setAccessible(true);
        Object enum183 = ((Field) term86597).get((Object) null);
        term86448 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term86448, term86448.getClass(), "kind", enum183);
        setField(term86448, term86448.getClass(), "prototype", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSuperClassConstructor", argTypes, term86448, args);
    }

};


