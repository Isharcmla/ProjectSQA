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

public class FunctionType_getGreatestSubtype_679591709829 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term843043;
     Object term843299;
     Object term843755;
     Object term843759;
     Object term843669;

    public FunctionType_getGreatestSubtype_679591709829() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term843764 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term843763 = ((Class) term843764).getDeclaredField((String) "INTERFACE");
        ((Field) term843763).setAccessible(true);
        Object enum1574 = ((Field) term843763).get((Object) null);
        term843043 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term843043, term843043.getClass(), "kind", enum1574);
        term843299 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term843299, term843299.getClass(), "kind", enum1574);
        Class<? extends Object> term844058 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term844057 = ((Class) term844058).getDeclaredField((String) "INTERFACE");
        ((Field) term844057).setAccessible(true);
        Object enum1575 = ((Field) term844057).get((Object) null);
        term843755 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term843755, term843755.getClass(), "this$0", null);
        setField(term843755, term843755.getClass(), "call", null);
        setField(term843755, term843755.getClass(), "prototype", null);
        setField(term843755, term843755.getClass(), "kind", enum1575);
        setField(term843755, term843755.getClass(), "typeOfThis", null);
        setField(term843755, term843755.getClass(), "source", null);
        setField(term843755, term843755.getClass(), "implementedInterfaces", null);
        setField(term843755, term843755.getClass(), "subTypes", null);
        setField(term843755, term843755.getClass(), "templateTypeName", null);
        setField(term843755, term843755.getClass(), "className", null);
        setField(term843755, term843755.getClass(), "properties", null);
        setField(term843755, term843755.getClass(), "implicitPrototype", null);
        setBooleanField(term843755, term843755.getClass(), "nativeType", false);
        setBooleanField(term843755, term843755.getClass(), "visited", false);
        setField(term843755, term843755.getClass(), "docInfo", null);
        setBooleanField(term843755, term843755.getClass(), "unknown", false);
        setBooleanField(term843755, term843755.getClass(), "resolved", false);
        setField(term843755, term843755.getClass(), "resolveResult", null);
        setField(term843755, term843755.getClass(), "registry", null);
        Class<? extends Object> term844352 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term844351 = ((Class) term844352).getDeclaredField((String) "INTERFACE");
        ((Field) term844351).setAccessible(true);
        Object enum1576 = ((Field) term844351).get((Object) null);
        term843759 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term843759, term843759.getClass(), "this$0", null);
        setField(term843759, term843759.getClass(), "call", null);
        setField(term843759, term843759.getClass(), "prototype", null);
        setField(term843759, term843759.getClass(), "kind", enum1576);
        setField(term843759, term843759.getClass(), "typeOfThis", null);
        setField(term843759, term843759.getClass(), "source", null);
        setField(term843759, term843759.getClass(), "implementedInterfaces", null);
        setField(term843759, term843759.getClass(), "subTypes", null);
        setField(term843759, term843759.getClass(), "templateTypeName", null);
        setField(term843759, term843759.getClass(), "className", null);
        setField(term843759, term843759.getClass(), "properties", null);
        setField(term843759, term843759.getClass(), "implicitPrototype", null);
        setBooleanField(term843759, term843759.getClass(), "nativeType", false);
        setBooleanField(term843759, term843759.getClass(), "visited", false);
        setField(term843759, term843759.getClass(), "docInfo", null);
        setBooleanField(term843759, term843759.getClass(), "unknown", false);
        setBooleanField(term843759, term843759.getClass(), "resolved", false);
        setField(term843759, term843759.getClass(), "resolveResult", null);
        setField(term843759, term843759.getClass(), "registry", null);
        Class<? extends Object> term844646 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term844645 = ((Class) term844646).getDeclaredField((String) "INTERFACE");
        ((Field) term844645).setAccessible(true);
        Object enum1577 = ((Field) term844645).get((Object) null);
        term843669 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term843669, term843669.getClass(), "this$0", null);
        setField(term843669, term843669.getClass(), "call", null);
        setField(term843669, term843669.getClass(), "prototype", null);
        setField(term843669, term843669.getClass(), "kind", enum1577);
        setField(term843669, term843669.getClass(), "typeOfThis", null);
        setField(term843669, term843669.getClass(), "source", null);
        setField(term843669, term843669.getClass(), "implementedInterfaces", null);
        setField(term843669, term843669.getClass(), "subTypes", null);
        setField(term843669, term843669.getClass(), "templateTypeName", null);
        setField(term843669, term843669.getClass(), "className", null);
        setField(term843669, term843669.getClass(), "properties", null);
        setField(term843669, term843669.getClass(), "implicitPrototype", null);
        setBooleanField(term843669, term843669.getClass(), "nativeType", false);
        setBooleanField(term843669, term843669.getClass(), "visited", false);
        setField(term843669, term843669.getClass(), "docInfo", null);
        setBooleanField(term843669, term843669.getClass(), "unknown", false);
        setBooleanField(term843669, term843669.getClass(), "resolved", false);
        setField(term843669, term843669.getClass(), "resolveResult", null);
        setField(term843669, term843669.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term843299;
        Object retValue = callMethod(klass, "getGreatestSubtype", argTypes, term843043, args);
        assertTrue(recursiveEquals(term843043, term843755));
        assertTrue(recursiveEquals(term843299, term843759));
        assertTrue(recursiveEquals(retValue, term843669));
    }

};


