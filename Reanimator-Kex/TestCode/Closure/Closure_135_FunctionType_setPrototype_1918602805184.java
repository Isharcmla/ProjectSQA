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
import static com.google.javascript.rhino.jstype.EqualityUtils.*;
import java.lang.String;
import java.lang.Object;

public class FunctionType_setPrototype_1918602805184 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term83576;
     Object term83842;
     Object term84934;
     Object term84939;

    public FunctionType_setPrototype_1918602805184() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term84942 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term84941 = ((Class) term84942).getDeclaredField((String) "INTERFACE");
        ((Field) term84941).setAccessible(true);
        Object enum178 = ((Field) term84941).get((Object) null);
        term83576 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term83576, term83576.getClass(), "kind", enum178);
        setField(term83576, term83576.getClass(), "prototype", null);
        term83842 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        Class<? extends Object> term85236 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term85235 = ((Class) term85236).getDeclaredField((String) "INTERFACE");
        ((Field) term85235).setAccessible(true);
        Object enum179 = ((Field) term85235).get((Object) null);
        term84934 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term84935 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setField(term84934, term84934.getClass(), "call", null);
        setField(term84935, term84935.getClass(), "ownerFunction", null);
        setField(term84935, term84935.getClass(), "className", null);
        setField(term84935, term84935.getClass(), "properties", null);
        setField(term84935, term84935.getClass(), "implicitPrototype", null);
        setBooleanField(term84935, term84935.getClass(), "nativeType", false);
        setBooleanField(term84935, term84935.getClass(), "visited", false);
        setField(term84935, term84935.getClass(), "docInfo", null);
        setBooleanField(term84935, term84935.getClass(), "unknown", false);
        setBooleanField(term84935, term84935.getClass(), "resolved", false);
        setField(term84935, term84935.getClass(), "resolveResult", null);
        setField(term84935, term84935.getClass(), "registry", null);
        setField(term84934, term84934.getClass(), "prototype", term84935);
        setField(term84934, term84934.getClass(), "kind", enum179);
        setField(term84934, term84934.getClass(), "typeOfThis", null);
        setField(term84934, term84934.getClass(), "source", null);
        setField(term84934, term84934.getClass(), "implementedInterfaces", null);
        setField(term84934, term84934.getClass(), "subTypes", null);
        setField(term84934, term84934.getClass(), "templateTypeName", null);
        setField(term84934, term84934.getClass(), "className", null);
        setField(term84934, term84934.getClass(), "properties", null);
        setField(term84934, term84934.getClass(), "implicitPrototype", null);
        setBooleanField(term84934, term84934.getClass(), "nativeType", false);
        setBooleanField(term84934, term84934.getClass(), "visited", false);
        setField(term84934, term84934.getClass(), "docInfo", null);
        setBooleanField(term84934, term84934.getClass(), "unknown", false);
        setBooleanField(term84934, term84934.getClass(), "resolved", false);
        setField(term84934, term84934.getClass(), "resolveResult", null);
        setField(term84934, term84934.getClass(), "registry", null);
        term84939 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setField(term84939, term84939.getClass(), "ownerFunction", null);
        setField(term84939, term84939.getClass(), "className", null);
        setField(term84939, term84939.getClass(), "properties", null);
        setField(term84939, term84939.getClass(), "implicitPrototype", null);
        setBooleanField(term84939, term84939.getClass(), "nativeType", false);
        setBooleanField(term84939, term84939.getClass(), "visited", false);
        setField(term84939, term84939.getClass(), "docInfo", null);
        setBooleanField(term84939, term84939.getClass(), "unknown", false);
        setBooleanField(term84939, term84939.getClass(), "resolved", false);
        setField(term84939, term84939.getClass(), "resolveResult", null);
        setField(term84939, term84939.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType");
        Object[] args = new Object[1];
        args[0] = term83842;
        Object retValue = callMethod(klass, "setPrototype", argTypes, term83576, args);
        assertTrue(recursiveEquals(term83576, term84934));
        assertTrue(recursiveEquals(term83842, term84939));
        assertTrue(recursiveEquals(retValue, true));
    }

};


