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

public class FunctionType_isSubtype_2101002158421 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term274446;
     Object term275000;
     Object term276414;
     Object term276418;

    public FunctionType_isSubtype_2101002158421() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term276424 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term276423 = ((Class) term276424).getDeclaredField((String) "ORDINARY");
        ((Field) term276423).setAccessible(true);
        Object enum502 = ((Field) term276423).get((Object) null);
        term274446 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term274446, term274446.getClass(), "kind", enum502);
        Class<? extends Object> term276715 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term276714 = ((Class) term276715).getDeclaredField((String) "INTERFACE");
        ((Field) term276714).setAccessible(true);
        Object enum503 = ((Field) term276714).get((Object) null);
        term275000 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term275000, term275000.getClass(), "kind", enum503);
        Class<? extends Object> term277009 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term277008 = ((Class) term277009).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term277008).setAccessible(true);
        Object enum504 = ((Field) term277008).get((Object) null);
        term276414 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term276414, term276414.getClass(), "this$0", null);
        setField(term276414, term276414.getClass(), "call", null);
        setField(term276414, term276414.getClass(), "prototype", null);
        setField(term276414, term276414.getClass(), "kind", enum504);
        setField(term276414, term276414.getClass(), "typeOfThis", null);
        setField(term276414, term276414.getClass(), "source", null);
        setField(term276414, term276414.getClass(), "implementedInterfaces", null);
        setField(term276414, term276414.getClass(), "subTypes", null);
        setField(term276414, term276414.getClass(), "templateTypeName", null);
        setField(term276414, term276414.getClass(), "className", null);
        setField(term276414, term276414.getClass(), "properties", null);
        setField(term276414, term276414.getClass(), "implicitPrototype", null);
        setBooleanField(term276414, term276414.getClass(), "nativeType", false);
        setBooleanField(term276414, term276414.getClass(), "visited", false);
        setField(term276414, term276414.getClass(), "docInfo", null);
        setBooleanField(term276414, term276414.getClass(), "unknown", false);
        setBooleanField(term276414, term276414.getClass(), "resolved", false);
        setField(term276414, term276414.getClass(), "resolveResult", null);
        setField(term276414, term276414.getClass(), "registry", null);
        Class<? extends Object> term277309 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term277308 = ((Class) term277309).getDeclaredField((String) "INTERFACE");
        ((Field) term277308).setAccessible(true);
        Object enum505 = ((Field) term277308).get((Object) null);
        term276418 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term276418, term276418.getClass(), "call", null);
        setField(term276418, term276418.getClass(), "prototype", null);
        setField(term276418, term276418.getClass(), "kind", enum505);
        setField(term276418, term276418.getClass(), "typeOfThis", null);
        setField(term276418, term276418.getClass(), "source", null);
        setField(term276418, term276418.getClass(), "implementedInterfaces", null);
        setField(term276418, term276418.getClass(), "subTypes", null);
        setField(term276418, term276418.getClass(), "templateTypeName", null);
        setField(term276418, term276418.getClass(), "className", null);
        setField(term276418, term276418.getClass(), "properties", null);
        setField(term276418, term276418.getClass(), "implicitPrototype", null);
        setBooleanField(term276418, term276418.getClass(), "nativeType", false);
        setBooleanField(term276418, term276418.getClass(), "visited", false);
        setField(term276418, term276418.getClass(), "docInfo", null);
        setBooleanField(term276418, term276418.getClass(), "unknown", false);
        setBooleanField(term276418, term276418.getClass(), "resolved", false);
        setField(term276418, term276418.getClass(), "resolveResult", null);
        setField(term276418, term276418.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term275000;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term274446, args);
        assertTrue(recursiveEquals(term274446, term276414));
        assertTrue(recursiveEquals(term275000, term276418));
        assertTrue(recursiveEquals(retValue, true));
    }

};


