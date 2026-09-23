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

public class FunctionType_isSubtype_2101002158629 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term545769;
     Object term546025;
     Object term546375;
     Object term546379;

    public FunctionType_isSubtype_2101002158629() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term546382 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term546381 = ((Class) term546382).getDeclaredField((String) "INTERFACE");
        ((Field) term546381).setAccessible(true);
        Object enum1008 = ((Field) term546381).get((Object) null);
        term545769 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term545769, term545769.getClass(), "kind", enum1008);
        term546025 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Class<? extends Object> term546676 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term546675 = ((Class) term546676).getDeclaredField((String) "INTERFACE");
        ((Field) term546675).setAccessible(true);
        Object enum1009 = ((Field) term546675).get((Object) null);
        term546375 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term546375, term546375.getClass(), "this$0", null);
        setField(term546375, term546375.getClass(), "call", null);
        setField(term546375, term546375.getClass(), "prototype", null);
        setField(term546375, term546375.getClass(), "kind", enum1009);
        setField(term546375, term546375.getClass(), "typeOfThis", null);
        setField(term546375, term546375.getClass(), "source", null);
        setField(term546375, term546375.getClass(), "implementedInterfaces", null);
        setField(term546375, term546375.getClass(), "subTypes", null);
        setField(term546375, term546375.getClass(), "templateTypeName", null);
        setField(term546375, term546375.getClass(), "className", null);
        setField(term546375, term546375.getClass(), "properties", null);
        setField(term546375, term546375.getClass(), "implicitPrototype", null);
        setBooleanField(term546375, term546375.getClass(), "nativeType", false);
        setBooleanField(term546375, term546375.getClass(), "visited", false);
        setField(term546375, term546375.getClass(), "docInfo", null);
        setBooleanField(term546375, term546375.getClass(), "unknown", false);
        setBooleanField(term546375, term546375.getClass(), "resolved", false);
        setField(term546375, term546375.getClass(), "resolveResult", null);
        setField(term546375, term546375.getClass(), "registry", null);
        term546379 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term546379, term546379.getClass(), "this$0", null);
        setField(term546379, term546379.getClass(), "call", null);
        setField(term546379, term546379.getClass(), "prototype", null);
        setField(term546379, term546379.getClass(), "kind", null);
        setField(term546379, term546379.getClass(), "typeOfThis", null);
        setField(term546379, term546379.getClass(), "source", null);
        setField(term546379, term546379.getClass(), "implementedInterfaces", null);
        setField(term546379, term546379.getClass(), "subTypes", null);
        setField(term546379, term546379.getClass(), "templateTypeName", null);
        setField(term546379, term546379.getClass(), "className", null);
        setField(term546379, term546379.getClass(), "properties", null);
        setField(term546379, term546379.getClass(), "implicitPrototype", null);
        setBooleanField(term546379, term546379.getClass(), "nativeType", false);
        setBooleanField(term546379, term546379.getClass(), "visited", false);
        setField(term546379, term546379.getClass(), "docInfo", null);
        setBooleanField(term546379, term546379.getClass(), "unknown", false);
        setBooleanField(term546379, term546379.getClass(), "resolved", false);
        setField(term546379, term546379.getClass(), "resolveResult", null);
        setField(term546379, term546379.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term546025;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term545769, args);
        assertTrue(recursiveEquals(term545769, term546375));
        assertTrue(recursiveEquals(term546025, term546379));
        assertTrue(recursiveEquals(retValue, false));
    }

};


