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

public class FunctionType_isSubtype_2101002158333 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term189406;
     Object term189958;
     Object term190707;
     Object term190711;

    public FunctionType_isSubtype_2101002158333() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term190717 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term190716 = ((Class) term190717).getDeclaredField((String) "ORDINARY");
        ((Field) term190716).setAccessible(true);
        Object enum347 = ((Field) term190716).get((Object) null);
        term189406 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term189406, term189406.getClass(), "kind", enum347);
        Class<? extends Object> term191008 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term191007 = ((Class) term191008).getDeclaredField((String) "INTERFACE");
        ((Field) term191007).setAccessible(true);
        Object enum348 = ((Field) term191007).get((Object) null);
        term189958 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term189958, term189958.getClass(), "kind", enum348);
        Class<? extends Object> term191302 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term191301 = ((Class) term191302).getDeclaredField((String) "INTERFACE");
        ((Field) term191301).setAccessible(true);
        Object enum349 = ((Field) term191301).get((Object) null);
        term190707 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term190707, term190707.getClass(), "call", null);
        setField(term190707, term190707.getClass(), "prototype", null);
        setField(term190707, term190707.getClass(), "kind", enum349);
        setField(term190707, term190707.getClass(), "typeOfThis", null);
        setField(term190707, term190707.getClass(), "source", null);
        setField(term190707, term190707.getClass(), "implementedInterfaces", null);
        setField(term190707, term190707.getClass(), "subTypes", null);
        setField(term190707, term190707.getClass(), "templateTypeName", null);
        setField(term190707, term190707.getClass(), "className", null);
        setField(term190707, term190707.getClass(), "properties", null);
        setField(term190707, term190707.getClass(), "implicitPrototype", null);
        setBooleanField(term190707, term190707.getClass(), "nativeType", false);
        setBooleanField(term190707, term190707.getClass(), "visited", false);
        setField(term190707, term190707.getClass(), "docInfo", null);
        setBooleanField(term190707, term190707.getClass(), "unknown", false);
        setBooleanField(term190707, term190707.getClass(), "resolved", false);
        setField(term190707, term190707.getClass(), "resolveResult", null);
        setField(term190707, term190707.getClass(), "registry", null);
        Class<? extends Object> term191596 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term191595 = ((Class) term191596).getDeclaredField((String) "INTERFACE");
        ((Field) term191595).setAccessible(true);
        Object enum350 = ((Field) term191595).get((Object) null);
        term190711 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term190711, term190711.getClass(), "this$0", null);
        setField(term190711, term190711.getClass(), "call", null);
        setField(term190711, term190711.getClass(), "prototype", null);
        setField(term190711, term190711.getClass(), "kind", enum350);
        setField(term190711, term190711.getClass(), "typeOfThis", null);
        setField(term190711, term190711.getClass(), "source", null);
        setField(term190711, term190711.getClass(), "implementedInterfaces", null);
        setField(term190711, term190711.getClass(), "subTypes", null);
        setField(term190711, term190711.getClass(), "templateTypeName", null);
        setField(term190711, term190711.getClass(), "className", null);
        setField(term190711, term190711.getClass(), "properties", null);
        setField(term190711, term190711.getClass(), "implicitPrototype", null);
        setBooleanField(term190711, term190711.getClass(), "nativeType", false);
        setBooleanField(term190711, term190711.getClass(), "visited", false);
        setField(term190711, term190711.getClass(), "docInfo", null);
        setBooleanField(term190711, term190711.getClass(), "unknown", false);
        setBooleanField(term190711, term190711.getClass(), "resolved", false);
        setField(term190711, term190711.getClass(), "resolveResult", null);
        setField(term190711, term190711.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term189958;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term189406, args);
        assertTrue(recursiveEquals(term189406, term190707));
        assertTrue(recursiveEquals(term189958, term190711));
        assertTrue(recursiveEquals(retValue, true));
    }

};


