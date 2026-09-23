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

public class FunctionType_isInterface_1109141755107 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term59297;
     Object term59760;

    public FunctionType_isInterface_1109141755107() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term59766 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term59765 = ((Class) term59766).getDeclaredField((String) "INTERFACE");
        ((Field) term59765).setAccessible(true);
        Object enum147 = ((Field) term59765).get((Object) null);
        term59297 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term59297, term59297.getClass(), "kind", enum147);
        Class<? extends Object> term60060 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term60059 = ((Class) term60060).getDeclaredField((String) "INTERFACE");
        ((Field) term60059).setAccessible(true);
        Object enum148 = ((Field) term60059).get((Object) null);
        term59760 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term59760, term59760.getClass(), "call", null);
        setField(term59760, term59760.getClass(), "prototype", null);
        setField(term59760, term59760.getClass(), "kind", enum148);
        setField(term59760, term59760.getClass(), "typeOfThis", null);
        setField(term59760, term59760.getClass(), "source", null);
        setField(term59760, term59760.getClass(), "implementedInterfaces", null);
        setField(term59760, term59760.getClass(), "subTypes", null);
        setField(term59760, term59760.getClass(), "templateTypeName", null);
        setField(term59760, term59760.getClass(), "className", null);
        setField(term59760, term59760.getClass(), "properties", null);
        setField(term59760, term59760.getClass(), "implicitPrototype", null);
        setBooleanField(term59760, term59760.getClass(), "nativeType", false);
        setBooleanField(term59760, term59760.getClass(), "visited", false);
        setField(term59760, term59760.getClass(), "docInfo", null);
        setBooleanField(term59760, term59760.getClass(), "unknown", false);
        setBooleanField(term59760, term59760.getClass(), "resolved", false);
        setField(term59760, term59760.getClass(), "resolveResult", null);
        setField(term59760, term59760.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "isInterface", argTypes, term59297, args);
        assertTrue(recursiveEquals(term59297, term59760));
        assertTrue(recursiveEquals(retValue, true));
    }

};


