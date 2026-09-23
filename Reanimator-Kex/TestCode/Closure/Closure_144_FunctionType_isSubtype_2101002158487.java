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

public class FunctionType_isSubtype_2101002158487 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term411944;
     Object term412608;
     Object term415553;
     Object term415558;

    public FunctionType_isSubtype_2101002158487() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term415564 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term415563 = ((Class) term415564).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term415563).setAccessible(true);
        Object enum752 = ((Field) term415563).get((Object) null);
        term411944 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term412498 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term411944, term411944.getClass(), "kind", enum752);
        setField(term411944, term411944.getClass(), "typeOfThis", term412498);
        Class<? extends Object> term415864 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term415863 = ((Class) term415864).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term415863).setAccessible(true);
        Object enum753 = ((Field) term415863).get((Object) null);
        term412608 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term412608, term412608.getClass(), "kind", enum753);
        setField(term412608, term412608.getClass(), "typeOfThis", null);
        Class<? extends Object> term416164 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term416163 = ((Class) term416164).getDeclaredField((String) "INTERFACE");
        ((Field) term416163).setAccessible(true);
        Object enum754 = ((Field) term416163).get((Object) null);
        term415553 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term415557 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term415553, term415553.getClass(), "call", null);
        setField(term415553, term415553.getClass(), "prototype", null);
        setField(term415553, term415553.getClass(), "kind", enum754);
        setField(term415557, term415557.getClass(), "call", null);
        setField(term415557, term415557.getClass(), "prototype", null);
        setField(term415557, term415557.getClass(), "kind", null);
        setField(term415557, term415557.getClass(), "typeOfThis", null);
        setField(term415557, term415557.getClass(), "source", null);
        setField(term415557, term415557.getClass(), "implementedInterfaces", null);
        setField(term415557, term415557.getClass(), "subTypes", null);
        setField(term415557, term415557.getClass(), "templateTypeName", null);
        setField(term415557, term415557.getClass(), "className", null);
        setField(term415557, term415557.getClass(), "properties", null);
        setField(term415557, term415557.getClass(), "implicitPrototype", null);
        setBooleanField(term415557, term415557.getClass(), "nativeType", false);
        setBooleanField(term415557, term415557.getClass(), "prettyPrint", false);
        setBooleanField(term415557, term415557.getClass(), "visited", false);
        setField(term415557, term415557.getClass(), "docInfo", null);
        setBooleanField(term415557, term415557.getClass(), "unknown", false);
        setBooleanField(term415557, term415557.getClass(), "resolved", false);
        setField(term415557, term415557.getClass(), "resolveResult", null);
        setField(term415557, term415557.getClass(), "registry", null);
        setField(term415553, term415553.getClass(), "typeOfThis", term415557);
        setField(term415553, term415553.getClass(), "source", null);
        setField(term415553, term415553.getClass(), "implementedInterfaces", null);
        setField(term415553, term415553.getClass(), "subTypes", null);
        setField(term415553, term415553.getClass(), "templateTypeName", null);
        setField(term415553, term415553.getClass(), "className", null);
        setField(term415553, term415553.getClass(), "properties", null);
        setField(term415553, term415553.getClass(), "implicitPrototype", null);
        setBooleanField(term415553, term415553.getClass(), "nativeType", false);
        setBooleanField(term415553, term415553.getClass(), "prettyPrint", false);
        setBooleanField(term415553, term415553.getClass(), "visited", false);
        setField(term415553, term415553.getClass(), "docInfo", null);
        setBooleanField(term415553, term415553.getClass(), "unknown", false);
        setBooleanField(term415553, term415553.getClass(), "resolved", false);
        setField(term415553, term415553.getClass(), "resolveResult", null);
        setField(term415553, term415553.getClass(), "registry", null);
        Class<? extends Object> term416458 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term416457 = ((Class) term416458).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term416457).setAccessible(true);
        Object enum755 = ((Field) term416457).get((Object) null);
        term415558 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term415558, term415558.getClass(), "call", null);
        setField(term415558, term415558.getClass(), "prototype", null);
        setField(term415558, term415558.getClass(), "kind", enum755);
        setField(term415558, term415558.getClass(), "typeOfThis", null);
        setField(term415558, term415558.getClass(), "source", null);
        setField(term415558, term415558.getClass(), "implementedInterfaces", null);
        setField(term415558, term415558.getClass(), "subTypes", null);
        setField(term415558, term415558.getClass(), "templateTypeName", null);
        setField(term415558, term415558.getClass(), "className", null);
        setField(term415558, term415558.getClass(), "properties", null);
        setField(term415558, term415558.getClass(), "implicitPrototype", null);
        setBooleanField(term415558, term415558.getClass(), "nativeType", false);
        setBooleanField(term415558, term415558.getClass(), "prettyPrint", false);
        setBooleanField(term415558, term415558.getClass(), "visited", false);
        setField(term415558, term415558.getClass(), "docInfo", null);
        setBooleanField(term415558, term415558.getClass(), "unknown", false);
        setBooleanField(term415558, term415558.getClass(), "resolved", false);
        setField(term415558, term415558.getClass(), "resolveResult", null);
        setField(term415558, term415558.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term412608;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term411944, args);
        assertTrue(recursiveEquals(term411944, term415553));
        assertTrue(recursiveEquals(term412608, term415558));
        assertTrue(recursiveEquals(retValue, false));
    }

};


