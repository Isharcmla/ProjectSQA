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

public class FunctionType_isSubtype_21010021581217 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1653146;
     Object term1653806;
     Object term1654885;
     Object term1654890;

    public FunctionType_isSubtype_21010021581217() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1654900 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1654899 = ((Class) term1654900).getDeclaredField((String) "INTERFACE");
        ((Field) term1654899).setAccessible(true);
        Object enum2956 = ((Field) term1654899).get((Object) null);
        term1653146 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1653698 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term1653146, term1653146.getClass(), "kind", enum2956);
        setField(term1653146, term1653146.getClass(), "typeOfThis", term1653698);
        Class<? extends Object> term1655194 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1655193 = ((Class) term1655194).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1655193).setAccessible(true);
        Object enum2957 = ((Field) term1655193).get((Object) null);
        term1653806 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1653988 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term1653806, term1653806.getClass(), "kind", enum2957);
        setField(term1653988, term1653988.getClass(), "kind", enum2956);
        setField(term1653988, term1653988.getClass(), "typeOfThis", null);
        setField(term1653806, term1653806.getClass(), "typeOfThis", term1653988);
        Class<? extends Object> term1655494 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1655493 = ((Class) term1655494).getDeclaredField((String) "INTERFACE");
        ((Field) term1655493).setAccessible(true);
        Object enum2958 = ((Field) term1655493).get((Object) null);
        term1654885 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1654889 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term1654885, term1654885.getClass(), "this$0", null);
        setField(term1654885, term1654885.getClass(), "call", null);
        setField(term1654885, term1654885.getClass(), "prototype", null);
        setField(term1654885, term1654885.getClass(), "kind", enum2958);
        setField(term1654889, term1654889.getClass(), "this$0", null);
        setField(term1654889, term1654889.getClass(), "call", null);
        setField(term1654889, term1654889.getClass(), "prototype", null);
        setField(term1654889, term1654889.getClass(), "kind", null);
        setField(term1654889, term1654889.getClass(), "typeOfThis", null);
        setField(term1654889, term1654889.getClass(), "source", null);
        setField(term1654889, term1654889.getClass(), "implementedInterfaces", null);
        setField(term1654889, term1654889.getClass(), "subTypes", null);
        setField(term1654889, term1654889.getClass(), "templateTypeName", null);
        setField(term1654889, term1654889.getClass(), "className", null);
        setField(term1654889, term1654889.getClass(), "properties", null);
        setField(term1654889, term1654889.getClass(), "implicitPrototype", null);
        setBooleanField(term1654889, term1654889.getClass(), "nativeType", false);
        setBooleanField(term1654889, term1654889.getClass(), "prettyPrint", false);
        setBooleanField(term1654889, term1654889.getClass(), "visited", false);
        setField(term1654889, term1654889.getClass(), "docInfo", null);
        setBooleanField(term1654889, term1654889.getClass(), "unknown", false);
        setBooleanField(term1654889, term1654889.getClass(), "resolved", false);
        setField(term1654889, term1654889.getClass(), "resolveResult", null);
        setField(term1654889, term1654889.getClass(), "registry", null);
        setField(term1654885, term1654885.getClass(), "typeOfThis", term1654889);
        setField(term1654885, term1654885.getClass(), "source", null);
        setField(term1654885, term1654885.getClass(), "implementedInterfaces", null);
        setField(term1654885, term1654885.getClass(), "subTypes", null);
        setField(term1654885, term1654885.getClass(), "templateTypeName", null);
        setField(term1654885, term1654885.getClass(), "className", null);
        setField(term1654885, term1654885.getClass(), "properties", null);
        setField(term1654885, term1654885.getClass(), "implicitPrototype", null);
        setBooleanField(term1654885, term1654885.getClass(), "nativeType", false);
        setBooleanField(term1654885, term1654885.getClass(), "prettyPrint", false);
        setBooleanField(term1654885, term1654885.getClass(), "visited", false);
        setField(term1654885, term1654885.getClass(), "docInfo", null);
        setBooleanField(term1654885, term1654885.getClass(), "unknown", false);
        setBooleanField(term1654885, term1654885.getClass(), "resolved", false);
        setField(term1654885, term1654885.getClass(), "resolveResult", null);
        setField(term1654885, term1654885.getClass(), "registry", null);
        Class<? extends Object> term1655788 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1655787 = ((Class) term1655788).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1655787).setAccessible(true);
        Object enum2959 = ((Field) term1655787).get((Object) null);
        Class<? extends Object> term1656088 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1656087 = ((Class) term1656088).getDeclaredField((String) "INTERFACE");
        ((Field) term1656087).setAccessible(true);
        Object enum2960 = ((Field) term1656087).get((Object) null);
        term1654890 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1654894 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term1654890, term1654890.getClass(), "this$0", null);
        setField(term1654890, term1654890.getClass(), "call", null);
        setField(term1654890, term1654890.getClass(), "prototype", null);
        setField(term1654890, term1654890.getClass(), "kind", enum2959);
        setField(term1654894, term1654894.getClass(), "this$0", null);
        setField(term1654894, term1654894.getClass(), "call", null);
        setField(term1654894, term1654894.getClass(), "prototype", null);
        setField(term1654894, term1654894.getClass(), "kind", enum2960);
        setField(term1654894, term1654894.getClass(), "typeOfThis", null);
        setField(term1654894, term1654894.getClass(), "source", null);
        setField(term1654894, term1654894.getClass(), "implementedInterfaces", null);
        setField(term1654894, term1654894.getClass(), "subTypes", null);
        setField(term1654894, term1654894.getClass(), "templateTypeName", null);
        setField(term1654894, term1654894.getClass(), "className", null);
        setField(term1654894, term1654894.getClass(), "properties", null);
        setField(term1654894, term1654894.getClass(), "implicitPrototype", null);
        setBooleanField(term1654894, term1654894.getClass(), "nativeType", false);
        setBooleanField(term1654894, term1654894.getClass(), "prettyPrint", false);
        setBooleanField(term1654894, term1654894.getClass(), "visited", false);
        setField(term1654894, term1654894.getClass(), "docInfo", null);
        setBooleanField(term1654894, term1654894.getClass(), "unknown", false);
        setBooleanField(term1654894, term1654894.getClass(), "resolved", false);
        setField(term1654894, term1654894.getClass(), "resolveResult", null);
        setField(term1654894, term1654894.getClass(), "registry", null);
        setField(term1654890, term1654890.getClass(), "typeOfThis", term1654894);
        setField(term1654890, term1654890.getClass(), "source", null);
        setField(term1654890, term1654890.getClass(), "implementedInterfaces", null);
        setField(term1654890, term1654890.getClass(), "subTypes", null);
        setField(term1654890, term1654890.getClass(), "templateTypeName", null);
        setField(term1654890, term1654890.getClass(), "className", null);
        setField(term1654890, term1654890.getClass(), "properties", null);
        setField(term1654890, term1654890.getClass(), "implicitPrototype", null);
        setBooleanField(term1654890, term1654890.getClass(), "nativeType", false);
        setBooleanField(term1654890, term1654890.getClass(), "prettyPrint", false);
        setBooleanField(term1654890, term1654890.getClass(), "visited", false);
        setField(term1654890, term1654890.getClass(), "docInfo", null);
        setBooleanField(term1654890, term1654890.getClass(), "unknown", false);
        setBooleanField(term1654890, term1654890.getClass(), "resolved", false);
        setField(term1654890, term1654890.getClass(), "resolveResult", null);
        setField(term1654890, term1654890.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1653806;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term1653146, args);
        assertTrue(recursiveEquals(term1653146, term1654885));
        assertTrue(recursiveEquals(term1653806, term1654890));
        assertTrue(recursiveEquals(retValue, false));
    }

};


