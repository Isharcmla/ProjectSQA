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
import java.lang.Object;

public class JSType_isSubtype_437021077392 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term93835;
     Object term93941;
     Object term94498;
     Object term94500;

    public JSType_isSubtype_437021077392() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term93835 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NumberType"));
        term93941 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ProxyObjectType"));
        Object term94029 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setBooleanField(term94029, term94029.getClass(), "unknown", false);
        setField(term93941, term93941.getClass(), "referencedType", term94029);
        term94498 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ProxyObjectType"));
        Object term94499 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setField(term94499, term94499.getClass(), "leastSupertypeVisitor", null);
        setField(term94499, term94499.getClass(), "greatestSubtypeVisitor", null);
        setField(term94499, term94499.getClass(), "call", null);
        setField(term94499, term94499.getClass(), "prototype", null);
        setField(term94499, term94499.getClass(), "kind", null);
        setField(term94499, term94499.getClass(), "typeOfThis", null);
        setField(term94499, term94499.getClass(), "source", null);
        setField(term94499, term94499.getClass(), "implementedInterfaces", null);
        setField(term94499, term94499.getClass(), "subTypes", null);
        setField(term94499, term94499.getClass(), "templateTypeName", null);
        setField(term94499, term94499.getClass(), "className", null);
        setField(term94499, term94499.getClass(), "properties", null);
        setField(term94499, term94499.getClass(), "implicitPrototype", null);
        setBooleanField(term94499, term94499.getClass(), "nativeType", false);
        setBooleanField(term94499, term94499.getClass(), "prettyPrint", false);
        setBooleanField(term94499, term94499.getClass(), "visited", false);
        setField(term94499, term94499.getClass(), "docInfo", null);
        setBooleanField(term94499, term94499.getClass(), "unknown", false);
        setBooleanField(term94499, term94499.getClass(), "resolved", false);
        setField(term94499, term94499.getClass(), "resolveResult", null);
        setField(term94499, term94499.getClass(), "registry", null);
        setField(term94498, term94498.getClass(), "referencedType", term94499);
        setBooleanField(term94498, term94498.getClass(), "visited", false);
        setField(term94498, term94498.getClass(), "docInfo", null);
        setBooleanField(term94498, term94498.getClass(), "unknown", false);
        setBooleanField(term94498, term94498.getClass(), "resolved", false);
        setField(term94498, term94498.getClass(), "resolveResult", null);
        setField(term94498, term94498.getClass(), "registry", null);
        term94500 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NumberType"));
        setBooleanField(term94500, term94500.getClass(), "resolved", false);
        setField(term94500, term94500.getClass(), "resolveResult", null);
        setField(term94500, term94500.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[2];
        args[0] = term93835;
        args[1] = term93941;
        Object retValue = callMethod(klass, "isSubtype", argTypes, null, args);
        assertTrue(recursiveEquals(term93835, term94498));
        assertTrue(recursiveEquals(term93941, term94500));
        assertTrue(recursiveEquals(retValue, false));
    }

};


