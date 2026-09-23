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

public class JSType_toMaybeTemplateType_1021752839209 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25829;
     Object term26235;

    public JSType_toMaybeTemplateType_1021752839209() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25829 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        term26235 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term26235, term26235.getClass(), "parameters", null);
        setField(term26235, term26235.getClass(), "returnType", null);
        setBooleanField(term26235, term26235.getClass(), "returnTypeInferred", false);
        setBooleanField(term26235, term26235.getClass(), "resolved", false);
        setField(term26235, term26235.getClass(), "resolveResult", null);
        setBooleanField(term26235, term26235.getClass(), "inTemplatedCheckVisit", false);
        setField(term26235, term26235.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term25829;
        Object retValue = callMethod(klass, "toMaybeTemplateType", argTypes, null, args);
        assertTrue(recursiveEquals(term25829, term26235));
        assertTrue(recursiveEquals(retValue, null));
    }

};


