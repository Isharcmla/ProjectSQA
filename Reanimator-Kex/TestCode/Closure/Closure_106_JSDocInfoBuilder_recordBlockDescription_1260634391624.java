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

public class JSDocInfoBuilder_recordBlockDescription_1260634391624 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term216779;
     Object term216880;

    public JSDocInfoBuilder_recordBlockDescription_1260634391624() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term216779 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term216859 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setBooleanField(term216779, term216779.getClass(), "parseDocumentation", false);
        setBooleanField(term216859, term216859.getClass(), "includeDocumentation", true);
        setField(term216779, term216779.getClass(), "currentInfo", term216859);
        term216880 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term216881 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term216882 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation"));
        setField(term216881, term216881.getClass(), "info", null);
        setField(term216882, term216882.getClass(), "markers", null);
        setField(term216882, term216882.getClass(), "parameters", null);
        setField(term216882, term216882.getClass(), "throwsDescriptions", null);
        setField(term216882, term216882.getClass(), "blockDescription", null);
        setField(term216882, term216882.getClass(), "fileOverview", null);
        setField(term216882, term216882.getClass(), "returnDescription", null);
        setField(term216882, term216882.getClass(), "version", null);
        setField(term216882, term216882.getClass(), "authors", null);
        setField(term216882, term216882.getClass(), "sees", null);
        setField(term216881, term216881.getClass(), "documentation", term216882);
        setField(term216881, term216881.getClass(), "sourceName", null);
        setField(term216881, term216881.getClass(), "visibility", null);
        setIntField(term216881, term216881.getClass(), "bitset", 0);
        setField(term216881, term216881.getClass(), "type", null);
        setField(term216881, term216881.getClass(), "thisType", null);
        setBooleanField(term216881, term216881.getClass(), "includeDocumentation", true);
        setField(term216880, term216880.getClass(), "currentInfo", term216881);
        setBooleanField(term216880, term216880.getClass(), "populated", false);
        setBooleanField(term216880, term216880.getClass(), "parseDocumentation", false);
        setField(term216880, term216880.getClass(), "currentMarker", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.JSDocInfoBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "recordBlockDescription", argTypes, term216779, args);
        assertTrue(recursiveEquals(term216779, term216880));
    }

};


