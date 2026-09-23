package com.google.gson.stream;

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
import static com.google.gson.stream.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.gson.stream.EqualityUtils.*;
import java.util.ArrayList;
import java.lang.Object;

public class JsonWriter_jsonValue_1831286341489 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term318754;
     Object term333178;
     Object term333167;

    public JsonWriter_jsonValue_1831286341489() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term318806 = new ArrayList();
        term318754 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeWriter"));
        setField(term318754, term318754.getClass(), "pendingName", null);
        setField(term318754, term318754.getClass(), "stack", term318806);
        ArrayList term333179 = new ArrayList();
        term333178 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeWriter"));
        Object term333181 = newInstance(Class.forName("com.google.gson.JsonNull"));
        setField(term333178, term333178.getClass(), "stack", term333179);
        setField(term333178, term333178.getClass(), "pendingName", null);
        setField(term333178, term333178.getClass(), "product", term333181);
        setField(term333178, term333178.getClass(), "out", null);
        setField(term333178, term333178.getClass(), "stack", null);
        setIntField(term333178, term333178.getClass(), "stackSize", 0);
        setField(term333178, term333178.getClass(), "indent", null);
        setField(term333178, term333178.getClass(), "separator", null);
        setBooleanField(term333178, term333178.getClass(), "lenient", false);
        setBooleanField(term333178, term333178.getClass(), "htmlSafe", false);
        setField(term333178, term333178.getClass(), "deferredName", null);
        setBooleanField(term333178, term333178.getClass(), "serializeNulls", false);
        ArrayList term333168 = new ArrayList();
        term333167 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeWriter"));
        Object term333172 = newInstance(Class.forName("com.google.gson.JsonNull"));
        setField(term333167, term333167.getClass(), "stack", term333168);
        setField(term333167, term333167.getClass(), "pendingName", null);
        setField(term333167, term333167.getClass(), "product", term333172);
        setField(term333167, term333167.getClass(), "out", null);
        setField(term333167, term333167.getClass(), "stack", null);
        setIntField(term333167, term333167.getClass(), "stackSize", 0);
        setField(term333167, term333167.getClass(), "indent", null);
        setField(term333167, term333167.getClass(), "separator", null);
        setBooleanField(term333167, term333167.getClass(), "lenient", false);
        setBooleanField(term333167, term333167.getClass(), "htmlSafe", false);
        setField(term333167, term333167.getClass(), "deferredName", null);
        setBooleanField(term333167, term333167.getClass(), "serializeNulls", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonWriter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "jsonValue", argTypes, term318754, args);
        assertTrue(recursiveEquals(term318754, term333178));
        assertTrue(recursiveEquals(retValue, term333167));
    }

};


