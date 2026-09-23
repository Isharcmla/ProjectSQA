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

public class JsonWriter_name_183306928750 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1357;

    public JsonWriter_name_183306928750() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1357 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        int[] term1358 = (int[]) newIntArray(0);
        setField(term1357, term1357.getClass(), "out", null);
        setField(term1357, term1357.getClass(), "stack", term1358);
        setIntField(term1357, term1357.getClass(), "stackSize", -481533957);
        setField(term1357, term1357.getClass(), "indent", "UiUYnPrcCi");
        setField(term1357, term1357.getClass(), "separator", "UoYtihxVaS");
        setBooleanField(term1357, term1357.getClass(), "lenient", false);
        setBooleanField(term1357, term1357.getClass(), "htmlSafe", true);
        setField(term1357, term1357.getClass(), "deferredName", "JDswTTCZHV");
        setBooleanField(term1357, term1357.getClass(), "serializeNulls", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonWriter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "onpbIeEKoi";
        try {
            callMethod(klass, "name", argTypes, term1357, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


