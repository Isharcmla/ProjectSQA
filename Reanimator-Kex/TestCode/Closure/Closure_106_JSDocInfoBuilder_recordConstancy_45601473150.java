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

public class JSDocInfoBuilder_recordConstancy_45601473150 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term108890;
     Object term109023;

    public JSDocInfoBuilder_recordConstancy_45601473150() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term108890 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term108970 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setIntField(term108970, term108970.getClass(), "bitset", 4);
        setField(term108890, term108890.getClass(), "currentInfo", term108970);
        term109023 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term109024 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term109024, term109024.getClass(), "info", null);
        setField(term109024, term109024.getClass(), "documentation", null);
        setField(term109024, term109024.getClass(), "sourceName", null);
        setField(term109024, term109024.getClass(), "visibility", null);
        setIntField(term109024, term109024.getClass(), "bitset", 4);
        setField(term109024, term109024.getClass(), "type", null);
        setField(term109024, term109024.getClass(), "thisType", null);
        setBooleanField(term109024, term109024.getClass(), "includeDocumentation", false);
        setField(term109023, term109023.getClass(), "currentInfo", term109024);
        setBooleanField(term109023, term109023.getClass(), "populated", false);
        setBooleanField(term109023, term109023.getClass(), "parseDocumentation", false);
        setField(term109023, term109023.getClass(), "currentMarker", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.JSDocInfoBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "recordConstancy", argTypes, term108890, args);
        assertTrue(recursiveEquals(term108890, term109023));
        assertTrue(recursiveEquals(retValue, false));
    }

};


