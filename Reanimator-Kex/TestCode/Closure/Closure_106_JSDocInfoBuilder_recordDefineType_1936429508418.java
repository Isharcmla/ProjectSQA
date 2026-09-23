package com.google.javascript.rhino;

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
import static com.google.javascript.rhino.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.javascript.rhino.EqualityUtils.*;
import java.lang.Object;

public class JSDocInfoBuilder_recordDefineType_1936429508418 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term160517;
     Object term160691;
     Object term161249;
     Object term161251;

    public JSDocInfoBuilder_recordDefineType_1936429508418() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term160517 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term160597 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setIntField(term160597, term160597.getClass(), "bitset", 4);
        setField(term160517, term160517.getClass(), "currentInfo", term160597);
        term160691 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        term161249 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term161250 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term161250, term161250.getClass(), "info", null);
        setField(term161250, term161250.getClass(), "documentation", null);
        setField(term161250, term161250.getClass(), "sourceName", null);
        setField(term161250, term161250.getClass(), "visibility", null);
        setIntField(term161250, term161250.getClass(), "bitset", 4);
        setField(term161250, term161250.getClass(), "type", null);
        setField(term161250, term161250.getClass(), "thisType", null);
        setBooleanField(term161250, term161250.getClass(), "includeDocumentation", false);
        setField(term161249, term161249.getClass(), "currentInfo", term161250);
        setBooleanField(term161249, term161249.getClass(), "populated", false);
        setBooleanField(term161249, term161249.getClass(), "parseDocumentation", false);
        setField(term161249, term161249.getClass(), "currentMarker", null);
        term161251 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        setField(term161251, term161251.getClass(), "root", null);
        setField(term161251, term161251.getClass(), "sourceName", null);
        setField(term161251, term161251.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.JSDocInfoBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.JSTypeExpression");
        Object[] args = new Object[1];
        args[0] = term160691;
        Object retValue = callMethod(klass, "recordDefineType", argTypes, term160517, args);
        assertTrue(recursiveEquals(term160517, term161249));
        assertTrue(recursiveEquals(term160691, term161251));
        assertTrue(recursiveEquals(retValue, false));
    }

};


