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

public class JSDocInfoBuilder_recordTypedef_595478264457 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term169508;
     Object term169806;
     Object term170094;
     Object term170097;

    public JSDocInfoBuilder_recordTypedef_595478264457() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term169508 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term169588 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term169712 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        setIntField(term169588, term169588.getClass(), "bitset", 1073741824);
        setField(term169712, term169712.getClass(), "parameters", null);
        setField(term169588, term169588.getClass(), "info", term169712);
        setField(term169508, term169508.getClass(), "currentInfo", term169588);
        term169806 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        term170094 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term170095 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term170096 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        setField(term170096, term170096.getClass(), "baseType", null);
        setField(term170096, term170096.getClass(), "implementedInterfaces", null);
        setField(term170096, term170096.getClass(), "parameters", null);
        setField(term170096, term170096.getClass(), "thrownTypes", null);
        setField(term170096, term170096.getClass(), "templateTypeName", null);
        setField(term170096, term170096.getClass(), "description", null);
        setField(term170096, term170096.getClass(), "deprecated", null);
        setField(term170096, term170096.getClass(), "license", null);
        setField(term170096, term170096.getClass(), "suppressions", null);
        setField(term170095, term170095.getClass(), "info", term170096);
        setField(term170095, term170095.getClass(), "documentation", null);
        setField(term170095, term170095.getClass(), "sourceName", null);
        setField(term170095, term170095.getClass(), "visibility", null);
        setIntField(term170095, term170095.getClass(), "bitset", 1073741824);
        setField(term170095, term170095.getClass(), "type", null);
        setField(term170095, term170095.getClass(), "thisType", null);
        setBooleanField(term170095, term170095.getClass(), "includeDocumentation", false);
        setField(term170094, term170094.getClass(), "currentInfo", term170095);
        setBooleanField(term170094, term170094.getClass(), "populated", false);
        setBooleanField(term170094, term170094.getClass(), "parseDocumentation", false);
        setField(term170094, term170094.getClass(), "currentMarker", null);
        term170097 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        setField(term170097, term170097.getClass(), "root", null);
        setField(term170097, term170097.getClass(), "sourceName", null);
        setField(term170097, term170097.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.JSDocInfoBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.JSTypeExpression");
        Object[] args = new Object[1];
        args[0] = term169806;
        Object retValue = callMethod(klass, "recordTypedef", argTypes, term169508, args);
        assertTrue(recursiveEquals(term169508, term170094));
        assertTrue(recursiveEquals(term169806, term170097));
        assertTrue(recursiveEquals(retValue, false));
    }

};


