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

public class JSDocInfoBuilder_recordTypedef_595478264330 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term139886;
     Object term140278;
     Object term140377;
     Object term140381;

    public JSDocInfoBuilder_recordTypedef_595478264330() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term139886 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term139966 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term140090 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        Object term140184 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        setIntField(term139966, term139966.getClass(), "bitset", 0);
        setField(term140090, term140090.getClass(), "parameters", null);
        setField(term140090, term140090.getClass(), "baseType", null);
        setField(term139966, term139966.getClass(), "info", term140090);
        setField(term139966, term139966.getClass(), "thisType", term140184);
        setField(term139886, term139886.getClass(), "currentInfo", term139966);
        term140278 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        term140377 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term140378 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term140379 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        Object term140380 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        setField(term140379, term140379.getClass(), "baseType", null);
        setField(term140379, term140379.getClass(), "implementedInterfaces", null);
        setField(term140379, term140379.getClass(), "parameters", null);
        setField(term140379, term140379.getClass(), "thrownTypes", null);
        setField(term140379, term140379.getClass(), "templateTypeName", null);
        setField(term140379, term140379.getClass(), "description", null);
        setField(term140379, term140379.getClass(), "deprecated", null);
        setField(term140379, term140379.getClass(), "license", null);
        setField(term140379, term140379.getClass(), "suppressions", null);
        setField(term140378, term140378.getClass(), "info", term140379);
        setField(term140378, term140378.getClass(), "documentation", null);
        setField(term140378, term140378.getClass(), "sourceName", null);
        setField(term140378, term140378.getClass(), "visibility", null);
        setIntField(term140378, term140378.getClass(), "bitset", 0);
        setField(term140378, term140378.getClass(), "type", null);
        setField(term140380, term140380.getClass(), "root", null);
        setField(term140380, term140380.getClass(), "sourceName", null);
        setField(term140380, term140380.getClass(), "registry", null);
        setField(term140378, term140378.getClass(), "thisType", term140380);
        setBooleanField(term140378, term140378.getClass(), "includeDocumentation", false);
        setField(term140377, term140377.getClass(), "currentInfo", term140378);
        setBooleanField(term140377, term140377.getClass(), "populated", false);
        setBooleanField(term140377, term140377.getClass(), "parseDocumentation", false);
        setField(term140377, term140377.getClass(), "currentMarker", null);
        term140381 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        setField(term140381, term140381.getClass(), "root", null);
        setField(term140381, term140381.getClass(), "sourceName", null);
        setField(term140381, term140381.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.JSDocInfoBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.JSTypeExpression");
        Object[] args = new Object[1];
        args[0] = term140278;
        Object retValue = callMethod(klass, "recordTypedef", argTypes, term139886, args);
        assertTrue(recursiveEquals(term139886, term140377));
        assertTrue(recursiveEquals(term140278, term140381));
        assertTrue(recursiveEquals(retValue, false));
    }

};


