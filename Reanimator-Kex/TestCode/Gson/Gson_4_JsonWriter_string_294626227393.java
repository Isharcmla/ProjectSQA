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

public class JsonWriter_string_294626227393 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1122966;
     Object term1250717;

    public JsonWriter_string_294626227393() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1122966 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        Object term1123004 = newInstance(Class.forName("java.io.Writer$1"));
        setBooleanField(term1122966, term1122966.getClass(), "htmlSafe", true);
        setField(term1122966, term1122966.getClass(), "out", term1123004);
        term1250717 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        Object term1250718 = newInstance(Class.forName("java.io.Writer$1"));
        setBooleanField(term1250718, term1250718.getClass(), "closed", false);
        setField(term1250718, term1250718.getClass(), "writeBuffer", null);
        setField(term1250718, term1250718.getClass(), "lock", null);
        setField(term1250717, term1250717.getClass(), "out", term1250718);
        setField(term1250717, term1250717.getClass(), "stack", null);
        setIntField(term1250717, term1250717.getClass(), "stackSize", 0);
        setField(term1250717, term1250717.getClass(), "indent", null);
        setField(term1250717, term1250717.getClass(), "separator", null);
        setBooleanField(term1250717, term1250717.getClass(), "lenient", false);
        setBooleanField(term1250717, term1250717.getClass(), "htmlSafe", true);
        setField(term1250717, term1250717.getClass(), "deferredName", null);
        setBooleanField(term1250717, term1250717.getClass(), "serializeNulls", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonWriter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
        callMethod(klass, "string", argTypes, term1122966, args);
        assertTrue(recursiveEquals(term1122966, term1250717));
    }

};


