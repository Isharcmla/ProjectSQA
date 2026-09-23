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
import java.util.LinkedHashMap;

public class JSDocInfoBuilder_recordThrowDescription_2143574786166 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term111063;
     Object term111206;

    public JSDocInfoBuilder_recordThrowDescription_2143574786166() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term111063 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term111143 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setBooleanField(term111143, term111143.getClass(), "includeDocumentation", true);
        setField(term111063, term111063.getClass(), "currentInfo", term111143);
        LinkedHashMap term111209 = new LinkedHashMap();
        term111206 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term111207 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term111208 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation"));
        setField(term111207, term111207.getClass(), "info", null);
        setField(term111208, term111208.getClass(), "markers", null);
        setField(term111208, term111208.getClass(), "parameters", null);
        setField(term111208, term111208.getClass(), "throwsDescriptions", term111209);
        setField(term111208, term111208.getClass(), "blockDescription", null);
        setField(term111208, term111208.getClass(), "fileOverview", null);
        setField(term111208, term111208.getClass(), "returnDescription", null);
        setField(term111208, term111208.getClass(), "version", null);
        setField(term111208, term111208.getClass(), "authors", null);
        setField(term111208, term111208.getClass(), "sees", null);
        setField(term111207, term111207.getClass(), "documentation", term111208);
        setField(term111207, term111207.getClass(), "sourceName", null);
        setField(term111207, term111207.getClass(), "visibility", null);
        setIntField(term111207, term111207.getClass(), "bitset", 0);
        setField(term111207, term111207.getClass(), "type", null);
        setField(term111207, term111207.getClass(), "thisType", null);
        setBooleanField(term111207, term111207.getClass(), "includeDocumentation", true);
        setField(term111206, term111206.getClass(), "currentInfo", term111207);
        setBooleanField(term111206, term111206.getClass(), "populated", true);
        setBooleanField(term111206, term111206.getClass(), "parseDocumentation", false);
        setField(term111206, term111206.getClass(), "currentMarker", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.JSDocInfoBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.JSTypeExpression");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        Object retValue = callMethod(klass, "recordThrowDescription", argTypes, term111063, args);
        assertTrue(recursiveEquals(term111063, term111206));
        assertTrue(recursiveEquals(retValue, true));
    }

};


