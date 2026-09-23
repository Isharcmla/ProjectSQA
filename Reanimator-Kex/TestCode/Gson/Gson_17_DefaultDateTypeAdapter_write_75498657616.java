package com.google.gson;

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
import java.lang.NullPointerException;
import static com.google.gson.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class DefaultDateTypeAdapter_write_75498657616 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33;
     Object term34;
     Object term81;

    public DefaultDateTypeAdapter_write_75498657616() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term33 = newInstance(Class.forName("com.google.gson.DefaultDateTypeAdapter"));
        setField(term33, term33.getClass(), "dateType", null);
        setField(term33, term33.getClass(), "enUsFormat", null);
        setField(term33, term33.getClass(), "localFormat", null);
        term34 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        int[] term35 = (int[]) newIntArray(5);
        setField(term34, term34.getClass(), "out", null);
        setIntElement(term35, 0, -616727354);
        setIntElement(term35, 1, -1955890973);
        setIntElement(term35, 2, -2038273078);
        setIntElement(term35, 3, 1227103734);
        setIntElement(term35, 4, -1339778481);
        setField(term34, term34.getClass(), "stack", term35);
        setIntField(term34, term34.getClass(), "stackSize", 1725571209);
        setField(term34, term34.getClass(), "indent", "sjlJAEtRrb");
        setField(term34, term34.getClass(), "separator", "MuLcgQHgqz");
        setBooleanField(term34, term34.getClass(), "lenient", false);
        setBooleanField(term34, term34.getClass(), "htmlSafe", false);
        setField(term34, term34.getClass(), "deferredName", "xxtlPwDYFs");
        setBooleanField(term34, term34.getClass(), "serializeNulls", false);
        term81 = newInstance(Class.forName("java.util.Date"));
        setLongField(term81, term81.getClass(), "fastTime", 1345889412244L);
        setField(term81, term81.getClass(), "cdate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.DefaultDateTypeAdapter");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.gson.stream.JsonWriter");
        argTypes[1] = Class.forName("java.util.Date");
        Object[] args = new Object[2];
        args[0] = term34;
        args[1] = term81;
        try {
            callMethod(klass, "write", argTypes, term33, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


