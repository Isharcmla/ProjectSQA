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

public class FunctionType_getImplementedInterfaces_281458626241 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term133705;
     Object term134468;

    public FunctionType_getImplementedInterfaces_281458626241() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term134475 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term134474 = ((Class) term134475).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term134474).setAccessible(true);
        Object enum270 = ((Field) term134474).get((Object) null);
        term133705 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term133971 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        Object term134081 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term133705, term133705.getClass(), "kind", enum270);
        setField(term133971, term133971.getClass(), "implicitPrototype", term134081);
        setField(term133705, term133705.getClass(), "prototype", term133971);
        Class<? extends Object> term134775 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term134774 = ((Class) term134775).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term134774).setAccessible(true);
        Object enum271 = ((Field) term134774).get((Object) null);
        term134468 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term134469 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        Object term134470 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term134468, term134468.getClass(), "call", null);
        setField(term134469, term134469.getClass(), "ownerFunction", null);
        setField(term134469, term134469.getClass(), "className", null);
        setField(term134469, term134469.getClass(), "properties", null);
        setField(term134470, term134470.getClass(), "call", null);
        setField(term134470, term134470.getClass(), "prototype", null);
        setField(term134470, term134470.getClass(), "kind", null);
        setField(term134470, term134470.getClass(), "typeOfThis", null);
        setField(term134470, term134470.getClass(), "source", null);
        setField(term134470, term134470.getClass(), "implementedInterfaces", null);
        setField(term134470, term134470.getClass(), "subTypes", null);
        setField(term134470, term134470.getClass(), "templateTypeName", null);
        setField(term134470, term134470.getClass(), "className", null);
        setField(term134470, term134470.getClass(), "properties", null);
        setField(term134470, term134470.getClass(), "implicitPrototype", null);
        setBooleanField(term134470, term134470.getClass(), "nativeType", false);
        setBooleanField(term134470, term134470.getClass(), "prettyPrint", false);
        setBooleanField(term134470, term134470.getClass(), "visited", false);
        setField(term134470, term134470.getClass(), "docInfo", null);
        setBooleanField(term134470, term134470.getClass(), "unknown", false);
        setBooleanField(term134470, term134470.getClass(), "resolved", false);
        setField(term134470, term134470.getClass(), "resolveResult", null);
        setField(term134470, term134470.getClass(), "registry", null);
        setField(term134469, term134469.getClass(), "implicitPrototype", term134470);
        setBooleanField(term134469, term134469.getClass(), "nativeType", false);
        setBooleanField(term134469, term134469.getClass(), "prettyPrint", false);
        setBooleanField(term134469, term134469.getClass(), "visited", false);
        setField(term134469, term134469.getClass(), "docInfo", null);
        setBooleanField(term134469, term134469.getClass(), "unknown", false);
        setBooleanField(term134469, term134469.getClass(), "resolved", false);
        setField(term134469, term134469.getClass(), "resolveResult", null);
        setField(term134469, term134469.getClass(), "registry", null);
        setField(term134468, term134468.getClass(), "prototype", term134469);
        setField(term134468, term134468.getClass(), "kind", enum271);
        setField(term134468, term134468.getClass(), "typeOfThis", null);
        setField(term134468, term134468.getClass(), "source", null);
        setField(term134468, term134468.getClass(), "implementedInterfaces", null);
        setField(term134468, term134468.getClass(), "subTypes", null);
        setField(term134468, term134468.getClass(), "templateTypeName", null);
        setField(term134468, term134468.getClass(), "className", null);
        setField(term134468, term134468.getClass(), "properties", null);
        setField(term134468, term134468.getClass(), "implicitPrototype", null);
        setBooleanField(term134468, term134468.getClass(), "nativeType", false);
        setBooleanField(term134468, term134468.getClass(), "prettyPrint", false);
        setBooleanField(term134468, term134468.getClass(), "visited", false);
        setField(term134468, term134468.getClass(), "docInfo", null);
        setBooleanField(term134468, term134468.getClass(), "unknown", false);
        setBooleanField(term134468, term134468.getClass(), "resolved", false);
        setField(term134468, term134468.getClass(), "resolveResult", null);
        setField(term134468, term134468.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getImplementedInterfaces", argTypes, term133705, args);
        assertTrue(recursiveEquals(term133705, term134468));
        assertTrue(recursiveEquals(retValue, null));
    }

};


