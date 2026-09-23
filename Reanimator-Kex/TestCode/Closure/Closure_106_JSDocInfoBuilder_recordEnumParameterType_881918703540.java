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

public class JSDocInfoBuilder_recordEnumParameterType_881918703540 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term191989;
     Object term192387;
     Object term192600;
     Object term192604;

    public JSDocInfoBuilder_recordEnumParameterType_881918703540() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term192241 = new HashMap();
        term191989 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term192069 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term192193 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        setIntField(term192069, term192069.getClass(), "bitset", 1610612736);
        setField(term192193, term192193.getClass(), "parameters", term192241);
        setField(term192193, term192193.getClass(), "baseType", null);
        setField(term192069, term192069.getClass(), "info", term192193);
        setField(term192069, term192069.getClass(), "thisType", null);
        setField(term191989, term191989.getClass(), "currentInfo", term192069);
        term192387 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        HashMap term192603 = new HashMap();
        term192600 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term192601 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term192602 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        setField(term192602, term192602.getClass(), "baseType", null);
        setField(term192602, term192602.getClass(), "implementedInterfaces", null);
        setField(term192602, term192602.getClass(), "parameters", term192603);
        setField(term192602, term192602.getClass(), "thrownTypes", null);
        setField(term192602, term192602.getClass(), "templateTypeName", null);
        setField(term192602, term192602.getClass(), "description", null);
        setField(term192602, term192602.getClass(), "deprecated", null);
        setField(term192602, term192602.getClass(), "license", null);
        setField(term192602, term192602.getClass(), "suppressions", null);
        setField(term192601, term192601.getClass(), "info", term192602);
        setField(term192601, term192601.getClass(), "documentation", null);
        setField(term192601, term192601.getClass(), "sourceName", null);
        setField(term192601, term192601.getClass(), "visibility", null);
        setIntField(term192601, term192601.getClass(), "bitset", 1610612736);
        setField(term192601, term192601.getClass(), "type", null);
        setField(term192601, term192601.getClass(), "thisType", null);
        setBooleanField(term192601, term192601.getClass(), "includeDocumentation", false);
        setField(term192600, term192600.getClass(), "currentInfo", term192601);
        setBooleanField(term192600, term192600.getClass(), "populated", false);
        setBooleanField(term192600, term192600.getClass(), "parseDocumentation", false);
        setField(term192600, term192600.getClass(), "currentMarker", null);
        term192604 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        setField(term192604, term192604.getClass(), "root", null);
        setField(term192604, term192604.getClass(), "sourceName", null);
        setField(term192604, term192604.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.JSDocInfoBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.JSTypeExpression");
        Object[] args = new Object[1];
        args[0] = term192387;
        Object retValue = callMethod(klass, "recordEnumParameterType", argTypes, term191989, args);
        assertTrue(recursiveEquals(term191989, term192600));
        assertTrue(recursiveEquals(term192387, term192604));
        assertTrue(recursiveEquals(retValue, false));
    }

};


