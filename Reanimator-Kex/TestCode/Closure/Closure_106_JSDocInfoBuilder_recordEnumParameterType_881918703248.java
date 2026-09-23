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

public class JSDocInfoBuilder_recordEnumParameterType_881918703248 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term124557;
     Object term124731;

    public JSDocInfoBuilder_recordEnumParameterType_881918703248() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term124557 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term124637 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setIntField(term124637, term124637.getClass(), "bitset", -1610612736);
        setField(term124637, term124637.getClass(), "info", null);
        setField(term124637, term124637.getClass(), "thisType", null);
        setField(term124557, term124557.getClass(), "currentInfo", term124637);
        term124731 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.JSDocInfoBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.JSTypeExpression");
        Object[] args = new Object[1];
        args[0] = term124731;
        try {
            callMethod(klass, "recordEnumParameterType", argTypes, term124557, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


