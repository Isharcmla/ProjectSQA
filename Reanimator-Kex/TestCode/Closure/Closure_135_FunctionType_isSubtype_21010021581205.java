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

public class FunctionType_isSubtype_21010021581205 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1470814;
     Object term1470488;
     Object term1471560;
     Object term1471565;

    public FunctionType_isSubtype_21010021581205() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1471576 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1471575 = ((Class) term1471576).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1471575).setAccessible(true);
        Object enum2749 = ((Field) term1471575).get((Object) null);
        term1470814 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1470616 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term1470814, term1470814.getClass(), "kind", enum2749);
        setField(term1470616, term1470616.getClass(), "kind", enum2749);
        setField(term1470616, term1470616.getClass(), "typeOfThis", term1470814);
        setField(term1470814, term1470814.getClass(), "typeOfThis", term1470616);
        Class<? extends Object> term1471876 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1471875 = ((Class) term1471876).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1471875).setAccessible(true);
        Object enum2750 = ((Field) term1471875).get((Object) null);
        term1470488 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term1470488, term1470488.getClass(), "kind", enum2750);
        setField(term1470488, term1470488.getClass(), "typeOfThis", term1470616);
        Class<? extends Object> term1472176 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1472175 = ((Class) term1472176).getDeclaredField((String) "INTERFACE");
        ((Field) term1472175).setAccessible(true);
        Object enum2751 = ((Field) term1472175).get((Object) null);
        term1471560 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1471564 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term1471560, term1471560.getClass(), "call", null);
        setField(term1471560, term1471560.getClass(), "prototype", null);
        setField(term1471560, term1471560.getClass(), "kind", enum2751);
        setField(term1471564, term1471564.getClass(), "this$0", null);
        setField(term1471564, term1471564.getClass(), "call", null);
        setField(term1471564, term1471564.getClass(), "prototype", null);
        setField(term1471564, term1471564.getClass(), "kind", enum2751);
        setField(term1471564, term1471564.getClass(), "typeOfThis", term1471560);
        setField(term1471564, term1471564.getClass(), "source", null);
        setField(term1471564, term1471564.getClass(), "implementedInterfaces", null);
        setField(term1471564, term1471564.getClass(), "subTypes", null);
        setField(term1471564, term1471564.getClass(), "templateTypeName", null);
        setField(term1471564, term1471564.getClass(), "className", null);
        setField(term1471564, term1471564.getClass(), "properties", null);
        setField(term1471564, term1471564.getClass(), "implicitPrototype", null);
        setBooleanField(term1471564, term1471564.getClass(), "nativeType", false);
        setBooleanField(term1471564, term1471564.getClass(), "visited", false);
        setField(term1471564, term1471564.getClass(), "docInfo", null);
        setBooleanField(term1471564, term1471564.getClass(), "unknown", false);
        setBooleanField(term1471564, term1471564.getClass(), "resolved", false);
        setField(term1471564, term1471564.getClass(), "resolveResult", null);
        setField(term1471564, term1471564.getClass(), "registry", null);
        setField(term1471560, term1471560.getClass(), "typeOfThis", term1471564);
        setField(term1471560, term1471560.getClass(), "source", null);
        setField(term1471560, term1471560.getClass(), "implementedInterfaces", null);
        setField(term1471560, term1471560.getClass(), "subTypes", null);
        setField(term1471560, term1471560.getClass(), "templateTypeName", null);
        setField(term1471560, term1471560.getClass(), "className", null);
        setField(term1471560, term1471560.getClass(), "properties", null);
        setField(term1471560, term1471560.getClass(), "implicitPrototype", null);
        setBooleanField(term1471560, term1471560.getClass(), "nativeType", false);
        setBooleanField(term1471560, term1471560.getClass(), "visited", false);
        setField(term1471560, term1471560.getClass(), "docInfo", null);
        setBooleanField(term1471560, term1471560.getClass(), "unknown", false);
        setBooleanField(term1471560, term1471560.getClass(), "resolved", false);
        setField(term1471560, term1471560.getClass(), "resolveResult", null);
        setField(term1471560, term1471560.getClass(), "registry", null);
        Class<? extends Object> term1472470 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1472469 = ((Class) term1472470).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1472469).setAccessible(true);
        Object enum2752 = ((Field) term1472469).get((Object) null);
        Class<? extends Object> term1472770 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1472769 = ((Class) term1472770).getDeclaredField((String) "INTERFACE");
        ((Field) term1472769).setAccessible(true);
        Object enum2753 = ((Field) term1472769).get((Object) null);
        term1471565 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1471569 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term1471573 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term1471565, term1471565.getClass(), "this$0", null);
        setField(term1471565, term1471565.getClass(), "call", null);
        setField(term1471565, term1471565.getClass(), "prototype", null);
        setField(term1471565, term1471565.getClass(), "kind", enum2752);
        setField(term1471569, term1471569.getClass(), "this$0", null);
        setField(term1471569, term1471569.getClass(), "call", null);
        setField(term1471569, term1471569.getClass(), "prototype", null);
        setField(term1471569, term1471569.getClass(), "kind", enum2753);
        setField(term1471573, term1471573.getClass(), "call", null);
        setField(term1471573, term1471573.getClass(), "prototype", null);
        setField(term1471573, term1471573.getClass(), "kind", enum2753);
        setField(term1471573, term1471573.getClass(), "typeOfThis", term1471569);
        setField(term1471573, term1471573.getClass(), "source", null);
        setField(term1471573, term1471573.getClass(), "implementedInterfaces", null);
        setField(term1471573, term1471573.getClass(), "subTypes", null);
        setField(term1471573, term1471573.getClass(), "templateTypeName", null);
        setField(term1471573, term1471573.getClass(), "className", null);
        setField(term1471573, term1471573.getClass(), "properties", null);
        setField(term1471573, term1471573.getClass(), "implicitPrototype", null);
        setBooleanField(term1471573, term1471573.getClass(), "nativeType", false);
        setBooleanField(term1471573, term1471573.getClass(), "visited", false);
        setField(term1471573, term1471573.getClass(), "docInfo", null);
        setBooleanField(term1471573, term1471573.getClass(), "unknown", false);
        setBooleanField(term1471573, term1471573.getClass(), "resolved", false);
        setField(term1471573, term1471573.getClass(), "resolveResult", null);
        setField(term1471573, term1471573.getClass(), "registry", null);
        setField(term1471569, term1471569.getClass(), "typeOfThis", term1471573);
        setField(term1471569, term1471569.getClass(), "source", null);
        setField(term1471569, term1471569.getClass(), "implementedInterfaces", null);
        setField(term1471569, term1471569.getClass(), "subTypes", null);
        setField(term1471569, term1471569.getClass(), "templateTypeName", null);
        setField(term1471569, term1471569.getClass(), "className", null);
        setField(term1471569, term1471569.getClass(), "properties", null);
        setField(term1471569, term1471569.getClass(), "implicitPrototype", null);
        setBooleanField(term1471569, term1471569.getClass(), "nativeType", false);
        setBooleanField(term1471569, term1471569.getClass(), "visited", false);
        setField(term1471569, term1471569.getClass(), "docInfo", null);
        setBooleanField(term1471569, term1471569.getClass(), "unknown", false);
        setBooleanField(term1471569, term1471569.getClass(), "resolved", false);
        setField(term1471569, term1471569.getClass(), "resolveResult", null);
        setField(term1471569, term1471569.getClass(), "registry", null);
        setField(term1471565, term1471565.getClass(), "typeOfThis", term1471569);
        setField(term1471565, term1471565.getClass(), "source", null);
        setField(term1471565, term1471565.getClass(), "implementedInterfaces", null);
        setField(term1471565, term1471565.getClass(), "subTypes", null);
        setField(term1471565, term1471565.getClass(), "templateTypeName", null);
        setField(term1471565, term1471565.getClass(), "className", null);
        setField(term1471565, term1471565.getClass(), "properties", null);
        setField(term1471565, term1471565.getClass(), "implicitPrototype", null);
        setBooleanField(term1471565, term1471565.getClass(), "nativeType", false);
        setBooleanField(term1471565, term1471565.getClass(), "visited", false);
        setField(term1471565, term1471565.getClass(), "docInfo", null);
        setBooleanField(term1471565, term1471565.getClass(), "unknown", false);
        setBooleanField(term1471565, term1471565.getClass(), "resolved", false);
        setField(term1471565, term1471565.getClass(), "resolveResult", null);
        setField(term1471565, term1471565.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1470488;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term1470814, args);
        assertTrue(recursiveEquals(term1470814, term1471560));
        assertTrue(recursiveEquals(term1470488, term1471565));
        assertTrue(recursiveEquals(retValue, false));
    }

};


