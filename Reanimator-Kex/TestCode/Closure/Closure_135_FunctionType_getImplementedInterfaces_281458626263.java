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

public class FunctionType_getImplementedInterfaces_281458626263 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term133499;
     Object term134112;

    public FunctionType_getImplementedInterfaces_281458626263() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term134118 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term134117 = ((Class) term134118).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term134117).setAccessible(true);
        Object enum256 = ((Field) term134117).get((Object) null);
        term133499 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term133765 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setField(term133499, term133499.getClass(), "kind", enum256);
        setField(term133499, term133499.getClass(), "prototype", term133765);
        Class<? extends Object> term134418 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term134417 = ((Class) term134418).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term134417).setAccessible(true);
        Object enum257 = ((Field) term134417).get((Object) null);
        term134112 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term134113 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setField(term134112, term134112.getClass(), "call", null);
        setField(term134113, term134113.getClass(), "ownerFunction", null);
        setField(term134113, term134113.getClass(), "className", null);
        setField(term134113, term134113.getClass(), "properties", null);
        setField(term134113, term134113.getClass(), "implicitPrototype", null);
        setBooleanField(term134113, term134113.getClass(), "nativeType", false);
        setBooleanField(term134113, term134113.getClass(), "visited", false);
        setField(term134113, term134113.getClass(), "docInfo", null);
        setBooleanField(term134113, term134113.getClass(), "unknown", false);
        setBooleanField(term134113, term134113.getClass(), "resolved", false);
        setField(term134113, term134113.getClass(), "resolveResult", null);
        setField(term134113, term134113.getClass(), "registry", null);
        setField(term134112, term134112.getClass(), "prototype", term134113);
        setField(term134112, term134112.getClass(), "kind", enum257);
        setField(term134112, term134112.getClass(), "typeOfThis", null);
        setField(term134112, term134112.getClass(), "source", null);
        setField(term134112, term134112.getClass(), "implementedInterfaces", null);
        setField(term134112, term134112.getClass(), "subTypes", null);
        setField(term134112, term134112.getClass(), "templateTypeName", null);
        setField(term134112, term134112.getClass(), "className", null);
        setField(term134112, term134112.getClass(), "properties", null);
        setField(term134112, term134112.getClass(), "implicitPrototype", null);
        setBooleanField(term134112, term134112.getClass(), "nativeType", false);
        setBooleanField(term134112, term134112.getClass(), "visited", false);
        setField(term134112, term134112.getClass(), "docInfo", null);
        setBooleanField(term134112, term134112.getClass(), "unknown", false);
        setBooleanField(term134112, term134112.getClass(), "resolved", false);
        setField(term134112, term134112.getClass(), "resolveResult", null);
        setField(term134112, term134112.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getImplementedInterfaces", argTypes, term133499, args);
        assertTrue(recursiveEquals(term133499, term134112));
        assertTrue(recursiveEquals(retValue, null));
    }

};


