package com.google.javascript.jscomp;

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
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class TypeCheck_hasUnknownOrEmptySupertype_59657982623 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term198114;

    public TypeCheck_hasUnknownOrEmptySupertype_59657982623() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term198500 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term198499 = ((Class) term198500).getDeclaredField((String) "INTERFACE");
        ((Field) term198499).setAccessible(true);
        Object enum27 = ((Field) term198499).get((Object) null);
        term198114 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term198380 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        Object term198498 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setField(term198114, term198114.getClass(), "kind", enum27);
        setBooleanField(term198114, term198114.getClass(), "unknown", false);
        setField(term198380, term198380.getClass(), "implicitPrototypeFallback", term198498);
        setField(term198114, term198114.getClass(), "prototype", term198380);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Object[] args = new Object[1];
        args[0] = term198114;
        callMethod(klass, "hasUnknownOrEmptySupertype", argTypes, null, args);
    }

};


