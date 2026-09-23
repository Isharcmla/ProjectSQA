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

public class JsonWriter_writeDeferredName_2035940590212 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term80703;

    public JsonWriter_writeDeferredName_2035940590212() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term80703 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        int[] term79898 = (int[]) newIntArray(346);
        Object term80787 = newInstance(Class.forName("java.io.StringWriter"));
        setField(term80703, term80703.getClass(), "deferredName", "");
        setIntField(term80703, term80703.getClass(), "stackSize", -2080374784);
        setIntElement(term79898, -2080374785, 3);
        setField(term80703, term80703.getClass(), "stack", term79898);
        setField(term80703, term80703.getClass(), "indent", null);
        setBooleanField(term80703, term80703.getClass(), "htmlSafe", false);
        setField(term80703, term80703.getClass(), "out", term80787);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonWriter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "writeDeferredName", argTypes, term80703, args);
    }

};


