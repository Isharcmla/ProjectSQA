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

public class FunctionType_isSubtype_2101002158472 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term395333;
     Object term395589;
     Object term397804;
     Object term397808;

    public FunctionType_isSubtype_2101002158472() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term397814 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term397813 = ((Class) term397814).getDeclaredField((String) "INTERFACE");
        ((Field) term397813).setAccessible(true);
        Object enum718 = ((Field) term397813).get((Object) null);
        term395333 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term395333, term395333.getClass(), "kind", enum718);
        Class<? extends Object> term398108 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term398107 = ((Class) term398108).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term398107).setAccessible(true);
        Object enum719 = ((Field) term398107).get((Object) null);
        term395589 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term395589, term395589.getClass(), "kind", enum719);
        Class<? extends Object> term398408 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term398407 = ((Class) term398408).getDeclaredField((String) "INTERFACE");
        ((Field) term398407).setAccessible(true);
        Object enum720 = ((Field) term398407).get((Object) null);
        term397804 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term397804, term397804.getClass(), "this$0", null);
        setField(term397804, term397804.getClass(), "call", null);
        setField(term397804, term397804.getClass(), "prototype", null);
        setField(term397804, term397804.getClass(), "kind", enum720);
        setField(term397804, term397804.getClass(), "typeOfThis", null);
        setField(term397804, term397804.getClass(), "source", null);
        setField(term397804, term397804.getClass(), "implementedInterfaces", null);
        setField(term397804, term397804.getClass(), "subTypes", null);
        setField(term397804, term397804.getClass(), "templateTypeName", null);
        setField(term397804, term397804.getClass(), "className", null);
        setField(term397804, term397804.getClass(), "properties", null);
        setField(term397804, term397804.getClass(), "implicitPrototype", null);
        setBooleanField(term397804, term397804.getClass(), "nativeType", false);
        setBooleanField(term397804, term397804.getClass(), "prettyPrint", false);
        setBooleanField(term397804, term397804.getClass(), "visited", false);
        setField(term397804, term397804.getClass(), "docInfo", null);
        setBooleanField(term397804, term397804.getClass(), "unknown", false);
        setBooleanField(term397804, term397804.getClass(), "resolved", false);
        setField(term397804, term397804.getClass(), "resolveResult", null);
        setField(term397804, term397804.getClass(), "registry", null);
        Class<? extends Object> term398702 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term398701 = ((Class) term398702).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term398701).setAccessible(true);
        Object enum721 = ((Field) term398701).get((Object) null);
        term397808 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term397808, term397808.getClass(), "this$0", null);
        setField(term397808, term397808.getClass(), "call", null);
        setField(term397808, term397808.getClass(), "prototype", null);
        setField(term397808, term397808.getClass(), "kind", enum721);
        setField(term397808, term397808.getClass(), "typeOfThis", null);
        setField(term397808, term397808.getClass(), "source", null);
        setField(term397808, term397808.getClass(), "implementedInterfaces", null);
        setField(term397808, term397808.getClass(), "subTypes", null);
        setField(term397808, term397808.getClass(), "templateTypeName", null);
        setField(term397808, term397808.getClass(), "className", null);
        setField(term397808, term397808.getClass(), "properties", null);
        setField(term397808, term397808.getClass(), "implicitPrototype", null);
        setBooleanField(term397808, term397808.getClass(), "nativeType", false);
        setBooleanField(term397808, term397808.getClass(), "prettyPrint", false);
        setBooleanField(term397808, term397808.getClass(), "visited", false);
        setField(term397808, term397808.getClass(), "docInfo", null);
        setBooleanField(term397808, term397808.getClass(), "unknown", false);
        setBooleanField(term397808, term397808.getClass(), "resolved", false);
        setField(term397808, term397808.getClass(), "resolveResult", null);
        setField(term397808, term397808.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term395589;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term395333, args);
        assertTrue(recursiveEquals(term395333, term397804));
        assertTrue(recursiveEquals(term395589, term397808));
        assertTrue(recursiveEquals(retValue, false));
    }

};


