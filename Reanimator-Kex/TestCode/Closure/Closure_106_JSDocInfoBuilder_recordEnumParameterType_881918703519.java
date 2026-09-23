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

public class JSDocInfoBuilder_recordEnumParameterType_881918703519 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term184220;
     Object term184618;
     Object term185590;
     Object term185594;

    public JSDocInfoBuilder_recordEnumParameterType_881918703519() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term184472 = new HashMap();
        term184220 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term184300 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term184424 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        setIntField(term184300, term184300.getClass(), "bitset", 536870912);
        setField(term184424, term184424.getClass(), "parameters", term184472);
        setField(term184424, term184424.getClass(), "baseType", null);
        setField(term184300, term184300.getClass(), "info", term184424);
        setField(term184300, term184300.getClass(), "thisType", null);
        setField(term184220, term184220.getClass(), "currentInfo", term184300);
        term184618 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        HashMap term185593 = new HashMap();
        term185590 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term185591 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term185592 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        setField(term185592, term185592.getClass(), "baseType", null);
        setField(term185592, term185592.getClass(), "implementedInterfaces", null);
        setField(term185592, term185592.getClass(), "parameters", term185593);
        setField(term185592, term185592.getClass(), "thrownTypes", null);
        setField(term185592, term185592.getClass(), "templateTypeName", null);
        setField(term185592, term185592.getClass(), "description", null);
        setField(term185592, term185592.getClass(), "deprecated", null);
        setField(term185592, term185592.getClass(), "license", null);
        setField(term185592, term185592.getClass(), "suppressions", null);
        setField(term185591, term185591.getClass(), "info", term185592);
        setField(term185591, term185591.getClass(), "documentation", null);
        setField(term185591, term185591.getClass(), "sourceName", null);
        setField(term185591, term185591.getClass(), "visibility", null);
        setIntField(term185591, term185591.getClass(), "bitset", 536870912);
        setField(term185591, term185591.getClass(), "type", null);
        setField(term185591, term185591.getClass(), "thisType", null);
        setBooleanField(term185591, term185591.getClass(), "includeDocumentation", false);
        setField(term185590, term185590.getClass(), "currentInfo", term185591);
        setBooleanField(term185590, term185590.getClass(), "populated", false);
        setBooleanField(term185590, term185590.getClass(), "parseDocumentation", false);
        setField(term185590, term185590.getClass(), "currentMarker", null);
        term185594 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        setField(term185594, term185594.getClass(), "root", null);
        setField(term185594, term185594.getClass(), "sourceName", null);
        setField(term185594, term185594.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.JSDocInfoBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.JSTypeExpression");
        Object[] args = new Object[1];
        args[0] = term184618;
        Object retValue = callMethod(klass, "recordEnumParameterType", argTypes, term184220, args);
        assertTrue(recursiveEquals(term184220, term185590));
        assertTrue(recursiveEquals(term184618, term185594));
        assertTrue(recursiveEquals(retValue, false));
    }

};


