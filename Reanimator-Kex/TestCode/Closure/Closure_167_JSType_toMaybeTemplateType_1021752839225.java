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

public class JSType_toMaybeTemplateType_1021752839225 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27941;
     Object term28197;

    public JSType_toMaybeTemplateType_1021752839225() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term27941 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NullType"));
        term28197 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NullType"));
        setBooleanField(term28197, term28197.getClass(), "resolved", false);
        setField(term28197, term28197.getClass(), "resolveResult", null);
        setBooleanField(term28197, term28197.getClass(), "inTemplatedCheckVisit", false);
        setField(term28197, term28197.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term27941;
        Object retValue = callMethod(klass, "toMaybeTemplateType", argTypes, null, args);
        assertTrue(recursiveEquals(term27941, term28197));
        assertTrue(recursiveEquals(retValue, null));
    }

};


