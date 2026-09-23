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

public class JSDocInfoBuilder_isDescriptionRecorded_703447246104 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term101920;
     Object term102139;

    public JSDocInfoBuilder_isDescriptionRecorded_703447246104() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term101920 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term102000 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term102124 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        setField(term102124, term102124.getClass(), "description", null);
        setField(term102000, term102000.getClass(), "info", term102124);
        setField(term101920, term101920.getClass(), "currentInfo", term102000);
        term102139 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term102140 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term102141 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        setField(term102141, term102141.getClass(), "baseType", null);
        setField(term102141, term102141.getClass(), "implementedInterfaces", null);
        setField(term102141, term102141.getClass(), "parameters", null);
        setField(term102141, term102141.getClass(), "thrownTypes", null);
        setField(term102141, term102141.getClass(), "templateTypeName", null);
        setField(term102141, term102141.getClass(), "description", null);
        setField(term102141, term102141.getClass(), "deprecated", null);
        setField(term102141, term102141.getClass(), "license", null);
        setField(term102141, term102141.getClass(), "suppressions", null);
        setField(term102140, term102140.getClass(), "info", term102141);
        setField(term102140, term102140.getClass(), "documentation", null);
        setField(term102140, term102140.getClass(), "sourceName", null);
        setField(term102140, term102140.getClass(), "visibility", null);
        setIntField(term102140, term102140.getClass(), "bitset", 0);
        setField(term102140, term102140.getClass(), "type", null);
        setField(term102140, term102140.getClass(), "thisType", null);
        setBooleanField(term102140, term102140.getClass(), "includeDocumentation", false);
        setField(term102139, term102139.getClass(), "currentInfo", term102140);
        setBooleanField(term102139, term102139.getClass(), "populated", false);
        setBooleanField(term102139, term102139.getClass(), "parseDocumentation", false);
        setField(term102139, term102139.getClass(), "currentMarker", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.JSDocInfoBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "isDescriptionRecorded", argTypes, term101920, args);
        assertTrue(recursiveEquals(term101920, term102139));
        assertTrue(recursiveEquals(retValue, false));
    }

};


