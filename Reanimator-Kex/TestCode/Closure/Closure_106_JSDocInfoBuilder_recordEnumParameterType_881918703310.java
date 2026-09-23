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

public class JSDocInfoBuilder_recordEnumParameterType_881918703310 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term135864;
     Object term135870;

    public JSDocInfoBuilder_recordEnumParameterType_881918703310() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term135864 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        term135870 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        setField(term135870, term135870.getClass(), "currentInfo", null);
        setBooleanField(term135870, term135870.getClass(), "populated", false);
        setBooleanField(term135870, term135870.getClass(), "parseDocumentation", false);
        setField(term135870, term135870.getClass(), "currentMarker", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.JSDocInfoBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.JSTypeExpression");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "recordEnumParameterType", argTypes, term135864, args);
        assertTrue(recursiveEquals(term135864, term135870));
        assertTrue(recursiveEquals(retValue, false));
    }

};


