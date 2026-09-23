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

public class JsonWriter_setIndent_60116788833 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term3157;

    public JsonWriter_setIndent_60116788833() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        int[] term2 = (int[]) newIntArray(5);
        setField(term1, term1.getClass(), "out", null);
        setIntElement(term2, 0, 568599855);
        setIntElement(term2, 1, 1162663216);
        setIntElement(term2, 2, 1484323161);
        setIntElement(term2, 3, 391863371);
        setIntElement(term2, 4, -1922583790);
        setField(term1, term1.getClass(), "stack", term2);
        setIntField(term1, term1.getClass(), "stackSize", -616727354);
        setField(term1, term1.getClass(), "indent", "PAEBtnZtTD");
        setField(term1, term1.getClass(), "separator", "sjlJAEtRrb");
        setBooleanField(term1, term1.getClass(), "lenient", false);
        setBooleanField(term1, term1.getClass(), "htmlSafe", false);
        setField(term1, term1.getClass(), "deferredName", "MuLcgQHgqz");
        setBooleanField(term1, term1.getClass(), "serializeNulls", false);
        term3157 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        int[] term3158 = (int[]) newIntArray(5);
        setField(term3157, term3157.getClass(), "out", null);
        setIntElement(term3158, 0, 568599855);
        setIntElement(term3158, 1, 1162663216);
        setIntElement(term3158, 2, 1484323161);
        setIntElement(term3158, 3, 391863371);
        setIntElement(term3158, 4, -1922583790);
        setField(term3157, term3157.getClass(), "stack", term3158);
        setIntField(term3157, term3157.getClass(), "stackSize", -616727354);
        setField(term3157, term3157.getClass(), "indent", "xxtlPwDYFs");
        setField(term3157, term3157.getClass(), "separator", ": ");
        setBooleanField(term3157, term3157.getClass(), "lenient", false);
        setBooleanField(term3157, term3157.getClass(), "htmlSafe", false);
        setField(term3157, term3157.getClass(), "deferredName", "MuLcgQHgqz");
        setBooleanField(term3157, term3157.getClass(), "serializeNulls", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonWriter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "xxtlPwDYFs";
        callMethod(klass, "setIndent", argTypes, term1, args);
        assertTrue(recursiveEquals(term1, term3157));
    }

};


