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

public class JSDocInfoBuilder_hasAnyTypeRelatedTags_479691772596 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term210121;
     Object term210663;

    public JSDocInfoBuilder_hasAnyTypeRelatedTags_479691772596() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term210373 = new HashMap();
        term210121 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term210201 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term210325 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        setIntField(term210201, term210201.getClass(), "bitset", -2147483648);
        setField(term210325, term210325.getClass(), "parameters", term210373);
        setField(term210325, term210325.getClass(), "baseType", null);
        setField(term210201, term210201.getClass(), "info", term210325);
        setField(term210201, term210201.getClass(), "thisType", null);
        setField(term210121, term210121.getClass(), "currentInfo", term210201);
        HashMap term210666 = new HashMap();
        term210663 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term210664 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term210665 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        setField(term210665, term210665.getClass(), "baseType", null);
        setField(term210665, term210665.getClass(), "implementedInterfaces", null);
        setField(term210665, term210665.getClass(), "parameters", term210666);
        setField(term210665, term210665.getClass(), "thrownTypes", null);
        setField(term210665, term210665.getClass(), "templateTypeName", null);
        setField(term210665, term210665.getClass(), "description", null);
        setField(term210665, term210665.getClass(), "deprecated", null);
        setField(term210665, term210665.getClass(), "license", null);
        setField(term210665, term210665.getClass(), "suppressions", null);
        setField(term210664, term210664.getClass(), "info", term210665);
        setField(term210664, term210664.getClass(), "documentation", null);
        setField(term210664, term210664.getClass(), "sourceName", null);
        setField(term210664, term210664.getClass(), "visibility", null);
        setIntField(term210664, term210664.getClass(), "bitset", -2147483648);
        setField(term210664, term210664.getClass(), "type", null);
        setField(term210664, term210664.getClass(), "thisType", null);
        setBooleanField(term210664, term210664.getClass(), "includeDocumentation", false);
        setField(term210663, term210663.getClass(), "currentInfo", term210664);
        setBooleanField(term210663, term210663.getClass(), "populated", false);
        setBooleanField(term210663, term210663.getClass(), "parseDocumentation", false);
        setField(term210663, term210663.getClass(), "currentMarker", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.JSDocInfoBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hasAnyTypeRelatedTags", argTypes, term210121, args);
        assertTrue(recursiveEquals(term210121, term210663));
        assertTrue(recursiveEquals(retValue, true));
    }

};


