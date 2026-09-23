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

public class DeserializationContext_reportMissingContent_1915447247148 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6057;

    public DeserializationContext_reportMissingContent_1915447247148() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6057 = (Object[]) newArray("java.lang.Object", 7);
        Object term6058 = newInstance(Class.forName("java.lang.Object"));
        Object term6059 = newInstance(Class.forName("java.lang.Object"));
        Object term6060 = newInstance(Class.forName("java.lang.Object"));
        Object term6061 = newInstance(Class.forName("java.lang.Object"));
        Object term6062 = newInstance(Class.forName("java.lang.Object"));
        Object term6063 = newInstance(Class.forName("java.lang.Object"));
        Object term6064 = newInstance(Class.forName("java.lang.Object"));
        setElement(term6057, 0, term6058);
        setElement(term6057, 1, term6059);
        setElement(term6057, 2, term6060);
        setElement(term6057, 3, term6061);
        setElement(term6057, 4, term6062);
        setElement(term6057, 5, term6063);
        setElement(term6057, 6, term6064);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[2];
        args[0] = "BYqFIqCKAV";
        args[1] = term6057;
        try {
            callMethod(klass, "reportMissingContent", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


