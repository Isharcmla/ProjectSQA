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

public class JsonWriter_value_129621706759 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2151;
     Object term9846;
     Object term9810;

    public JsonWriter_value_129621706759() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2151 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        int[] term2152 = (int[]) newIntArray(6);
        setField(term2151, term2151.getClass(), "out", null);
        setIntElement(term2152, 0, 1107176718);
        setIntElement(term2152, 1, 480137250);
        setIntElement(term2152, 2, -341152642);
        setIntElement(term2152, 3, -2015854073);
        setIntElement(term2152, 4, 538259104);
        setIntElement(term2152, 5, 96566506);
        setField(term2151, term2151.getClass(), "stack", term2152);
        setIntField(term2151, term2151.getClass(), "stackSize", -343325701);
        setField(term2151, term2151.getClass(), "indent", "VgZnGoIFwQ");
        setField(term2151, term2151.getClass(), "separator", "jUbSRrkrYZ");
        setBooleanField(term2151, term2151.getClass(), "lenient", true);
        setBooleanField(term2151, term2151.getClass(), "htmlSafe", false);
        setField(term2151, term2151.getClass(), "deferredName", "bWWfajKbEX");
        setBooleanField(term2151, term2151.getClass(), "serializeNulls", false);
        term9846 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        int[] term9847 = (int[]) newIntArray(6);
        setField(term9846, term9846.getClass(), "out", null);
        setIntElement(term9847, 0, 1107176718);
        setIntElement(term9847, 1, 480137250);
        setIntElement(term9847, 2, -341152642);
        setIntElement(term9847, 3, -2015854073);
        setIntElement(term9847, 4, 538259104);
        setIntElement(term9847, 5, 96566506);
        setField(term9846, term9846.getClass(), "stack", term9847);
        setIntField(term9846, term9846.getClass(), "stackSize", -343325701);
        setField(term9846, term9846.getClass(), "indent", "VgZnGoIFwQ");
        setField(term9846, term9846.getClass(), "separator", "jUbSRrkrYZ");
        setBooleanField(term9846, term9846.getClass(), "lenient", true);
        setBooleanField(term9846, term9846.getClass(), "htmlSafe", false);
        setField(term9846, term9846.getClass(), "deferredName", null);
        setBooleanField(term9846, term9846.getClass(), "serializeNulls", false);
        term9810 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        int[] term9811 = (int[]) newIntArray(6);
        setField(term9810, term9810.getClass(), "out", null);
        setIntElement(term9811, 0, 1107176718);
        setIntElement(term9811, 1, 480137250);
        setIntElement(term9811, 2, -341152642);
        setIntElement(term9811, 3, -2015854073);
        setIntElement(term9811, 4, 538259104);
        setIntElement(term9811, 5, 96566506);
        setField(term9810, term9810.getClass(), "stack", term9811);
        setIntField(term9810, term9810.getClass(), "stackSize", -343325701);
        setField(term9810, term9810.getClass(), "indent", "VgZnGoIFwQ");
        setField(term9810, term9810.getClass(), "separator", "jUbSRrkrYZ");
        setBooleanField(term9810, term9810.getClass(), "lenient", true);
        setBooleanField(term9810, term9810.getClass(), "htmlSafe", false);
        setField(term9810, term9810.getClass(), "deferredName", null);
        setBooleanField(term9810, term9810.getClass(), "serializeNulls", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonWriter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Number");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "value", argTypes, term2151, args);
        assertTrue(recursiveEquals(term2151, term9846));
        assertTrue(recursiveEquals(retValue, term9810));
    }

};


