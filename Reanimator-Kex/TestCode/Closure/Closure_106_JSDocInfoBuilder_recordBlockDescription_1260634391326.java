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

public class JSDocInfoBuilder_recordBlockDescription_1260634391326 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term139255;
     Object term139351;

    public JSDocInfoBuilder_recordBlockDescription_1260634391326() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term139255 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term139335 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setBooleanField(term139255, term139255.getClass(), "parseDocumentation", true);
        setBooleanField(term139255, term139255.getClass(), "populated", false);
        setBooleanField(term139335, term139335.getClass(), "includeDocumentation", false);
        setField(term139255, term139255.getClass(), "currentInfo", term139335);
        term139351 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term139352 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term139352, term139352.getClass(), "info", null);
        setField(term139352, term139352.getClass(), "documentation", null);
        setField(term139352, term139352.getClass(), "sourceName", null);
        setField(term139352, term139352.getClass(), "visibility", null);
        setIntField(term139352, term139352.getClass(), "bitset", 0);
        setField(term139352, term139352.getClass(), "type", null);
        setField(term139352, term139352.getClass(), "thisType", null);
        setBooleanField(term139352, term139352.getClass(), "includeDocumentation", false);
        setField(term139351, term139351.getClass(), "currentInfo", term139352);
        setBooleanField(term139351, term139351.getClass(), "populated", true);
        setBooleanField(term139351, term139351.getClass(), "parseDocumentation", true);
        setField(term139351, term139351.getClass(), "currentMarker", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.JSDocInfoBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "recordBlockDescription", argTypes, term139255, args);
        assertTrue(recursiveEquals(term139255, term139351));
    }

};


