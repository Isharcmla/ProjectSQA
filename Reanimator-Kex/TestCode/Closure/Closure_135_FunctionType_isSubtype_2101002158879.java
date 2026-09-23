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

public class FunctionType_isSubtype_2101002158879 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term926833;
     Object term927089;
     Object term928561;
     Object term928565;

    public FunctionType_isSubtype_2101002158879() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term928572 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term928571 = ((Class) term928572).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term928571).setAccessible(true);
        Object enum1730 = ((Field) term928571).get((Object) null);
        term926833 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term926833, term926833.getClass(), "kind", enum1730);
        setField(term926833, term926833.getClass(), "typeOfThis", term926833);
        Class<? extends Object> term928872 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term928871 = ((Class) term928872).getDeclaredField((String) "INTERFACE");
        ((Field) term928871).setAccessible(true);
        Object enum1731 = ((Field) term928871).get((Object) null);
        Class<? extends Object> term929166 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term929165 = ((Class) term929166).getDeclaredField((String) "INTERFACE");
        ((Field) term929165).setAccessible(true);
        Object enum1732 = ((Field) term929165).get((Object) null);
        term927089 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term927567 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term927089, term927089.getClass(), "kind", enum1731);
        setField(term927567, term927567.getClass(), "kind", enum1732);
        setField(term927089, term927089.getClass(), "typeOfThis", term927567);
        Class<? extends Object> term929460 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term929459 = ((Class) term929460).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term929459).setAccessible(true);
        Object enum1733 = ((Field) term929459).get((Object) null);
        term928561 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term928561, term928561.getClass(), "this$0", null);
        setField(term928561, term928561.getClass(), "call", null);
        setField(term928561, term928561.getClass(), "prototype", null);
        setField(term928561, term928561.getClass(), "kind", enum1733);
        setField(term928561, term928561.getClass(), "typeOfThis", term928561);
        setField(term928561, term928561.getClass(), "source", null);
        setField(term928561, term928561.getClass(), "implementedInterfaces", null);
        setField(term928561, term928561.getClass(), "subTypes", null);
        setField(term928561, term928561.getClass(), "templateTypeName", null);
        setField(term928561, term928561.getClass(), "className", null);
        setField(term928561, term928561.getClass(), "properties", null);
        setField(term928561, term928561.getClass(), "implicitPrototype", null);
        setBooleanField(term928561, term928561.getClass(), "nativeType", false);
        setBooleanField(term928561, term928561.getClass(), "visited", false);
        setField(term928561, term928561.getClass(), "docInfo", null);
        setBooleanField(term928561, term928561.getClass(), "unknown", false);
        setBooleanField(term928561, term928561.getClass(), "resolved", false);
        setField(term928561, term928561.getClass(), "resolveResult", null);
        setField(term928561, term928561.getClass(), "registry", null);
        Class<? extends Object> term929760 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term929759 = ((Class) term929760).getDeclaredField((String) "INTERFACE");
        ((Field) term929759).setAccessible(true);
        Object enum1734 = ((Field) term929759).get((Object) null);
        term928565 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term928569 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term928565, term928565.getClass(), "this$0", null);
        setField(term928565, term928565.getClass(), "call", null);
        setField(term928565, term928565.getClass(), "prototype", null);
        setField(term928565, term928565.getClass(), "kind", enum1734);
        setField(term928569, term928569.getClass(), "this$0", null);
        setField(term928569, term928569.getClass(), "call", null);
        setField(term928569, term928569.getClass(), "prototype", null);
        setField(term928569, term928569.getClass(), "kind", enum1734);
        setField(term928569, term928569.getClass(), "typeOfThis", null);
        setField(term928569, term928569.getClass(), "source", null);
        setField(term928569, term928569.getClass(), "implementedInterfaces", null);
        setField(term928569, term928569.getClass(), "subTypes", null);
        setField(term928569, term928569.getClass(), "templateTypeName", null);
        setField(term928569, term928569.getClass(), "className", null);
        setField(term928569, term928569.getClass(), "properties", null);
        setField(term928569, term928569.getClass(), "implicitPrototype", null);
        setBooleanField(term928569, term928569.getClass(), "nativeType", false);
        setBooleanField(term928569, term928569.getClass(), "visited", false);
        setField(term928569, term928569.getClass(), "docInfo", null);
        setBooleanField(term928569, term928569.getClass(), "unknown", false);
        setBooleanField(term928569, term928569.getClass(), "resolved", false);
        setField(term928569, term928569.getClass(), "resolveResult", null);
        setField(term928569, term928569.getClass(), "registry", null);
        setField(term928565, term928565.getClass(), "typeOfThis", term928569);
        setField(term928565, term928565.getClass(), "source", null);
        setField(term928565, term928565.getClass(), "implementedInterfaces", null);
        setField(term928565, term928565.getClass(), "subTypes", null);
        setField(term928565, term928565.getClass(), "templateTypeName", null);
        setField(term928565, term928565.getClass(), "className", null);
        setField(term928565, term928565.getClass(), "properties", null);
        setField(term928565, term928565.getClass(), "implicitPrototype", null);
        setBooleanField(term928565, term928565.getClass(), "nativeType", false);
        setBooleanField(term928565, term928565.getClass(), "visited", false);
        setField(term928565, term928565.getClass(), "docInfo", null);
        setBooleanField(term928565, term928565.getClass(), "unknown", false);
        setBooleanField(term928565, term928565.getClass(), "resolved", false);
        setField(term928565, term928565.getClass(), "resolveResult", null);
        setField(term928565, term928565.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term927089;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term926833, args);
        assertTrue(recursiveEquals(term926833, term928561));
        assertTrue(recursiveEquals(term927089, term928565));
        assertTrue(recursiveEquals(retValue, true));
    }

};


