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

public class JsonWriter_string_294626227537 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1033748;
     Object term1430760;

    public JsonWriter_string_294626227537() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1033748 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        Object term1033786 = newInstance(Class.forName("java.io.Writer$1"));
        setBooleanField(term1033748, term1033748.getClass(), "htmlSafe", true);
        setField(term1033748, term1033748.getClass(), "out", term1033786);
        term1430760 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        Object term1430761 = newInstance(Class.forName("java.io.Writer$1"));
        setBooleanField(term1430761, term1430761.getClass(), "closed", false);
        setField(term1430761, term1430761.getClass(), "writeBuffer", null);
        setField(term1430761, term1430761.getClass(), "lock", null);
        setField(term1430760, term1430760.getClass(), "out", term1430761);
        setField(term1430760, term1430760.getClass(), "stack", null);
        setIntField(term1430760, term1430760.getClass(), "stackSize", 0);
        setField(term1430760, term1430760.getClass(), "indent", null);
        setField(term1430760, term1430760.getClass(), "separator", null);
        setBooleanField(term1430760, term1430760.getClass(), "lenient", false);
        setBooleanField(term1430760, term1430760.getClass(), "htmlSafe", true);
        setField(term1430760, term1430760.getClass(), "deferredName", null);
        setBooleanField(term1430760, term1430760.getClass(), "serializeNulls", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonWriter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "\u0001\b\u0001\u0001\u0001\u0002 \u0001@@@\u0010\u0002\u0001\u0002\b\u0001\u0001\u0001\u0002\u0004\u0002\u0001\u0001\u0002\u0002\u0002\u0002\u0002\u0002\u0002\u0002\u0002\b\u0004\u0004\u0004\u0004\u0010\u0002\u0001\u0001\u0001\u0001\u0002\u0002\u0002\u0002 \u0002\u0002\u0002\u0002\u0002\u0002\u0004\u0001\u0002\u0002\u0001\u0004\u0004\u0004@\u0004 \u0004 \u0004\u0010\u0010\b\b\b\u0002\u0004\u0004\u0004@\u0004@\u0004 \u0004\u0010\u0010\u0010\b\u0002\u0002\u0004\u0004\u0004\u0001\u0004@\u0004 \b\b\b\b\b\b\b\b\u0010\u0010\u0010\u0010\u0010\u0010\u0010\u0010\u0010@@@@@@@@@@@@@@@\u0001@@@@@@@@@@@\u0001@@@@@\u0010                                                                                                                                                                                                                                          ";
        callMethod(klass, "string", argTypes, term1033748, args);
        assertTrue(recursiveEquals(term1033748, term1430760));
    }

};


