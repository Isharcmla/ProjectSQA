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

public class JSDocInfoBuilder_recordDescription_191676556141 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term107373;
     Object term107831;

    public JSDocInfoBuilder_recordDescription_191676556141() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term107373 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term107453 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term107577 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        setField(term107577, term107577.getClass(), "description", null);
        setField(term107453, term107453.getClass(), "info", term107577);
        setField(term107373, term107373.getClass(), "currentInfo", term107453);
        term107831 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term107832 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term107833 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        setField(term107833, term107833.getClass(), "baseType", null);
        setField(term107833, term107833.getClass(), "implementedInterfaces", null);
        setField(term107833, term107833.getClass(), "parameters", null);
        setField(term107833, term107833.getClass(), "thrownTypes", null);
        setField(term107833, term107833.getClass(), "templateTypeName", null);
        setField(term107833, term107833.getClass(), "description", "");
        setField(term107833, term107833.getClass(), "deprecated", null);
        setField(term107833, term107833.getClass(), "license", null);
        setField(term107833, term107833.getClass(), "suppressions", null);
        setField(term107832, term107832.getClass(), "info", term107833);
        setField(term107832, term107832.getClass(), "documentation", null);
        setField(term107832, term107832.getClass(), "sourceName", null);
        setField(term107832, term107832.getClass(), "visibility", null);
        setIntField(term107832, term107832.getClass(), "bitset", 0);
        setField(term107832, term107832.getClass(), "type", null);
        setField(term107832, term107832.getClass(), "thisType", null);
        setBooleanField(term107832, term107832.getClass(), "includeDocumentation", false);
        setField(term107831, term107831.getClass(), "currentInfo", term107832);
        setBooleanField(term107831, term107831.getClass(), "populated", true);
        setBooleanField(term107831, term107831.getClass(), "parseDocumentation", false);
        setField(term107831, term107831.getClass(), "currentMarker", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.JSDocInfoBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "";
        Object retValue = callMethod(klass, "recordDescription", argTypes, term107373, args);
        assertTrue(recursiveEquals(term107373, term107831));
        assertTrue(recursiveEquals(retValue, true));
    }

};


