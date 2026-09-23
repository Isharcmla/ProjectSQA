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

public class JSType_isSubtype_437021077581 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term161759;
     Object term161853;
     Object term161991;
     Object term161993;

    public JSType_isSubtype_437021077581() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term161759 = newInstance(Class.forName("com.google.javascript.rhino.jstype.AllType"));
        term161853 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        Object term161941 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setField(term161853, term161853.getClass(), "referencedType", term161941);
        term161991 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        Object term161992 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setField(term161991, term161991.getClass(), "reference", null);
        setField(term161991, term161991.getClass(), "sourceName", null);
        setIntField(term161991, term161991.getClass(), "lineno", 0);
        setIntField(term161991, term161991.getClass(), "charno", 0);
        setBooleanField(term161991, term161991.getClass(), "forgiving", false);
        setField(term161992, term161992.getClass(), "leastSupertypeVisitor", null);
        setField(term161992, term161992.getClass(), "greatestSubtypeVisitor", null);
        setField(term161992, term161992.getClass(), "call", null);
        setField(term161992, term161992.getClass(), "prototype", null);
        setField(term161992, term161992.getClass(), "kind", null);
        setField(term161992, term161992.getClass(), "typeOfThis", null);
        setField(term161992, term161992.getClass(), "source", null);
        setField(term161992, term161992.getClass(), "implementedInterfaces", null);
        setField(term161992, term161992.getClass(), "subTypes", null);
        setField(term161992, term161992.getClass(), "templateTypeName", null);
        setField(term161992, term161992.getClass(), "className", null);
        setField(term161992, term161992.getClass(), "properties", null);
        setField(term161992, term161992.getClass(), "implicitPrototype", null);
        setBooleanField(term161992, term161992.getClass(), "nativeType", false);
        setBooleanField(term161992, term161992.getClass(), "prettyPrint", false);
        setBooleanField(term161992, term161992.getClass(), "visited", false);
        setField(term161992, term161992.getClass(), "docInfo", null);
        setBooleanField(term161992, term161992.getClass(), "unknown", false);
        setBooleanField(term161992, term161992.getClass(), "resolved", false);
        setField(term161992, term161992.getClass(), "resolveResult", null);
        setField(term161992, term161992.getClass(), "registry", null);
        setField(term161991, term161991.getClass(), "referencedType", term161992);
        setBooleanField(term161991, term161991.getClass(), "visited", false);
        setField(term161991, term161991.getClass(), "docInfo", null);
        setBooleanField(term161991, term161991.getClass(), "unknown", false);
        setBooleanField(term161991, term161991.getClass(), "resolved", false);
        setField(term161991, term161991.getClass(), "resolveResult", null);
        setField(term161991, term161991.getClass(), "registry", null);
        term161993 = newInstance(Class.forName("com.google.javascript.rhino.jstype.AllType"));
        setBooleanField(term161993, term161993.getClass(), "resolved", false);
        setField(term161993, term161993.getClass(), "resolveResult", null);
        setField(term161993, term161993.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[2];
        args[0] = term161759;
        args[1] = term161853;
        Object retValue = callMethod(klass, "isSubtype", argTypes, null, args);
        assertTrue(recursiveEquals(term161759, term161991));
        assertTrue(recursiveEquals(term161853, term161993));
        assertTrue(recursiveEquals(retValue, false));
    }

};


