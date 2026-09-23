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

public class FunctionType_setPrototype_1918602805515 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term382490;
     Object term382440;
     Object term384058;
     Object term384063;

    public FunctionType_setPrototype_1918602805515() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term384070 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term384069 = ((Class) term384070).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term384069).setAccessible(true);
        Object enum704 = ((Field) term384069).get((Object) null);
        term382490 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term382623 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setField(term382490, term382490.getClass(), "kind", enum704);
        setField(term382490, term382490.getClass(), "typeOfThis", null);
        setField(term382490, term382490.getClass(), "prototype", term382623);
        term382440 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setField(term382440, term382440.getClass(), "implicitPrototype", term382490);
        Class<? extends Object> term384370 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term384369 = ((Class) term384370).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term384369).setAccessible(true);
        Object enum705 = ((Field) term384369).get((Object) null);
        term384058 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term384059 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setField(term384058, term384058.getClass(), "call", null);
        setField(term384059, term384059.getClass(), "ownerFunction", null);
        setField(term384059, term384059.getClass(), "className", null);
        setField(term384059, term384059.getClass(), "properties", null);
        setField(term384059, term384059.getClass(), "implicitPrototype", term384058);
        setBooleanField(term384059, term384059.getClass(), "nativeType", false);
        setBooleanField(term384059, term384059.getClass(), "visited", false);
        setField(term384059, term384059.getClass(), "docInfo", null);
        setBooleanField(term384059, term384059.getClass(), "unknown", false);
        setBooleanField(term384059, term384059.getClass(), "resolved", false);
        setField(term384059, term384059.getClass(), "resolveResult", null);
        setField(term384059, term384059.getClass(), "registry", null);
        setField(term384058, term384058.getClass(), "prototype", term384059);
        setField(term384058, term384058.getClass(), "kind", enum705);
        setField(term384058, term384058.getClass(), "typeOfThis", null);
        setField(term384058, term384058.getClass(), "source", null);
        setField(term384058, term384058.getClass(), "implementedInterfaces", null);
        setField(term384058, term384058.getClass(), "subTypes", null);
        setField(term384058, term384058.getClass(), "templateTypeName", null);
        setField(term384058, term384058.getClass(), "className", null);
        setField(term384058, term384058.getClass(), "properties", null);
        setField(term384058, term384058.getClass(), "implicitPrototype", null);
        setBooleanField(term384058, term384058.getClass(), "nativeType", false);
        setBooleanField(term384058, term384058.getClass(), "visited", false);
        setField(term384058, term384058.getClass(), "docInfo", null);
        setBooleanField(term384058, term384058.getClass(), "unknown", false);
        setBooleanField(term384058, term384058.getClass(), "resolved", false);
        setField(term384058, term384058.getClass(), "resolveResult", null);
        setField(term384058, term384058.getClass(), "registry", null);
        Class<? extends Object> term384670 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term384669 = ((Class) term384670).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term384669).setAccessible(true);
        Object enum706 = ((Field) term384669).get((Object) null);
        term384063 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        Object term384064 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term384063, term384063.getClass(), "ownerFunction", null);
        setField(term384063, term384063.getClass(), "className", null);
        setField(term384063, term384063.getClass(), "properties", null);
        setField(term384064, term384064.getClass(), "call", null);
        setField(term384064, term384064.getClass(), "prototype", term384063);
        setField(term384064, term384064.getClass(), "kind", enum706);
        setField(term384064, term384064.getClass(), "typeOfThis", null);
        setField(term384064, term384064.getClass(), "source", null);
        setField(term384064, term384064.getClass(), "implementedInterfaces", null);
        setField(term384064, term384064.getClass(), "subTypes", null);
        setField(term384064, term384064.getClass(), "templateTypeName", null);
        setField(term384064, term384064.getClass(), "className", null);
        setField(term384064, term384064.getClass(), "properties", null);
        setField(term384064, term384064.getClass(), "implicitPrototype", null);
        setBooleanField(term384064, term384064.getClass(), "nativeType", false);
        setBooleanField(term384064, term384064.getClass(), "visited", false);
        setField(term384064, term384064.getClass(), "docInfo", null);
        setBooleanField(term384064, term384064.getClass(), "unknown", false);
        setBooleanField(term384064, term384064.getClass(), "resolved", false);
        setField(term384064, term384064.getClass(), "resolveResult", null);
        setField(term384064, term384064.getClass(), "registry", null);
        setField(term384063, term384063.getClass(), "implicitPrototype", term384064);
        setBooleanField(term384063, term384063.getClass(), "nativeType", false);
        setBooleanField(term384063, term384063.getClass(), "visited", false);
        setField(term384063, term384063.getClass(), "docInfo", null);
        setBooleanField(term384063, term384063.getClass(), "unknown", false);
        setBooleanField(term384063, term384063.getClass(), "resolved", false);
        setField(term384063, term384063.getClass(), "resolveResult", null);
        setField(term384063, term384063.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType");
        Object[] args = new Object[1];
        args[0] = term382440;
        Object retValue = callMethod(klass, "setPrototype", argTypes, term382490, args);
        assertTrue(recursiveEquals(term382490, term384058));
        assertTrue(recursiveEquals(term382440, term384063));
        assertTrue(recursiveEquals(retValue, true));
    }

};


