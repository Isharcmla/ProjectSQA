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

public class JSDocInfoBuilder_recordParameterDescription_915937072124 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term104927;
     Object term105023;

    public JSDocInfoBuilder_recordParameterDescription_915937072124() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term104927 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term105007 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setBooleanField(term105007, term105007.getClass(), "includeDocumentation", false);
        setField(term104927, term104927.getClass(), "currentInfo", term105007);
        term105023 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term105024 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term105024, term105024.getClass(), "info", null);
        setField(term105024, term105024.getClass(), "documentation", null);
        setField(term105024, term105024.getClass(), "sourceName", null);
        setField(term105024, term105024.getClass(), "visibility", null);
        setIntField(term105024, term105024.getClass(), "bitset", 0);
        setField(term105024, term105024.getClass(), "type", null);
        setField(term105024, term105024.getClass(), "thisType", null);
        setBooleanField(term105024, term105024.getClass(), "includeDocumentation", false);
        setField(term105023, term105023.getClass(), "currentInfo", term105024);
        setBooleanField(term105023, term105023.getClass(), "populated", true);
        setBooleanField(term105023, term105023.getClass(), "parseDocumentation", false);
        setField(term105023, term105023.getClass(), "currentMarker", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.JSDocInfoBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        Object retValue = callMethod(klass, "recordParameterDescription", argTypes, term104927, args);
        assertTrue(recursiveEquals(term104927, term105023));
        assertTrue(recursiveEquals(retValue, true));
    }

};


