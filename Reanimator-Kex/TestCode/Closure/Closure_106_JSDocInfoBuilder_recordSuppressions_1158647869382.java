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

public class JSDocInfoBuilder_recordSuppressions_1158647869382 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term152326;
     Object term152547;

    public JSDocInfoBuilder_recordSuppressions_1158647869382() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term152326 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term152406 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term152530 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        setField(term152530, term152530.getClass(), "suppressions", null);
        setField(term152406, term152406.getClass(), "info", term152530);
        setField(term152326, term152326.getClass(), "currentInfo", term152406);
        term152547 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term152548 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term152549 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        setField(term152549, term152549.getClass(), "baseType", null);
        setField(term152549, term152549.getClass(), "implementedInterfaces", null);
        setField(term152549, term152549.getClass(), "parameters", null);
        setField(term152549, term152549.getClass(), "thrownTypes", null);
        setField(term152549, term152549.getClass(), "templateTypeName", null);
        setField(term152549, term152549.getClass(), "description", null);
        setField(term152549, term152549.getClass(), "deprecated", null);
        setField(term152549, term152549.getClass(), "license", null);
        setField(term152549, term152549.getClass(), "suppressions", null);
        setField(term152548, term152548.getClass(), "info", term152549);
        setField(term152548, term152548.getClass(), "documentation", null);
        setField(term152548, term152548.getClass(), "sourceName", null);
        setField(term152548, term152548.getClass(), "visibility", null);
        setIntField(term152548, term152548.getClass(), "bitset", 0);
        setField(term152548, term152548.getClass(), "type", null);
        setField(term152548, term152548.getClass(), "thisType", null);
        setBooleanField(term152548, term152548.getClass(), "includeDocumentation", false);
        setField(term152547, term152547.getClass(), "currentInfo", term152548);
        setBooleanField(term152547, term152547.getClass(), "populated", true);
        setBooleanField(term152547, term152547.getClass(), "parseDocumentation", false);
        setField(term152547, term152547.getClass(), "currentMarker", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.JSDocInfoBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Set");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "recordSuppressions", argTypes, term152326, args);
        assertTrue(recursiveEquals(term152326, term152547));
        assertTrue(recursiveEquals(retValue, true));
    }

};


