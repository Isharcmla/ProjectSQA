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

public class JSDocInfoBuilder_recordDefineType_1936429508376 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term150072;
     Object term150246;

    public JSDocInfoBuilder_recordDefineType_1936429508376() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term150072 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term150152 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setIntField(term150152, term150152.getClass(), "bitset", -1610612736);
        setField(term150152, term150152.getClass(), "info", null);
        setField(term150152, term150152.getClass(), "thisType", null);
        setField(term150072, term150072.getClass(), "currentInfo", term150152);
        term150246 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.JSDocInfoBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.JSTypeExpression");
        Object[] args = new Object[1];
        args[0] = term150246;
        try {
            callMethod(klass, "recordDefineType", argTypes, term150072, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


