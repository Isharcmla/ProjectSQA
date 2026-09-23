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

public class JSDocInfoBuilder_recordBlockDescription_1260634391318 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term137244;
     Object term137554;

    public JSDocInfoBuilder_recordBlockDescription_1260634391318() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term137244 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term137324 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term137466 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation"));
        setBooleanField(term137244, term137244.getClass(), "parseDocumentation", true);
        setBooleanField(term137244, term137244.getClass(), "populated", false);
        setBooleanField(term137324, term137324.getClass(), "includeDocumentation", true);
        setField(term137466, term137466.getClass(), "blockDescription", null);
        setField(term137324, term137324.getClass(), "documentation", term137466);
        setField(term137244, term137244.getClass(), "currentInfo", term137324);
        term137554 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term137555 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term137556 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation"));
        setField(term137555, term137555.getClass(), "info", null);
        setField(term137556, term137556.getClass(), "markers", null);
        setField(term137556, term137556.getClass(), "parameters", null);
        setField(term137556, term137556.getClass(), "throwsDescriptions", null);
        setField(term137556, term137556.getClass(), "blockDescription", null);
        setField(term137556, term137556.getClass(), "fileOverview", null);
        setField(term137556, term137556.getClass(), "returnDescription", null);
        setField(term137556, term137556.getClass(), "version", null);
        setField(term137556, term137556.getClass(), "authors", null);
        setField(term137556, term137556.getClass(), "sees", null);
        setField(term137555, term137555.getClass(), "documentation", term137556);
        setField(term137555, term137555.getClass(), "sourceName", null);
        setField(term137555, term137555.getClass(), "visibility", null);
        setIntField(term137555, term137555.getClass(), "bitset", 0);
        setField(term137555, term137555.getClass(), "type", null);
        setField(term137555, term137555.getClass(), "thisType", null);
        setBooleanField(term137555, term137555.getClass(), "includeDocumentation", true);
        setField(term137554, term137554.getClass(), "currentInfo", term137555);
        setBooleanField(term137554, term137554.getClass(), "populated", true);
        setBooleanField(term137554, term137554.getClass(), "parseDocumentation", true);
        setField(term137554, term137554.getClass(), "currentMarker", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.JSDocInfoBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "recordBlockDescription", argTypes, term137244, args);
        assertTrue(recursiveEquals(term137244, term137554));
    }

};


