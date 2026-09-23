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

public class JSDocInfoBuilder_recordFileOverview_1110168625119 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term104292;
     Object term104585;

    public JSDocInfoBuilder_recordFileOverview_1110168625119() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term104292 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term104372 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setIntField(term104372, term104372.getClass(), "bitset", 0);
        setBooleanField(term104372, term104372.getClass(), "includeDocumentation", true);
        setField(term104292, term104292.getClass(), "currentInfo", term104372);
        term104585 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term104586 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term104587 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation"));
        setField(term104586, term104586.getClass(), "info", null);
        setField(term104587, term104587.getClass(), "markers", null);
        setField(term104587, term104587.getClass(), "parameters", null);
        setField(term104587, term104587.getClass(), "throwsDescriptions", null);
        setField(term104587, term104587.getClass(), "blockDescription", null);
        setField(term104587, term104587.getClass(), "fileOverview", null);
        setField(term104587, term104587.getClass(), "returnDescription", null);
        setField(term104587, term104587.getClass(), "version", null);
        setField(term104587, term104587.getClass(), "authors", null);
        setField(term104587, term104587.getClass(), "sees", null);
        setField(term104586, term104586.getClass(), "documentation", term104587);
        setField(term104586, term104586.getClass(), "sourceName", null);
        setField(term104586, term104586.getClass(), "visibility", null);
        setIntField(term104586, term104586.getClass(), "bitset", 4096);
        setField(term104586, term104586.getClass(), "type", null);
        setField(term104586, term104586.getClass(), "thisType", null);
        setBooleanField(term104586, term104586.getClass(), "includeDocumentation", true);
        setField(term104585, term104585.getClass(), "currentInfo", term104586);
        setBooleanField(term104585, term104585.getClass(), "populated", true);
        setBooleanField(term104585, term104585.getClass(), "parseDocumentation", false);
        setField(term104585, term104585.getClass(), "currentMarker", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.JSDocInfoBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "recordFileOverview", argTypes, term104292, args);
        assertTrue(recursiveEquals(term104292, term104585));
        assertTrue(recursiveEquals(retValue, true));
    }

};


