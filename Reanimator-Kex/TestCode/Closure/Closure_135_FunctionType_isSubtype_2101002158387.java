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

public class FunctionType_isSubtype_2101002158387 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term238699;
     Object term238955;
     Object term239305;
     Object term239309;

    public FunctionType_isSubtype_2101002158387() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term239312 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term239311 = ((Class) term239312).getDeclaredField((String) "INTERFACE");
        ((Field) term239311).setAccessible(true);
        Object enum431 = ((Field) term239311).get((Object) null);
        term238699 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term238699, term238699.getClass(), "kind", enum431);
        term238955 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Class<? extends Object> term239606 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term239605 = ((Class) term239606).getDeclaredField((String) "INTERFACE");
        ((Field) term239605).setAccessible(true);
        Object enum432 = ((Field) term239605).get((Object) null);
        term239305 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term239305, term239305.getClass(), "this$0", null);
        setField(term239305, term239305.getClass(), "call", null);
        setField(term239305, term239305.getClass(), "prototype", null);
        setField(term239305, term239305.getClass(), "kind", enum432);
        setField(term239305, term239305.getClass(), "typeOfThis", null);
        setField(term239305, term239305.getClass(), "source", null);
        setField(term239305, term239305.getClass(), "implementedInterfaces", null);
        setField(term239305, term239305.getClass(), "subTypes", null);
        setField(term239305, term239305.getClass(), "templateTypeName", null);
        setField(term239305, term239305.getClass(), "className", null);
        setField(term239305, term239305.getClass(), "properties", null);
        setField(term239305, term239305.getClass(), "implicitPrototype", null);
        setBooleanField(term239305, term239305.getClass(), "nativeType", false);
        setBooleanField(term239305, term239305.getClass(), "visited", false);
        setField(term239305, term239305.getClass(), "docInfo", null);
        setBooleanField(term239305, term239305.getClass(), "unknown", false);
        setBooleanField(term239305, term239305.getClass(), "resolved", false);
        setField(term239305, term239305.getClass(), "resolveResult", null);
        setField(term239305, term239305.getClass(), "registry", null);
        term239309 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term239309, term239309.getClass(), "this$0", null);
        setField(term239309, term239309.getClass(), "call", null);
        setField(term239309, term239309.getClass(), "prototype", null);
        setField(term239309, term239309.getClass(), "kind", null);
        setField(term239309, term239309.getClass(), "typeOfThis", null);
        setField(term239309, term239309.getClass(), "source", null);
        setField(term239309, term239309.getClass(), "implementedInterfaces", null);
        setField(term239309, term239309.getClass(), "subTypes", null);
        setField(term239309, term239309.getClass(), "templateTypeName", null);
        setField(term239309, term239309.getClass(), "className", null);
        setField(term239309, term239309.getClass(), "properties", null);
        setField(term239309, term239309.getClass(), "implicitPrototype", null);
        setBooleanField(term239309, term239309.getClass(), "nativeType", false);
        setBooleanField(term239309, term239309.getClass(), "visited", false);
        setField(term239309, term239309.getClass(), "docInfo", null);
        setBooleanField(term239309, term239309.getClass(), "unknown", false);
        setBooleanField(term239309, term239309.getClass(), "resolved", false);
        setField(term239309, term239309.getClass(), "resolveResult", null);
        setField(term239309, term239309.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term238955;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term238699, args);
        assertTrue(recursiveEquals(term238699, term239305));
        assertTrue(recursiveEquals(term238955, term239309));
        assertTrue(recursiveEquals(retValue, false));
    }

};


