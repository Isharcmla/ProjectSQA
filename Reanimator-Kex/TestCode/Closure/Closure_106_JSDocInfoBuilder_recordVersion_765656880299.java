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

public class JSDocInfoBuilder_recordVersion_765656880299 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term134146;
     Object term134668;

    public JSDocInfoBuilder_recordVersion_765656880299() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term134146 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term134226 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term134368 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation"));
        setBooleanField(term134226, term134226.getClass(), "includeDocumentation", true);
        setField(term134368, term134368.getClass(), "version", "");
        setField(term134226, term134226.getClass(), "documentation", term134368);
        setField(term134146, term134146.getClass(), "currentInfo", term134226);
        term134668 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term134669 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term134670 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation"));
        setField(term134669, term134669.getClass(), "info", null);
        setField(term134670, term134670.getClass(), "markers", null);
        setField(term134670, term134670.getClass(), "parameters", null);
        setField(term134670, term134670.getClass(), "throwsDescriptions", null);
        setField(term134670, term134670.getClass(), "blockDescription", null);
        setField(term134670, term134670.getClass(), "fileOverview", null);
        setField(term134670, term134670.getClass(), "returnDescription", null);
        setField(term134670, term134670.getClass(), "version", "");
        setField(term134670, term134670.getClass(), "authors", null);
        setField(term134670, term134670.getClass(), "sees", null);
        setField(term134669, term134669.getClass(), "documentation", term134670);
        setField(term134669, term134669.getClass(), "sourceName", null);
        setField(term134669, term134669.getClass(), "visibility", null);
        setIntField(term134669, term134669.getClass(), "bitset", 0);
        setField(term134669, term134669.getClass(), "type", null);
        setField(term134669, term134669.getClass(), "thisType", null);
        setBooleanField(term134669, term134669.getClass(), "includeDocumentation", true);
        setField(term134668, term134668.getClass(), "currentInfo", term134669);
        setBooleanField(term134668, term134668.getClass(), "populated", false);
        setBooleanField(term134668, term134668.getClass(), "parseDocumentation", false);
        setField(term134668, term134668.getClass(), "currentMarker", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.JSDocInfoBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "recordVersion", argTypes, term134146, args);
        assertTrue(recursiveEquals(term134146, term134668));
        assertTrue(recursiveEquals(retValue, false));
    }

};


