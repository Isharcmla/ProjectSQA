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

public class FunctionType_isSubtype_21010021581675 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2265893;
     Object term2266651;
     Object term2269535;
     Object term2269541;

    public FunctionType_isSubtype_21010021581675() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2269551 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2269550 = ((Class) term2269551).getDeclaredField((String) "ORDINARY");
        ((Field) term2269550).setAccessible(true);
        Object enum4232 = ((Field) term2269550).get((Object) null);
        term2265893 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term2266437 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term2266543 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumElementType"));
        setField(term2265893, term2265893.getClass(), "kind", enum4232);
        setField(term2266437, term2266437.getClass(), "kind", enum4232);
        setField(term2266437, term2266437.getClass(), "typeOfThis", term2266543);
        setField(term2265893, term2265893.getClass(), "typeOfThis", term2266437);
        Class<? extends Object> term2269842 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2269841 = ((Class) term2269842).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term2269841).setAccessible(true);
        Object enum4233 = ((Field) term2269841).get((Object) null);
        term2266651 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term2266981 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term2266651, term2266651.getClass(), "kind", enum4232);
        setField(term2266981, term2266981.getClass(), "kind", enum4233);
        setField(term2266981, term2266981.getClass(), "typeOfThis", null);
        setField(term2266651, term2266651.getClass(), "typeOfThis", term2266981);
        Class<? extends Object> term2270142 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2270141 = ((Class) term2270142).getDeclaredField((String) "INTERFACE");
        ((Field) term2270141).setAccessible(true);
        Object enum4234 = ((Field) term2270141).get((Object) null);
        term2269535 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term2269539 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term2269540 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumElementType"));
        setField(term2269535, term2269535.getClass(), "this$0", null);
        setField(term2269535, term2269535.getClass(), "call", null);
        setField(term2269535, term2269535.getClass(), "prototype", null);
        setField(term2269535, term2269535.getClass(), "kind", enum4234);
        setField(term2269539, term2269539.getClass(), "call", null);
        setField(term2269539, term2269539.getClass(), "prototype", null);
        setField(term2269539, term2269539.getClass(), "kind", enum4234);
        setField(term2269540, term2269540.getClass(), "primitiveType", null);
        setField(term2269540, term2269540.getClass(), "primitiveObjectType", null);
        setField(term2269540, term2269540.getClass(), "name", null);
        setBooleanField(term2269540, term2269540.getClass(), "visited", false);
        setField(term2269540, term2269540.getClass(), "docInfo", null);
        setBooleanField(term2269540, term2269540.getClass(), "unknown", false);
        setBooleanField(term2269540, term2269540.getClass(), "resolved", false);
        setField(term2269540, term2269540.getClass(), "resolveResult", null);
        setField(term2269540, term2269540.getClass(), "registry", null);
        setField(term2269539, term2269539.getClass(), "typeOfThis", term2269540);
        setField(term2269539, term2269539.getClass(), "source", null);
        setField(term2269539, term2269539.getClass(), "implementedInterfaces", null);
        setField(term2269539, term2269539.getClass(), "subTypes", null);
        setField(term2269539, term2269539.getClass(), "templateTypeName", null);
        setField(term2269539, term2269539.getClass(), "className", null);
        setField(term2269539, term2269539.getClass(), "properties", null);
        setField(term2269539, term2269539.getClass(), "implicitPrototype", null);
        setBooleanField(term2269539, term2269539.getClass(), "nativeType", false);
        setBooleanField(term2269539, term2269539.getClass(), "visited", false);
        setField(term2269539, term2269539.getClass(), "docInfo", null);
        setBooleanField(term2269539, term2269539.getClass(), "unknown", false);
        setBooleanField(term2269539, term2269539.getClass(), "resolved", false);
        setField(term2269539, term2269539.getClass(), "resolveResult", null);
        setField(term2269539, term2269539.getClass(), "registry", null);
        setField(term2269535, term2269535.getClass(), "typeOfThis", term2269539);
        setField(term2269535, term2269535.getClass(), "source", null);
        setField(term2269535, term2269535.getClass(), "implementedInterfaces", null);
        setField(term2269535, term2269535.getClass(), "subTypes", null);
        setField(term2269535, term2269535.getClass(), "templateTypeName", null);
        setField(term2269535, term2269535.getClass(), "className", null);
        setField(term2269535, term2269535.getClass(), "properties", null);
        setField(term2269535, term2269535.getClass(), "implicitPrototype", null);
        setBooleanField(term2269535, term2269535.getClass(), "nativeType", false);
        setBooleanField(term2269535, term2269535.getClass(), "visited", false);
        setField(term2269535, term2269535.getClass(), "docInfo", null);
        setBooleanField(term2269535, term2269535.getClass(), "unknown", false);
        setBooleanField(term2269535, term2269535.getClass(), "resolved", false);
        setField(term2269535, term2269535.getClass(), "resolveResult", null);
        setField(term2269535, term2269535.getClass(), "registry", null);
        Class<? extends Object> term2270436 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2270435 = ((Class) term2270436).getDeclaredField((String) "INTERFACE");
        ((Field) term2270435).setAccessible(true);
        Object enum4235 = ((Field) term2270435).get((Object) null);
        Class<? extends Object> term2270730 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2270729 = ((Class) term2270730).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term2270729).setAccessible(true);
        Object enum4236 = ((Field) term2270729).get((Object) null);
        term2269541 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term2269545 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term2269541, term2269541.getClass(), "this$0", null);
        setField(term2269541, term2269541.getClass(), "call", null);
        setField(term2269541, term2269541.getClass(), "prototype", null);
        setField(term2269541, term2269541.getClass(), "kind", enum4235);
        setField(term2269545, term2269545.getClass(), "this$0", null);
        setField(term2269545, term2269545.getClass(), "call", null);
        setField(term2269545, term2269545.getClass(), "prototype", null);
        setField(term2269545, term2269545.getClass(), "kind", enum4236);
        setField(term2269545, term2269545.getClass(), "typeOfThis", null);
        setField(term2269545, term2269545.getClass(), "source", null);
        setField(term2269545, term2269545.getClass(), "implementedInterfaces", null);
        setField(term2269545, term2269545.getClass(), "subTypes", null);
        setField(term2269545, term2269545.getClass(), "templateTypeName", null);
        setField(term2269545, term2269545.getClass(), "className", null);
        setField(term2269545, term2269545.getClass(), "properties", null);
        setField(term2269545, term2269545.getClass(), "implicitPrototype", null);
        setBooleanField(term2269545, term2269545.getClass(), "nativeType", false);
        setBooleanField(term2269545, term2269545.getClass(), "visited", false);
        setField(term2269545, term2269545.getClass(), "docInfo", null);
        setBooleanField(term2269545, term2269545.getClass(), "unknown", false);
        setBooleanField(term2269545, term2269545.getClass(), "resolved", false);
        setField(term2269545, term2269545.getClass(), "resolveResult", null);
        setField(term2269545, term2269545.getClass(), "registry", null);
        setField(term2269541, term2269541.getClass(), "typeOfThis", term2269545);
        setField(term2269541, term2269541.getClass(), "source", null);
        setField(term2269541, term2269541.getClass(), "implementedInterfaces", null);
        setField(term2269541, term2269541.getClass(), "subTypes", null);
        setField(term2269541, term2269541.getClass(), "templateTypeName", null);
        setField(term2269541, term2269541.getClass(), "className", null);
        setField(term2269541, term2269541.getClass(), "properties", null);
        setField(term2269541, term2269541.getClass(), "implicitPrototype", null);
        setBooleanField(term2269541, term2269541.getClass(), "nativeType", false);
        setBooleanField(term2269541, term2269541.getClass(), "visited", false);
        setField(term2269541, term2269541.getClass(), "docInfo", null);
        setBooleanField(term2269541, term2269541.getClass(), "unknown", false);
        setBooleanField(term2269541, term2269541.getClass(), "resolved", false);
        setField(term2269541, term2269541.getClass(), "resolveResult", null);
        setField(term2269541, term2269541.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term2266651;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term2265893, args);
        assertTrue(recursiveEquals(term2265893, term2269535));
        assertTrue(recursiveEquals(term2266651, term2269541));
        assertTrue(recursiveEquals(retValue, true));
    }

};


