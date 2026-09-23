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

public class JsonWriter_string_294626227525 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1231330;
     Object term1268796;

    public JsonWriter_string_294626227525() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1231330 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        Object term1231368 = newInstance(Class.forName("java.io.Writer$1"));
        setBooleanField(term1231330, term1231330.getClass(), "htmlSafe", true);
        setField(term1231330, term1231330.getClass(), "out", term1231368);
        term1268796 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        Object term1268797 = newInstance(Class.forName("java.io.Writer$1"));
        setBooleanField(term1268797, term1268797.getClass(), "closed", false);
        setField(term1268797, term1268797.getClass(), "writeBuffer", null);
        setField(term1268797, term1268797.getClass(), "lock", null);
        setField(term1268796, term1268796.getClass(), "out", term1268797);
        setField(term1268796, term1268796.getClass(), "stack", null);
        setIntField(term1268796, term1268796.getClass(), "stackSize", 0);
        setField(term1268796, term1268796.getClass(), "indent", null);
        setField(term1268796, term1268796.getClass(), "separator", null);
        setBooleanField(term1268796, term1268796.getClass(), "lenient", false);
        setBooleanField(term1268796, term1268796.getClass(), "htmlSafe", true);
        setField(term1268796, term1268796.getClass(), "deferredName", null);
        setBooleanField(term1268796, term1268796.getClass(), "serializeNulls", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonWriter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            ";
        callMethod(klass, "string", argTypes, term1231330, args);
        assertTrue(recursiveEquals(term1231330, term1268796));
    }

};


