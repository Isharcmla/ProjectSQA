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

public class FunctionType_setPrototypeBasedOn_1012666130215 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term108120;
     Object term108486;

    public FunctionType_setPrototypeBasedOn_1012666130215() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term108592 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term108591 = ((Class) term108592).getDeclaredField((String) "ORDINARY");
        ((Field) term108591).setAccessible(true);
        Object enum198 = ((Field) term108591).get((Object) null);
        term108120 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term108382 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        setBooleanField(term108120, term108120.getClass(), "nativeType", false);
        setField(term108120, term108120.getClass(), "kind", enum198);
        setField(term108120, term108120.getClass(), "prototype", term108382);
        setField(term108120, term108120.getClass(), "prototypeSlot", null);
        term108486 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        Object term108590 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        setField(term108486, term108486.getClass(), "className", null);
        setField(term108486, term108486.getClass(), "ownerFunction", term108590);
        setBooleanField(term108486, term108486.getClass(), "unknown", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        Object[] args = new Object[1];
        args[0] = term108486;
        callMethod(klass, "setPrototypeBasedOn", argTypes, term108120, args);
    }

};


