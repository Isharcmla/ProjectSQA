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

public class JSType_isSubtype_437021077633 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term179058;
     Object term179152;
     Object term179328;
     Object term179330;

    public JSType_isSubtype_437021077633() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term179058 = newInstance(Class.forName("com.google.javascript.rhino.jstype.StringType"));
        term179152 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        Object term179270 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setBooleanField(term179270, term179270.getClass(), "unknown", false);
        setField(term179152, term179152.getClass(), "referencedType", term179270);
        term179328 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        Object term179329 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setField(term179328, term179328.getClass(), "reference", null);
        setField(term179328, term179328.getClass(), "sourceName", null);
        setIntField(term179328, term179328.getClass(), "lineno", 0);
        setIntField(term179328, term179328.getClass(), "charno", 0);
        setBooleanField(term179328, term179328.getClass(), "forgiving", false);
        setField(term179329, term179329.getClass(), "ownerFunction", null);
        setField(term179329, term179329.getClass(), "className", null);
        setField(term179329, term179329.getClass(), "properties", null);
        setField(term179329, term179329.getClass(), "implicitPrototype", null);
        setBooleanField(term179329, term179329.getClass(), "nativeType", false);
        setBooleanField(term179329, term179329.getClass(), "prettyPrint", false);
        setBooleanField(term179329, term179329.getClass(), "visited", false);
        setField(term179329, term179329.getClass(), "docInfo", null);
        setBooleanField(term179329, term179329.getClass(), "unknown", false);
        setBooleanField(term179329, term179329.getClass(), "resolved", false);
        setField(term179329, term179329.getClass(), "resolveResult", null);
        setField(term179329, term179329.getClass(), "registry", null);
        setField(term179328, term179328.getClass(), "referencedType", term179329);
        setBooleanField(term179328, term179328.getClass(), "visited", false);
        setField(term179328, term179328.getClass(), "docInfo", null);
        setBooleanField(term179328, term179328.getClass(), "unknown", false);
        setBooleanField(term179328, term179328.getClass(), "resolved", false);
        setField(term179328, term179328.getClass(), "resolveResult", null);
        setField(term179328, term179328.getClass(), "registry", null);
        term179330 = newInstance(Class.forName("com.google.javascript.rhino.jstype.StringType"));
        setBooleanField(term179330, term179330.getClass(), "resolved", false);
        setField(term179330, term179330.getClass(), "resolveResult", null);
        setField(term179330, term179330.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[2];
        args[0] = term179058;
        args[1] = term179152;
        Object retValue = callMethod(klass, "isSubtype", argTypes, null, args);
        assertTrue(recursiveEquals(term179058, term179328));
        assertTrue(recursiveEquals(term179152, term179330));
        assertTrue(recursiveEquals(retValue, false));
    }

};


