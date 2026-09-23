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

public class JSDocInfoBuilder_hasAnyTypeRelatedTags_479691772436 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term165158;
     Object term165450;

    public JSDocInfoBuilder_hasAnyTypeRelatedTags_479691772436() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term165158 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term165238 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term165362 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        setIntField(term165238, term165238.getClass(), "bitset", 0);
        setField(term165238, term165238.getClass(), "info", term165362);
        setField(term165158, term165158.getClass(), "currentInfo", term165238);
        term165450 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term165451 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term165452 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        setField(term165452, term165452.getClass(), "baseType", null);
        setField(term165452, term165452.getClass(), "implementedInterfaces", null);
        setField(term165452, term165452.getClass(), "parameters", null);
        setField(term165452, term165452.getClass(), "thrownTypes", null);
        setField(term165452, term165452.getClass(), "templateTypeName", null);
        setField(term165452, term165452.getClass(), "description", null);
        setField(term165452, term165452.getClass(), "deprecated", null);
        setField(term165452, term165452.getClass(), "license", null);
        setField(term165452, term165452.getClass(), "suppressions", null);
        setField(term165451, term165451.getClass(), "info", term165452);
        setField(term165451, term165451.getClass(), "documentation", null);
        setField(term165451, term165451.getClass(), "sourceName", null);
        setField(term165451, term165451.getClass(), "visibility", null);
        setIntField(term165451, term165451.getClass(), "bitset", 0);
        setField(term165451, term165451.getClass(), "type", null);
        setField(term165451, term165451.getClass(), "thisType", null);
        setBooleanField(term165451, term165451.getClass(), "includeDocumentation", false);
        setField(term165450, term165450.getClass(), "currentInfo", term165451);
        setBooleanField(term165450, term165450.getClass(), "populated", false);
        setBooleanField(term165450, term165450.getClass(), "parseDocumentation", false);
        setField(term165450, term165450.getClass(), "currentMarker", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.JSDocInfoBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hasAnyTypeRelatedTags", argTypes, term165158, args);
        assertTrue(recursiveEquals(term165158, term165450));
        assertTrue(recursiveEquals(retValue, false));
    }

};


