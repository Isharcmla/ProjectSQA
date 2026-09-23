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

public class FunctionType_isSubtype_2101002158952 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1177515;
     Object term1178277;
     Object term1181127;
     Object term1181133;

    public FunctionType_isSubtype_2101002158952() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1181141 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1181140 = ((Class) term1181141).getDeclaredField((String) "INTERFACE");
        ((Field) term1181140).setAccessible(true);
        Object enum2121 = ((Field) term1181140).get((Object) null);
        term1177515 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1178059 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1178169 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term1177515, term1177515.getClass(), "kind", enum2121);
        setField(term1178059, term1178059.getClass(), "kind", enum2121);
        setField(term1178059, term1178059.getClass(), "typeOfThis", term1178169);
        setField(term1177515, term1177515.getClass(), "typeOfThis", term1178059);
        Class<? extends Object> term1181435 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1181434 = ((Class) term1181435).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1181434).setAccessible(true);
        Object enum2122 = ((Field) term1181434).get((Object) null);
        term1178277 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1178461 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1178567 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ProxyObjectType"));
        setField(term1178277, term1178277.getClass(), "kind", enum2122);
        setField(term1178461, term1178461.getClass(), "kind", enum2122);
        setField(term1178461, term1178461.getClass(), "typeOfThis", term1178567);
        setField(term1178277, term1178277.getClass(), "typeOfThis", term1178461);
        Class<? extends Object> term1181735 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1181734 = ((Class) term1181735).getDeclaredField((String) "INTERFACE");
        ((Field) term1181734).setAccessible(true);
        Object enum2123 = ((Field) term1181734).get((Object) null);
        term1181127 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1181131 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1181132 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term1181127, term1181127.getClass(), "this$0", null);
        setField(term1181127, term1181127.getClass(), "call", null);
        setField(term1181127, term1181127.getClass(), "prototype", null);
        setField(term1181127, term1181127.getClass(), "kind", enum2123);
        setField(term1181131, term1181131.getClass(), "call", null);
        setField(term1181131, term1181131.getClass(), "prototype", null);
        setField(term1181131, term1181131.getClass(), "kind", enum2123);
        setField(term1181132, term1181132.getClass(), "call", null);
        setField(term1181132, term1181132.getClass(), "prototype", null);
        setField(term1181132, term1181132.getClass(), "kind", null);
        setField(term1181132, term1181132.getClass(), "typeOfThis", null);
        setField(term1181132, term1181132.getClass(), "source", null);
        setField(term1181132, term1181132.getClass(), "implementedInterfaces", null);
        setField(term1181132, term1181132.getClass(), "subTypes", null);
        setField(term1181132, term1181132.getClass(), "templateTypeName", null);
        setField(term1181132, term1181132.getClass(), "className", null);
        setField(term1181132, term1181132.getClass(), "properties", null);
        setField(term1181132, term1181132.getClass(), "implicitPrototype", null);
        setBooleanField(term1181132, term1181132.getClass(), "nativeType", false);
        setBooleanField(term1181132, term1181132.getClass(), "prettyPrint", false);
        setBooleanField(term1181132, term1181132.getClass(), "visited", false);
        setField(term1181132, term1181132.getClass(), "docInfo", null);
        setBooleanField(term1181132, term1181132.getClass(), "unknown", false);
        setBooleanField(term1181132, term1181132.getClass(), "resolved", false);
        setField(term1181132, term1181132.getClass(), "resolveResult", null);
        setField(term1181132, term1181132.getClass(), "registry", null);
        setField(term1181131, term1181131.getClass(), "typeOfThis", term1181132);
        setField(term1181131, term1181131.getClass(), "source", null);
        setField(term1181131, term1181131.getClass(), "implementedInterfaces", null);
        setField(term1181131, term1181131.getClass(), "subTypes", null);
        setField(term1181131, term1181131.getClass(), "templateTypeName", null);
        setField(term1181131, term1181131.getClass(), "className", null);
        setField(term1181131, term1181131.getClass(), "properties", null);
        setField(term1181131, term1181131.getClass(), "implicitPrototype", null);
        setBooleanField(term1181131, term1181131.getClass(), "nativeType", false);
        setBooleanField(term1181131, term1181131.getClass(), "prettyPrint", false);
        setBooleanField(term1181131, term1181131.getClass(), "visited", false);
        setField(term1181131, term1181131.getClass(), "docInfo", null);
        setBooleanField(term1181131, term1181131.getClass(), "unknown", false);
        setBooleanField(term1181131, term1181131.getClass(), "resolved", false);
        setField(term1181131, term1181131.getClass(), "resolveResult", null);
        setField(term1181131, term1181131.getClass(), "registry", null);
        setField(term1181127, term1181127.getClass(), "typeOfThis", term1181131);
        setField(term1181127, term1181127.getClass(), "source", null);
        setField(term1181127, term1181127.getClass(), "implementedInterfaces", null);
        setField(term1181127, term1181127.getClass(), "subTypes", null);
        setField(term1181127, term1181127.getClass(), "templateTypeName", null);
        setField(term1181127, term1181127.getClass(), "className", null);
        setField(term1181127, term1181127.getClass(), "properties", null);
        setField(term1181127, term1181127.getClass(), "implicitPrototype", null);
        setBooleanField(term1181127, term1181127.getClass(), "nativeType", false);
        setBooleanField(term1181127, term1181127.getClass(), "prettyPrint", false);
        setBooleanField(term1181127, term1181127.getClass(), "visited", false);
        setField(term1181127, term1181127.getClass(), "docInfo", null);
        setBooleanField(term1181127, term1181127.getClass(), "unknown", false);
        setBooleanField(term1181127, term1181127.getClass(), "resolved", false);
        setField(term1181127, term1181127.getClass(), "resolveResult", null);
        setField(term1181127, term1181127.getClass(), "registry", null);
        Class<? extends Object> term1182029 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1182028 = ((Class) term1182029).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1182028).setAccessible(true);
        Object enum2124 = ((Field) term1182028).get((Object) null);
        term1181133 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1181137 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1181138 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ProxyObjectType"));
        setField(term1181133, term1181133.getClass(), "this$0", null);
        setField(term1181133, term1181133.getClass(), "call", null);
        setField(term1181133, term1181133.getClass(), "prototype", null);
        setField(term1181133, term1181133.getClass(), "kind", enum2124);
        setField(term1181137, term1181137.getClass(), "call", null);
        setField(term1181137, term1181137.getClass(), "prototype", null);
        setField(term1181137, term1181137.getClass(), "kind", enum2124);
        setField(term1181138, term1181138.getClass(), "referencedType", null);
        setBooleanField(term1181138, term1181138.getClass(), "visited", false);
        setField(term1181138, term1181138.getClass(), "docInfo", null);
        setBooleanField(term1181138, term1181138.getClass(), "unknown", false);
        setBooleanField(term1181138, term1181138.getClass(), "resolved", false);
        setField(term1181138, term1181138.getClass(), "resolveResult", null);
        setField(term1181138, term1181138.getClass(), "registry", null);
        setField(term1181137, term1181137.getClass(), "typeOfThis", term1181138);
        setField(term1181137, term1181137.getClass(), "source", null);
        setField(term1181137, term1181137.getClass(), "implementedInterfaces", null);
        setField(term1181137, term1181137.getClass(), "subTypes", null);
        setField(term1181137, term1181137.getClass(), "templateTypeName", null);
        setField(term1181137, term1181137.getClass(), "className", null);
        setField(term1181137, term1181137.getClass(), "properties", null);
        setField(term1181137, term1181137.getClass(), "implicitPrototype", null);
        setBooleanField(term1181137, term1181137.getClass(), "nativeType", false);
        setBooleanField(term1181137, term1181137.getClass(), "prettyPrint", false);
        setBooleanField(term1181137, term1181137.getClass(), "visited", false);
        setField(term1181137, term1181137.getClass(), "docInfo", null);
        setBooleanField(term1181137, term1181137.getClass(), "unknown", false);
        setBooleanField(term1181137, term1181137.getClass(), "resolved", false);
        setField(term1181137, term1181137.getClass(), "resolveResult", null);
        setField(term1181137, term1181137.getClass(), "registry", null);
        setField(term1181133, term1181133.getClass(), "typeOfThis", term1181137);
        setField(term1181133, term1181133.getClass(), "source", null);
        setField(term1181133, term1181133.getClass(), "implementedInterfaces", null);
        setField(term1181133, term1181133.getClass(), "subTypes", null);
        setField(term1181133, term1181133.getClass(), "templateTypeName", null);
        setField(term1181133, term1181133.getClass(), "className", null);
        setField(term1181133, term1181133.getClass(), "properties", null);
        setField(term1181133, term1181133.getClass(), "implicitPrototype", null);
        setBooleanField(term1181133, term1181133.getClass(), "nativeType", false);
        setBooleanField(term1181133, term1181133.getClass(), "prettyPrint", false);
        setBooleanField(term1181133, term1181133.getClass(), "visited", false);
        setField(term1181133, term1181133.getClass(), "docInfo", null);
        setBooleanField(term1181133, term1181133.getClass(), "unknown", false);
        setBooleanField(term1181133, term1181133.getClass(), "resolved", false);
        setField(term1181133, term1181133.getClass(), "resolveResult", null);
        setField(term1181133, term1181133.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1178277;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term1177515, args);
        assertTrue(recursiveEquals(term1177515, term1181127));
        assertTrue(recursiveEquals(term1178277, term1181133));
        assertTrue(recursiveEquals(retValue, false));
    }

};


