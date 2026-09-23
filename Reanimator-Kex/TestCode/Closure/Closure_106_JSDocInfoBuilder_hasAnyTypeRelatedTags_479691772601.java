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

public class JSDocInfoBuilder_hasAnyTypeRelatedTags_479691772601 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term211494;
     Object term212434;

    public JSDocInfoBuilder_hasAnyTypeRelatedTags_479691772601() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term211746 = new HashMap();
        term211494 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term211574 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term211698 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        Object term211892 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        setIntField(term211574, term211574.getClass(), "bitset", 0);
        setField(term211698, term211698.getClass(), "parameters", term211746);
        setField(term211698, term211698.getClass(), "baseType", term211892);
        setField(term211574, term211574.getClass(), "info", term211698);
        setField(term211494, term211494.getClass(), "currentInfo", term211574);
        HashMap term212438 = new HashMap();
        term212434 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term212435 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term212436 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        Object term212437 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        setField(term212437, term212437.getClass(), "root", null);
        setField(term212437, term212437.getClass(), "sourceName", null);
        setField(term212437, term212437.getClass(), "registry", null);
        setField(term212436, term212436.getClass(), "baseType", term212437);
        setField(term212436, term212436.getClass(), "implementedInterfaces", null);
        setField(term212436, term212436.getClass(), "parameters", term212438);
        setField(term212436, term212436.getClass(), "thrownTypes", null);
        setField(term212436, term212436.getClass(), "templateTypeName", null);
        setField(term212436, term212436.getClass(), "description", null);
        setField(term212436, term212436.getClass(), "deprecated", null);
        setField(term212436, term212436.getClass(), "license", null);
        setField(term212436, term212436.getClass(), "suppressions", null);
        setField(term212435, term212435.getClass(), "info", term212436);
        setField(term212435, term212435.getClass(), "documentation", null);
        setField(term212435, term212435.getClass(), "sourceName", null);
        setField(term212435, term212435.getClass(), "visibility", null);
        setIntField(term212435, term212435.getClass(), "bitset", 0);
        setField(term212435, term212435.getClass(), "type", null);
        setField(term212435, term212435.getClass(), "thisType", null);
        setBooleanField(term212435, term212435.getClass(), "includeDocumentation", false);
        setField(term212434, term212434.getClass(), "currentInfo", term212435);
        setBooleanField(term212434, term212434.getClass(), "populated", false);
        setBooleanField(term212434, term212434.getClass(), "parseDocumentation", false);
        setField(term212434, term212434.getClass(), "currentMarker", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.JSDocInfoBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hasAnyTypeRelatedTags", argTypes, term211494, args);
        assertTrue(recursiveEquals(term211494, term212434));
        assertTrue(recursiveEquals(retValue, true));
    }

};


