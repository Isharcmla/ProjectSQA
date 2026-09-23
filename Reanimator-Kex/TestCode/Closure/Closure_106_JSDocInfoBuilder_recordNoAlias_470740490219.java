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

public class JSDocInfoBuilder_recordNoAlias_470740490219 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term119443;
     Object term119877;

    public JSDocInfoBuilder_recordNoAlias_470740490219() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term119443 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term119523 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setIntField(term119523, term119523.getClass(), "bitset", 0);
        setField(term119443, term119443.getClass(), "currentInfo", term119523);
        term119877 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term119878 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term119878, term119878.getClass(), "info", null);
        setField(term119878, term119878.getClass(), "documentation", null);
        setField(term119878, term119878.getClass(), "sourceName", null);
        setField(term119878, term119878.getClass(), "visibility", null);
        setIntField(term119878, term119878.getClass(), "bitset", 128);
        setField(term119878, term119878.getClass(), "type", null);
        setField(term119878, term119878.getClass(), "thisType", null);
        setBooleanField(term119878, term119878.getClass(), "includeDocumentation", false);
        setField(term119877, term119877.getClass(), "currentInfo", term119878);
        setBooleanField(term119877, term119877.getClass(), "populated", true);
        setBooleanField(term119877, term119877.getClass(), "parseDocumentation", false);
        setField(term119877, term119877.getClass(), "currentMarker", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.JSDocInfoBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "recordNoAlias", argTypes, term119443, args);
        assertTrue(recursiveEquals(term119443, term119877));
        assertTrue(recursiveEquals(retValue, true));
    }

};


