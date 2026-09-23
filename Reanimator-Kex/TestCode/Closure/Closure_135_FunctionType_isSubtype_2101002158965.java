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

public class FunctionType_isSubtype_2101002158965 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1070281;
     Object term1070537;
     Object term1072963;
     Object term1072967;

    public FunctionType_isSubtype_2101002158965() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1072973 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1072972 = ((Class) term1072973).getDeclaredField((String) "INTERFACE");
        ((Field) term1072972).setAccessible(true);
        Object enum2000 = ((Field) term1072972).get((Object) null);
        term1070281 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term1070281, term1070281.getClass(), "kind", enum2000);
        term1070537 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term1070537, term1070537.getClass(), "kind", enum2000);
        Class<? extends Object> term1073267 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1073266 = ((Class) term1073267).getDeclaredField((String) "INTERFACE");
        ((Field) term1073266).setAccessible(true);
        Object enum2001 = ((Field) term1073266).get((Object) null);
        term1072963 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term1072963, term1072963.getClass(), "this$0", null);
        setField(term1072963, term1072963.getClass(), "call", null);
        setField(term1072963, term1072963.getClass(), "prototype", null);
        setField(term1072963, term1072963.getClass(), "kind", enum2001);
        setField(term1072963, term1072963.getClass(), "typeOfThis", null);
        setField(term1072963, term1072963.getClass(), "source", null);
        setField(term1072963, term1072963.getClass(), "implementedInterfaces", null);
        setField(term1072963, term1072963.getClass(), "subTypes", null);
        setField(term1072963, term1072963.getClass(), "templateTypeName", null);
        setField(term1072963, term1072963.getClass(), "className", null);
        setField(term1072963, term1072963.getClass(), "properties", null);
        setField(term1072963, term1072963.getClass(), "implicitPrototype", null);
        setBooleanField(term1072963, term1072963.getClass(), "nativeType", false);
        setBooleanField(term1072963, term1072963.getClass(), "visited", false);
        setField(term1072963, term1072963.getClass(), "docInfo", null);
        setBooleanField(term1072963, term1072963.getClass(), "unknown", false);
        setBooleanField(term1072963, term1072963.getClass(), "resolved", false);
        setField(term1072963, term1072963.getClass(), "resolveResult", null);
        setField(term1072963, term1072963.getClass(), "registry", null);
        Class<? extends Object> term1073561 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1073560 = ((Class) term1073561).getDeclaredField((String) "INTERFACE");
        ((Field) term1073560).setAccessible(true);
        Object enum2002 = ((Field) term1073560).get((Object) null);
        term1072967 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term1072967, term1072967.getClass(), "this$0", null);
        setField(term1072967, term1072967.getClass(), "call", null);
        setField(term1072967, term1072967.getClass(), "prototype", null);
        setField(term1072967, term1072967.getClass(), "kind", enum2002);
        setField(term1072967, term1072967.getClass(), "typeOfThis", null);
        setField(term1072967, term1072967.getClass(), "source", null);
        setField(term1072967, term1072967.getClass(), "implementedInterfaces", null);
        setField(term1072967, term1072967.getClass(), "subTypes", null);
        setField(term1072967, term1072967.getClass(), "templateTypeName", null);
        setField(term1072967, term1072967.getClass(), "className", null);
        setField(term1072967, term1072967.getClass(), "properties", null);
        setField(term1072967, term1072967.getClass(), "implicitPrototype", null);
        setBooleanField(term1072967, term1072967.getClass(), "nativeType", false);
        setBooleanField(term1072967, term1072967.getClass(), "visited", false);
        setField(term1072967, term1072967.getClass(), "docInfo", null);
        setBooleanField(term1072967, term1072967.getClass(), "unknown", false);
        setBooleanField(term1072967, term1072967.getClass(), "resolved", false);
        setField(term1072967, term1072967.getClass(), "resolveResult", null);
        setField(term1072967, term1072967.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1070537;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term1070281, args);
        assertTrue(recursiveEquals(term1070281, term1072963));
        assertTrue(recursiveEquals(term1070537, term1072967));
        assertTrue(recursiveEquals(retValue, true));
    }

};


