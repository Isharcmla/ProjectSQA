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

public class JSDocInfoBuilder_recordType_1891988247492 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term177006;
     Object term177304;
     Object term177378;
     Object term177381;

    public JSDocInfoBuilder_recordType_1891988247492() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term177006 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term177086 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term177210 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        setIntField(term177086, term177086.getClass(), "bitset", 536870912);
        setField(term177210, term177210.getClass(), "parameters", null);
        setField(term177210, term177210.getClass(), "baseType", null);
        setField(term177086, term177086.getClass(), "info", term177210);
        setField(term177086, term177086.getClass(), "thisType", null);
        setField(term177006, term177006.getClass(), "currentInfo", term177086);
        term177304 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        term177378 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term177379 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term177380 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        setField(term177380, term177380.getClass(), "baseType", null);
        setField(term177380, term177380.getClass(), "implementedInterfaces", null);
        setField(term177380, term177380.getClass(), "parameters", null);
        setField(term177380, term177380.getClass(), "thrownTypes", null);
        setField(term177380, term177380.getClass(), "templateTypeName", null);
        setField(term177380, term177380.getClass(), "description", null);
        setField(term177380, term177380.getClass(), "deprecated", null);
        setField(term177380, term177380.getClass(), "license", null);
        setField(term177380, term177380.getClass(), "suppressions", null);
        setField(term177379, term177379.getClass(), "info", term177380);
        setField(term177379, term177379.getClass(), "documentation", null);
        setField(term177379, term177379.getClass(), "sourceName", null);
        setField(term177379, term177379.getClass(), "visibility", null);
        setIntField(term177379, term177379.getClass(), "bitset", 536870912);
        setField(term177379, term177379.getClass(), "type", null);
        setField(term177379, term177379.getClass(), "thisType", null);
        setBooleanField(term177379, term177379.getClass(), "includeDocumentation", false);
        setField(term177378, term177378.getClass(), "currentInfo", term177379);
        setBooleanField(term177378, term177378.getClass(), "populated", false);
        setBooleanField(term177378, term177378.getClass(), "parseDocumentation", false);
        setField(term177378, term177378.getClass(), "currentMarker", null);
        term177381 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        setField(term177381, term177381.getClass(), "root", null);
        setField(term177381, term177381.getClass(), "sourceName", null);
        setField(term177381, term177381.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.JSDocInfoBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.JSTypeExpression");
        Object[] args = new Object[1];
        args[0] = term177304;
        Object retValue = callMethod(klass, "recordType", argTypes, term177006, args);
        assertTrue(recursiveEquals(term177006, term177378));
        assertTrue(recursiveEquals(term177304, term177381));
        assertTrue(recursiveEquals(retValue, false));
    }

};


