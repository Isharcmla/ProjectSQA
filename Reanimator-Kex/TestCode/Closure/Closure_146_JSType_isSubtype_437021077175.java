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

public class JSType_isSubtype_437021077175 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23049;
     Object term23147;
     Object term23437;
     Object term23438;

    public JSType_isSubtype_437021077175() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23049 = newInstance(Class.forName("com.google.javascript.rhino.jstype.AllType"));
        term23147 = newInstance(Class.forName("com.google.javascript.rhino.jstype.BooleanType"));
        term23437 = newInstance(Class.forName("com.google.javascript.rhino.jstype.BooleanType"));
        setBooleanField(term23437, term23437.getClass(), "resolved", false);
        setField(term23437, term23437.getClass(), "resolveResult", null);
        setField(term23437, term23437.getClass(), "registry", null);
        term23438 = newInstance(Class.forName("com.google.javascript.rhino.jstype.AllType"));
        setBooleanField(term23438, term23438.getClass(), "resolved", false);
        setField(term23438, term23438.getClass(), "resolveResult", null);
        setField(term23438, term23438.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[2];
        args[0] = term23049;
        args[1] = term23147;
        Object retValue = callMethod(klass, "isSubtype", argTypes, null, args);
        assertTrue(recursiveEquals(term23049, term23437));
        assertTrue(recursiveEquals(term23147, term23438));
        assertTrue(recursiveEquals(retValue, false));
    }

};


