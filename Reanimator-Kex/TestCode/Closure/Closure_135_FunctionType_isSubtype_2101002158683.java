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

public class FunctionType_isSubtype_2101002158683 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term617523;
     Object term618173;
     Object term618946;
     Object term618951;

    public FunctionType_isSubtype_2101002158683() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term618957 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term618956 = ((Class) term618957).getDeclaredField((String) "ORDINARY");
        ((Field) term618956).setAccessible(true);
        Object enum1148 = ((Field) term618956).get((Object) null);
        term617523 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term618065 = newInstance(Class.forName("com.google.javascript.rhino.jstype.IndexedType"));
        setField(term617523, term617523.getClass(), "kind", enum1148);
        setField(term617523, term617523.getClass(), "typeOfThis", term618065);
        Class<? extends Object> term619248 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term619247 = ((Class) term619248).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term619247).setAccessible(true);
        Object enum1149 = ((Field) term619247).get((Object) null);
        term618173 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term618173, term618173.getClass(), "kind", enum1149);
        setField(term618173, term618173.getClass(), "typeOfThis", null);
        Class<? extends Object> term619548 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term619547 = ((Class) term619548).getDeclaredField((String) "INTERFACE");
        ((Field) term619547).setAccessible(true);
        Object enum1150 = ((Field) term619547).get((Object) null);
        term618946 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term618950 = newInstance(Class.forName("com.google.javascript.rhino.jstype.IndexedType"));
        setField(term618946, term618946.getClass(), "call", null);
        setField(term618946, term618946.getClass(), "prototype", null);
        setField(term618946, term618946.getClass(), "kind", enum1150);
        setField(term618950, term618950.getClass(), "indexType", null);
        setField(term618950, term618950.getClass(), "referencedType", null);
        setBooleanField(term618950, term618950.getClass(), "visited", false);
        setField(term618950, term618950.getClass(), "docInfo", null);
        setBooleanField(term618950, term618950.getClass(), "unknown", false);
        setBooleanField(term618950, term618950.getClass(), "resolved", false);
        setField(term618950, term618950.getClass(), "resolveResult", null);
        setField(term618950, term618950.getClass(), "registry", null);
        setField(term618946, term618946.getClass(), "typeOfThis", term618950);
        setField(term618946, term618946.getClass(), "source", null);
        setField(term618946, term618946.getClass(), "implementedInterfaces", null);
        setField(term618946, term618946.getClass(), "subTypes", null);
        setField(term618946, term618946.getClass(), "templateTypeName", null);
        setField(term618946, term618946.getClass(), "className", null);
        setField(term618946, term618946.getClass(), "properties", null);
        setField(term618946, term618946.getClass(), "implicitPrototype", null);
        setBooleanField(term618946, term618946.getClass(), "nativeType", false);
        setBooleanField(term618946, term618946.getClass(), "visited", false);
        setField(term618946, term618946.getClass(), "docInfo", null);
        setBooleanField(term618946, term618946.getClass(), "unknown", false);
        setBooleanField(term618946, term618946.getClass(), "resolved", false);
        setField(term618946, term618946.getClass(), "resolveResult", null);
        setField(term618946, term618946.getClass(), "registry", null);
        Class<? extends Object> term619842 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term619841 = ((Class) term619842).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term619841).setAccessible(true);
        Object enum1151 = ((Field) term619841).get((Object) null);
        term618951 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term618951, term618951.getClass(), "this$0", null);
        setField(term618951, term618951.getClass(), "call", null);
        setField(term618951, term618951.getClass(), "prototype", null);
        setField(term618951, term618951.getClass(), "kind", enum1151);
        setField(term618951, term618951.getClass(), "typeOfThis", null);
        setField(term618951, term618951.getClass(), "source", null);
        setField(term618951, term618951.getClass(), "implementedInterfaces", null);
        setField(term618951, term618951.getClass(), "subTypes", null);
        setField(term618951, term618951.getClass(), "templateTypeName", null);
        setField(term618951, term618951.getClass(), "className", null);
        setField(term618951, term618951.getClass(), "properties", null);
        setField(term618951, term618951.getClass(), "implicitPrototype", null);
        setBooleanField(term618951, term618951.getClass(), "nativeType", false);
        setBooleanField(term618951, term618951.getClass(), "visited", false);
        setField(term618951, term618951.getClass(), "docInfo", null);
        setBooleanField(term618951, term618951.getClass(), "unknown", false);
        setBooleanField(term618951, term618951.getClass(), "resolved", false);
        setField(term618951, term618951.getClass(), "resolveResult", null);
        setField(term618951, term618951.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term618173;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term617523, args);
        assertTrue(recursiveEquals(term617523, term618946));
        assertTrue(recursiveEquals(term618173, term618951));
        assertTrue(recursiveEquals(retValue, false));
    }

};


