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

public class FunctionType_isSubtype_2101002158549 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term426877;
     Object term427431;
     Object term428181;
     Object term428185;

    public FunctionType_isSubtype_2101002158549() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term428191 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term428190 = ((Class) term428191).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term428190).setAccessible(true);
        Object enum790 = ((Field) term428190).get((Object) null);
        term426877 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term426877, term426877.getClass(), "kind", enum790);
        Class<? extends Object> term428491 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term428490 = ((Class) term428491).getDeclaredField((String) "INTERFACE");
        ((Field) term428490).setAccessible(true);
        Object enum791 = ((Field) term428490).get((Object) null);
        term427431 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term427431, term427431.getClass(), "kind", enum791);
        Class<? extends Object> term428785 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term428784 = ((Class) term428785).getDeclaredField((String) "ORDINARY");
        ((Field) term428784).setAccessible(true);
        Object enum792 = ((Field) term428784).get((Object) null);
        term428181 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term428181, term428181.getClass(), "this$0", null);
        setField(term428181, term428181.getClass(), "call", null);
        setField(term428181, term428181.getClass(), "prototype", null);
        setField(term428181, term428181.getClass(), "kind", enum792);
        setField(term428181, term428181.getClass(), "typeOfThis", null);
        setField(term428181, term428181.getClass(), "source", null);
        setField(term428181, term428181.getClass(), "implementedInterfaces", null);
        setField(term428181, term428181.getClass(), "subTypes", null);
        setField(term428181, term428181.getClass(), "templateTypeName", null);
        setField(term428181, term428181.getClass(), "className", null);
        setField(term428181, term428181.getClass(), "properties", null);
        setField(term428181, term428181.getClass(), "implicitPrototype", null);
        setBooleanField(term428181, term428181.getClass(), "nativeType", false);
        setBooleanField(term428181, term428181.getClass(), "visited", false);
        setField(term428181, term428181.getClass(), "docInfo", null);
        setBooleanField(term428181, term428181.getClass(), "unknown", false);
        setBooleanField(term428181, term428181.getClass(), "resolved", false);
        setField(term428181, term428181.getClass(), "resolveResult", null);
        setField(term428181, term428181.getClass(), "registry", null);
        Class<? extends Object> term429076 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term429075 = ((Class) term429076).getDeclaredField((String) "INTERFACE");
        ((Field) term429075).setAccessible(true);
        Object enum793 = ((Field) term429075).get((Object) null);
        term428185 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term428185, term428185.getClass(), "call", null);
        setField(term428185, term428185.getClass(), "prototype", null);
        setField(term428185, term428185.getClass(), "kind", enum793);
        setField(term428185, term428185.getClass(), "typeOfThis", null);
        setField(term428185, term428185.getClass(), "source", null);
        setField(term428185, term428185.getClass(), "implementedInterfaces", null);
        setField(term428185, term428185.getClass(), "subTypes", null);
        setField(term428185, term428185.getClass(), "templateTypeName", null);
        setField(term428185, term428185.getClass(), "className", null);
        setField(term428185, term428185.getClass(), "properties", null);
        setField(term428185, term428185.getClass(), "implicitPrototype", null);
        setBooleanField(term428185, term428185.getClass(), "nativeType", false);
        setBooleanField(term428185, term428185.getClass(), "visited", false);
        setField(term428185, term428185.getClass(), "docInfo", null);
        setBooleanField(term428185, term428185.getClass(), "unknown", false);
        setBooleanField(term428185, term428185.getClass(), "resolved", false);
        setField(term428185, term428185.getClass(), "resolveResult", null);
        setField(term428185, term428185.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term427431;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term426877, args);
        assertTrue(recursiveEquals(term426877, term428181));
        assertTrue(recursiveEquals(term427431, term428185));
        assertTrue(recursiveEquals(retValue, true));
    }

};


