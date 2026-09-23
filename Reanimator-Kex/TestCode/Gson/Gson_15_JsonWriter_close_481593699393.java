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
import java.lang.Object;

public class JsonWriter_close_481593699393 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term208614;
     Object term208916;

    public JsonWriter_close_481593699393() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term208614 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        Object term208654 = newInstance(Class.forName("java.io.Console$3"));
        setField(term208614, term208614.getClass(), "out", term208654);
        term208916 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        Object term208917 = newInstance(Class.forName("java.io.Console$3"));
        setField(term208917, term208917.getClass(), "this$0", null);
        setField(term208917, term208917.getClass(), "out", null);
        setBooleanField(term208917, term208917.getClass(), "autoFlush", false);
        setBooleanField(term208917, term208917.getClass(), "trouble", false);
        setField(term208917, term208917.getClass(), "formatter", null);
        setField(term208917, term208917.getClass(), "psOut", null);
        setField(term208917, term208917.getClass(), "writeBuffer", null);
        setField(term208917, term208917.getClass(), "lock", null);
        setField(term208916, term208916.getClass(), "out", term208917);
        setField(term208916, term208916.getClass(), "stack", null);
        setIntField(term208916, term208916.getClass(), "stackSize", 0);
        setField(term208916, term208916.getClass(), "indent", null);
        setField(term208916, term208916.getClass(), "separator", null);
        setBooleanField(term208916, term208916.getClass(), "lenient", false);
        setBooleanField(term208916, term208916.getClass(), "htmlSafe", false);
        setField(term208916, term208916.getClass(), "deferredName", null);
        setBooleanField(term208916, term208916.getClass(), "serializeNulls", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonWriter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "close", argTypes, term208614, args);
        assertTrue(recursiveEquals(term208614, term208916));
    }

};


