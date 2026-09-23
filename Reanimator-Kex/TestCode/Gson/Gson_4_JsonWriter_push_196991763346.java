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
import java.lang.Integer;

public class JsonWriter_push_196991763346 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1125;
     Object term1169;

    public JsonWriter_push_196991763346() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1125 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        int[] term1126 = (int[]) newIntArray(2);
        setField(term1125, term1125.getClass(), "out", null);
        setIntElement(term1126, 0, 962840079);
        setIntElement(term1126, 1, 1540719661);
        setField(term1125, term1125.getClass(), "stack", term1126);
        setIntField(term1125, term1125.getClass(), "stackSize", 1265463001);
        setField(term1125, term1125.getClass(), "indent", "gGSMzuGICf");
        setField(term1125, term1125.getClass(), "separator", "hxCBltsObl");
        setBooleanField(term1125, term1125.getClass(), "lenient", true);
        setBooleanField(term1125, term1125.getClass(), "htmlSafe", true);
        setField(term1125, term1125.getClass(), "deferredName", "BndsHwAFMv");
        setBooleanField(term1125, term1125.getClass(), "serializeNulls", false);
        term1169 = new Integer(335112684);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonWriter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term1169;
        try {
            callMethod(klass, "push", argTypes, term1125, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


