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

public class JSDocInfoBuilder_recordType_1891988247474 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term173558;
     Object term173950;
     Object term174020;
     Object term174024;

    public JSDocInfoBuilder_recordType_1891988247474() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term173558 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term173638 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term173762 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        Object term173856 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        setIntField(term173638, term173638.getClass(), "bitset", 0);
        setField(term173762, term173762.getClass(), "parameters", null);
        setField(term173762, term173762.getClass(), "baseType", null);
        setField(term173638, term173638.getClass(), "info", term173762);
        setField(term173638, term173638.getClass(), "thisType", term173856);
        setField(term173558, term173558.getClass(), "currentInfo", term173638);
        term173950 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        term174020 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term174021 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term174022 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        Object term174023 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        setField(term174022, term174022.getClass(), "baseType", null);
        setField(term174022, term174022.getClass(), "implementedInterfaces", null);
        setField(term174022, term174022.getClass(), "parameters", null);
        setField(term174022, term174022.getClass(), "thrownTypes", null);
        setField(term174022, term174022.getClass(), "templateTypeName", null);
        setField(term174022, term174022.getClass(), "description", null);
        setField(term174022, term174022.getClass(), "deprecated", null);
        setField(term174022, term174022.getClass(), "license", null);
        setField(term174022, term174022.getClass(), "suppressions", null);
        setField(term174021, term174021.getClass(), "info", term174022);
        setField(term174021, term174021.getClass(), "documentation", null);
        setField(term174021, term174021.getClass(), "sourceName", null);
        setField(term174021, term174021.getClass(), "visibility", null);
        setIntField(term174021, term174021.getClass(), "bitset", 0);
        setField(term174021, term174021.getClass(), "type", null);
        setField(term174023, term174023.getClass(), "root", null);
        setField(term174023, term174023.getClass(), "sourceName", null);
        setField(term174023, term174023.getClass(), "registry", null);
        setField(term174021, term174021.getClass(), "thisType", term174023);
        setBooleanField(term174021, term174021.getClass(), "includeDocumentation", false);
        setField(term174020, term174020.getClass(), "currentInfo", term174021);
        setBooleanField(term174020, term174020.getClass(), "populated", false);
        setBooleanField(term174020, term174020.getClass(), "parseDocumentation", false);
        setField(term174020, term174020.getClass(), "currentMarker", null);
        term174024 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        setField(term174024, term174024.getClass(), "root", null);
        setField(term174024, term174024.getClass(), "sourceName", null);
        setField(term174024, term174024.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.JSDocInfoBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.JSTypeExpression");
        Object[] args = new Object[1];
        args[0] = term173950;
        Object retValue = callMethod(klass, "recordType", argTypes, term173558, args);
        assertTrue(recursiveEquals(term173558, term174020));
        assertTrue(recursiveEquals(term173950, term174024));
        assertTrue(recursiveEquals(retValue, false));
    }

};


