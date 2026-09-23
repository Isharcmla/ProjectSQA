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

public class JSDocInfoBuilder_hasAnyTypeRelatedTags_479691772496 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term177985;
     Object term178342;

    public JSDocInfoBuilder_hasAnyTypeRelatedTags_479691772496() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term177985 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term178065 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term178189 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        Object term178283 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        setIntField(term178065, term178065.getClass(), "bitset", 0);
        setField(term178189, term178189.getClass(), "parameters", null);
        setField(term178189, term178189.getClass(), "baseType", term178283);
        setField(term178065, term178065.getClass(), "info", term178189);
        setField(term177985, term177985.getClass(), "currentInfo", term178065);
        term178342 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term178343 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term178344 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        Object term178345 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        setField(term178345, term178345.getClass(), "root", null);
        setField(term178345, term178345.getClass(), "sourceName", null);
        setField(term178345, term178345.getClass(), "registry", null);
        setField(term178344, term178344.getClass(), "baseType", term178345);
        setField(term178344, term178344.getClass(), "implementedInterfaces", null);
        setField(term178344, term178344.getClass(), "parameters", null);
        setField(term178344, term178344.getClass(), "thrownTypes", null);
        setField(term178344, term178344.getClass(), "templateTypeName", null);
        setField(term178344, term178344.getClass(), "description", null);
        setField(term178344, term178344.getClass(), "deprecated", null);
        setField(term178344, term178344.getClass(), "license", null);
        setField(term178344, term178344.getClass(), "suppressions", null);
        setField(term178343, term178343.getClass(), "info", term178344);
        setField(term178343, term178343.getClass(), "documentation", null);
        setField(term178343, term178343.getClass(), "sourceName", null);
        setField(term178343, term178343.getClass(), "visibility", null);
        setIntField(term178343, term178343.getClass(), "bitset", 0);
        setField(term178343, term178343.getClass(), "type", null);
        setField(term178343, term178343.getClass(), "thisType", null);
        setBooleanField(term178343, term178343.getClass(), "includeDocumentation", false);
        setField(term178342, term178342.getClass(), "currentInfo", term178343);
        setBooleanField(term178342, term178342.getClass(), "populated", false);
        setBooleanField(term178342, term178342.getClass(), "parseDocumentation", false);
        setField(term178342, term178342.getClass(), "currentMarker", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.JSDocInfoBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hasAnyTypeRelatedTags", argTypes, term177985, args);
        assertTrue(recursiveEquals(term177985, term178342));
        assertTrue(recursiveEquals(retValue, true));
    }

};


