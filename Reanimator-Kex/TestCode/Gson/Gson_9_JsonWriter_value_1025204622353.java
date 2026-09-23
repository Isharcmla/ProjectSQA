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

public class JsonWriter_value_1025204622353 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term185747;

    public JsonWriter_value_1025204622353() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term185747 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        int[] term184942 = (int[]) newIntArray(346);
        Object term185843 = newInstance(Class.forName("java.io.OutputStreamWriter"));
        setField(term185747, term185747.getClass(), "deferredName", "");
        setIntField(term185747, term185747.getClass(), "stackSize", -2080374784);
        setIntElement(term184942, -2080374785, 3);
        setField(term185747, term185747.getClass(), "stack", term184942);
        setField(term185747, term185747.getClass(), "indent", null);
        setBooleanField(term185747, term185747.getClass(), "htmlSafe", true);
        setField(term185747, term185747.getClass(), "out", term185843);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonWriter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = 0L;
        callMethod(klass, "value", argTypes, term185747, args);
    }

};


