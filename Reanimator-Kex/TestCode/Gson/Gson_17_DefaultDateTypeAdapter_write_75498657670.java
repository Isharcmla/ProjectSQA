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

public class DefaultDateTypeAdapter_write_75498657670 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19574;
     Object term19668;
     Object term19720;
     Object term19721;

    public DefaultDateTypeAdapter_write_75498657670() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19574 = newInstance(Class.forName("com.google.gson.DefaultDateTypeAdapter"));
        term19668 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeWriter"));
        setField(term19668, term19668.getClass(), "pendingName", "");
        term19720 = newInstance(Class.forName("com.google.gson.DefaultDateTypeAdapter"));
        setField(term19720, term19720.getClass(), "dateType", null);
        setField(term19720, term19720.getClass(), "enUsFormat", null);
        setField(term19720, term19720.getClass(), "localFormat", null);
        term19721 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeWriter"));
        setField(term19721, term19721.getClass(), "stack", null);
        setField(term19721, term19721.getClass(), "pendingName", null);
        setField(term19721, term19721.getClass(), "product", null);
        setField(term19721, term19721.getClass(), "out", null);
        setField(term19721, term19721.getClass(), "stack", null);
        setIntField(term19721, term19721.getClass(), "stackSize", 0);
        setField(term19721, term19721.getClass(), "indent", null);
        setField(term19721, term19721.getClass(), "separator", null);
        setBooleanField(term19721, term19721.getClass(), "lenient", false);
        setBooleanField(term19721, term19721.getClass(), "htmlSafe", false);
        setField(term19721, term19721.getClass(), "deferredName", null);
        setBooleanField(term19721, term19721.getClass(), "serializeNulls", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.DefaultDateTypeAdapter");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.gson.stream.JsonWriter");
        argTypes[1] = Class.forName("java.util.Date");
        Object[] args = new Object[2];
        args[0] = term19668;
        args[1] = null;
        callMethod(klass, "write", argTypes, term19574, args);
        assertTrue(recursiveEquals(term19574, term19720));
        assertTrue(recursiveEquals(term19668, term19721));
    }

};


