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

public class JSDocInfoBuilder_recordEnumParameterType_881918703370 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term148624;
     Object term148922;
     Object term149041;
     Object term149044;

    public JSDocInfoBuilder_recordEnumParameterType_881918703370() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term148624 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term148704 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term148828 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        setIntField(term148704, term148704.getClass(), "bitset", 536870912);
        setField(term148828, term148828.getClass(), "parameters", null);
        setField(term148828, term148828.getClass(), "baseType", null);
        setField(term148704, term148704.getClass(), "info", term148828);
        setField(term148704, term148704.getClass(), "thisType", null);
        setField(term148624, term148624.getClass(), "currentInfo", term148704);
        term148922 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        term149041 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term149042 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term149043 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        setField(term149043, term149043.getClass(), "baseType", null);
        setField(term149043, term149043.getClass(), "implementedInterfaces", null);
        setField(term149043, term149043.getClass(), "parameters", null);
        setField(term149043, term149043.getClass(), "thrownTypes", null);
        setField(term149043, term149043.getClass(), "templateTypeName", null);
        setField(term149043, term149043.getClass(), "description", null);
        setField(term149043, term149043.getClass(), "deprecated", null);
        setField(term149043, term149043.getClass(), "license", null);
        setField(term149043, term149043.getClass(), "suppressions", null);
        setField(term149042, term149042.getClass(), "info", term149043);
        setField(term149042, term149042.getClass(), "documentation", null);
        setField(term149042, term149042.getClass(), "sourceName", null);
        setField(term149042, term149042.getClass(), "visibility", null);
        setIntField(term149042, term149042.getClass(), "bitset", 536870912);
        setField(term149042, term149042.getClass(), "type", null);
        setField(term149042, term149042.getClass(), "thisType", null);
        setBooleanField(term149042, term149042.getClass(), "includeDocumentation", false);
        setField(term149041, term149041.getClass(), "currentInfo", term149042);
        setBooleanField(term149041, term149041.getClass(), "populated", false);
        setBooleanField(term149041, term149041.getClass(), "parseDocumentation", false);
        setField(term149041, term149041.getClass(), "currentMarker", null);
        term149044 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        setField(term149044, term149044.getClass(), "root", null);
        setField(term149044, term149044.getClass(), "sourceName", null);
        setField(term149044, term149044.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.JSDocInfoBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.JSTypeExpression");
        Object[] args = new Object[1];
        args[0] = term148922;
        Object retValue = callMethod(klass, "recordEnumParameterType", argTypes, term148624, args);
        assertTrue(recursiveEquals(term148624, term149041));
        assertTrue(recursiveEquals(term148922, term149044));
        assertTrue(recursiveEquals(retValue, false));
    }

};


