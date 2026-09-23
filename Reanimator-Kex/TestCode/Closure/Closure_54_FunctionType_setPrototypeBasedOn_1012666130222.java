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

public class FunctionType_setPrototypeBasedOn_1012666130222 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term114724;
     Object term115392;

    public FunctionType_setPrototypeBasedOn_1012666130222() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term115394 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term115393 = ((Class) term115394).getDeclaredField((String) "INTERFACE");
        ((Field) term115393).setAccessible(true);
        Object enum205 = ((Field) term115393).get((Object) null);
        term114724 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term115282 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        setBooleanField(term114724, term114724.getClass(), "nativeType", false);
        setField(term114724, term114724.getClass(), "kind", enum205);
        setField(term114724, term114724.getClass(), "prototype", term115282);
        setField(term114724, term114724.getClass(), "prototypeSlot", null);
        setBooleanField(term114724, term114724.getClass(), "unknown", false);
        setField(term114724, term114724.getClass(), "subTypes", null);
        term115392 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term115392, term115392.getClass(), "className", null);
        setField(term115392, term115392.getClass(), "ownerFunction", null);
        setBooleanField(term115392, term115392.getClass(), "unknown", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        Object[] args = new Object[1];
        args[0] = term115392;
        callMethod(klass, "setPrototypeBasedOn", argTypes, term114724, args);
    }

};


