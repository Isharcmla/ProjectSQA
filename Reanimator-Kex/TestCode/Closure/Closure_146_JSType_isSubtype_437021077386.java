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

public class JSType_isSubtype_437021077386 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term92238;
     Object term92332;
     Object term92912;
     Object term92914;

    public JSType_isSubtype_437021077386() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term92238 = newInstance(Class.forName("com.google.javascript.rhino.jstype.VoidType"));
        term92332 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        Object term92438 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumElementType"));
        setBooleanField(term92438, term92438.getClass(), "unknown", false);
        setField(term92332, term92332.getClass(), "referencedType", term92438);
        term92912 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        Object term92913 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumElementType"));
        setField(term92912, term92912.getClass(), "reference", null);
        setField(term92912, term92912.getClass(), "sourceName", null);
        setIntField(term92912, term92912.getClass(), "lineno", 0);
        setIntField(term92912, term92912.getClass(), "charno", 0);
        setBooleanField(term92912, term92912.getClass(), "forgiving", false);
        setField(term92913, term92913.getClass(), "primitiveType", null);
        setField(term92913, term92913.getClass(), "primitiveObjectType", null);
        setField(term92913, term92913.getClass(), "name", null);
        setBooleanField(term92913, term92913.getClass(), "visited", false);
        setField(term92913, term92913.getClass(), "docInfo", null);
        setBooleanField(term92913, term92913.getClass(), "unknown", false);
        setBooleanField(term92913, term92913.getClass(), "resolved", false);
        setField(term92913, term92913.getClass(), "resolveResult", null);
        setField(term92913, term92913.getClass(), "registry", null);
        setField(term92912, term92912.getClass(), "referencedType", term92913);
        setBooleanField(term92912, term92912.getClass(), "visited", false);
        setField(term92912, term92912.getClass(), "docInfo", null);
        setBooleanField(term92912, term92912.getClass(), "unknown", false);
        setBooleanField(term92912, term92912.getClass(), "resolved", false);
        setField(term92912, term92912.getClass(), "resolveResult", null);
        setField(term92912, term92912.getClass(), "registry", null);
        term92914 = newInstance(Class.forName("com.google.javascript.rhino.jstype.VoidType"));
        setBooleanField(term92914, term92914.getClass(), "resolved", false);
        setField(term92914, term92914.getClass(), "resolveResult", null);
        setField(term92914, term92914.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[2];
        args[0] = term92238;
        args[1] = term92332;
        Object retValue = callMethod(klass, "isSubtype", argTypes, null, args);
        assertTrue(recursiveEquals(term92238, term92912));
        assertTrue(recursiveEquals(term92332, term92914));
        assertTrue(recursiveEquals(retValue, false));
    }

};


