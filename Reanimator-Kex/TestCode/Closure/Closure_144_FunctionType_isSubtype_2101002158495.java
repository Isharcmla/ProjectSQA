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

public class FunctionType_isSubtype_2101002158495 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term423850;
     Object term424200;
     Object term425052;
     Object term425057;

    public FunctionType_isSubtype_2101002158495() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term425063 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term425062 = ((Class) term425063).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term425062).setAccessible(true);
        Object enum771 = ((Field) term425062).get((Object) null);
        term423850 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term424092 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term423850, term423850.getClass(), "kind", enum771);
        setField(term423850, term423850.getClass(), "call", term424092);
        Class<? extends Object> term425363 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term425362 = ((Class) term425363).getDeclaredField((String) "ORDINARY");
        ((Field) term425362).setAccessible(true);
        Object enum772 = ((Field) term425362).get((Object) null);
        term424200 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term424200, term424200.getClass(), "kind", enum772);
        setField(term424200, term424200.getClass(), "call", null);
        Class<? extends Object> term425654 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term425653 = ((Class) term425654).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term425653).setAccessible(true);
        Object enum773 = ((Field) term425653).get((Object) null);
        term425052 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term425053 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term425052, term425052.getClass(), "this$0", null);
        setField(term425053, term425053.getClass(), "parameters", null);
        setField(term425053, term425053.getClass(), "returnType", null);
        setBooleanField(term425053, term425053.getClass(), "returnTypeInferred", false);
        setBooleanField(term425053, term425053.getClass(), "resolved", false);
        setField(term425053, term425053.getClass(), "resolveResult", null);
        setField(term425053, term425053.getClass(), "registry", null);
        setField(term425052, term425052.getClass(), "call", term425053);
        setField(term425052, term425052.getClass(), "prototype", null);
        setField(term425052, term425052.getClass(), "kind", enum773);
        setField(term425052, term425052.getClass(), "typeOfThis", null);
        setField(term425052, term425052.getClass(), "source", null);
        setField(term425052, term425052.getClass(), "implementedInterfaces", null);
        setField(term425052, term425052.getClass(), "subTypes", null);
        setField(term425052, term425052.getClass(), "templateTypeName", null);
        setField(term425052, term425052.getClass(), "className", null);
        setField(term425052, term425052.getClass(), "properties", null);
        setField(term425052, term425052.getClass(), "implicitPrototype", null);
        setBooleanField(term425052, term425052.getClass(), "nativeType", false);
        setBooleanField(term425052, term425052.getClass(), "prettyPrint", false);
        setBooleanField(term425052, term425052.getClass(), "visited", false);
        setField(term425052, term425052.getClass(), "docInfo", null);
        setBooleanField(term425052, term425052.getClass(), "unknown", false);
        setBooleanField(term425052, term425052.getClass(), "resolved", false);
        setField(term425052, term425052.getClass(), "resolveResult", null);
        setField(term425052, term425052.getClass(), "registry", null);
        Class<? extends Object> term425954 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term425953 = ((Class) term425954).getDeclaredField((String) "ORDINARY");
        ((Field) term425953).setAccessible(true);
        Object enum774 = ((Field) term425953).get((Object) null);
        term425057 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term425057, term425057.getClass(), "this$0", null);
        setField(term425057, term425057.getClass(), "call", null);
        setField(term425057, term425057.getClass(), "prototype", null);
        setField(term425057, term425057.getClass(), "kind", enum774);
        setField(term425057, term425057.getClass(), "typeOfThis", null);
        setField(term425057, term425057.getClass(), "source", null);
        setField(term425057, term425057.getClass(), "implementedInterfaces", null);
        setField(term425057, term425057.getClass(), "subTypes", null);
        setField(term425057, term425057.getClass(), "templateTypeName", null);
        setField(term425057, term425057.getClass(), "className", null);
        setField(term425057, term425057.getClass(), "properties", null);
        setField(term425057, term425057.getClass(), "implicitPrototype", null);
        setBooleanField(term425057, term425057.getClass(), "nativeType", false);
        setBooleanField(term425057, term425057.getClass(), "prettyPrint", false);
        setBooleanField(term425057, term425057.getClass(), "visited", false);
        setField(term425057, term425057.getClass(), "docInfo", null);
        setBooleanField(term425057, term425057.getClass(), "unknown", false);
        setBooleanField(term425057, term425057.getClass(), "resolved", false);
        setField(term425057, term425057.getClass(), "resolveResult", null);
        setField(term425057, term425057.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term424200;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term423850, args);
        assertTrue(recursiveEquals(term423850, term425052));
        assertTrue(recursiveEquals(term424200, term425057));
        assertTrue(recursiveEquals(retValue, false));
    }

};


