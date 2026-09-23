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

public class JSDocInfoBuilder_recordParameter_1978522823419 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term160815;
     Object term161286;

    public JSDocInfoBuilder_recordParameter_1978522823419() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term160815 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term160895 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setIntField(term160895, term160895.getClass(), "bitset", 1610612736);
        setField(term160815, term160815.getClass(), "currentInfo", term160895);
        term161286 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term161287 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term161287, term161287.getClass(), "info", null);
        setField(term161287, term161287.getClass(), "documentation", null);
        setField(term161287, term161287.getClass(), "sourceName", null);
        setField(term161287, term161287.getClass(), "visibility", null);
        setIntField(term161287, term161287.getClass(), "bitset", 1610612736);
        setField(term161287, term161287.getClass(), "type", null);
        setField(term161287, term161287.getClass(), "thisType", null);
        setBooleanField(term161287, term161287.getClass(), "includeDocumentation", false);
        setField(term161286, term161286.getClass(), "currentInfo", term161287);
        setBooleanField(term161286, term161286.getClass(), "populated", false);
        setBooleanField(term161286, term161286.getClass(), "parseDocumentation", false);
        setField(term161286, term161286.getClass(), "currentMarker", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.JSDocInfoBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("com.google.javascript.rhino.JSTypeExpression");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        Object retValue = callMethod(klass, "recordParameter", argTypes, term160815, args);
        assertTrue(recursiveEquals(term160815, term161286));
        assertTrue(recursiveEquals(retValue, false));
    }

};


