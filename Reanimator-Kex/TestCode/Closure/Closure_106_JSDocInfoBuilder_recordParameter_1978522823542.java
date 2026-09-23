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

public class JSDocInfoBuilder_recordParameter_1978522823542 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term192763;
     Object term193091;

    public JSDocInfoBuilder_recordParameter_1978522823542() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term193015 = new HashMap();
        term192763 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term192843 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term192967 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        setIntField(term192843, term192843.getClass(), "bitset", -1610612736);
        setField(term192967, term192967.getClass(), "parameters", term193015);
        setField(term192843, term192843.getClass(), "info", term192967);
        setField(term192763, term192763.getClass(), "currentInfo", term192843);
        HashMap term193094 = new HashMap();
        term193091 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term193092 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term193093 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        setField(term193093, term193093.getClass(), "baseType", null);
        setField(term193093, term193093.getClass(), "implementedInterfaces", null);
        setField(term193093, term193093.getClass(), "parameters", term193094);
        setField(term193093, term193093.getClass(), "thrownTypes", null);
        setField(term193093, term193093.getClass(), "templateTypeName", null);
        setField(term193093, term193093.getClass(), "description", null);
        setField(term193093, term193093.getClass(), "deprecated", null);
        setField(term193093, term193093.getClass(), "license", null);
        setField(term193093, term193093.getClass(), "suppressions", null);
        setField(term193092, term193092.getClass(), "info", term193093);
        setField(term193092, term193092.getClass(), "documentation", null);
        setField(term193092, term193092.getClass(), "sourceName", null);
        setField(term193092, term193092.getClass(), "visibility", null);
        setIntField(term193092, term193092.getClass(), "bitset", -1610612736);
        setField(term193092, term193092.getClass(), "type", null);
        setField(term193092, term193092.getClass(), "thisType", null);
        setBooleanField(term193092, term193092.getClass(), "includeDocumentation", false);
        setField(term193091, term193091.getClass(), "currentInfo", term193092);
        setBooleanField(term193091, term193091.getClass(), "populated", true);
        setBooleanField(term193091, term193091.getClass(), "parseDocumentation", false);
        setField(term193091, term193091.getClass(), "currentMarker", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.JSDocInfoBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("com.google.javascript.rhino.JSTypeExpression");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        Object retValue = callMethod(klass, "recordParameter", argTypes, term192763, args);
        assertTrue(recursiveEquals(term192763, term193091));
        assertTrue(recursiveEquals(retValue, true));
    }

};


