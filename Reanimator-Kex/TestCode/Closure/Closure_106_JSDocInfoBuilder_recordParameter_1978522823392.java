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
import java.util.LinkedHashMap;

public class JSDocInfoBuilder_recordParameter_1978522823392 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term154484;
     Object term154753;

    public JSDocInfoBuilder_recordParameter_1978522823392() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term154484 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term154564 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term154688 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        setIntField(term154564, term154564.getClass(), "bitset", 1073741824);
        setField(term154564, term154564.getClass(), "info", term154688);
        setField(term154484, term154484.getClass(), "currentInfo", term154564);
        LinkedHashMap term154756 = new LinkedHashMap();
        term154753 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term154754 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term154755 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        setField(term154755, term154755.getClass(), "baseType", null);
        setField(term154755, term154755.getClass(), "implementedInterfaces", null);
        setField(term154755, term154755.getClass(), "parameters", term154756);
        setField(term154755, term154755.getClass(), "thrownTypes", null);
        setField(term154755, term154755.getClass(), "templateTypeName", null);
        setField(term154755, term154755.getClass(), "description", null);
        setField(term154755, term154755.getClass(), "deprecated", null);
        setField(term154755, term154755.getClass(), "license", null);
        setField(term154755, term154755.getClass(), "suppressions", null);
        setField(term154754, term154754.getClass(), "info", term154755);
        setField(term154754, term154754.getClass(), "documentation", null);
        setField(term154754, term154754.getClass(), "sourceName", null);
        setField(term154754, term154754.getClass(), "visibility", null);
        setIntField(term154754, term154754.getClass(), "bitset", 1073741824);
        setField(term154754, term154754.getClass(), "type", null);
        setField(term154754, term154754.getClass(), "thisType", null);
        setBooleanField(term154754, term154754.getClass(), "includeDocumentation", false);
        setField(term154753, term154753.getClass(), "currentInfo", term154754);
        setBooleanField(term154753, term154753.getClass(), "populated", true);
        setBooleanField(term154753, term154753.getClass(), "parseDocumentation", false);
        setField(term154753, term154753.getClass(), "currentMarker", null);
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
        Object retValue = callMethod(klass, "recordParameter", argTypes, term154484, args);
        assertTrue(recursiveEquals(term154484, term154753));
        assertTrue(recursiveEquals(retValue, true));
    }

};


