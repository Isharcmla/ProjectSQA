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

public class JSType_isEquivalent_1737835225156 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20162;
     Object term20501;

    public JSType_isEquivalent_1737835225156() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20162 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnionType"));
        term20501 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnionType"));
        setField(term20501, term20501.getClass(), "alternates", null);
        setIntField(term20501, term20501.getClass(), "hashcode", 0);
        setBooleanField(term20501, term20501.getClass(), "resolved", false);
        setField(term20501, term20501.getClass(), "resolveResult", null);
        setField(term20501, term20501.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term20162;
        Object retValue = callMethod(klass, "isEquivalent", argTypes, null, args);
        assertTrue(recursiveEquals(term20162, term20501));
        assertTrue(recursiveEquals(retValue, false));
    }

};


