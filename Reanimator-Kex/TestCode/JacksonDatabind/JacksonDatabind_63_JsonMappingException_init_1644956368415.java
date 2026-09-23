package com.fasterxml.jackson.databind;

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
import java.lang.NullPointerException;
import static com.fasterxml.jackson.databind.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;

public class JsonMappingException_init_1644956368415 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term632171;

    public JsonMappingException_init_1644956368415() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term631953 = new ArrayList();
        Object term631857 = newInstance(Class.forName("com.fasterxml.jackson.databind.JsonMappingException"));
        Object term631901 = newInstance(Class.forName("java.lang.Throwable"));
        Object[] term631715 = (Object[]) newArray("java.lang.StackTraceElement", 0);
        Object term632051 = newInstance(Class.forName("java.io.PushbackInputStream"));
        setField(term631857, term631857.getClass(), "cause", term631901);
        setField(term631857, term631857.getClass(), "stackTrace", term631715);
        setField(term631857, term631857.getClass(), "suppressedExceptions", term631953);
        setField(term631857, term631857.getClass(), "detailMessage", "");
        setField(term631857, term631857.getClass(), "_processor", term632051);
        term632171 = newInstance(Class.forName("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        Object term632291 = newInstance(Class.forName("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        setField(term632171, term632171.getClass(), "delegate", term632291);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.JsonMappingException");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.io.Closeable");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term632171;
        args[1] = "";
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


