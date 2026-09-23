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

public class FunctionType_setPrototype_1918602805455 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term309945;
     Object term310270;
     Object term312133;
     Object term312138;

    public FunctionType_setPrototype_1918602805455() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term312141 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term312140 = ((Class) term312141).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term312140).setAccessible(true);
        Object enum566 = ((Field) term312140).get((Object) null);
        term309945 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        term310270 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setField(term309945, term309945.getClass(), "kind", enum566);
        setField(term309945, term309945.getClass(), "typeOfThis", term310270);
        Class<? extends Object> term312441 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term312440 = ((Class) term312441).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term312440).setAccessible(true);
        Object enum567 = ((Field) term312440).get((Object) null);
        term312133 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term312137 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setField(term312133, term312133.getClass(), "call", null);
        setField(term312133, term312133.getClass(), "prototype", null);
        setField(term312133, term312133.getClass(), "kind", enum567);
        setField(term312137, term312137.getClass(), "ownerFunction", null);
        setField(term312137, term312137.getClass(), "className", null);
        setField(term312137, term312137.getClass(), "properties", null);
        setField(term312137, term312137.getClass(), "implicitPrototype", null);
        setBooleanField(term312137, term312137.getClass(), "nativeType", false);
        setBooleanField(term312137, term312137.getClass(), "visited", false);
        setField(term312137, term312137.getClass(), "docInfo", null);
        setBooleanField(term312137, term312137.getClass(), "unknown", false);
        setBooleanField(term312137, term312137.getClass(), "resolved", false);
        setField(term312137, term312137.getClass(), "resolveResult", null);
        setField(term312137, term312137.getClass(), "registry", null);
        setField(term312133, term312133.getClass(), "typeOfThis", term312137);
        setField(term312133, term312133.getClass(), "source", null);
        setField(term312133, term312133.getClass(), "implementedInterfaces", null);
        setField(term312133, term312133.getClass(), "subTypes", null);
        setField(term312133, term312133.getClass(), "templateTypeName", null);
        setField(term312133, term312133.getClass(), "className", null);
        setField(term312133, term312133.getClass(), "properties", null);
        setField(term312133, term312133.getClass(), "implicitPrototype", null);
        setBooleanField(term312133, term312133.getClass(), "nativeType", false);
        setBooleanField(term312133, term312133.getClass(), "visited", false);
        setField(term312133, term312133.getClass(), "docInfo", null);
        setBooleanField(term312133, term312133.getClass(), "unknown", false);
        setBooleanField(term312133, term312133.getClass(), "resolved", false);
        setField(term312133, term312133.getClass(), "resolveResult", null);
        setField(term312133, term312133.getClass(), "registry", null);
        term312138 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setField(term312138, term312138.getClass(), "ownerFunction", null);
        setField(term312138, term312138.getClass(), "className", null);
        setField(term312138, term312138.getClass(), "properties", null);
        setField(term312138, term312138.getClass(), "implicitPrototype", null);
        setBooleanField(term312138, term312138.getClass(), "nativeType", false);
        setBooleanField(term312138, term312138.getClass(), "visited", false);
        setField(term312138, term312138.getClass(), "docInfo", null);
        setBooleanField(term312138, term312138.getClass(), "unknown", false);
        setBooleanField(term312138, term312138.getClass(), "resolved", false);
        setField(term312138, term312138.getClass(), "resolveResult", null);
        setField(term312138, term312138.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType");
        Object[] args = new Object[1];
        args[0] = term310270;
        Object retValue = callMethod(klass, "setPrototype", argTypes, term309945, args);
        assertTrue(recursiveEquals(term309945, term312133));
        assertTrue(recursiveEquals(term310270, term312138));
        assertTrue(recursiveEquals(retValue, false));
    }

};


