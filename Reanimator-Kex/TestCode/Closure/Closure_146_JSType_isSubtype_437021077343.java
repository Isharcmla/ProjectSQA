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

public class JSType_isSubtype_437021077343 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term71686;
     Object term71792;
     Object term71939;
     Object term71941;

    public JSType_isSubtype_437021077343() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term71686 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NullType"));
        term71792 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ProxyObjectType"));
        Object term71898 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumElementType"));
        setBooleanField(term71898, term71898.getClass(), "unknown", false);
        setField(term71792, term71792.getClass(), "referencedType", term71898);
        term71939 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ProxyObjectType"));
        Object term71940 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumElementType"));
        setField(term71940, term71940.getClass(), "primitiveType", null);
        setField(term71940, term71940.getClass(), "primitiveObjectType", null);
        setField(term71940, term71940.getClass(), "name", null);
        setBooleanField(term71940, term71940.getClass(), "visited", false);
        setField(term71940, term71940.getClass(), "docInfo", null);
        setBooleanField(term71940, term71940.getClass(), "unknown", false);
        setBooleanField(term71940, term71940.getClass(), "resolved", false);
        setField(term71940, term71940.getClass(), "resolveResult", null);
        setField(term71940, term71940.getClass(), "registry", null);
        setField(term71939, term71939.getClass(), "referencedType", term71940);
        setBooleanField(term71939, term71939.getClass(), "visited", false);
        setField(term71939, term71939.getClass(), "docInfo", null);
        setBooleanField(term71939, term71939.getClass(), "unknown", false);
        setBooleanField(term71939, term71939.getClass(), "resolved", false);
        setField(term71939, term71939.getClass(), "resolveResult", null);
        setField(term71939, term71939.getClass(), "registry", null);
        term71941 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NullType"));
        setBooleanField(term71941, term71941.getClass(), "resolved", false);
        setField(term71941, term71941.getClass(), "resolveResult", null);
        setField(term71941, term71941.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[2];
        args[0] = term71686;
        args[1] = term71792;
        Object retValue = callMethod(klass, "isSubtype", argTypes, null, args);
        assertTrue(recursiveEquals(term71686, term71939));
        assertTrue(recursiveEquals(term71792, term71941));
        assertTrue(recursiveEquals(retValue, false));
    }

};


