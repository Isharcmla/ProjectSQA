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

public class FunctionType_isSubtype_2101002158869 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term908149;
     Object term908405;
     Object term911296;
     Object term911300;

    public FunctionType_isSubtype_2101002158869() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term911303 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term911302 = ((Class) term911303).getDeclaredField((String) "INTERFACE");
        ((Field) term911302).setAccessible(true);
        Object enum1699 = ((Field) term911302).get((Object) null);
        term908149 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term908149, term908149.getClass(), "kind", enum1699);
        term908405 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Class<? extends Object> term911597 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term911596 = ((Class) term911597).getDeclaredField((String) "INTERFACE");
        ((Field) term911596).setAccessible(true);
        Object enum1700 = ((Field) term911596).get((Object) null);
        term911296 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term911296, term911296.getClass(), "this$0", null);
        setField(term911296, term911296.getClass(), "call", null);
        setField(term911296, term911296.getClass(), "prototype", null);
        setField(term911296, term911296.getClass(), "kind", enum1700);
        setField(term911296, term911296.getClass(), "typeOfThis", null);
        setField(term911296, term911296.getClass(), "source", null);
        setField(term911296, term911296.getClass(), "implementedInterfaces", null);
        setField(term911296, term911296.getClass(), "subTypes", null);
        setField(term911296, term911296.getClass(), "templateTypeName", null);
        setField(term911296, term911296.getClass(), "className", null);
        setField(term911296, term911296.getClass(), "properties", null);
        setField(term911296, term911296.getClass(), "implicitPrototype", null);
        setBooleanField(term911296, term911296.getClass(), "nativeType", false);
        setBooleanField(term911296, term911296.getClass(), "visited", false);
        setField(term911296, term911296.getClass(), "docInfo", null);
        setBooleanField(term911296, term911296.getClass(), "unknown", false);
        setBooleanField(term911296, term911296.getClass(), "resolved", false);
        setField(term911296, term911296.getClass(), "resolveResult", null);
        setField(term911296, term911296.getClass(), "registry", null);
        term911300 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term911300, term911300.getClass(), "this$0", null);
        setField(term911300, term911300.getClass(), "call", null);
        setField(term911300, term911300.getClass(), "prototype", null);
        setField(term911300, term911300.getClass(), "kind", null);
        setField(term911300, term911300.getClass(), "typeOfThis", null);
        setField(term911300, term911300.getClass(), "source", null);
        setField(term911300, term911300.getClass(), "implementedInterfaces", null);
        setField(term911300, term911300.getClass(), "subTypes", null);
        setField(term911300, term911300.getClass(), "templateTypeName", null);
        setField(term911300, term911300.getClass(), "className", null);
        setField(term911300, term911300.getClass(), "properties", null);
        setField(term911300, term911300.getClass(), "implicitPrototype", null);
        setBooleanField(term911300, term911300.getClass(), "nativeType", false);
        setBooleanField(term911300, term911300.getClass(), "visited", false);
        setField(term911300, term911300.getClass(), "docInfo", null);
        setBooleanField(term911300, term911300.getClass(), "unknown", false);
        setBooleanField(term911300, term911300.getClass(), "resolved", false);
        setField(term911300, term911300.getClass(), "resolveResult", null);
        setField(term911300, term911300.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term908405;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term908149, args);
        assertTrue(recursiveEquals(term908149, term911296));
        assertTrue(recursiveEquals(term908405, term911300));
        assertTrue(recursiveEquals(retValue, false));
    }

};


