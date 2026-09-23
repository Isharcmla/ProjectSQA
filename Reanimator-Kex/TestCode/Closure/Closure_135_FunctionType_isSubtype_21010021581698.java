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

public class FunctionType_isSubtype_21010021581698 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2307002;
     Object term2307662;
     Object term2308842;
     Object term2308847;

    public FunctionType_isSubtype_21010021581698() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2308854 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2308853 = ((Class) term2308854).getDeclaredField((String) "INTERFACE");
        ((Field) term2308853).setAccessible(true);
        Object enum4309 = ((Field) term2308853).get((Object) null);
        term2307002 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term2307554 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term2307002, term2307002.getClass(), "kind", enum4309);
        setField(term2307002, term2307002.getClass(), "typeOfThis", term2307554);
        Class<? extends Object> term2309148 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2309147 = ((Class) term2309148).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term2309147).setAccessible(true);
        Object enum4310 = ((Field) term2309147).get((Object) null);
        term2307662 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term2307844 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term2307662, term2307662.getClass(), "kind", enum4310);
        setField(term2307662, term2307662.getClass(), "typeOfThis", term2307844);
        Class<? extends Object> term2309448 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2309447 = ((Class) term2309448).getDeclaredField((String) "INTERFACE");
        ((Field) term2309447).setAccessible(true);
        Object enum4311 = ((Field) term2309447).get((Object) null);
        term2308842 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term2308846 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term2308842, term2308842.getClass(), "this$0", null);
        setField(term2308842, term2308842.getClass(), "call", null);
        setField(term2308842, term2308842.getClass(), "prototype", null);
        setField(term2308842, term2308842.getClass(), "kind", enum4311);
        setField(term2308846, term2308846.getClass(), "this$0", null);
        setField(term2308846, term2308846.getClass(), "call", null);
        setField(term2308846, term2308846.getClass(), "prototype", null);
        setField(term2308846, term2308846.getClass(), "kind", null);
        setField(term2308846, term2308846.getClass(), "typeOfThis", null);
        setField(term2308846, term2308846.getClass(), "source", null);
        setField(term2308846, term2308846.getClass(), "implementedInterfaces", null);
        setField(term2308846, term2308846.getClass(), "subTypes", null);
        setField(term2308846, term2308846.getClass(), "templateTypeName", null);
        setField(term2308846, term2308846.getClass(), "className", null);
        setField(term2308846, term2308846.getClass(), "properties", null);
        setField(term2308846, term2308846.getClass(), "implicitPrototype", null);
        setBooleanField(term2308846, term2308846.getClass(), "nativeType", false);
        setBooleanField(term2308846, term2308846.getClass(), "visited", false);
        setField(term2308846, term2308846.getClass(), "docInfo", null);
        setBooleanField(term2308846, term2308846.getClass(), "unknown", false);
        setBooleanField(term2308846, term2308846.getClass(), "resolved", false);
        setField(term2308846, term2308846.getClass(), "resolveResult", null);
        setField(term2308846, term2308846.getClass(), "registry", null);
        setField(term2308842, term2308842.getClass(), "typeOfThis", term2308846);
        setField(term2308842, term2308842.getClass(), "source", null);
        setField(term2308842, term2308842.getClass(), "implementedInterfaces", null);
        setField(term2308842, term2308842.getClass(), "subTypes", null);
        setField(term2308842, term2308842.getClass(), "templateTypeName", null);
        setField(term2308842, term2308842.getClass(), "className", null);
        setField(term2308842, term2308842.getClass(), "properties", null);
        setField(term2308842, term2308842.getClass(), "implicitPrototype", null);
        setBooleanField(term2308842, term2308842.getClass(), "nativeType", false);
        setBooleanField(term2308842, term2308842.getClass(), "visited", false);
        setField(term2308842, term2308842.getClass(), "docInfo", null);
        setBooleanField(term2308842, term2308842.getClass(), "unknown", false);
        setBooleanField(term2308842, term2308842.getClass(), "resolved", false);
        setField(term2308842, term2308842.getClass(), "resolveResult", null);
        setField(term2308842, term2308842.getClass(), "registry", null);
        Class<? extends Object> term2309742 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2309741 = ((Class) term2309742).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term2309741).setAccessible(true);
        Object enum4312 = ((Field) term2309741).get((Object) null);
        term2308847 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term2308851 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term2308847, term2308847.getClass(), "this$0", null);
        setField(term2308847, term2308847.getClass(), "call", null);
        setField(term2308847, term2308847.getClass(), "prototype", null);
        setField(term2308847, term2308847.getClass(), "kind", enum4312);
        setField(term2308851, term2308851.getClass(), "this$0", null);
        setField(term2308851, term2308851.getClass(), "call", null);
        setField(term2308851, term2308851.getClass(), "prototype", null);
        setField(term2308851, term2308851.getClass(), "kind", null);
        setField(term2308851, term2308851.getClass(), "typeOfThis", null);
        setField(term2308851, term2308851.getClass(), "source", null);
        setField(term2308851, term2308851.getClass(), "implementedInterfaces", null);
        setField(term2308851, term2308851.getClass(), "subTypes", null);
        setField(term2308851, term2308851.getClass(), "templateTypeName", null);
        setField(term2308851, term2308851.getClass(), "className", null);
        setField(term2308851, term2308851.getClass(), "properties", null);
        setField(term2308851, term2308851.getClass(), "implicitPrototype", null);
        setBooleanField(term2308851, term2308851.getClass(), "nativeType", false);
        setBooleanField(term2308851, term2308851.getClass(), "visited", false);
        setField(term2308851, term2308851.getClass(), "docInfo", null);
        setBooleanField(term2308851, term2308851.getClass(), "unknown", false);
        setBooleanField(term2308851, term2308851.getClass(), "resolved", false);
        setField(term2308851, term2308851.getClass(), "resolveResult", null);
        setField(term2308851, term2308851.getClass(), "registry", null);
        setField(term2308847, term2308847.getClass(), "typeOfThis", term2308851);
        setField(term2308847, term2308847.getClass(), "source", null);
        setField(term2308847, term2308847.getClass(), "implementedInterfaces", null);
        setField(term2308847, term2308847.getClass(), "subTypes", null);
        setField(term2308847, term2308847.getClass(), "templateTypeName", null);
        setField(term2308847, term2308847.getClass(), "className", null);
        setField(term2308847, term2308847.getClass(), "properties", null);
        setField(term2308847, term2308847.getClass(), "implicitPrototype", null);
        setBooleanField(term2308847, term2308847.getClass(), "nativeType", false);
        setBooleanField(term2308847, term2308847.getClass(), "visited", false);
        setField(term2308847, term2308847.getClass(), "docInfo", null);
        setBooleanField(term2308847, term2308847.getClass(), "unknown", false);
        setBooleanField(term2308847, term2308847.getClass(), "resolved", false);
        setField(term2308847, term2308847.getClass(), "resolveResult", null);
        setField(term2308847, term2308847.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term2307662;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term2307002, args);
        assertTrue(recursiveEquals(term2307002, term2308842));
        assertTrue(recursiveEquals(term2307662, term2308847));
        assertTrue(recursiveEquals(retValue, false));
    }

};


