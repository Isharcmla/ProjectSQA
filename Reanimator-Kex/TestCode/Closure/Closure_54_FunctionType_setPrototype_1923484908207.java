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

public class FunctionType_setPrototype_1923484908207 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term105994;
     Object term106242;

    public FunctionType_setPrototype_1923484908207() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term106244 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term106243 = ((Class) term106244).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term106243).setAccessible(true);
        Object enum197 = ((Field) term106243).get((Object) null);
        term105994 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term105994, term105994.getClass(), "kind", enum197);
        term106242 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType");
        Object[] args = new Object[1];
        args[0] = term106242;
        callMethod(klass, "setPrototype", argTypes, term105994, args);
    }

};


