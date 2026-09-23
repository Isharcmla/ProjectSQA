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

public class FunctionType_isSubtype_2101002158907 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term976571;
     Object term977323;
     Object term978492;
     Object term978501;

    public FunctionType_isSubtype_2101002158907() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term978512 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term978511 = ((Class) term978512).getDeclaredField((String) "INTERFACE");
        ((Field) term978511).setAccessible(true);
        Object enum1823 = ((Field) term978511).get((Object) null);
        Class<? extends Object> term978806 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term978805 = ((Class) term978806).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term978805).setAccessible(true);
        Object enum1824 = ((Field) term978805).get((Object) null);
        term976571 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term977115 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term977215 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term976571, term976571.getClass(), "kind", enum1823);
        setField(term977115, term977115.getClass(), "kind", enum1824);
        setField(term977115, term977115.getClass(), "typeOfThis", term977215);
        setField(term976571, term976571.getClass(), "typeOfThis", term977115);
        term977323 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term977653 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term977751 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnknownType"));
        setField(term977323, term977323.getClass(), "kind", enum1823);
        setField(term977653, term977653.getClass(), "kind", enum1824);
        setField(term977653, term977653.getClass(), "typeOfThis", term977751);
        setField(term977323, term977323.getClass(), "typeOfThis", term977653);
        Class<? extends Object> term979106 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term979105 = ((Class) term979106).getDeclaredField((String) "INTERFACE");
        ((Field) term979105).setAccessible(true);
        Object enum1825 = ((Field) term979105).get((Object) null);
        Class<? extends Object> term979400 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term979399 = ((Class) term979400).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term979399).setAccessible(true);
        Object enum1826 = ((Field) term979399).get((Object) null);
        term978492 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term978496 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term978500 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term978492, term978492.getClass(), "this$0", null);
        setField(term978492, term978492.getClass(), "call", null);
        setField(term978492, term978492.getClass(), "prototype", null);
        setField(term978492, term978492.getClass(), "kind", enum1825);
        setField(term978496, term978496.getClass(), "call", null);
        setField(term978496, term978496.getClass(), "prototype", null);
        setField(term978496, term978496.getClass(), "kind", enum1826);
        setField(term978500, term978500.getClass(), "call", null);
        setField(term978500, term978500.getClass(), "prototype", null);
        setField(term978500, term978500.getClass(), "kind", null);
        setField(term978500, term978500.getClass(), "typeOfThis", null);
        setField(term978500, term978500.getClass(), "source", null);
        setField(term978500, term978500.getClass(), "implementedInterfaces", null);
        setField(term978500, term978500.getClass(), "subTypes", null);
        setField(term978500, term978500.getClass(), "templateTypeName", null);
        setField(term978500, term978500.getClass(), "className", null);
        setField(term978500, term978500.getClass(), "properties", null);
        setField(term978500, term978500.getClass(), "implicitPrototype", null);
        setBooleanField(term978500, term978500.getClass(), "nativeType", false);
        setBooleanField(term978500, term978500.getClass(), "visited", false);
        setField(term978500, term978500.getClass(), "docInfo", null);
        setBooleanField(term978500, term978500.getClass(), "unknown", false);
        setBooleanField(term978500, term978500.getClass(), "resolved", false);
        setField(term978500, term978500.getClass(), "resolveResult", null);
        setField(term978500, term978500.getClass(), "registry", null);
        setField(term978496, term978496.getClass(), "typeOfThis", term978500);
        setField(term978496, term978496.getClass(), "source", null);
        setField(term978496, term978496.getClass(), "implementedInterfaces", null);
        setField(term978496, term978496.getClass(), "subTypes", null);
        setField(term978496, term978496.getClass(), "templateTypeName", null);
        setField(term978496, term978496.getClass(), "className", null);
        setField(term978496, term978496.getClass(), "properties", null);
        setField(term978496, term978496.getClass(), "implicitPrototype", null);
        setBooleanField(term978496, term978496.getClass(), "nativeType", false);
        setBooleanField(term978496, term978496.getClass(), "visited", false);
        setField(term978496, term978496.getClass(), "docInfo", null);
        setBooleanField(term978496, term978496.getClass(), "unknown", false);
        setBooleanField(term978496, term978496.getClass(), "resolved", false);
        setField(term978496, term978496.getClass(), "resolveResult", null);
        setField(term978496, term978496.getClass(), "registry", null);
        setField(term978492, term978492.getClass(), "typeOfThis", term978496);
        setField(term978492, term978492.getClass(), "source", null);
        setField(term978492, term978492.getClass(), "implementedInterfaces", null);
        setField(term978492, term978492.getClass(), "subTypes", null);
        setField(term978492, term978492.getClass(), "templateTypeName", null);
        setField(term978492, term978492.getClass(), "className", null);
        setField(term978492, term978492.getClass(), "properties", null);
        setField(term978492, term978492.getClass(), "implicitPrototype", null);
        setBooleanField(term978492, term978492.getClass(), "nativeType", false);
        setBooleanField(term978492, term978492.getClass(), "visited", false);
        setField(term978492, term978492.getClass(), "docInfo", null);
        setBooleanField(term978492, term978492.getClass(), "unknown", false);
        setBooleanField(term978492, term978492.getClass(), "resolved", false);
        setField(term978492, term978492.getClass(), "resolveResult", null);
        setField(term978492, term978492.getClass(), "registry", null);
        Class<? extends Object> term979700 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term979699 = ((Class) term979700).getDeclaredField((String) "INTERFACE");
        ((Field) term979699).setAccessible(true);
        Object enum1827 = ((Field) term979699).get((Object) null);
        Class<? extends Object> term979994 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term979993 = ((Class) term979994).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term979993).setAccessible(true);
        Object enum1828 = ((Field) term979993).get((Object) null);
        term978501 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term978505 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term978509 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnknownType"));
        setField(term978501, term978501.getClass(), "this$0", null);
        setField(term978501, term978501.getClass(), "call", null);
        setField(term978501, term978501.getClass(), "prototype", null);
        setField(term978501, term978501.getClass(), "kind", enum1827);
        setField(term978505, term978505.getClass(), "this$0", null);
        setField(term978505, term978505.getClass(), "call", null);
        setField(term978505, term978505.getClass(), "prototype", null);
        setField(term978505, term978505.getClass(), "kind", enum1828);
        setBooleanField(term978509, term978509.getClass(), "isChecked", false);
        setBooleanField(term978509, term978509.getClass(), "visited", false);
        setField(term978509, term978509.getClass(), "docInfo", null);
        setBooleanField(term978509, term978509.getClass(), "unknown", false);
        setBooleanField(term978509, term978509.getClass(), "resolved", false);
        setField(term978509, term978509.getClass(), "resolveResult", null);
        setField(term978509, term978509.getClass(), "registry", null);
        setField(term978505, term978505.getClass(), "typeOfThis", term978509);
        setField(term978505, term978505.getClass(), "source", null);
        setField(term978505, term978505.getClass(), "implementedInterfaces", null);
        setField(term978505, term978505.getClass(), "subTypes", null);
        setField(term978505, term978505.getClass(), "templateTypeName", null);
        setField(term978505, term978505.getClass(), "className", null);
        setField(term978505, term978505.getClass(), "properties", null);
        setField(term978505, term978505.getClass(), "implicitPrototype", null);
        setBooleanField(term978505, term978505.getClass(), "nativeType", false);
        setBooleanField(term978505, term978505.getClass(), "visited", false);
        setField(term978505, term978505.getClass(), "docInfo", null);
        setBooleanField(term978505, term978505.getClass(), "unknown", false);
        setBooleanField(term978505, term978505.getClass(), "resolved", false);
        setField(term978505, term978505.getClass(), "resolveResult", null);
        setField(term978505, term978505.getClass(), "registry", null);
        setField(term978501, term978501.getClass(), "typeOfThis", term978505);
        setField(term978501, term978501.getClass(), "source", null);
        setField(term978501, term978501.getClass(), "implementedInterfaces", null);
        setField(term978501, term978501.getClass(), "subTypes", null);
        setField(term978501, term978501.getClass(), "templateTypeName", null);
        setField(term978501, term978501.getClass(), "className", null);
        setField(term978501, term978501.getClass(), "properties", null);
        setField(term978501, term978501.getClass(), "implicitPrototype", null);
        setBooleanField(term978501, term978501.getClass(), "nativeType", false);
        setBooleanField(term978501, term978501.getClass(), "visited", false);
        setField(term978501, term978501.getClass(), "docInfo", null);
        setBooleanField(term978501, term978501.getClass(), "unknown", false);
        setBooleanField(term978501, term978501.getClass(), "resolved", false);
        setField(term978501, term978501.getClass(), "resolveResult", null);
        setField(term978501, term978501.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term977323;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term976571, args);
        assertTrue(recursiveEquals(term976571, term978492));
        assertTrue(recursiveEquals(term977323, term978501));
        assertTrue(recursiveEquals(retValue, true));
    }

};


