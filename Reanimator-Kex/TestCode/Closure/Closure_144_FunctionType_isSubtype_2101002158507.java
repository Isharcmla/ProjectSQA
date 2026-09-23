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

public class FunctionType_isSubtype_2101002158507 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term438058;
     Object term438488;
     Object term438492;

    public FunctionType_isSubtype_2101002158507() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term438498 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term438497 = ((Class) term438498).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term438497).setAccessible(true);
        Object enum794 = ((Field) term438497).get((Object) null);
        term438058 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term438058, term438058.getClass(), "kind", enum794);
        Class<? extends Object> term438798 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term438797 = ((Class) term438798).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term438797).setAccessible(true);
        Object enum795 = ((Field) term438797).get((Object) null);
        term438488 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term438488, term438488.getClass(), "this$0", null);
        setField(term438488, term438488.getClass(), "call", null);
        setField(term438488, term438488.getClass(), "prototype", null);
        setField(term438488, term438488.getClass(), "kind", enum795);
        setField(term438488, term438488.getClass(), "typeOfThis", null);
        setField(term438488, term438488.getClass(), "source", null);
        setField(term438488, term438488.getClass(), "implementedInterfaces", null);
        setField(term438488, term438488.getClass(), "subTypes", null);
        setField(term438488, term438488.getClass(), "templateTypeName", null);
        setField(term438488, term438488.getClass(), "className", null);
        setField(term438488, term438488.getClass(), "properties", null);
        setField(term438488, term438488.getClass(), "implicitPrototype", null);
        setBooleanField(term438488, term438488.getClass(), "nativeType", false);
        setBooleanField(term438488, term438488.getClass(), "prettyPrint", false);
        setBooleanField(term438488, term438488.getClass(), "visited", false);
        setField(term438488, term438488.getClass(), "docInfo", null);
        setBooleanField(term438488, term438488.getClass(), "unknown", false);
        setBooleanField(term438488, term438488.getClass(), "resolved", false);
        setField(term438488, term438488.getClass(), "resolveResult", null);
        setField(term438488, term438488.getClass(), "registry", null);
        Class<? extends Object> term439098 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term439097 = ((Class) term439098).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term439097).setAccessible(true);
        Object enum796 = ((Field) term439097).get((Object) null);
        term438492 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term438492, term438492.getClass(), "this$0", null);
        setField(term438492, term438492.getClass(), "call", null);
        setField(term438492, term438492.getClass(), "prototype", null);
        setField(term438492, term438492.getClass(), "kind", enum796);
        setField(term438492, term438492.getClass(), "typeOfThis", null);
        setField(term438492, term438492.getClass(), "source", null);
        setField(term438492, term438492.getClass(), "implementedInterfaces", null);
        setField(term438492, term438492.getClass(), "subTypes", null);
        setField(term438492, term438492.getClass(), "templateTypeName", null);
        setField(term438492, term438492.getClass(), "className", null);
        setField(term438492, term438492.getClass(), "properties", null);
        setField(term438492, term438492.getClass(), "implicitPrototype", null);
        setBooleanField(term438492, term438492.getClass(), "nativeType", false);
        setBooleanField(term438492, term438492.getClass(), "prettyPrint", false);
        setBooleanField(term438492, term438492.getClass(), "visited", false);
        setField(term438492, term438492.getClass(), "docInfo", null);
        setBooleanField(term438492, term438492.getClass(), "unknown", false);
        setBooleanField(term438492, term438492.getClass(), "resolved", false);
        setField(term438492, term438492.getClass(), "resolveResult", null);
        setField(term438492, term438492.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term438058;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term438058, args);
        assertTrue(recursiveEquals(term438058, term438488));
        assertTrue(recursiveEquals(term438058, term438492));
        assertTrue(recursiveEquals(retValue, true));
    }

};


