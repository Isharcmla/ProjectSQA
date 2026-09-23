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

public class JSDocInfoBuilder_hasAnyTypeRelatedTags_479691772562 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term198478;
     Object term198868;

    public JSDocInfoBuilder_hasAnyTypeRelatedTags_479691772562() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term198730 = new HashMap();
        term198478 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term198558 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term198682 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        setIntField(term198558, term198558.getClass(), "bitset", 0);
        setField(term198682, term198682.getClass(), "parameters", term198730);
        setField(term198558, term198558.getClass(), "info", term198682);
        setField(term198478, term198478.getClass(), "currentInfo", term198558);
        HashMap term198871 = new HashMap();
        term198868 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term198869 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term198870 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        setField(term198870, term198870.getClass(), "baseType", null);
        setField(term198870, term198870.getClass(), "implementedInterfaces", null);
        setField(term198870, term198870.getClass(), "parameters", term198871);
        setField(term198870, term198870.getClass(), "thrownTypes", null);
        setField(term198870, term198870.getClass(), "templateTypeName", null);
        setField(term198870, term198870.getClass(), "description", null);
        setField(term198870, term198870.getClass(), "deprecated", null);
        setField(term198870, term198870.getClass(), "license", null);
        setField(term198870, term198870.getClass(), "suppressions", null);
        setField(term198869, term198869.getClass(), "info", term198870);
        setField(term198869, term198869.getClass(), "documentation", null);
        setField(term198869, term198869.getClass(), "sourceName", null);
        setField(term198869, term198869.getClass(), "visibility", null);
        setIntField(term198869, term198869.getClass(), "bitset", 0);
        setField(term198869, term198869.getClass(), "type", null);
        setField(term198869, term198869.getClass(), "thisType", null);
        setBooleanField(term198869, term198869.getClass(), "includeDocumentation", false);
        setField(term198868, term198868.getClass(), "currentInfo", term198869);
        setBooleanField(term198868, term198868.getClass(), "populated", false);
        setBooleanField(term198868, term198868.getClass(), "parseDocumentation", false);
        setField(term198868, term198868.getClass(), "currentMarker", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.JSDocInfoBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hasAnyTypeRelatedTags", argTypes, term198478, args);
        assertTrue(recursiveEquals(term198478, term198868));
        assertTrue(recursiveEquals(retValue, false));
    }

};


