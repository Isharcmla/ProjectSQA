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

public class JSDocInfoBuilder_hasAnyTypeRelatedTags_479691772520 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term185272;
     Object term185674;

    public JSDocInfoBuilder_hasAnyTypeRelatedTags_479691772520() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term185272 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term185352 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term185476 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        setIntField(term185352, term185352.getClass(), "bitset", -2147483648);
        setField(term185476, term185476.getClass(), "parameters", null);
        setField(term185476, term185476.getClass(), "baseType", null);
        setField(term185352, term185352.getClass(), "info", term185476);
        setField(term185352, term185352.getClass(), "thisType", null);
        setField(term185272, term185272.getClass(), "currentInfo", term185352);
        term185674 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term185675 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term185676 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        setField(term185676, term185676.getClass(), "baseType", null);
        setField(term185676, term185676.getClass(), "implementedInterfaces", null);
        setField(term185676, term185676.getClass(), "parameters", null);
        setField(term185676, term185676.getClass(), "thrownTypes", null);
        setField(term185676, term185676.getClass(), "templateTypeName", null);
        setField(term185676, term185676.getClass(), "description", null);
        setField(term185676, term185676.getClass(), "deprecated", null);
        setField(term185676, term185676.getClass(), "license", null);
        setField(term185676, term185676.getClass(), "suppressions", null);
        setField(term185675, term185675.getClass(), "info", term185676);
        setField(term185675, term185675.getClass(), "documentation", null);
        setField(term185675, term185675.getClass(), "sourceName", null);
        setField(term185675, term185675.getClass(), "visibility", null);
        setIntField(term185675, term185675.getClass(), "bitset", -2147483648);
        setField(term185675, term185675.getClass(), "type", null);
        setField(term185675, term185675.getClass(), "thisType", null);
        setBooleanField(term185675, term185675.getClass(), "includeDocumentation", false);
        setField(term185674, term185674.getClass(), "currentInfo", term185675);
        setBooleanField(term185674, term185674.getClass(), "populated", false);
        setBooleanField(term185674, term185674.getClass(), "parseDocumentation", false);
        setField(term185674, term185674.getClass(), "currentMarker", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.JSDocInfoBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hasAnyTypeRelatedTags", argTypes, term185272, args);
        assertTrue(recursiveEquals(term185272, term185674));
        assertTrue(recursiveEquals(retValue, true));
    }

};


