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

public class JSType_isSubtype_437021077314 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term62948;
     Object term63054;
     Object term63521;
     Object term63523;

    public JSType_isSubtype_437021077314() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term62948 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnknownType"));
        term63054 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ProxyObjectType"));
        Object term63142 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setBooleanField(term63142, term63142.getClass(), "unknown", false);
        setField(term63054, term63054.getClass(), "referencedType", term63142);
        term63521 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ProxyObjectType"));
        Object term63522 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setField(term63522, term63522.getClass(), "leastSupertypeVisitor", null);
        setField(term63522, term63522.getClass(), "greatestSubtypeVisitor", null);
        setField(term63522, term63522.getClass(), "call", null);
        setField(term63522, term63522.getClass(), "prototype", null);
        setField(term63522, term63522.getClass(), "kind", null);
        setField(term63522, term63522.getClass(), "typeOfThis", null);
        setField(term63522, term63522.getClass(), "source", null);
        setField(term63522, term63522.getClass(), "implementedInterfaces", null);
        setField(term63522, term63522.getClass(), "subTypes", null);
        setField(term63522, term63522.getClass(), "templateTypeName", null);
        setField(term63522, term63522.getClass(), "className", null);
        setField(term63522, term63522.getClass(), "properties", null);
        setField(term63522, term63522.getClass(), "implicitPrototype", null);
        setBooleanField(term63522, term63522.getClass(), "nativeType", false);
        setBooleanField(term63522, term63522.getClass(), "prettyPrint", false);
        setBooleanField(term63522, term63522.getClass(), "visited", false);
        setField(term63522, term63522.getClass(), "docInfo", null);
        setBooleanField(term63522, term63522.getClass(), "unknown", false);
        setBooleanField(term63522, term63522.getClass(), "resolved", false);
        setField(term63522, term63522.getClass(), "resolveResult", null);
        setField(term63522, term63522.getClass(), "registry", null);
        setField(term63521, term63521.getClass(), "referencedType", term63522);
        setBooleanField(term63521, term63521.getClass(), "visited", false);
        setField(term63521, term63521.getClass(), "docInfo", null);
        setBooleanField(term63521, term63521.getClass(), "unknown", false);
        setBooleanField(term63521, term63521.getClass(), "resolved", false);
        setField(term63521, term63521.getClass(), "resolveResult", null);
        setField(term63521, term63521.getClass(), "registry", null);
        term63523 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnknownType"));
        setBooleanField(term63523, term63523.getClass(), "isChecked", false);
        setBooleanField(term63523, term63523.getClass(), "visited", false);
        setField(term63523, term63523.getClass(), "docInfo", null);
        setBooleanField(term63523, term63523.getClass(), "unknown", false);
        setBooleanField(term63523, term63523.getClass(), "resolved", false);
        setField(term63523, term63523.getClass(), "resolveResult", null);
        setField(term63523, term63523.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[2];
        args[0] = term62948;
        args[1] = term63054;
        Object retValue = callMethod(klass, "isSubtype", argTypes, null, args);
        assertTrue(recursiveEquals(term62948, term63521));
        assertTrue(recursiveEquals(term63054, term63523));
        assertTrue(recursiveEquals(retValue, false));
    }

};


