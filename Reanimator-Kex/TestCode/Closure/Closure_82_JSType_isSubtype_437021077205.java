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

public class JSType_isSubtype_437021077205 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28263;
     Object term28369;
     Object term28388;
     Object term28389;

    public JSType_isSubtype_437021077205() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28263 = newInstance(Class.forName("com.google.javascript.rhino.jstype.VoidType"));
        term28369 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumElementType"));
        setBooleanField(term28369, term28369.getClass(), "unknown", false);
        term28388 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumElementType"));
        setField(term28388, term28388.getClass(), "primitiveType", null);
        setField(term28388, term28388.getClass(), "primitiveObjectType", null);
        setField(term28388, term28388.getClass(), "name", null);
        setBooleanField(term28388, term28388.getClass(), "visited", false);
        setField(term28388, term28388.getClass(), "docInfo", null);
        setBooleanField(term28388, term28388.getClass(), "unknown", false);
        setBooleanField(term28388, term28388.getClass(), "resolved", false);
        setField(term28388, term28388.getClass(), "resolveResult", null);
        setField(term28388, term28388.getClass(), "registry", null);
        term28389 = newInstance(Class.forName("com.google.javascript.rhino.jstype.VoidType"));
        setBooleanField(term28389, term28389.getClass(), "resolved", false);
        setField(term28389, term28389.getClass(), "resolveResult", null);
        setField(term28389, term28389.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[2];
        args[0] = term28263;
        args[1] = term28369;
        Object retValue = callMethod(klass, "isSubtype", argTypes, null, args);
        assertTrue(recursiveEquals(term28263, term28388));
        assertTrue(recursiveEquals(term28369, term28389));
        assertTrue(recursiveEquals(retValue, false));
    }

};


