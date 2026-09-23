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

public class JSType_isSubtype_437021077593 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term165606;
     Object term165700;
     Object term165937;
     Object term165939;

    public JSType_isSubtype_437021077593() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term165606 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        term165700 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        Object term165818 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setField(term165700, term165700.getClass(), "referencedType", term165818);
        term165937 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        Object term165938 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setField(term165937, term165937.getClass(), "reference", null);
        setField(term165937, term165937.getClass(), "sourceName", null);
        setIntField(term165937, term165937.getClass(), "lineno", 0);
        setIntField(term165937, term165937.getClass(), "charno", 0);
        setBooleanField(term165937, term165937.getClass(), "forgiving", false);
        setField(term165938, term165938.getClass(), "ownerFunction", null);
        setField(term165938, term165938.getClass(), "className", null);
        setField(term165938, term165938.getClass(), "properties", null);
        setField(term165938, term165938.getClass(), "implicitPrototype", null);
        setBooleanField(term165938, term165938.getClass(), "nativeType", false);
        setBooleanField(term165938, term165938.getClass(), "prettyPrint", false);
        setBooleanField(term165938, term165938.getClass(), "visited", false);
        setField(term165938, term165938.getClass(), "docInfo", null);
        setBooleanField(term165938, term165938.getClass(), "unknown", false);
        setBooleanField(term165938, term165938.getClass(), "resolved", false);
        setField(term165938, term165938.getClass(), "resolveResult", null);
        setField(term165938, term165938.getClass(), "registry", null);
        setField(term165937, term165937.getClass(), "referencedType", term165938);
        setBooleanField(term165937, term165937.getClass(), "visited", false);
        setField(term165937, term165937.getClass(), "docInfo", null);
        setBooleanField(term165937, term165937.getClass(), "unknown", false);
        setBooleanField(term165937, term165937.getClass(), "resolved", false);
        setField(term165937, term165937.getClass(), "resolveResult", null);
        setField(term165937, term165937.getClass(), "registry", null);
        term165939 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setField(term165939, term165939.getClass(), "ownerFunction", null);
        setField(term165939, term165939.getClass(), "className", null);
        setField(term165939, term165939.getClass(), "properties", null);
        setField(term165939, term165939.getClass(), "implicitPrototype", null);
        setBooleanField(term165939, term165939.getClass(), "nativeType", false);
        setBooleanField(term165939, term165939.getClass(), "prettyPrint", false);
        setBooleanField(term165939, term165939.getClass(), "visited", false);
        setField(term165939, term165939.getClass(), "docInfo", null);
        setBooleanField(term165939, term165939.getClass(), "unknown", false);
        setBooleanField(term165939, term165939.getClass(), "resolved", false);
        setField(term165939, term165939.getClass(), "resolveResult", null);
        setField(term165939, term165939.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[2];
        args[0] = term165606;
        args[1] = term165700;
        Object retValue = callMethod(klass, "isSubtype", argTypes, null, args);
        assertTrue(recursiveEquals(term165606, term165937));
        assertTrue(recursiveEquals(term165700, term165939));
        assertTrue(recursiveEquals(retValue, false));
    }

};


