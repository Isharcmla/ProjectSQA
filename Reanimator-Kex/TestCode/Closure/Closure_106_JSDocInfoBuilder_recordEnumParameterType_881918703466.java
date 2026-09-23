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

public class JSDocInfoBuilder_recordEnumParameterType_881918703466 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term171374;
     Object term171672;
     Object term171789;
     Object term171792;

    public JSDocInfoBuilder_recordEnumParameterType_881918703466() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term171374 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term171454 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term171578 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        setIntField(term171454, term171454.getClass(), "bitset", -2147483648);
        setField(term171578, term171578.getClass(), "parameters", null);
        setField(term171578, term171578.getClass(), "baseType", null);
        setField(term171454, term171454.getClass(), "info", term171578);
        setField(term171454, term171454.getClass(), "thisType", null);
        setField(term171374, term171374.getClass(), "currentInfo", term171454);
        term171672 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        term171789 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term171790 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term171791 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        setField(term171791, term171791.getClass(), "baseType", null);
        setField(term171791, term171791.getClass(), "implementedInterfaces", null);
        setField(term171791, term171791.getClass(), "parameters", null);
        setField(term171791, term171791.getClass(), "thrownTypes", null);
        setField(term171791, term171791.getClass(), "templateTypeName", null);
        setField(term171791, term171791.getClass(), "description", null);
        setField(term171791, term171791.getClass(), "deprecated", null);
        setField(term171791, term171791.getClass(), "license", null);
        setField(term171791, term171791.getClass(), "suppressions", null);
        setField(term171790, term171790.getClass(), "info", term171791);
        setField(term171790, term171790.getClass(), "documentation", null);
        setField(term171790, term171790.getClass(), "sourceName", null);
        setField(term171790, term171790.getClass(), "visibility", null);
        setIntField(term171790, term171790.getClass(), "bitset", -2147483648);
        setField(term171790, term171790.getClass(), "type", null);
        setField(term171790, term171790.getClass(), "thisType", null);
        setBooleanField(term171790, term171790.getClass(), "includeDocumentation", false);
        setField(term171789, term171789.getClass(), "currentInfo", term171790);
        setBooleanField(term171789, term171789.getClass(), "populated", false);
        setBooleanField(term171789, term171789.getClass(), "parseDocumentation", false);
        setField(term171789, term171789.getClass(), "currentMarker", null);
        term171792 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        setField(term171792, term171792.getClass(), "root", null);
        setField(term171792, term171792.getClass(), "sourceName", null);
        setField(term171792, term171792.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.JSDocInfoBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.JSTypeExpression");
        Object[] args = new Object[1];
        args[0] = term171672;
        Object retValue = callMethod(klass, "recordEnumParameterType", argTypes, term171374, args);
        assertTrue(recursiveEquals(term171374, term171789));
        assertTrue(recursiveEquals(term171672, term171792));
        assertTrue(recursiveEquals(retValue, false));
    }

};


