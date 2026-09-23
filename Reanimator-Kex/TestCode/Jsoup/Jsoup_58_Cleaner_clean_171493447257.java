package org.jsoup.safety;

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
import java.lang.IllegalArgumentException;
import static org.jsoup.safety.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Cleaner_clean_171493447257 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23471;
     Object term23525;

    public Cleaner_clean_171493447257() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23471 = newInstance(Class.forName("org.jsoup.safety.Cleaner"));
        term23525 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        setField(term23525, term23525.getClass(), "baseUri", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.safety.Cleaner");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Document");
        Object[] args = new Object[1];
        args[0] = term23525;
        try {
            callMethod(klass, "clean", argTypes, term23471, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


