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
import static com.google.gson.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.gson.EqualityUtils.*;
import java.util.ArrayList;
import java.lang.Object;

public class DefaultDateTypeAdapter_write_75498657683 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22756;
     Object term22850;
     Object term24596;
     Object term24597;

    public DefaultDateTypeAdapter_write_75498657683() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term22756 = newInstance(Class.forName("com.google.gson.DefaultDateTypeAdapter"));
        ArrayList term22902 = new ArrayList();
        term22850 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeWriter"));
        setField(term22850, term22850.getClass(), "pendingName", null);
        setField(term22850, term22850.getClass(), "stack", term22902);
        term24596 = newInstance(Class.forName("com.google.gson.DefaultDateTypeAdapter"));
        setField(term24596, term24596.getClass(), "dateType", null);
        setField(term24596, term24596.getClass(), "enUsFormat", null);
        setField(term24596, term24596.getClass(), "localFormat", null);
        ArrayList term24598 = new ArrayList();
        term24597 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeWriter"));
        Object term24600 = newInstance(Class.forName("com.google.gson.JsonNull"));
        setField(term24597, term24597.getClass(), "stack", term24598);
        setField(term24597, term24597.getClass(), "pendingName", null);
        setField(term24597, term24597.getClass(), "product", term24600);
        setField(term24597, term24597.getClass(), "out", null);
        setField(term24597, term24597.getClass(), "stack", null);
        setIntField(term24597, term24597.getClass(), "stackSize", 0);
        setField(term24597, term24597.getClass(), "indent", null);
        setField(term24597, term24597.getClass(), "separator", null);
        setBooleanField(term24597, term24597.getClass(), "lenient", false);
        setBooleanField(term24597, term24597.getClass(), "htmlSafe", false);
        setField(term24597, term24597.getClass(), "deferredName", null);
        setBooleanField(term24597, term24597.getClass(), "serializeNulls", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.DefaultDateTypeAdapter");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.gson.stream.JsonWriter");
        argTypes[1] = Class.forName("java.util.Date");
        Object[] args = new Object[2];
        args[0] = term22850;
        args[1] = null;
        callMethod(klass, "write", argTypes, term22756, args);
        assertTrue(recursiveEquals(term22756, term24596));
        assertTrue(recursiveEquals(term22850, term24597));
    }

};


