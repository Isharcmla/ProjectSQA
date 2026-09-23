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
     Object term286359;
     Object term286617;
     Object term287454;
     Object term287458;

    public FunctionType_isSubtype_2101002158387() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term287464 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term287463 = ((Class) term287464).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term287463).setAccessible(true);
        Object enum528 = ((Field) term287463).get((Object) null);
        term286359 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term286359, term286359.getClass(), "kind", enum528);
        Class<? extends Object> term287764 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term287763 = ((Class) term287764).getDeclaredField((String) "INTERFACE");
        ((Field) term287763).setAccessible(true);
        Object enum529 = ((Field) term287763).get((Object) null);
        term286617 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term286617, term286617.getClass(), "kind", enum529);
        Class<? extends Object> term288058 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term288057 = ((Class) term288058).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term288057).setAccessible(true);
        Object enum530 = ((Field) term288057).get((Object) null);
        term287454 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term287454, term287454.getClass(), "call", null);
        setField(term287454, term287454.getClass(), "prototype", null);
        setField(term287454, term287454.getClass(), "kind", enum530);
        setField(term287454, term287454.getClass(), "typeOfThis", null);
        setField(term287454, term287454.getClass(), "source", null);
        setField(term287454, term287454.getClass(), "implementedInterfaces", null);
        setField(term287454, term287454.getClass(), "subTypes", null);
        setField(term287454, term287454.getClass(), "templateTypeName", null);
        setField(term287454, term287454.getClass(), "className", null);
        setField(term287454, term287454.getClass(), "properties", null);
        setField(term287454, term287454.getClass(), "implicitPrototype", null);
        setBooleanField(term287454, term287454.getClass(), "nativeType", false);
        setBooleanField(term287454, term287454.getClass(), "prettyPrint", false);
        setBooleanField(term287454, term287454.getClass(), "visited", false);
        setField(term287454, term287454.getClass(), "docInfo", null);
        setBooleanField(term287454, term287454.getClass(), "unknown", false);
        setBooleanField(term287454, term287454.getClass(), "resolved", false);
        setField(term287454, term287454.getClass(), "resolveResult", null);
        setField(term287454, term287454.getClass(), "registry", null);
        Class<? extends Object> term288358 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term288357 = ((Class) term288358).getDeclaredField((String) "INTERFACE");
        ((Field) term288357).setAccessible(true);
        Object enum531 = ((Field) term288357).get((Object) null);
        term287458 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term287458, term287458.getClass(), "call", null);
        setField(term287458, term287458.getClass(), "prototype", null);
        setField(term287458, term287458.getClass(), "kind", enum531);
        setField(term287458, term287458.getClass(), "typeOfThis", null);
        setField(term287458, term287458.getClass(), "source", null);
        setField(term287458, term287458.getClass(), "implementedInterfaces", null);
        setField(term287458, term287458.getClass(), "subTypes", null);
        setField(term287458, term287458.getClass(), "templateTypeName", null);
        setField(term287458, term287458.getClass(), "className", null);
        setField(term287458, term287458.getClass(), "properties", null);
        setField(term287458, term287458.getClass(), "implicitPrototype", null);
        setBooleanField(term287458, term287458.getClass(), "nativeType", false);
        setBooleanField(term287458, term287458.getClass(), "prettyPrint", false);
        setBooleanField(term287458, term287458.getClass(), "visited", false);
        setField(term287458, term287458.getClass(), "docInfo", null);
        setBooleanField(term287458, term287458.getClass(), "unknown", false);
        setBooleanField(term287458, term287458.getClass(), "resolved", false);
        setField(term287458, term287458.getClass(), "resolveResult", null);
        setField(term287458, term287458.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term286617;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term286359, args);
        assertTrue(recursiveEquals(term286359, term287454));
        assertTrue(recursiveEquals(term286617, term287458));
        assertTrue(recursiveEquals(retValue, true));
    }

};


