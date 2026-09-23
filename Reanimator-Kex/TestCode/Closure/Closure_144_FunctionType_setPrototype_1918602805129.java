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

public class FunctionType_setPrototype_1918602805129 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term67841;
     Object term68166;
     Object term68518;
     Object term68523;

    public FunctionType_setPrototype_1918602805129() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term68526 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term68525 = ((Class) term68526).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term68525).setAccessible(true);
        Object enum168 = ((Field) term68525).get((Object) null);
        term67841 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        term68166 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setField(term67841, term67841.getClass(), "kind", enum168);
        setField(term67841, term67841.getClass(), "typeOfThis", term68166);
        Class<? extends Object> term68826 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term68825 = ((Class) term68826).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term68825).setAccessible(true);
        Object enum169 = ((Field) term68825).get((Object) null);
        term68518 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term68522 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setField(term68518, term68518.getClass(), "call", null);
        setField(term68518, term68518.getClass(), "prototype", null);
        setField(term68518, term68518.getClass(), "kind", enum169);
        setField(term68522, term68522.getClass(), "ownerFunction", null);
        setField(term68522, term68522.getClass(), "className", null);
        setField(term68522, term68522.getClass(), "properties", null);
        setField(term68522, term68522.getClass(), "implicitPrototype", null);
        setBooleanField(term68522, term68522.getClass(), "nativeType", false);
        setBooleanField(term68522, term68522.getClass(), "prettyPrint", false);
        setBooleanField(term68522, term68522.getClass(), "visited", false);
        setField(term68522, term68522.getClass(), "docInfo", null);
        setBooleanField(term68522, term68522.getClass(), "unknown", false);
        setBooleanField(term68522, term68522.getClass(), "resolved", false);
        setField(term68522, term68522.getClass(), "resolveResult", null);
        setField(term68522, term68522.getClass(), "registry", null);
        setField(term68518, term68518.getClass(), "typeOfThis", term68522);
        setField(term68518, term68518.getClass(), "source", null);
        setField(term68518, term68518.getClass(), "implementedInterfaces", null);
        setField(term68518, term68518.getClass(), "subTypes", null);
        setField(term68518, term68518.getClass(), "templateTypeName", null);
        setField(term68518, term68518.getClass(), "className", null);
        setField(term68518, term68518.getClass(), "properties", null);
        setField(term68518, term68518.getClass(), "implicitPrototype", null);
        setBooleanField(term68518, term68518.getClass(), "nativeType", false);
        setBooleanField(term68518, term68518.getClass(), "prettyPrint", false);
        setBooleanField(term68518, term68518.getClass(), "visited", false);
        setField(term68518, term68518.getClass(), "docInfo", null);
        setBooleanField(term68518, term68518.getClass(), "unknown", false);
        setBooleanField(term68518, term68518.getClass(), "resolved", false);
        setField(term68518, term68518.getClass(), "resolveResult", null);
        setField(term68518, term68518.getClass(), "registry", null);
        term68523 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setField(term68523, term68523.getClass(), "ownerFunction", null);
        setField(term68523, term68523.getClass(), "className", null);
        setField(term68523, term68523.getClass(), "properties", null);
        setField(term68523, term68523.getClass(), "implicitPrototype", null);
        setBooleanField(term68523, term68523.getClass(), "nativeType", false);
        setBooleanField(term68523, term68523.getClass(), "prettyPrint", false);
        setBooleanField(term68523, term68523.getClass(), "visited", false);
        setField(term68523, term68523.getClass(), "docInfo", null);
        setBooleanField(term68523, term68523.getClass(), "unknown", false);
        setBooleanField(term68523, term68523.getClass(), "resolved", false);
        setField(term68523, term68523.getClass(), "resolveResult", null);
        setField(term68523, term68523.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType");
        Object[] args = new Object[1];
        args[0] = term68166;
        Object retValue = callMethod(klass, "setPrototype", argTypes, term67841, args);
        assertTrue(recursiveEquals(term67841, term68518));
        assertTrue(recursiveEquals(term68166, term68523));
        assertTrue(recursiveEquals(retValue, false));
    }

};


