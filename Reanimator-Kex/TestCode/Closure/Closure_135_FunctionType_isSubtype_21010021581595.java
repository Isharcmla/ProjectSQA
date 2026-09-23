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

public class FunctionType_isSubtype_21010021581595 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2131770;
     Object term2132430;
     Object term2133268;
     Object term2133276;

    public FunctionType_isSubtype_21010021581595() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2133283 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2133282 = ((Class) term2133283).getDeclaredField((String) "ORDINARY");
        ((Field) term2133282).setAccessible(true);
        Object enum3975 = ((Field) term2133282).get((Object) null);
        Class<? extends Object> term2133574 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2133573 = ((Class) term2133574).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term2133573).setAccessible(true);
        Object enum3976 = ((Field) term2133573).get((Object) null);
        term2131770 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term2132558 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term2131770, term2131770.getClass(), "kind", enum3975);
        setField(term2132558, term2132558.getClass(), "kind", enum3976);
        setField(term2131770, term2131770.getClass(), "typeOfThis", term2132558);
        term2132430 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term2132430, term2132430.getClass(), "kind", enum3976);
        setField(term2132430, term2132430.getClass(), "typeOfThis", term2132558);
        Class<? extends Object> term2133874 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2133873 = ((Class) term2133874).getDeclaredField((String) "INTERFACE");
        ((Field) term2133873).setAccessible(true);
        Object enum3977 = ((Field) term2133873).get((Object) null);
        Class<? extends Object> term2134168 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2134167 = ((Class) term2134168).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term2134167).setAccessible(true);
        Object enum3978 = ((Field) term2134167).get((Object) null);
        term2133268 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term2133272 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term2133268, term2133268.getClass(), "this$0", null);
        setField(term2133268, term2133268.getClass(), "call", null);
        setField(term2133268, term2133268.getClass(), "prototype", null);
        setField(term2133268, term2133268.getClass(), "kind", enum3977);
        setField(term2133272, term2133272.getClass(), "this$0", null);
        setField(term2133272, term2133272.getClass(), "call", null);
        setField(term2133272, term2133272.getClass(), "prototype", null);
        setField(term2133272, term2133272.getClass(), "kind", enum3978);
        setField(term2133272, term2133272.getClass(), "typeOfThis", null);
        setField(term2133272, term2133272.getClass(), "source", null);
        setField(term2133272, term2133272.getClass(), "implementedInterfaces", null);
        setField(term2133272, term2133272.getClass(), "subTypes", null);
        setField(term2133272, term2133272.getClass(), "templateTypeName", null);
        setField(term2133272, term2133272.getClass(), "className", null);
        setField(term2133272, term2133272.getClass(), "properties", null);
        setField(term2133272, term2133272.getClass(), "implicitPrototype", null);
        setBooleanField(term2133272, term2133272.getClass(), "nativeType", false);
        setBooleanField(term2133272, term2133272.getClass(), "visited", false);
        setField(term2133272, term2133272.getClass(), "docInfo", null);
        setBooleanField(term2133272, term2133272.getClass(), "unknown", false);
        setBooleanField(term2133272, term2133272.getClass(), "resolved", false);
        setField(term2133272, term2133272.getClass(), "resolveResult", null);
        setField(term2133272, term2133272.getClass(), "registry", null);
        setField(term2133268, term2133268.getClass(), "typeOfThis", term2133272);
        setField(term2133268, term2133268.getClass(), "source", null);
        setField(term2133268, term2133268.getClass(), "implementedInterfaces", null);
        setField(term2133268, term2133268.getClass(), "subTypes", null);
        setField(term2133268, term2133268.getClass(), "templateTypeName", null);
        setField(term2133268, term2133268.getClass(), "className", null);
        setField(term2133268, term2133268.getClass(), "properties", null);
        setField(term2133268, term2133268.getClass(), "implicitPrototype", null);
        setBooleanField(term2133268, term2133268.getClass(), "nativeType", false);
        setBooleanField(term2133268, term2133268.getClass(), "visited", false);
        setField(term2133268, term2133268.getClass(), "docInfo", null);
        setBooleanField(term2133268, term2133268.getClass(), "unknown", false);
        setBooleanField(term2133268, term2133268.getClass(), "resolved", false);
        setField(term2133268, term2133268.getClass(), "resolveResult", null);
        setField(term2133268, term2133268.getClass(), "registry", null);
        Class<? extends Object> term2134468 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2134467 = ((Class) term2134468).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term2134467).setAccessible(true);
        Object enum3979 = ((Field) term2134467).get((Object) null);
        term2133276 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term2133280 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term2133276, term2133276.getClass(), "this$0", null);
        setField(term2133276, term2133276.getClass(), "call", null);
        setField(term2133276, term2133276.getClass(), "prototype", null);
        setField(term2133276, term2133276.getClass(), "kind", enum3979);
        setField(term2133280, term2133280.getClass(), "this$0", null);
        setField(term2133280, term2133280.getClass(), "call", null);
        setField(term2133280, term2133280.getClass(), "prototype", null);
        setField(term2133280, term2133280.getClass(), "kind", enum3979);
        setField(term2133280, term2133280.getClass(), "typeOfThis", null);
        setField(term2133280, term2133280.getClass(), "source", null);
        setField(term2133280, term2133280.getClass(), "implementedInterfaces", null);
        setField(term2133280, term2133280.getClass(), "subTypes", null);
        setField(term2133280, term2133280.getClass(), "templateTypeName", null);
        setField(term2133280, term2133280.getClass(), "className", null);
        setField(term2133280, term2133280.getClass(), "properties", null);
        setField(term2133280, term2133280.getClass(), "implicitPrototype", null);
        setBooleanField(term2133280, term2133280.getClass(), "nativeType", false);
        setBooleanField(term2133280, term2133280.getClass(), "visited", false);
        setField(term2133280, term2133280.getClass(), "docInfo", null);
        setBooleanField(term2133280, term2133280.getClass(), "unknown", false);
        setBooleanField(term2133280, term2133280.getClass(), "resolved", false);
        setField(term2133280, term2133280.getClass(), "resolveResult", null);
        setField(term2133280, term2133280.getClass(), "registry", null);
        setField(term2133276, term2133276.getClass(), "typeOfThis", term2133280);
        setField(term2133276, term2133276.getClass(), "source", null);
        setField(term2133276, term2133276.getClass(), "implementedInterfaces", null);
        setField(term2133276, term2133276.getClass(), "subTypes", null);
        setField(term2133276, term2133276.getClass(), "templateTypeName", null);
        setField(term2133276, term2133276.getClass(), "className", null);
        setField(term2133276, term2133276.getClass(), "properties", null);
        setField(term2133276, term2133276.getClass(), "implicitPrototype", null);
        setBooleanField(term2133276, term2133276.getClass(), "nativeType", false);
        setBooleanField(term2133276, term2133276.getClass(), "visited", false);
        setField(term2133276, term2133276.getClass(), "docInfo", null);
        setBooleanField(term2133276, term2133276.getClass(), "unknown", false);
        setBooleanField(term2133276, term2133276.getClass(), "resolved", false);
        setField(term2133276, term2133276.getClass(), "resolveResult", null);
        setField(term2133276, term2133276.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term2132430;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term2131770, args);
        assertTrue(recursiveEquals(term2131770, term2133268));
        assertTrue(recursiveEquals(term2132430, term2133276));
        assertTrue(recursiveEquals(retValue, false));
    }

};


