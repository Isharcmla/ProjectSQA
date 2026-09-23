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

public class FunctionType_isSubtype_2101002158889 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term944791;
     Object term945047;
     Object term945886;
     Object term945890;

    public FunctionType_isSubtype_2101002158889() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term945896 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term945895 = ((Class) term945896).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term945895).setAccessible(true);
        Object enum1762 = ((Field) term945895).get((Object) null);
        term944791 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        setField(term944791, term944791.getClass(), "kind", enum1762);
        Class<? extends Object> term946196 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term946195 = ((Class) term946196).getDeclaredField((String) "INTERFACE");
        ((Field) term946195).setAccessible(true);
        Object enum1763 = ((Field) term946195).get((Object) null);
        term945047 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term945047, term945047.getClass(), "kind", enum1763);
        Class<? extends Object> term946490 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term946489 = ((Class) term946490).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term946489).setAccessible(true);
        Object enum1764 = ((Field) term946489).get((Object) null);
        term945886 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        setField(term945886, term945886.getClass(), "this$0", null);
        setField(term945886, term945886.getClass(), "call", null);
        setField(term945886, term945886.getClass(), "prototype", null);
        setField(term945886, term945886.getClass(), "kind", enum1764);
        setField(term945886, term945886.getClass(), "typeOfThis", null);
        setField(term945886, term945886.getClass(), "source", null);
        setField(term945886, term945886.getClass(), "implementedInterfaces", null);
        setField(term945886, term945886.getClass(), "subTypes", null);
        setField(term945886, term945886.getClass(), "templateTypeName", null);
        setField(term945886, term945886.getClass(), "className", null);
        setField(term945886, term945886.getClass(), "properties", null);
        setField(term945886, term945886.getClass(), "implicitPrototype", null);
        setBooleanField(term945886, term945886.getClass(), "nativeType", false);
        setBooleanField(term945886, term945886.getClass(), "visited", false);
        setField(term945886, term945886.getClass(), "docInfo", null);
        setBooleanField(term945886, term945886.getClass(), "unknown", false);
        setBooleanField(term945886, term945886.getClass(), "resolved", false);
        setField(term945886, term945886.getClass(), "resolveResult", null);
        setField(term945886, term945886.getClass(), "registry", null);
        Class<? extends Object> term946790 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term946789 = ((Class) term946790).getDeclaredField((String) "INTERFACE");
        ((Field) term946789).setAccessible(true);
        Object enum1765 = ((Field) term946789).get((Object) null);
        term945890 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term945890, term945890.getClass(), "this$0", null);
        setField(term945890, term945890.getClass(), "call", null);
        setField(term945890, term945890.getClass(), "prototype", null);
        setField(term945890, term945890.getClass(), "kind", enum1765);
        setField(term945890, term945890.getClass(), "typeOfThis", null);
        setField(term945890, term945890.getClass(), "source", null);
        setField(term945890, term945890.getClass(), "implementedInterfaces", null);
        setField(term945890, term945890.getClass(), "subTypes", null);
        setField(term945890, term945890.getClass(), "templateTypeName", null);
        setField(term945890, term945890.getClass(), "className", null);
        setField(term945890, term945890.getClass(), "properties", null);
        setField(term945890, term945890.getClass(), "implicitPrototype", null);
        setBooleanField(term945890, term945890.getClass(), "nativeType", false);
        setBooleanField(term945890, term945890.getClass(), "visited", false);
        setField(term945890, term945890.getClass(), "docInfo", null);
        setBooleanField(term945890, term945890.getClass(), "unknown", false);
        setBooleanField(term945890, term945890.getClass(), "resolved", false);
        setField(term945890, term945890.getClass(), "resolveResult", null);
        setField(term945890, term945890.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term945047;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term944791, args);
        assertTrue(recursiveEquals(term944791, term945886));
        assertTrue(recursiveEquals(term945047, term945890));
        assertTrue(recursiveEquals(retValue, true));
    }

};


