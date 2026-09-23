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

public class JsonWriter_name_1833069287191 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term60327;
     Object term60636;
     Object term60627;

    public JsonWriter_name_1833069287191() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term60327 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        setField(term60327, term60327.getClass(), "deferredName", null);
        setIntField(term60327, term60327.getClass(), "stackSize", -1);
        term60636 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        setField(term60636, term60636.getClass(), "out", null);
        setField(term60636, term60636.getClass(), "stack", null);
        setIntField(term60636, term60636.getClass(), "stackSize", -1);
        setField(term60636, term60636.getClass(), "indent", null);
        setField(term60636, term60636.getClass(), "separator", null);
        setBooleanField(term60636, term60636.getClass(), "lenient", false);
        setBooleanField(term60636, term60636.getClass(), "htmlSafe", false);
        setField(term60636, term60636.getClass(), "deferredName", "");
        setBooleanField(term60636, term60636.getClass(), "serializeNulls", false);
        term60627 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        setField(term60627, term60627.getClass(), "out", null);
        setField(term60627, term60627.getClass(), "stack", null);
        setIntField(term60627, term60627.getClass(), "stackSize", -1);
        setField(term60627, term60627.getClass(), "indent", null);
        setField(term60627, term60627.getClass(), "separator", null);
        setBooleanField(term60627, term60627.getClass(), "lenient", false);
        setBooleanField(term60627, term60627.getClass(), "htmlSafe", false);
        setField(term60627, term60627.getClass(), "deferredName", "");
        setBooleanField(term60627, term60627.getClass(), "serializeNulls", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonWriter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "";
        Object retValue = callMethod(klass, "name", argTypes, term60327, args);
        assertTrue(recursiveEquals(term60327, term60636));
        assertTrue(recursiveEquals(retValue, term60627));
    }

};


