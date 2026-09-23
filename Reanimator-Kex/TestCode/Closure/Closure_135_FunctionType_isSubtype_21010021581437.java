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

public class FunctionType_isSubtype_21010021581437 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1864187;
     Object term1864849;
     Object term1865746;
     Object term1865751;

    public FunctionType_isSubtype_21010021581437() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1865758 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1865757 = ((Class) term1865758).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1865757).setAccessible(true);
        Object enum3474 = ((Field) term1865757).get((Object) null);
        term1864187 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term1864739 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term1864187, term1864187.getClass(), "kind", enum3474);
        setField(term1864187, term1864187.getClass(), "typeOfThis", term1864739);
        Class<? extends Object> term1866058 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1866057 = ((Class) term1866058).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1866057).setAccessible(true);
        Object enum3475 = ((Field) term1866057).get((Object) null);
        term1864849 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1865031 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term1864849, term1864849.getClass(), "kind", enum3475);
        setField(term1864849, term1864849.getClass(), "typeOfThis", term1865031);
        Class<? extends Object> term1866358 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1866357 = ((Class) term1866358).getDeclaredField((String) "INTERFACE");
        ((Field) term1866357).setAccessible(true);
        Object enum3476 = ((Field) term1866357).get((Object) null);
        term1865746 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term1865750 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term1865746, term1865746.getClass(), "this$0", null);
        setField(term1865746, term1865746.getClass(), "call", null);
        setField(term1865746, term1865746.getClass(), "prototype", null);
        setField(term1865746, term1865746.getClass(), "kind", enum3476);
        setField(term1865750, term1865750.getClass(), "this$0", null);
        setField(term1865750, term1865750.getClass(), "call", null);
        setField(term1865750, term1865750.getClass(), "prototype", null);
        setField(term1865750, term1865750.getClass(), "kind", null);
        setField(term1865750, term1865750.getClass(), "typeOfThis", null);
        setField(term1865750, term1865750.getClass(), "source", null);
        setField(term1865750, term1865750.getClass(), "implementedInterfaces", null);
        setField(term1865750, term1865750.getClass(), "subTypes", null);
        setField(term1865750, term1865750.getClass(), "templateTypeName", null);
        setField(term1865750, term1865750.getClass(), "className", null);
        setField(term1865750, term1865750.getClass(), "properties", null);
        setField(term1865750, term1865750.getClass(), "implicitPrototype", null);
        setBooleanField(term1865750, term1865750.getClass(), "nativeType", false);
        setBooleanField(term1865750, term1865750.getClass(), "visited", false);
        setField(term1865750, term1865750.getClass(), "docInfo", null);
        setBooleanField(term1865750, term1865750.getClass(), "unknown", false);
        setBooleanField(term1865750, term1865750.getClass(), "resolved", false);
        setField(term1865750, term1865750.getClass(), "resolveResult", null);
        setField(term1865750, term1865750.getClass(), "registry", null);
        setField(term1865746, term1865746.getClass(), "typeOfThis", term1865750);
        setField(term1865746, term1865746.getClass(), "source", null);
        setField(term1865746, term1865746.getClass(), "implementedInterfaces", null);
        setField(term1865746, term1865746.getClass(), "subTypes", null);
        setField(term1865746, term1865746.getClass(), "templateTypeName", null);
        setField(term1865746, term1865746.getClass(), "className", null);
        setField(term1865746, term1865746.getClass(), "properties", null);
        setField(term1865746, term1865746.getClass(), "implicitPrototype", null);
        setBooleanField(term1865746, term1865746.getClass(), "nativeType", false);
        setBooleanField(term1865746, term1865746.getClass(), "visited", false);
        setField(term1865746, term1865746.getClass(), "docInfo", null);
        setBooleanField(term1865746, term1865746.getClass(), "unknown", false);
        setBooleanField(term1865746, term1865746.getClass(), "resolved", false);
        setField(term1865746, term1865746.getClass(), "resolveResult", null);
        setField(term1865746, term1865746.getClass(), "registry", null);
        Class<? extends Object> term1866652 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1866651 = ((Class) term1866652).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1866651).setAccessible(true);
        Object enum3477 = ((Field) term1866651).get((Object) null);
        term1865751 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1865755 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term1865751, term1865751.getClass(), "call", null);
        setField(term1865751, term1865751.getClass(), "prototype", null);
        setField(term1865751, term1865751.getClass(), "kind", enum3477);
        setField(term1865755, term1865755.getClass(), "this$0", null);
        setField(term1865755, term1865755.getClass(), "call", null);
        setField(term1865755, term1865755.getClass(), "prototype", null);
        setField(term1865755, term1865755.getClass(), "kind", null);
        setField(term1865755, term1865755.getClass(), "typeOfThis", null);
        setField(term1865755, term1865755.getClass(), "source", null);
        setField(term1865755, term1865755.getClass(), "implementedInterfaces", null);
        setField(term1865755, term1865755.getClass(), "subTypes", null);
        setField(term1865755, term1865755.getClass(), "templateTypeName", null);
        setField(term1865755, term1865755.getClass(), "className", null);
        setField(term1865755, term1865755.getClass(), "properties", null);
        setField(term1865755, term1865755.getClass(), "implicitPrototype", null);
        setBooleanField(term1865755, term1865755.getClass(), "nativeType", false);
        setBooleanField(term1865755, term1865755.getClass(), "visited", false);
        setField(term1865755, term1865755.getClass(), "docInfo", null);
        setBooleanField(term1865755, term1865755.getClass(), "unknown", false);
        setBooleanField(term1865755, term1865755.getClass(), "resolved", false);
        setField(term1865755, term1865755.getClass(), "resolveResult", null);
        setField(term1865755, term1865755.getClass(), "registry", null);
        setField(term1865751, term1865751.getClass(), "typeOfThis", term1865755);
        setField(term1865751, term1865751.getClass(), "source", null);
        setField(term1865751, term1865751.getClass(), "implementedInterfaces", null);
        setField(term1865751, term1865751.getClass(), "subTypes", null);
        setField(term1865751, term1865751.getClass(), "templateTypeName", null);
        setField(term1865751, term1865751.getClass(), "className", null);
        setField(term1865751, term1865751.getClass(), "properties", null);
        setField(term1865751, term1865751.getClass(), "implicitPrototype", null);
        setBooleanField(term1865751, term1865751.getClass(), "nativeType", false);
        setBooleanField(term1865751, term1865751.getClass(), "visited", false);
        setField(term1865751, term1865751.getClass(), "docInfo", null);
        setBooleanField(term1865751, term1865751.getClass(), "unknown", false);
        setBooleanField(term1865751, term1865751.getClass(), "resolved", false);
        setField(term1865751, term1865751.getClass(), "resolveResult", null);
        setField(term1865751, term1865751.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1864849;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term1864187, args);
        assertTrue(recursiveEquals(term1864187, term1865746));
        assertTrue(recursiveEquals(term1864849, term1865751));
        assertTrue(recursiveEquals(retValue, false));
    }

};


