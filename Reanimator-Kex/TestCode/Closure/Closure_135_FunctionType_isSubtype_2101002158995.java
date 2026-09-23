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

public class FunctionType_isSubtype_2101002158995 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1116669;
     Object term1117221;
     Object term1118113;
     Object term1118117;

    public FunctionType_isSubtype_2101002158995() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1118124 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1118123 = ((Class) term1118124).getDeclaredField((String) "ORDINARY");
        ((Field) term1118123).setAccessible(true);
        Object enum2078 = ((Field) term1118123).get((Object) null);
        term1116669 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term1116669, term1116669.getClass(), "kind", enum2078);
        setField(term1116669, term1116669.getClass(), "typeOfThis", term1116669);
        Class<? extends Object> term1118415 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1118414 = ((Class) term1118415).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1118414).setAccessible(true);
        Object enum2079 = ((Field) term1118414).get((Object) null);
        term1117221 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1117403 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term1117221, term1117221.getClass(), "kind", enum2079);
        setField(term1117403, term1117403.getClass(), "kind", enum2079);
        setField(term1117221, term1117221.getClass(), "typeOfThis", term1117403);
        Class<? extends Object> term1118715 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1118714 = ((Class) term1118715).getDeclaredField((String) "INTERFACE");
        ((Field) term1118714).setAccessible(true);
        Object enum2080 = ((Field) term1118714).get((Object) null);
        term1118113 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term1118113, term1118113.getClass(), "this$0", null);
        setField(term1118113, term1118113.getClass(), "call", null);
        setField(term1118113, term1118113.getClass(), "prototype", null);
        setField(term1118113, term1118113.getClass(), "kind", enum2080);
        setField(term1118113, term1118113.getClass(), "typeOfThis", term1118113);
        setField(term1118113, term1118113.getClass(), "source", null);
        setField(term1118113, term1118113.getClass(), "implementedInterfaces", null);
        setField(term1118113, term1118113.getClass(), "subTypes", null);
        setField(term1118113, term1118113.getClass(), "templateTypeName", null);
        setField(term1118113, term1118113.getClass(), "className", null);
        setField(term1118113, term1118113.getClass(), "properties", null);
        setField(term1118113, term1118113.getClass(), "implicitPrototype", null);
        setBooleanField(term1118113, term1118113.getClass(), "nativeType", false);
        setBooleanField(term1118113, term1118113.getClass(), "visited", false);
        setField(term1118113, term1118113.getClass(), "docInfo", null);
        setBooleanField(term1118113, term1118113.getClass(), "unknown", false);
        setBooleanField(term1118113, term1118113.getClass(), "resolved", false);
        setField(term1118113, term1118113.getClass(), "resolveResult", null);
        setField(term1118113, term1118113.getClass(), "registry", null);
        Class<? extends Object> term1119009 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1119008 = ((Class) term1119009).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1119008).setAccessible(true);
        Object enum2081 = ((Field) term1119008).get((Object) null);
        term1118117 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1118121 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term1118117, term1118117.getClass(), "this$0", null);
        setField(term1118117, term1118117.getClass(), "call", null);
        setField(term1118117, term1118117.getClass(), "prototype", null);
        setField(term1118117, term1118117.getClass(), "kind", enum2081);
        setField(term1118121, term1118121.getClass(), "this$0", null);
        setField(term1118121, term1118121.getClass(), "call", null);
        setField(term1118121, term1118121.getClass(), "prototype", null);
        setField(term1118121, term1118121.getClass(), "kind", enum2081);
        setField(term1118121, term1118121.getClass(), "typeOfThis", null);
        setField(term1118121, term1118121.getClass(), "source", null);
        setField(term1118121, term1118121.getClass(), "implementedInterfaces", null);
        setField(term1118121, term1118121.getClass(), "subTypes", null);
        setField(term1118121, term1118121.getClass(), "templateTypeName", null);
        setField(term1118121, term1118121.getClass(), "className", null);
        setField(term1118121, term1118121.getClass(), "properties", null);
        setField(term1118121, term1118121.getClass(), "implicitPrototype", null);
        setBooleanField(term1118121, term1118121.getClass(), "nativeType", false);
        setBooleanField(term1118121, term1118121.getClass(), "visited", false);
        setField(term1118121, term1118121.getClass(), "docInfo", null);
        setBooleanField(term1118121, term1118121.getClass(), "unknown", false);
        setBooleanField(term1118121, term1118121.getClass(), "resolved", false);
        setField(term1118121, term1118121.getClass(), "resolveResult", null);
        setField(term1118121, term1118121.getClass(), "registry", null);
        setField(term1118117, term1118117.getClass(), "typeOfThis", term1118121);
        setField(term1118117, term1118117.getClass(), "source", null);
        setField(term1118117, term1118117.getClass(), "implementedInterfaces", null);
        setField(term1118117, term1118117.getClass(), "subTypes", null);
        setField(term1118117, term1118117.getClass(), "templateTypeName", null);
        setField(term1118117, term1118117.getClass(), "className", null);
        setField(term1118117, term1118117.getClass(), "properties", null);
        setField(term1118117, term1118117.getClass(), "implicitPrototype", null);
        setBooleanField(term1118117, term1118117.getClass(), "nativeType", false);
        setBooleanField(term1118117, term1118117.getClass(), "visited", false);
        setField(term1118117, term1118117.getClass(), "docInfo", null);
        setBooleanField(term1118117, term1118117.getClass(), "unknown", false);
        setBooleanField(term1118117, term1118117.getClass(), "resolved", false);
        setField(term1118117, term1118117.getClass(), "resolveResult", null);
        setField(term1118117, term1118117.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1117221;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term1116669, args);
        assertTrue(recursiveEquals(term1116669, term1118113));
        assertTrue(recursiveEquals(term1117221, term1118117));
        assertTrue(recursiveEquals(retValue, false));
    }

};


