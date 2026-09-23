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

public class JSType_isSubtype_437021077455 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term117935;
     Object term118029;
     Object term118422;
     Object term118424;

    public JSType_isSubtype_437021077455() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term117935 = newInstance(Class.forName("com.google.javascript.rhino.jstype.AllType"));
        term118029 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        Object term118117 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setField(term118029, term118029.getClass(), "referencedType", term118117);
        term118422 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        Object term118423 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setField(term118422, term118422.getClass(), "reference", null);
        setField(term118422, term118422.getClass(), "sourceName", null);
        setIntField(term118422, term118422.getClass(), "lineno", 0);
        setIntField(term118422, term118422.getClass(), "charno", 0);
        setBooleanField(term118422, term118422.getClass(), "forgiving", false);
        setField(term118423, term118423.getClass(), "leastSupertypeVisitor", null);
        setField(term118423, term118423.getClass(), "greatestSubtypeVisitor", null);
        setField(term118423, term118423.getClass(), "call", null);
        setField(term118423, term118423.getClass(), "prototype", null);
        setField(term118423, term118423.getClass(), "kind", null);
        setField(term118423, term118423.getClass(), "typeOfThis", null);
        setField(term118423, term118423.getClass(), "source", null);
        setField(term118423, term118423.getClass(), "implementedInterfaces", null);
        setField(term118423, term118423.getClass(), "subTypes", null);
        setField(term118423, term118423.getClass(), "templateTypeName", null);
        setField(term118423, term118423.getClass(), "className", null);
        setField(term118423, term118423.getClass(), "properties", null);
        setField(term118423, term118423.getClass(), "implicitPrototype", null);
        setBooleanField(term118423, term118423.getClass(), "nativeType", false);
        setBooleanField(term118423, term118423.getClass(), "prettyPrint", false);
        setBooleanField(term118423, term118423.getClass(), "visited", false);
        setField(term118423, term118423.getClass(), "docInfo", null);
        setBooleanField(term118423, term118423.getClass(), "unknown", false);
        setBooleanField(term118423, term118423.getClass(), "resolved", false);
        setField(term118423, term118423.getClass(), "resolveResult", null);
        setField(term118423, term118423.getClass(), "registry", null);
        setField(term118422, term118422.getClass(), "referencedType", term118423);
        setBooleanField(term118422, term118422.getClass(), "visited", false);
        setField(term118422, term118422.getClass(), "docInfo", null);
        setBooleanField(term118422, term118422.getClass(), "unknown", false);
        setBooleanField(term118422, term118422.getClass(), "resolved", false);
        setField(term118422, term118422.getClass(), "resolveResult", null);
        setField(term118422, term118422.getClass(), "registry", null);
        term118424 = newInstance(Class.forName("com.google.javascript.rhino.jstype.AllType"));
        setBooleanField(term118424, term118424.getClass(), "resolved", false);
        setField(term118424, term118424.getClass(), "resolveResult", null);
        setField(term118424, term118424.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[2];
        args[0] = term117935;
        args[1] = term118029;
        Object retValue = callMethod(klass, "isSubtype", argTypes, null, args);
        assertTrue(recursiveEquals(term117935, term118422));
        assertTrue(recursiveEquals(term118029, term118424));
        assertTrue(recursiveEquals(retValue, false));
    }

};


