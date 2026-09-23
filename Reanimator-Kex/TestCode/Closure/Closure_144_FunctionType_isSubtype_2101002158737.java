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

public class FunctionType_isSubtype_2101002158737 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term802995;
     Object term803345;
     Object term804191;
     Object term804196;

    public FunctionType_isSubtype_2101002158737() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term804202 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term804201 = ((Class) term804202).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term804201).setAccessible(true);
        Object enum1447 = ((Field) term804201).get((Object) null);
        term802995 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term803237 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term802995, term802995.getClass(), "kind", enum1447);
        setField(term802995, term802995.getClass(), "call", term803237);
        Class<? extends Object> term804502 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term804501 = ((Class) term804502).getDeclaredField((String) "ORDINARY");
        ((Field) term804501).setAccessible(true);
        Object enum1448 = ((Field) term804501).get((Object) null);
        term803345 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term803345, term803345.getClass(), "kind", enum1448);
        setField(term803345, term803345.getClass(), "call", null);
        Class<? extends Object> term804793 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term804792 = ((Class) term804793).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term804792).setAccessible(true);
        Object enum1449 = ((Field) term804792).get((Object) null);
        term804191 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term804192 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term804192, term804192.getClass(), "parameters", null);
        setField(term804192, term804192.getClass(), "returnType", null);
        setBooleanField(term804192, term804192.getClass(), "returnTypeInferred", false);
        setBooleanField(term804192, term804192.getClass(), "resolved", false);
        setField(term804192, term804192.getClass(), "resolveResult", null);
        setField(term804192, term804192.getClass(), "registry", null);
        setField(term804191, term804191.getClass(), "call", term804192);
        setField(term804191, term804191.getClass(), "prototype", null);
        setField(term804191, term804191.getClass(), "kind", enum1449);
        setField(term804191, term804191.getClass(), "typeOfThis", null);
        setField(term804191, term804191.getClass(), "source", null);
        setField(term804191, term804191.getClass(), "implementedInterfaces", null);
        setField(term804191, term804191.getClass(), "subTypes", null);
        setField(term804191, term804191.getClass(), "templateTypeName", null);
        setField(term804191, term804191.getClass(), "className", null);
        setField(term804191, term804191.getClass(), "properties", null);
        setField(term804191, term804191.getClass(), "implicitPrototype", null);
        setBooleanField(term804191, term804191.getClass(), "nativeType", false);
        setBooleanField(term804191, term804191.getClass(), "prettyPrint", false);
        setBooleanField(term804191, term804191.getClass(), "visited", false);
        setField(term804191, term804191.getClass(), "docInfo", null);
        setBooleanField(term804191, term804191.getClass(), "unknown", false);
        setBooleanField(term804191, term804191.getClass(), "resolved", false);
        setField(term804191, term804191.getClass(), "resolveResult", null);
        setField(term804191, term804191.getClass(), "registry", null);
        Class<? extends Object> term805093 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term805092 = ((Class) term805093).getDeclaredField((String) "ORDINARY");
        ((Field) term805092).setAccessible(true);
        Object enum1450 = ((Field) term805092).get((Object) null);
        term804196 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term804196, term804196.getClass(), "this$0", null);
        setField(term804196, term804196.getClass(), "call", null);
        setField(term804196, term804196.getClass(), "prototype", null);
        setField(term804196, term804196.getClass(), "kind", enum1450);
        setField(term804196, term804196.getClass(), "typeOfThis", null);
        setField(term804196, term804196.getClass(), "source", null);
        setField(term804196, term804196.getClass(), "implementedInterfaces", null);
        setField(term804196, term804196.getClass(), "subTypes", null);
        setField(term804196, term804196.getClass(), "templateTypeName", null);
        setField(term804196, term804196.getClass(), "className", null);
        setField(term804196, term804196.getClass(), "properties", null);
        setField(term804196, term804196.getClass(), "implicitPrototype", null);
        setBooleanField(term804196, term804196.getClass(), "nativeType", false);
        setBooleanField(term804196, term804196.getClass(), "prettyPrint", false);
        setBooleanField(term804196, term804196.getClass(), "visited", false);
        setField(term804196, term804196.getClass(), "docInfo", null);
        setBooleanField(term804196, term804196.getClass(), "unknown", false);
        setBooleanField(term804196, term804196.getClass(), "resolved", false);
        setField(term804196, term804196.getClass(), "resolveResult", null);
        setField(term804196, term804196.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term803345;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term802995, args);
        assertTrue(recursiveEquals(term802995, term804191));
        assertTrue(recursiveEquals(term803345, term804196));
        assertTrue(recursiveEquals(retValue, false));
    }

};


