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

public class JSDocInfoBuilder_recordTemplateTypeName_1654740281229 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term121486;
     Object term121769;

    public JSDocInfoBuilder_recordTemplateTypeName_1654740281229() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term121486 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term121566 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term121566, term121566.getClass(), "info", null);
        setField(term121486, term121486.getClass(), "currentInfo", term121566);
        term121769 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term121770 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term121771 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        setField(term121771, term121771.getClass(), "baseType", null);
        setField(term121771, term121771.getClass(), "implementedInterfaces", null);
        setField(term121771, term121771.getClass(), "parameters", null);
        setField(term121771, term121771.getClass(), "thrownTypes", null);
        setField(term121771, term121771.getClass(), "templateTypeName", null);
        setField(term121771, term121771.getClass(), "description", null);
        setField(term121771, term121771.getClass(), "deprecated", null);
        setField(term121771, term121771.getClass(), "license", null);
        setField(term121771, term121771.getClass(), "suppressions", null);
        setField(term121770, term121770.getClass(), "info", term121771);
        setField(term121770, term121770.getClass(), "documentation", null);
        setField(term121770, term121770.getClass(), "sourceName", null);
        setField(term121770, term121770.getClass(), "visibility", null);
        setIntField(term121770, term121770.getClass(), "bitset", 0);
        setField(term121770, term121770.getClass(), "type", null);
        setField(term121770, term121770.getClass(), "thisType", null);
        setBooleanField(term121770, term121770.getClass(), "includeDocumentation", false);
        setField(term121769, term121769.getClass(), "currentInfo", term121770);
        setBooleanField(term121769, term121769.getClass(), "populated", true);
        setBooleanField(term121769, term121769.getClass(), "parseDocumentation", false);
        setField(term121769, term121769.getClass(), "currentMarker", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.JSDocInfoBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "recordTemplateTypeName", argTypes, term121486, args);
        assertTrue(recursiveEquals(term121486, term121769));
        assertTrue(recursiveEquals(retValue, true));
    }

};


