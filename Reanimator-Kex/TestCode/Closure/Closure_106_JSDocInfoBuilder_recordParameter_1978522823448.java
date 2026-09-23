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

public class JSDocInfoBuilder_recordParameter_1978522823448 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term167200;
     Object term167773;

    public JSDocInfoBuilder_recordParameter_1978522823448() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term167200 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term167280 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setIntField(term167280, term167280.getClass(), "bitset", 0);
        setField(term167280, term167280.getClass(), "info", null);
        setField(term167200, term167200.getClass(), "currentInfo", term167280);
        LinkedHashMap term167776 = new LinkedHashMap();
        term167773 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term167774 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term167775 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        setField(term167775, term167775.getClass(), "baseType", null);
        setField(term167775, term167775.getClass(), "implementedInterfaces", null);
        setField(term167775, term167775.getClass(), "parameters", term167776);
        setField(term167775, term167775.getClass(), "thrownTypes", null);
        setField(term167775, term167775.getClass(), "templateTypeName", null);
        setField(term167775, term167775.getClass(), "description", null);
        setField(term167775, term167775.getClass(), "deprecated", null);
        setField(term167775, term167775.getClass(), "license", null);
        setField(term167775, term167775.getClass(), "suppressions", null);
        setField(term167774, term167774.getClass(), "info", term167775);
        setField(term167774, term167774.getClass(), "documentation", null);
        setField(term167774, term167774.getClass(), "sourceName", null);
        setField(term167774, term167774.getClass(), "visibility", null);
        setIntField(term167774, term167774.getClass(), "bitset", 0);
        setField(term167774, term167774.getClass(), "type", null);
        setField(term167774, term167774.getClass(), "thisType", null);
        setBooleanField(term167774, term167774.getClass(), "includeDocumentation", false);
        setField(term167773, term167773.getClass(), "currentInfo", term167774);
        setBooleanField(term167773, term167773.getClass(), "populated", true);
        setBooleanField(term167773, term167773.getClass(), "parseDocumentation", false);
        setField(term167773, term167773.getClass(), "currentMarker", null);
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
        Object retValue = callMethod(klass, "recordParameter", argTypes, term167200, args);
        assertTrue(recursiveEquals(term167200, term167773));
        assertTrue(recursiveEquals(retValue, true));
    }

};


