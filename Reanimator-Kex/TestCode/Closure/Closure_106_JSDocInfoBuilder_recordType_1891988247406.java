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

public class JSDocInfoBuilder_recordType_1891988247406 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term158112;
     Object term158410;
     Object term158458;
     Object term158461;

    public JSDocInfoBuilder_recordType_1891988247406() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term158112 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term158192 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term158316 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        setIntField(term158192, term158192.getClass(), "bitset", 1073741824);
        setField(term158316, term158316.getClass(), "parameters", null);
        setField(term158192, term158192.getClass(), "info", term158316);
        setField(term158112, term158112.getClass(), "currentInfo", term158192);
        term158410 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        term158458 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term158459 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term158460 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        setField(term158460, term158460.getClass(), "baseType", null);
        setField(term158460, term158460.getClass(), "implementedInterfaces", null);
        setField(term158460, term158460.getClass(), "parameters", null);
        setField(term158460, term158460.getClass(), "thrownTypes", null);
        setField(term158460, term158460.getClass(), "templateTypeName", null);
        setField(term158460, term158460.getClass(), "description", null);
        setField(term158460, term158460.getClass(), "deprecated", null);
        setField(term158460, term158460.getClass(), "license", null);
        setField(term158460, term158460.getClass(), "suppressions", null);
        setField(term158459, term158459.getClass(), "info", term158460);
        setField(term158459, term158459.getClass(), "documentation", null);
        setField(term158459, term158459.getClass(), "sourceName", null);
        setField(term158459, term158459.getClass(), "visibility", null);
        setIntField(term158459, term158459.getClass(), "bitset", 1073741824);
        setField(term158459, term158459.getClass(), "type", null);
        setField(term158459, term158459.getClass(), "thisType", null);
        setBooleanField(term158459, term158459.getClass(), "includeDocumentation", false);
        setField(term158458, term158458.getClass(), "currentInfo", term158459);
        setBooleanField(term158458, term158458.getClass(), "populated", false);
        setBooleanField(term158458, term158458.getClass(), "parseDocumentation", false);
        setField(term158458, term158458.getClass(), "currentMarker", null);
        term158461 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        setField(term158461, term158461.getClass(), "root", null);
        setField(term158461, term158461.getClass(), "sourceName", null);
        setField(term158461, term158461.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.JSDocInfoBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.JSTypeExpression");
        Object[] args = new Object[1];
        args[0] = term158410;
        Object retValue = callMethod(klass, "recordType", argTypes, term158112, args);
        assertTrue(recursiveEquals(term158112, term158458));
        assertTrue(recursiveEquals(term158410, term158461));
        assertTrue(recursiveEquals(retValue, false));
    }

};


