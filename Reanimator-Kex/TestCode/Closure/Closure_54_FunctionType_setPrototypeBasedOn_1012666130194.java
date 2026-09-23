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

public class FunctionType_setPrototypeBasedOn_1012666130194 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term96357;
     Object term96905;

    public FunctionType_setPrototypeBasedOn_1012666130194() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term96981 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term96980 = ((Class) term96981).getDeclaredField((String) "INTERFACE");
        ((Field) term96980).setAccessible(true);
        Object enum189 = ((Field) term96980).get((Object) null);
        term96357 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setBooleanField(term96357, term96357.getClass(), "nativeType", false);
        setField(term96357, term96357.getClass(), "kind", enum189);
        setField(term96357, term96357.getClass(), "prototype", null);
        setField(term96357, term96357.getClass(), "prototypeSlot", null);
        setBooleanField(term96357, term96357.getClass(), "unknown", false);
        setField(term96357, term96357.getClass(), "subTypes", null);
        Class<? extends Object> term97275 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term97274 = ((Class) term97275).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term97274).setAccessible(true);
        Object enum190 = ((Field) term97274).get((Object) null);
        term96905 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        setField(term96905, term96905.getClass(), "className", null);
        setField(term96905, term96905.getClass(), "ownerFunction", null);
        setBooleanField(term96905, term96905.getClass(), "unknown", false);
        setField(term96905, term96905.getClass(), "subTypes", null);
        setBooleanField(term96905, term96905.getClass(), "nativeType", false);
        setField(term96905, term96905.getClass(), "kind", enum190);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        Object[] args = new Object[1];
        args[0] = term96905;
        callMethod(klass, "setPrototypeBasedOn", argTypes, term96357, args);
    }

};


