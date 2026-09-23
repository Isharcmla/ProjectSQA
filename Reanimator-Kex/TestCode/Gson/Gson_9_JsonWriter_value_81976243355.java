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
import java.lang.ArrayIndexOutOfBoundsException;
import static com.google.gson.stream.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Double;

public class JsonWriter_value_81976243355 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1895;
     Object term1946;

    public JsonWriter_value_81976243355() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1895 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        int[] term1896 = (int[]) newIntArray(9);
        setField(term1895, term1895.getClass(), "out", null);
        setIntElement(term1896, 0, 339854490);
        setIntElement(term1896, 1, -615654495);
        setIntElement(term1896, 2, -1476117762);
        setIntElement(term1896, 3, -341962980);
        setIntElement(term1896, 4, 1532716628);
        setIntElement(term1896, 5, -1801760683);
        setIntElement(term1896, 6, 1141317871);
        setIntElement(term1896, 7, 890669485);
        setIntElement(term1896, 8, 691577392);
        setField(term1895, term1895.getClass(), "stack", term1896);
        setIntField(term1895, term1895.getClass(), "stackSize", -893623680);
        setField(term1895, term1895.getClass(), "indent", "JUmudUmaaV");
        setField(term1895, term1895.getClass(), "separator", "KoyGrUJeJW");
        setBooleanField(term1895, term1895.getClass(), "lenient", false);
        setBooleanField(term1895, term1895.getClass(), "htmlSafe", false);
        setField(term1895, term1895.getClass(), "deferredName", "HqBOwkVqjD");
        setBooleanField(term1895, term1895.getClass(), "serializeNulls", false);
        term1946 = new Double(0.13238746331190498);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonWriter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = term1946;
        try {
            callMethod(klass, "value", argTypes, term1895, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


