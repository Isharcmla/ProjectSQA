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

public class FunctionType_isSubtype_21010021581579 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2104223;
     Object term2104875;
     Object term2105770;
     Object term2105775;

    public FunctionType_isSubtype_21010021581579() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2105782 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2105781 = ((Class) term2105782).getDeclaredField((String) "ORDINARY");
        ((Field) term2105781).setAccessible(true);
        Object enum3920 = ((Field) term2105781).get((Object) null);
        term2104223 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term2104767 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term2104223, term2104223.getClass(), "kind", enum3920);
        setField(term2104223, term2104223.getClass(), "typeOfThis", term2104767);
        Class<? extends Object> term2106073 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2106072 = ((Class) term2106073).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term2106072).setAccessible(true);
        Object enum3921 = ((Field) term2106072).get((Object) null);
        term2104875 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term2105049 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(term2104875, term2104875.getClass(), "kind", enum3921);
        setField(term2104875, term2104875.getClass(), "typeOfThis", term2105049);
        Class<? extends Object> term2106373 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2106372 = ((Class) term2106373).getDeclaredField((String) "INTERFACE");
        ((Field) term2106372).setAccessible(true);
        Object enum3922 = ((Field) term2106372).get((Object) null);
        term2105770 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term2105774 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term2105770, term2105770.getClass(), "this$0", null);
        setField(term2105770, term2105770.getClass(), "call", null);
        setField(term2105770, term2105770.getClass(), "prototype", null);
        setField(term2105770, term2105770.getClass(), "kind", enum3922);
        setField(term2105774, term2105774.getClass(), "call", null);
        setField(term2105774, term2105774.getClass(), "prototype", null);
        setField(term2105774, term2105774.getClass(), "kind", null);
        setField(term2105774, term2105774.getClass(), "typeOfThis", null);
        setField(term2105774, term2105774.getClass(), "source", null);
        setField(term2105774, term2105774.getClass(), "implementedInterfaces", null);
        setField(term2105774, term2105774.getClass(), "subTypes", null);
        setField(term2105774, term2105774.getClass(), "templateTypeName", null);
        setField(term2105774, term2105774.getClass(), "className", null);
        setField(term2105774, term2105774.getClass(), "properties", null);
        setField(term2105774, term2105774.getClass(), "implicitPrototype", null);
        setBooleanField(term2105774, term2105774.getClass(), "nativeType", false);
        setBooleanField(term2105774, term2105774.getClass(), "visited", false);
        setField(term2105774, term2105774.getClass(), "docInfo", null);
        setBooleanField(term2105774, term2105774.getClass(), "unknown", false);
        setBooleanField(term2105774, term2105774.getClass(), "resolved", false);
        setField(term2105774, term2105774.getClass(), "resolveResult", null);
        setField(term2105774, term2105774.getClass(), "registry", null);
        setField(term2105770, term2105770.getClass(), "typeOfThis", term2105774);
        setField(term2105770, term2105770.getClass(), "source", null);
        setField(term2105770, term2105770.getClass(), "implementedInterfaces", null);
        setField(term2105770, term2105770.getClass(), "subTypes", null);
        setField(term2105770, term2105770.getClass(), "templateTypeName", null);
        setField(term2105770, term2105770.getClass(), "className", null);
        setField(term2105770, term2105770.getClass(), "properties", null);
        setField(term2105770, term2105770.getClass(), "implicitPrototype", null);
        setBooleanField(term2105770, term2105770.getClass(), "nativeType", false);
        setBooleanField(term2105770, term2105770.getClass(), "visited", false);
        setField(term2105770, term2105770.getClass(), "docInfo", null);
        setBooleanField(term2105770, term2105770.getClass(), "unknown", false);
        setBooleanField(term2105770, term2105770.getClass(), "resolved", false);
        setField(term2105770, term2105770.getClass(), "resolveResult", null);
        setField(term2105770, term2105770.getClass(), "registry", null);
        Class<? extends Object> term2106667 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2106666 = ((Class) term2106667).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term2106666).setAccessible(true);
        Object enum3923 = ((Field) term2106666).get((Object) null);
        term2105775 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term2105779 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(term2105775, term2105775.getClass(), "this$0", null);
        setField(term2105775, term2105775.getClass(), "call", null);
        setField(term2105775, term2105775.getClass(), "prototype", null);
        setField(term2105775, term2105775.getClass(), "kind", enum3923);
        setField(term2105779, term2105779.getClass(), "leastSupertypeVisitor", null);
        setField(term2105779, term2105779.getClass(), "greatestSubtypeVisitor", null);
        setField(term2105779, term2105779.getClass(), "call", null);
        setField(term2105779, term2105779.getClass(), "prototype", null);
        setField(term2105779, term2105779.getClass(), "kind", null);
        setField(term2105779, term2105779.getClass(), "typeOfThis", null);
        setField(term2105779, term2105779.getClass(), "source", null);
        setField(term2105779, term2105779.getClass(), "implementedInterfaces", null);
        setField(term2105779, term2105779.getClass(), "subTypes", null);
        setField(term2105779, term2105779.getClass(), "templateTypeName", null);
        setField(term2105779, term2105779.getClass(), "className", null);
        setField(term2105779, term2105779.getClass(), "properties", null);
        setField(term2105779, term2105779.getClass(), "implicitPrototype", null);
        setBooleanField(term2105779, term2105779.getClass(), "nativeType", false);
        setBooleanField(term2105779, term2105779.getClass(), "visited", false);
        setField(term2105779, term2105779.getClass(), "docInfo", null);
        setBooleanField(term2105779, term2105779.getClass(), "unknown", false);
        setBooleanField(term2105779, term2105779.getClass(), "resolved", false);
        setField(term2105779, term2105779.getClass(), "resolveResult", null);
        setField(term2105779, term2105779.getClass(), "registry", null);
        setField(term2105775, term2105775.getClass(), "typeOfThis", term2105779);
        setField(term2105775, term2105775.getClass(), "source", null);
        setField(term2105775, term2105775.getClass(), "implementedInterfaces", null);
        setField(term2105775, term2105775.getClass(), "subTypes", null);
        setField(term2105775, term2105775.getClass(), "templateTypeName", null);
        setField(term2105775, term2105775.getClass(), "className", null);
        setField(term2105775, term2105775.getClass(), "properties", null);
        setField(term2105775, term2105775.getClass(), "implicitPrototype", null);
        setBooleanField(term2105775, term2105775.getClass(), "nativeType", false);
        setBooleanField(term2105775, term2105775.getClass(), "visited", false);
        setField(term2105775, term2105775.getClass(), "docInfo", null);
        setBooleanField(term2105775, term2105775.getClass(), "unknown", false);
        setBooleanField(term2105775, term2105775.getClass(), "resolved", false);
        setField(term2105775, term2105775.getClass(), "resolveResult", null);
        setField(term2105775, term2105775.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term2104875;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term2104223, args);
        assertTrue(recursiveEquals(term2104223, term2105770));
        assertTrue(recursiveEquals(term2104875, term2105775));
        assertTrue(recursiveEquals(retValue, false));
    }

};


