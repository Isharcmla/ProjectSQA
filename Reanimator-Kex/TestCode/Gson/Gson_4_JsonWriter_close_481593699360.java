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

public class JsonWriter_close_481593699360 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term211638;
     Object term212364;

    public JsonWriter_close_481593699360() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term211638 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        Object term211682 = newInstance(Class.forName("java.io.PipedWriter"));
        setField(term211638, term211638.getClass(), "out", term211682);
        term212364 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        Object term212365 = newInstance(Class.forName("java.io.PipedWriter"));
        setField(term212365, term212365.getClass(), "sink", null);
        setBooleanField(term212365, term212365.getClass(), "closed", true);
        setField(term212365, term212365.getClass(), "writeBuffer", null);
        setField(term212365, term212365.getClass(), "lock", null);
        setField(term212364, term212364.getClass(), "out", term212365);
        setField(term212364, term212364.getClass(), "stack", null);
        setIntField(term212364, term212364.getClass(), "stackSize", 0);
        setField(term212364, term212364.getClass(), "indent", null);
        setField(term212364, term212364.getClass(), "separator", null);
        setBooleanField(term212364, term212364.getClass(), "lenient", false);
        setBooleanField(term212364, term212364.getClass(), "htmlSafe", false);
        setField(term212364, term212364.getClass(), "deferredName", null);
        setBooleanField(term212364, term212364.getClass(), "serializeNulls", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonWriter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "close", argTypes, term211638, args);
        assertTrue(recursiveEquals(term211638, term212364));
    }

};


