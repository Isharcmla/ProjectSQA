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

public class JSDocInfoBuilder_recordEnumParameterType_881918703408 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term158611;
     Object term159003;
     Object term159079;
     Object term159083;

    public JSDocInfoBuilder_recordEnumParameterType_881918703408() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term158611 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term158691 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term158815 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        Object term158909 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        setIntField(term158691, term158691.getClass(), "bitset", 0);
        setField(term158815, term158815.getClass(), "parameters", null);
        setField(term158815, term158815.getClass(), "baseType", null);
        setField(term158691, term158691.getClass(), "info", term158815);
        setField(term158691, term158691.getClass(), "thisType", term158909);
        setField(term158611, term158611.getClass(), "currentInfo", term158691);
        term159003 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        term159079 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term159080 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term159081 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        Object term159082 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        setField(term159081, term159081.getClass(), "baseType", null);
        setField(term159081, term159081.getClass(), "implementedInterfaces", null);
        setField(term159081, term159081.getClass(), "parameters", null);
        setField(term159081, term159081.getClass(), "thrownTypes", null);
        setField(term159081, term159081.getClass(), "templateTypeName", null);
        setField(term159081, term159081.getClass(), "description", null);
        setField(term159081, term159081.getClass(), "deprecated", null);
        setField(term159081, term159081.getClass(), "license", null);
        setField(term159081, term159081.getClass(), "suppressions", null);
        setField(term159080, term159080.getClass(), "info", term159081);
        setField(term159080, term159080.getClass(), "documentation", null);
        setField(term159080, term159080.getClass(), "sourceName", null);
        setField(term159080, term159080.getClass(), "visibility", null);
        setIntField(term159080, term159080.getClass(), "bitset", 0);
        setField(term159080, term159080.getClass(), "type", null);
        setField(term159082, term159082.getClass(), "root", null);
        setField(term159082, term159082.getClass(), "sourceName", null);
        setField(term159082, term159082.getClass(), "registry", null);
        setField(term159080, term159080.getClass(), "thisType", term159082);
        setBooleanField(term159080, term159080.getClass(), "includeDocumentation", false);
        setField(term159079, term159079.getClass(), "currentInfo", term159080);
        setBooleanField(term159079, term159079.getClass(), "populated", false);
        setBooleanField(term159079, term159079.getClass(), "parseDocumentation", false);
        setField(term159079, term159079.getClass(), "currentMarker", null);
        term159083 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        setField(term159083, term159083.getClass(), "root", null);
        setField(term159083, term159083.getClass(), "sourceName", null);
        setField(term159083, term159083.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.JSDocInfoBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.JSTypeExpression");
        Object[] args = new Object[1];
        args[0] = term159003;
        Object retValue = callMethod(klass, "recordEnumParameterType", argTypes, term158611, args);
        assertTrue(recursiveEquals(term158611, term159079));
        assertTrue(recursiveEquals(term159003, term159083));
        assertTrue(recursiveEquals(retValue, false));
    }

};


