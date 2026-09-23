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
import java.lang.Boolean;

public class JsonWriter_setLenient_13377478035 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term105;
     Object term151;
     Object term3382;

    public JsonWriter_setLenient_13377478035() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term105 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        int[] term106 = (int[]) newIntArray(4);
        setField(term105, term105.getClass(), "out", null);
        setIntElement(term106, 0, -1955890973);
        setIntElement(term106, 1, -2038273078);
        setIntElement(term106, 2, 1227103734);
        setIntElement(term106, 3, -1339778481);
        setField(term105, term105.getClass(), "stack", term106);
        setIntField(term105, term105.getClass(), "stackSize", 1725571209);
        setField(term105, term105.getClass(), "indent", "jJCZpVmanW");
        setField(term105, term105.getClass(), "separator", "EGtDIRbSSb");
        setBooleanField(term105, term105.getClass(), "lenient", false);
        setBooleanField(term105, term105.getClass(), "htmlSafe", true);
        setField(term105, term105.getClass(), "deferredName", "SzjVpOQTyS");
        setBooleanField(term105, term105.getClass(), "serializeNulls", true);
        term151 = new Boolean(true);
        term3382 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        int[] term3383 = (int[]) newIntArray(4);
        setField(term3382, term3382.getClass(), "out", null);
        setIntElement(term3383, 0, -1955890973);
        setIntElement(term3383, 1, -2038273078);
        setIntElement(term3383, 2, 1227103734);
        setIntElement(term3383, 3, -1339778481);
        setField(term3382, term3382.getClass(), "stack", term3383);
        setIntField(term3382, term3382.getClass(), "stackSize", 1725571209);
        setField(term3382, term3382.getClass(), "indent", "jJCZpVmanW");
        setField(term3382, term3382.getClass(), "separator", "EGtDIRbSSb");
        setBooleanField(term3382, term3382.getClass(), "lenient", true);
        setBooleanField(term3382, term3382.getClass(), "htmlSafe", true);
        setField(term3382, term3382.getClass(), "deferredName", "SzjVpOQTyS");
        setBooleanField(term3382, term3382.getClass(), "serializeNulls", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonWriter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term151;
        callMethod(klass, "setLenient", argTypes, term105, args);
        assertTrue(recursiveEquals(term105, term3382));
        assertTrue(recursiveEquals(term151, true));
    }

};


