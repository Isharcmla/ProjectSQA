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

public class FunctionType_isSubtype_2101002158429 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term338954;
     Object term339212;
     Object term340059;
     Object term340063;

    public FunctionType_isSubtype_2101002158429() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term340069 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term340068 = ((Class) term340069).getDeclaredField((String) "INTERFACE");
        ((Field) term340068).setAccessible(true);
        Object enum618 = ((Field) term340068).get((Object) null);
        term338954 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term338954, term338954.getClass(), "kind", enum618);
        Class<? extends Object> term340363 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term340362 = ((Class) term340363).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term340362).setAccessible(true);
        Object enum619 = ((Field) term340362).get((Object) null);
        term339212 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term339212, term339212.getClass(), "kind", enum619);
        Class<? extends Object> term340663 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term340662 = ((Class) term340663).getDeclaredField((String) "INTERFACE");
        ((Field) term340662).setAccessible(true);
        Object enum620 = ((Field) term340662).get((Object) null);
        term340059 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term340059, term340059.getClass(), "call", null);
        setField(term340059, term340059.getClass(), "prototype", null);
        setField(term340059, term340059.getClass(), "kind", enum620);
        setField(term340059, term340059.getClass(), "typeOfThis", null);
        setField(term340059, term340059.getClass(), "source", null);
        setField(term340059, term340059.getClass(), "implementedInterfaces", null);
        setField(term340059, term340059.getClass(), "subTypes", null);
        setField(term340059, term340059.getClass(), "templateTypeName", null);
        setField(term340059, term340059.getClass(), "className", null);
        setField(term340059, term340059.getClass(), "properties", null);
        setField(term340059, term340059.getClass(), "implicitPrototype", null);
        setBooleanField(term340059, term340059.getClass(), "nativeType", false);
        setBooleanField(term340059, term340059.getClass(), "prettyPrint", false);
        setBooleanField(term340059, term340059.getClass(), "visited", false);
        setField(term340059, term340059.getClass(), "docInfo", null);
        setBooleanField(term340059, term340059.getClass(), "unknown", false);
        setBooleanField(term340059, term340059.getClass(), "resolved", false);
        setField(term340059, term340059.getClass(), "resolveResult", null);
        setField(term340059, term340059.getClass(), "registry", null);
        Class<? extends Object> term340957 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term340956 = ((Class) term340957).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term340956).setAccessible(true);
        Object enum621 = ((Field) term340956).get((Object) null);
        term340063 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term340063, term340063.getClass(), "call", null);
        setField(term340063, term340063.getClass(), "prototype", null);
        setField(term340063, term340063.getClass(), "kind", enum621);
        setField(term340063, term340063.getClass(), "typeOfThis", null);
        setField(term340063, term340063.getClass(), "source", null);
        setField(term340063, term340063.getClass(), "implementedInterfaces", null);
        setField(term340063, term340063.getClass(), "subTypes", null);
        setField(term340063, term340063.getClass(), "templateTypeName", null);
        setField(term340063, term340063.getClass(), "className", null);
        setField(term340063, term340063.getClass(), "properties", null);
        setField(term340063, term340063.getClass(), "implicitPrototype", null);
        setBooleanField(term340063, term340063.getClass(), "nativeType", false);
        setBooleanField(term340063, term340063.getClass(), "prettyPrint", false);
        setBooleanField(term340063, term340063.getClass(), "visited", false);
        setField(term340063, term340063.getClass(), "docInfo", null);
        setBooleanField(term340063, term340063.getClass(), "unknown", false);
        setBooleanField(term340063, term340063.getClass(), "resolved", false);
        setField(term340063, term340063.getClass(), "resolveResult", null);
        setField(term340063, term340063.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term339212;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term338954, args);
        assertTrue(recursiveEquals(term338954, term340059));
        assertTrue(recursiveEquals(term339212, term340063));
        assertTrue(recursiveEquals(retValue, false));
    }

};


