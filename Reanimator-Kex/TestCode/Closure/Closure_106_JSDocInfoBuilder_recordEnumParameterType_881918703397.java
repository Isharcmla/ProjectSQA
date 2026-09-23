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

public class JSDocInfoBuilder_recordEnumParameterType_881918703397 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term155215;
     Object term155513;
     Object term155922;
     Object term155925;

    public JSDocInfoBuilder_recordEnumParameterType_881918703397() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term155215 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term155295 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term155419 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        setIntField(term155295, term155295.getClass(), "bitset", 1610612736);
        setField(term155419, term155419.getClass(), "parameters", null);
        setField(term155419, term155419.getClass(), "baseType", null);
        setField(term155295, term155295.getClass(), "info", term155419);
        setField(term155295, term155295.getClass(), "thisType", null);
        setField(term155215, term155215.getClass(), "currentInfo", term155295);
        term155513 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        term155922 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term155923 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term155924 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        setField(term155924, term155924.getClass(), "baseType", null);
        setField(term155924, term155924.getClass(), "implementedInterfaces", null);
        setField(term155924, term155924.getClass(), "parameters", null);
        setField(term155924, term155924.getClass(), "thrownTypes", null);
        setField(term155924, term155924.getClass(), "templateTypeName", null);
        setField(term155924, term155924.getClass(), "description", null);
        setField(term155924, term155924.getClass(), "deprecated", null);
        setField(term155924, term155924.getClass(), "license", null);
        setField(term155924, term155924.getClass(), "suppressions", null);
        setField(term155923, term155923.getClass(), "info", term155924);
        setField(term155923, term155923.getClass(), "documentation", null);
        setField(term155923, term155923.getClass(), "sourceName", null);
        setField(term155923, term155923.getClass(), "visibility", null);
        setIntField(term155923, term155923.getClass(), "bitset", 1610612736);
        setField(term155923, term155923.getClass(), "type", null);
        setField(term155923, term155923.getClass(), "thisType", null);
        setBooleanField(term155923, term155923.getClass(), "includeDocumentation", false);
        setField(term155922, term155922.getClass(), "currentInfo", term155923);
        setBooleanField(term155922, term155922.getClass(), "populated", false);
        setBooleanField(term155922, term155922.getClass(), "parseDocumentation", false);
        setField(term155922, term155922.getClass(), "currentMarker", null);
        term155925 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        setField(term155925, term155925.getClass(), "root", null);
        setField(term155925, term155925.getClass(), "sourceName", null);
        setField(term155925, term155925.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.JSDocInfoBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.JSTypeExpression");
        Object[] args = new Object[1];
        args[0] = term155513;
        Object retValue = callMethod(klass, "recordEnumParameterType", argTypes, term155215, args);
        assertTrue(recursiveEquals(term155215, term155922));
        assertTrue(recursiveEquals(term155513, term155925));
        assertTrue(recursiveEquals(retValue, false));
    }

};


