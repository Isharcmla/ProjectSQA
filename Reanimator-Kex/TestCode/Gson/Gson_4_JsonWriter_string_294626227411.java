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

public class JsonWriter_string_294626227411 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2466349;

    public JsonWriter_string_294626227411() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2466349 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        Object term2466387 = newInstance(Class.forName("java.io.Writer$1"));
        setBooleanField(term2466349, term2466349.getClass(), "htmlSafe", true);
        setField(term2466349, term2466349.getClass(), "out", term2466387);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonWriter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "\u0001 @\u0004\u0010\u0002@\u0004 \u0002@ \u0002\u0001@@\u0002@ @\b\u0002\b\b \u0004\b\u0001 \u0010@@\b \u0010 \b\u0004\u0004\u0010\u0010 \u0004@\u0010\b\u0002\b\u0010\u0010\b\u0010 @\u0004\u0001\u0002\u0010\u0002\u0001@\b@ \u0001\u0002\u0004\b@\u0004\u0001@\u0010\u0001\u0004\u0010\b\u0001 @ \b@\u0001\u0010\u0002\u0010@  \u0002\u0004\u0010\u0002@@\u0004\b\u0004\b\b\b\u0010\u0004\u0002@\u0001 \b\b@\b\u0010@\u0002@\u0010\u0001\u0004\b\u0001\u0010\u0001\u0004\u0002\b \u0010\u0002\b@\b  \b  \u0001\u0002 \u0010\u0001\u0004 \b \u0002\u0004  \u0004\u0004\u0010                                                                                                                                                                                                                                                                                                                                                                     ";
        callMethod(klass, "string", argTypes, term2466349, args);
    }

};


