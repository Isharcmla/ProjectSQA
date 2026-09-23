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

public class FunctionType_getInstanceType_1940487563154 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term77774;
     Object term79458;

    public FunctionType_getInstanceType_1940487563154() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term79463 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term79462 = ((Class) term79463).getDeclaredField((String) "INTERFACE");
        ((Field) term79462).setAccessible(true);
        Object enum181 = ((Field) term79462).get((Object) null);
        term77774 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term77774, term77774.getClass(), "kind", enum181);
        Class<? extends Object> term79757 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term79756 = ((Class) term79757).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term79756).setAccessible(true);
        Object enum182 = ((Field) term79756).get((Object) null);
        term79458 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term79458, term79458.getClass(), "call", null);
        setField(term79458, term79458.getClass(), "prototype", null);
        setField(term79458, term79458.getClass(), "kind", enum182);
        setField(term79458, term79458.getClass(), "typeOfThis", null);
        setField(term79458, term79458.getClass(), "source", null);
        setField(term79458, term79458.getClass(), "implementedInterfaces", null);
        setField(term79458, term79458.getClass(), "subTypes", null);
        setField(term79458, term79458.getClass(), "templateTypeName", null);
        setField(term79458, term79458.getClass(), "className", null);
        setField(term79458, term79458.getClass(), "properties", null);
        setBooleanField(term79458, term79458.getClass(), "nativeType", false);
        setField(term79458, term79458.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term79458, term79458.getClass(), "prettyPrint", false);
        setBooleanField(term79458, term79458.getClass(), "visited", false);
        setField(term79458, term79458.getClass(), "docInfo", null);
        setBooleanField(term79458, term79458.getClass(), "unknown", false);
        setBooleanField(term79458, term79458.getClass(), "resolved", false);
        setField(term79458, term79458.getClass(), "resolveResult", null);
        setField(term79458, term79458.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getInstanceType", argTypes, term77774, args);
        assertTrue(recursiveEquals(term77774, term79458));
        assertTrue(recursiveEquals(retValue, null));
    }

};


