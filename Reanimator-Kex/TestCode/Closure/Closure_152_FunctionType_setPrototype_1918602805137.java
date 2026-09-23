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

public class FunctionType_setPrototype_1918602805137 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term71094;
     Object term71419;
     Object term71765;
     Object term71770;

    public FunctionType_setPrototype_1918602805137() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term71773 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term71772 = ((Class) term71773).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term71772).setAccessible(true);
        Object enum171 = ((Field) term71772).get((Object) null);
        term71094 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        term71419 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setField(term71094, term71094.getClass(), "kind", enum171);
        setField(term71094, term71094.getClass(), "typeOfThis", term71419);
        Class<? extends Object> term72073 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term72072 = ((Class) term72073).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term72072).setAccessible(true);
        Object enum172 = ((Field) term72072).get((Object) null);
        term71765 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term71769 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setField(term71765, term71765.getClass(), "call", null);
        setField(term71765, term71765.getClass(), "prototype", null);
        setField(term71765, term71765.getClass(), "kind", enum172);
        setField(term71769, term71769.getClass(), "ownerFunction", null);
        setField(term71769, term71769.getClass(), "className", null);
        setField(term71769, term71769.getClass(), "properties", null);
        setBooleanField(term71769, term71769.getClass(), "nativeType", false);
        setField(term71769, term71769.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term71769, term71769.getClass(), "prettyPrint", false);
        setBooleanField(term71769, term71769.getClass(), "visited", false);
        setField(term71769, term71769.getClass(), "docInfo", null);
        setBooleanField(term71769, term71769.getClass(), "unknown", false);
        setBooleanField(term71769, term71769.getClass(), "resolved", false);
        setField(term71769, term71769.getClass(), "resolveResult", null);
        setField(term71769, term71769.getClass(), "registry", null);
        setField(term71765, term71765.getClass(), "typeOfThis", term71769);
        setField(term71765, term71765.getClass(), "source", null);
        setField(term71765, term71765.getClass(), "implementedInterfaces", null);
        setField(term71765, term71765.getClass(), "subTypes", null);
        setField(term71765, term71765.getClass(), "templateTypeName", null);
        setField(term71765, term71765.getClass(), "className", null);
        setField(term71765, term71765.getClass(), "properties", null);
        setBooleanField(term71765, term71765.getClass(), "nativeType", false);
        setField(term71765, term71765.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term71765, term71765.getClass(), "prettyPrint", false);
        setBooleanField(term71765, term71765.getClass(), "visited", false);
        setField(term71765, term71765.getClass(), "docInfo", null);
        setBooleanField(term71765, term71765.getClass(), "unknown", false);
        setBooleanField(term71765, term71765.getClass(), "resolved", false);
        setField(term71765, term71765.getClass(), "resolveResult", null);
        setField(term71765, term71765.getClass(), "registry", null);
        term71770 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setField(term71770, term71770.getClass(), "ownerFunction", null);
        setField(term71770, term71770.getClass(), "className", null);
        setField(term71770, term71770.getClass(), "properties", null);
        setBooleanField(term71770, term71770.getClass(), "nativeType", false);
        setField(term71770, term71770.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term71770, term71770.getClass(), "prettyPrint", false);
        setBooleanField(term71770, term71770.getClass(), "visited", false);
        setField(term71770, term71770.getClass(), "docInfo", null);
        setBooleanField(term71770, term71770.getClass(), "unknown", false);
        setBooleanField(term71770, term71770.getClass(), "resolved", false);
        setField(term71770, term71770.getClass(), "resolveResult", null);
        setField(term71770, term71770.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType");
        Object[] args = new Object[1];
        args[0] = term71419;
        Object retValue = callMethod(klass, "setPrototype", argTypes, term71094, args);
        assertTrue(recursiveEquals(term71094, term71765));
        assertTrue(recursiveEquals(term71419, term71770));
        assertTrue(recursiveEquals(retValue, false));
    }

};


