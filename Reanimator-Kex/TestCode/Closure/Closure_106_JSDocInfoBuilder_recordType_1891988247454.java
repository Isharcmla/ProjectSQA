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
import java.util.HashMap;

public class JSDocInfoBuilder_recordType_1891988247454 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term168864;
     Object term169210;
     Object term169363;
     Object term169368;

    public JSDocInfoBuilder_recordType_1891988247454() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term169116 = new HashMap();
        term168864 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term168944 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term169068 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        setIntField(term168944, term168944.getClass(), "bitset", 0);
        setField(term169068, term169068.getClass(), "parameters", term169116);
        setField(term168944, term168944.getClass(), "info", term169068);
        setField(term168864, term168864.getClass(), "currentInfo", term168944);
        term169210 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        HashMap term169366 = new HashMap();
        term169363 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term169364 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term169365 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        Object term169367 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        setField(term169365, term169365.getClass(), "baseType", null);
        setField(term169365, term169365.getClass(), "implementedInterfaces", null);
        setField(term169365, term169365.getClass(), "parameters", term169366);
        setField(term169365, term169365.getClass(), "thrownTypes", null);
        setField(term169365, term169365.getClass(), "templateTypeName", null);
        setField(term169365, term169365.getClass(), "description", null);
        setField(term169365, term169365.getClass(), "deprecated", null);
        setField(term169365, term169365.getClass(), "license", null);
        setField(term169365, term169365.getClass(), "suppressions", null);
        setField(term169364, term169364.getClass(), "info", term169365);
        setField(term169364, term169364.getClass(), "documentation", null);
        setField(term169364, term169364.getClass(), "sourceName", null);
        setField(term169364, term169364.getClass(), "visibility", null);
        setIntField(term169364, term169364.getClass(), "bitset", 536870912);
        setField(term169367, term169367.getClass(), "root", null);
        setField(term169367, term169367.getClass(), "sourceName", null);
        setField(term169367, term169367.getClass(), "registry", null);
        setField(term169364, term169364.getClass(), "type", term169367);
        setField(term169364, term169364.getClass(), "thisType", null);
        setBooleanField(term169364, term169364.getClass(), "includeDocumentation", false);
        setField(term169363, term169363.getClass(), "currentInfo", term169364);
        setBooleanField(term169363, term169363.getClass(), "populated", true);
        setBooleanField(term169363, term169363.getClass(), "parseDocumentation", false);
        setField(term169363, term169363.getClass(), "currentMarker", null);
        term169368 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        setField(term169368, term169368.getClass(), "root", null);
        setField(term169368, term169368.getClass(), "sourceName", null);
        setField(term169368, term169368.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.JSDocInfoBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.JSTypeExpression");
        Object[] args = new Object[1];
        args[0] = term169210;
        Object retValue = callMethod(klass, "recordType", argTypes, term168864, args);
        assertTrue(recursiveEquals(term168864, term169363));
        assertTrue(recursiveEquals(term169210, term169368));
        assertTrue(recursiveEquals(retValue, true));
    }

};


