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

public class JsonWriter_string_294626227388 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term891543;
     Object term897247;

    public JsonWriter_string_294626227388() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term891543 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        Object term891581 = newInstance(Class.forName("java.io.Writer$1"));
        setBooleanField(term891543, term891543.getClass(), "htmlSafe", true);
        setField(term891543, term891543.getClass(), "out", term891581);
        term897247 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        Object term897248 = newInstance(Class.forName("java.io.Writer$1"));
        setBooleanField(term897248, term897248.getClass(), "closed", false);
        setField(term897248, term897248.getClass(), "writeBuffer", null);
        setField(term897248, term897248.getClass(), "lock", null);
        setField(term897247, term897247.getClass(), "out", term897248);
        setField(term897247, term897247.getClass(), "stack", null);
        setIntField(term897247, term897247.getClass(), "stackSize", 0);
        setField(term897247, term897247.getClass(), "indent", null);
        setField(term897247, term897247.getClass(), "separator", null);
        setBooleanField(term897247, term897247.getClass(), "lenient", false);
        setBooleanField(term897247, term897247.getClass(), "htmlSafe", true);
        setField(term897247, term897247.getClass(), "deferredName", null);
        setBooleanField(term897247, term897247.getClass(), "serializeNulls", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonWriter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "\u0002@\u0002@\u0001\u0004\u0002\u0001\u0004\b  @\u0001\u0001@\b\u0010\u0010@\u0002\u0001\u0010\u0010@ \b\u0002@@@\u0002\u0001 \u0010\b\b@\u0001@@\b\u0001\u0001\u0002\u0010\u0010@\u0004@\u0002\b\u0001@\b@\u0001\u0001\b@\u0001@\b@\u0001\b\u0010 \u0001\u0001\u0002\u0002\u0002\u0002\u0001\u0004\u0004\u0001\u0002\u0002\b\u0004@@        \u0002\u0002\u0002\u0002\u0002\u0002\u0002\u0002\u0002\u0010\u0004\u0004\u0004\u0004@\u0002\b@                                                                                                                                               ";
        callMethod(klass, "string", argTypes, term891543, args);
        assertTrue(recursiveEquals(term891543, term897247));
    }

};


