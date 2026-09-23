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
import java.lang.Object;
import java.util.HashMap;

public class JSDocInfoBuilder_recordEnumParameterType_881918703528 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term187690;
     Object term188088;

    public JSDocInfoBuilder_recordEnumParameterType_881918703528() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term187942 = new HashMap();
        term187690 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term187770 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term187894 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        setIntField(term187770, term187770.getClass(), "bitset", -1073741824);
        setField(term187894, term187894.getClass(), "parameters", term187942);
        setField(term187894, term187894.getClass(), "baseType", null);
        setField(term187770, term187770.getClass(), "info", term187894);
        setField(term187770, term187770.getClass(), "thisType", null);
        setField(term187690, term187690.getClass(), "currentInfo", term187770);
        term188088 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.JSDocInfoBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.JSTypeExpression");
        Object[] args = new Object[1];
        args[0] = term188088;
        try {
            callMethod(klass, "recordEnumParameterType", argTypes, term187690, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


