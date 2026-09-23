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

public class JsonWriter_string_294626227387 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term858998;
     Object term895669;

    public JsonWriter_string_294626227387() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term858998 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        Object term859036 = newInstance(Class.forName("java.io.Writer$1"));
        setBooleanField(term858998, term858998.getClass(), "htmlSafe", true);
        setField(term858998, term858998.getClass(), "out", term859036);
        term895669 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        Object term895670 = newInstance(Class.forName("java.io.Writer$1"));
        setBooleanField(term895670, term895670.getClass(), "closed", false);
        setField(term895670, term895670.getClass(), "writeBuffer", null);
        setField(term895670, term895670.getClass(), "lock", null);
        setField(term895669, term895669.getClass(), "out", term895670);
        setField(term895669, term895669.getClass(), "stack", null);
        setIntField(term895669, term895669.getClass(), "stackSize", 0);
        setField(term895669, term895669.getClass(), "indent", null);
        setField(term895669, term895669.getClass(), "separator", null);
        setBooleanField(term895669, term895669.getClass(), "lenient", false);
        setBooleanField(term895669, term895669.getClass(), "htmlSafe", true);
        setField(term895669, term895669.getClass(), "deferredName", null);
        setBooleanField(term895669, term895669.getClass(), "serializeNulls", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonWriter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            ";
        callMethod(klass, "string", argTypes, term858998, args);
        assertTrue(recursiveEquals(term858998, term895669));
    }

};


