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

public class JSType_isSubtype_437021077549 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term150975;
     Object term151069;
     Object term151219;
     Object term151221;

    public JSType_isSubtype_437021077549() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term150975 = newInstance(Class.forName("com.google.javascript.rhino.jstype.AllType"));
        term151069 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        Object term151169 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(term151069, term151069.getClass(), "referencedType", term151169);
        term151219 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        Object term151220 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(term151219, term151219.getClass(), "reference", null);
        setField(term151219, term151219.getClass(), "sourceName", null);
        setIntField(term151219, term151219.getClass(), "lineno", 0);
        setIntField(term151219, term151219.getClass(), "charno", 0);
        setBooleanField(term151219, term151219.getClass(), "forgiving", false);
        setField(term151220, term151220.getClass(), "leastSupertypeVisitor", null);
        setField(term151220, term151220.getClass(), "greatestSubtypeVisitor", null);
        setField(term151220, term151220.getClass(), "call", null);
        setField(term151220, term151220.getClass(), "prototype", null);
        setField(term151220, term151220.getClass(), "kind", null);
        setField(term151220, term151220.getClass(), "typeOfThis", null);
        setField(term151220, term151220.getClass(), "source", null);
        setField(term151220, term151220.getClass(), "implementedInterfaces", null);
        setField(term151220, term151220.getClass(), "subTypes", null);
        setField(term151220, term151220.getClass(), "templateTypeName", null);
        setField(term151220, term151220.getClass(), "className", null);
        setField(term151220, term151220.getClass(), "properties", null);
        setField(term151220, term151220.getClass(), "implicitPrototype", null);
        setBooleanField(term151220, term151220.getClass(), "nativeType", false);
        setBooleanField(term151220, term151220.getClass(), "prettyPrint", false);
        setBooleanField(term151220, term151220.getClass(), "visited", false);
        setField(term151220, term151220.getClass(), "docInfo", null);
        setBooleanField(term151220, term151220.getClass(), "unknown", false);
        setBooleanField(term151220, term151220.getClass(), "resolved", false);
        setField(term151220, term151220.getClass(), "resolveResult", null);
        setField(term151220, term151220.getClass(), "registry", null);
        setField(term151219, term151219.getClass(), "referencedType", term151220);
        setBooleanField(term151219, term151219.getClass(), "visited", false);
        setField(term151219, term151219.getClass(), "docInfo", null);
        setBooleanField(term151219, term151219.getClass(), "unknown", false);
        setBooleanField(term151219, term151219.getClass(), "resolved", false);
        setField(term151219, term151219.getClass(), "resolveResult", null);
        setField(term151219, term151219.getClass(), "registry", null);
        term151221 = newInstance(Class.forName("com.google.javascript.rhino.jstype.AllType"));
        setBooleanField(term151221, term151221.getClass(), "resolved", false);
        setField(term151221, term151221.getClass(), "resolveResult", null);
        setField(term151221, term151221.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[2];
        args[0] = term150975;
        args[1] = term151069;
        Object retValue = callMethod(klass, "isSubtype", argTypes, null, args);
        assertTrue(recursiveEquals(term150975, term151219));
        assertTrue(recursiveEquals(term151069, term151221));
        assertTrue(recursiveEquals(retValue, false));
    }

};


