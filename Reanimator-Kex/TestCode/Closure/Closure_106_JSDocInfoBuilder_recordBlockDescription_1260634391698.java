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

public class JSDocInfoBuilder_recordBlockDescription_1260634391698 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term230747;
     Object term230989;

    public JSDocInfoBuilder_recordBlockDescription_1260634391698() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term230747 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term230827 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term230969 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation"));
        setBooleanField(term230747, term230747.getClass(), "parseDocumentation", false);
        setBooleanField(term230827, term230827.getClass(), "includeDocumentation", true);
        setField(term230827, term230827.getClass(), "documentation", term230969);
        setField(term230747, term230747.getClass(), "currentInfo", term230827);
        term230989 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term230990 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term230991 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation"));
        setField(term230990, term230990.getClass(), "info", null);
        setField(term230991, term230991.getClass(), "markers", null);
        setField(term230991, term230991.getClass(), "parameters", null);
        setField(term230991, term230991.getClass(), "throwsDescriptions", null);
        setField(term230991, term230991.getClass(), "blockDescription", null);
        setField(term230991, term230991.getClass(), "fileOverview", null);
        setField(term230991, term230991.getClass(), "returnDescription", null);
        setField(term230991, term230991.getClass(), "version", null);
        setField(term230991, term230991.getClass(), "authors", null);
        setField(term230991, term230991.getClass(), "sees", null);
        setField(term230990, term230990.getClass(), "documentation", term230991);
        setField(term230990, term230990.getClass(), "sourceName", null);
        setField(term230990, term230990.getClass(), "visibility", null);
        setIntField(term230990, term230990.getClass(), "bitset", 0);
        setField(term230990, term230990.getClass(), "type", null);
        setField(term230990, term230990.getClass(), "thisType", null);
        setBooleanField(term230990, term230990.getClass(), "includeDocumentation", true);
        setField(term230989, term230989.getClass(), "currentInfo", term230990);
        setBooleanField(term230989, term230989.getClass(), "populated", false);
        setBooleanField(term230989, term230989.getClass(), "parseDocumentation", false);
        setField(term230989, term230989.getClass(), "currentMarker", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.JSDocInfoBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "recordBlockDescription", argTypes, term230747, args);
        assertTrue(recursiveEquals(term230747, term230989));
    }

};


