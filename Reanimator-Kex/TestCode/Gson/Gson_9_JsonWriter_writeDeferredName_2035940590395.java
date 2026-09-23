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
import java.lang.Object;

public class JsonWriter_writeDeferredName_2035940590395 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term204397;

    public JsonWriter_writeDeferredName_2035940590395() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term204397 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        int[] term204295 = (int[]) newIntArray(0);
        Object term204519 = newInstance(Class.forName("java.io.StringWriter"));
        setField(term204397, term204397.getClass(), "deferredName", "");
        setIntField(term204397, term204397.getClass(), "stackSize", -2113929216);
        setIntElement(term204295, -2113929217, 3);
        setField(term204397, term204397.getClass(), "stack", term204295);
        setField(term204397, term204397.getClass(), "indent", "");
        setField(term204397, term204397.getClass(), "out", term204519);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonWriter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "writeDeferredName", argTypes, term204397, args);
    }

};


