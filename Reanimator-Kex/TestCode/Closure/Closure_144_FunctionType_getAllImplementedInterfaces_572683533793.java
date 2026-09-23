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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class FunctionType_getAllImplementedInterfaces_572683533793 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term902530;
     Object term903220;
     Object term903214;

    public FunctionType_getAllImplementedInterfaces_572683533793() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term903228 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term903227 = ((Class) term903228).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term903227).setAccessible(true);
        Object enum1633 = ((Field) term903227).get((Object) null);
        ArrayList term902848 = new ArrayList();
        term902530 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term902796 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setField(term902530, term902530.getClass(), "kind", enum1633);
        setField(term902796, term902796.getClass(), "implicitPrototype", null);
        setField(term902530, term902530.getClass(), "prototype", term902796);
        setField(term902530, term902530.getClass(), "implementedInterfaces", term902848);
        Class<? extends Object> term903528 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term903527 = ((Class) term903528).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term903527).setAccessible(true);
        Object enum1634 = ((Field) term903527).get((Object) null);
        ArrayList term903225 = new ArrayList();
        term903220 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term903221 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setField(term903220, term903220.getClass(), "call", null);
        setField(term903221, term903221.getClass(), "ownerFunction", null);
        setField(term903221, term903221.getClass(), "className", null);
        setField(term903221, term903221.getClass(), "properties", null);
        setField(term903221, term903221.getClass(), "implicitPrototype", null);
        setBooleanField(term903221, term903221.getClass(), "nativeType", false);
        setBooleanField(term903221, term903221.getClass(), "prettyPrint", false);
        setBooleanField(term903221, term903221.getClass(), "visited", false);
        setField(term903221, term903221.getClass(), "docInfo", null);
        setBooleanField(term903221, term903221.getClass(), "unknown", false);
        setBooleanField(term903221, term903221.getClass(), "resolved", false);
        setField(term903221, term903221.getClass(), "resolveResult", null);
        setField(term903221, term903221.getClass(), "registry", null);
        setField(term903220, term903220.getClass(), "prototype", term903221);
        setField(term903220, term903220.getClass(), "kind", enum1634);
        setField(term903220, term903220.getClass(), "typeOfThis", null);
        setField(term903220, term903220.getClass(), "source", null);
        setField(term903220, term903220.getClass(), "implementedInterfaces", term903225);
        setField(term903220, term903220.getClass(), "subTypes", null);
        setField(term903220, term903220.getClass(), "templateTypeName", null);
        setField(term903220, term903220.getClass(), "className", null);
        setField(term903220, term903220.getClass(), "properties", null);
        setField(term903220, term903220.getClass(), "implicitPrototype", null);
        setBooleanField(term903220, term903220.getClass(), "nativeType", false);
        setBooleanField(term903220, term903220.getClass(), "prettyPrint", false);
        setBooleanField(term903220, term903220.getClass(), "visited", false);
        setField(term903220, term903220.getClass(), "docInfo", null);
        setBooleanField(term903220, term903220.getClass(), "unknown", false);
        setBooleanField(term903220, term903220.getClass(), "resolved", false);
        setField(term903220, term903220.getClass(), "resolveResult", null);
        setField(term903220, term903220.getClass(), "registry", null);
        HashMap term903215 = new HashMap();
        Set<Object> term903827 =  ((Map) term903215).keySet();
        term903214 = new HashSet((Collection<? extends Object>) term903827);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getAllImplementedInterfaces", argTypes, term902530, args);
        assertTrue(recursiveEquals(term902530, term903220));
        assertTrue(recursiveEquals(retValue, term903214));
    }

};


