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

public class JsonWriter_jsonValue_1831286341251 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term110585;
     Object term110637;
     Object term110632;

    public JsonWriter_jsonValue_1831286341251() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term110585 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        setField(term110585, term110585.getClass(), "deferredName", "");
        term110637 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        setField(term110637, term110637.getClass(), "out", null);
        setField(term110637, term110637.getClass(), "stack", null);
        setIntField(term110637, term110637.getClass(), "stackSize", 0);
        setField(term110637, term110637.getClass(), "indent", null);
        setField(term110637, term110637.getClass(), "separator", null);
        setBooleanField(term110637, term110637.getClass(), "lenient", false);
        setBooleanField(term110637, term110637.getClass(), "htmlSafe", false);
        setField(term110637, term110637.getClass(), "deferredName", null);
        setBooleanField(term110637, term110637.getClass(), "serializeNulls", false);
        term110632 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        setField(term110632, term110632.getClass(), "out", null);
        setField(term110632, term110632.getClass(), "stack", null);
        setIntField(term110632, term110632.getClass(), "stackSize", 0);
        setField(term110632, term110632.getClass(), "indent", null);
        setField(term110632, term110632.getClass(), "separator", null);
        setBooleanField(term110632, term110632.getClass(), "lenient", false);
        setBooleanField(term110632, term110632.getClass(), "htmlSafe", false);
        setField(term110632, term110632.getClass(), "deferredName", null);
        setBooleanField(term110632, term110632.getClass(), "serializeNulls", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonWriter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "jsonValue", argTypes, term110585, args);
        assertTrue(recursiveEquals(term110585, term110637));
        assertTrue(recursiveEquals(retValue, term110632));
    }

};


