package com.fasterxml.jackson.core.json;

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
import static com.fasterxml.jackson.core.json.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.fasterxml.jackson.core.json.EqualityUtils.*;

public class JsonWriteContext_createRootContext_122648603222 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1081;

    public JsonWriteContext_createRootContext_122648603222() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1081 = newInstance(Class.forName("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(term1081, term1081.getClass(), "_parent", null);
        setField(term1081, term1081.getClass(), "_dups", null);
        setField(term1081, term1081.getClass(), "_child", null);
        setField(term1081, term1081.getClass(), "_currentName", null);
        setField(term1081, term1081.getClass(), "_currentValue", null);
        setBooleanField(term1081, term1081.getClass(), "_gotName", false);
        setIntField(term1081, term1081.getClass(), "_type", 0);
        setIntField(term1081, term1081.getClass(), "_index", -1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.core.json.JsonWriteContext");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "createRootContext", argTypes, null, args);
        assertTrue(recursiveEquals(retValue, term1081));
    }

};


