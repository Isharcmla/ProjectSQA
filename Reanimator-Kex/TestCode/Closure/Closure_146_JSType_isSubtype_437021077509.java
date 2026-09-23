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

public class JSType_isSubtype_437021077509 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term140162;
     Object term140256;
     Object term140398;
     Object term140400;

    public JSType_isSubtype_437021077509() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term140162 = newInstance(Class.forName("com.google.javascript.rhino.jstype.AllType"));
        term140256 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        Object term140348 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumType"));
        setField(term140256, term140256.getClass(), "referencedType", term140348);
        term140398 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        Object term140399 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumType"));
        setField(term140398, term140398.getClass(), "reference", null);
        setField(term140398, term140398.getClass(), "sourceName", null);
        setIntField(term140398, term140398.getClass(), "lineno", 0);
        setIntField(term140398, term140398.getClass(), "charno", 0);
        setBooleanField(term140398, term140398.getClass(), "forgiving", false);
        setField(term140399, term140399.getClass(), "elementsType", null);
        setField(term140399, term140399.getClass(), "elements", null);
        setField(term140399, term140399.getClass(), "className", null);
        setField(term140399, term140399.getClass(), "properties", null);
        setField(term140399, term140399.getClass(), "implicitPrototype", null);
        setBooleanField(term140399, term140399.getClass(), "nativeType", false);
        setBooleanField(term140399, term140399.getClass(), "prettyPrint", false);
        setBooleanField(term140399, term140399.getClass(), "visited", false);
        setField(term140399, term140399.getClass(), "docInfo", null);
        setBooleanField(term140399, term140399.getClass(), "unknown", false);
        setBooleanField(term140399, term140399.getClass(), "resolved", false);
        setField(term140399, term140399.getClass(), "resolveResult", null);
        setField(term140399, term140399.getClass(), "registry", null);
        setField(term140398, term140398.getClass(), "referencedType", term140399);
        setBooleanField(term140398, term140398.getClass(), "visited", false);
        setField(term140398, term140398.getClass(), "docInfo", null);
        setBooleanField(term140398, term140398.getClass(), "unknown", false);
        setBooleanField(term140398, term140398.getClass(), "resolved", false);
        setField(term140398, term140398.getClass(), "resolveResult", null);
        setField(term140398, term140398.getClass(), "registry", null);
        term140400 = newInstance(Class.forName("com.google.javascript.rhino.jstype.AllType"));
        setBooleanField(term140400, term140400.getClass(), "resolved", false);
        setField(term140400, term140400.getClass(), "resolveResult", null);
        setField(term140400, term140400.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[2];
        args[0] = term140162;
        args[1] = term140256;
        Object retValue = callMethod(klass, "isSubtype", argTypes, null, args);
        assertTrue(recursiveEquals(term140162, term140398));
        assertTrue(recursiveEquals(term140256, term140400));
        assertTrue(recursiveEquals(retValue, false));
    }

};


