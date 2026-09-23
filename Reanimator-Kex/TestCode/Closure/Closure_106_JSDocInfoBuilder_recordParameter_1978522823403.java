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

public class JSDocInfoBuilder_recordParameter_1978522823403 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term157389;
     Object term157906;

    public JSDocInfoBuilder_recordParameter_1978522823403() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term157389 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term157469 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setIntField(term157469, term157469.getClass(), "bitset", -2147483648);
        setField(term157389, term157389.getClass(), "currentInfo", term157469);
        term157906 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term157907 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term157907, term157907.getClass(), "info", null);
        setField(term157907, term157907.getClass(), "documentation", null);
        setField(term157907, term157907.getClass(), "sourceName", null);
        setField(term157907, term157907.getClass(), "visibility", null);
        setIntField(term157907, term157907.getClass(), "bitset", -2147483648);
        setField(term157907, term157907.getClass(), "type", null);
        setField(term157907, term157907.getClass(), "thisType", null);
        setBooleanField(term157907, term157907.getClass(), "includeDocumentation", false);
        setField(term157906, term157906.getClass(), "currentInfo", term157907);
        setBooleanField(term157906, term157906.getClass(), "populated", false);
        setBooleanField(term157906, term157906.getClass(), "parseDocumentation", false);
        setField(term157906, term157906.getClass(), "currentMarker", null);
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
        Object retValue = callMethod(klass, "recordParameter", argTypes, term157389, args);
        assertTrue(recursiveEquals(term157389, term157906));
        assertTrue(recursiveEquals(retValue, false));
    }

};


