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

public class JsonWriter_setHtmlSafe_147722038536 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term265;
     Object term311;
     Object term3539;

    public JsonWriter_setHtmlSafe_147722038536() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term265 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        int[] term266 = (int[]) newIntArray(4);
        setField(term265, term265.getClass(), "out", null);
        setIntElement(term266, 0, 597278769);
        setIntElement(term266, 1, -1685132342);
        setIntElement(term266, 2, -1456670397);
        setIntElement(term266, 3, 1622346318);
        setField(term265, term265.getClass(), "stack", term266);
        setIntField(term265, term265.getClass(), "stackSize", 1048535127);
        setField(term265, term265.getClass(), "indent", "NRdvgJlhkX");
        setField(term265, term265.getClass(), "separator", "uuaPigETmJ");
        setBooleanField(term265, term265.getClass(), "lenient", false);
        setBooleanField(term265, term265.getClass(), "htmlSafe", true);
        setField(term265, term265.getClass(), "deferredName", "MxlszYVzRf");
        setBooleanField(term265, term265.getClass(), "serializeNulls", false);
        term311 = new Boolean(true);
        term3539 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        int[] term3540 = (int[]) newIntArray(4);
        setField(term3539, term3539.getClass(), "out", null);
        setIntElement(term3540, 0, 597278769);
        setIntElement(term3540, 1, -1685132342);
        setIntElement(term3540, 2, -1456670397);
        setIntElement(term3540, 3, 1622346318);
        setField(term3539, term3539.getClass(), "stack", term3540);
        setIntField(term3539, term3539.getClass(), "stackSize", 1048535127);
        setField(term3539, term3539.getClass(), "indent", "NRdvgJlhkX");
        setField(term3539, term3539.getClass(), "separator", "uuaPigETmJ");
        setBooleanField(term3539, term3539.getClass(), "lenient", false);
        setBooleanField(term3539, term3539.getClass(), "htmlSafe", true);
        setField(term3539, term3539.getClass(), "deferredName", "MxlszYVzRf");
        setBooleanField(term3539, term3539.getClass(), "serializeNulls", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonWriter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term311;
        callMethod(klass, "setHtmlSafe", argTypes, term265, args);
        assertTrue(recursiveEquals(term265, term3539));
        assertTrue(recursiveEquals(term311, true));
    }

};


