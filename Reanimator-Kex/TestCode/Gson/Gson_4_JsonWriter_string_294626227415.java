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

public class JsonWriter_string_294626227415 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2329990;
     Object term2690172;

    public JsonWriter_string_294626227415() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2329990 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        Object term2330028 = newInstance(Class.forName("java.io.Writer$1"));
        setBooleanField(term2329990, term2329990.getClass(), "htmlSafe", true);
        setField(term2329990, term2329990.getClass(), "out", term2330028);
        term2690172 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        Object term2690173 = newInstance(Class.forName("java.io.Writer$1"));
        setBooleanField(term2690173, term2690173.getClass(), "closed", false);
        setField(term2690173, term2690173.getClass(), "writeBuffer", null);
        setField(term2690173, term2690173.getClass(), "lock", null);
        setField(term2690172, term2690172.getClass(), "out", term2690173);
        setField(term2690172, term2690172.getClass(), "stack", null);
        setIntField(term2690172, term2690172.getClass(), "stackSize", 0);
        setField(term2690172, term2690172.getClass(), "indent", null);
        setField(term2690172, term2690172.getClass(), "separator", null);
        setBooleanField(term2690172, term2690172.getClass(), "lenient", false);
        setBooleanField(term2690172, term2690172.getClass(), "htmlSafe", true);
        setField(term2690172, term2690172.getClass(), "deferredName", null);
        setBooleanField(term2690172, term2690172.getClass(), "serializeNulls", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonWriter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "\u0002\u0002\u0002\u0002\u0002\u0002\u0002\u0002\u0002\u0002\u0002\u0002\u0002\u0002                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 ";
        callMethod(klass, "string", argTypes, term2329990, args);
        assertTrue(recursiveEquals(term2329990, term2690172));
    }

};


