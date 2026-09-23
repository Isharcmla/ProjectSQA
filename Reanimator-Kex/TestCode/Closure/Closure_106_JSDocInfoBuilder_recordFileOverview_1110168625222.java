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

public class JSDocInfoBuilder_recordFileOverview_1110168625222 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term120056;
     Object term120301;

    public JSDocInfoBuilder_recordFileOverview_1110168625222() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term120056 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term120136 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term120278 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation"));
        setIntField(term120136, term120136.getClass(), "bitset", 0);
        setBooleanField(term120136, term120136.getClass(), "includeDocumentation", true);
        setField(term120136, term120136.getClass(), "documentation", term120278);
        setField(term120056, term120056.getClass(), "currentInfo", term120136);
        term120301 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term120302 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term120303 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation"));
        setField(term120302, term120302.getClass(), "info", null);
        setField(term120303, term120303.getClass(), "markers", null);
        setField(term120303, term120303.getClass(), "parameters", null);
        setField(term120303, term120303.getClass(), "throwsDescriptions", null);
        setField(term120303, term120303.getClass(), "blockDescription", null);
        setField(term120303, term120303.getClass(), "fileOverview", null);
        setField(term120303, term120303.getClass(), "returnDescription", null);
        setField(term120303, term120303.getClass(), "version", null);
        setField(term120303, term120303.getClass(), "authors", null);
        setField(term120303, term120303.getClass(), "sees", null);
        setField(term120302, term120302.getClass(), "documentation", term120303);
        setField(term120302, term120302.getClass(), "sourceName", null);
        setField(term120302, term120302.getClass(), "visibility", null);
        setIntField(term120302, term120302.getClass(), "bitset", 4096);
        setField(term120302, term120302.getClass(), "type", null);
        setField(term120302, term120302.getClass(), "thisType", null);
        setBooleanField(term120302, term120302.getClass(), "includeDocumentation", true);
        setField(term120301, term120301.getClass(), "currentInfo", term120302);
        setBooleanField(term120301, term120301.getClass(), "populated", true);
        setBooleanField(term120301, term120301.getClass(), "parseDocumentation", false);
        setField(term120301, term120301.getClass(), "currentMarker", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.JSDocInfoBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "recordFileOverview", argTypes, term120056, args);
        assertTrue(recursiveEquals(term120056, term120301));
        assertTrue(recursiveEquals(retValue, true));
    }

};


