package org.jsoup.select;

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
import static org.jsoup.select.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Elements_empty_2079018060278 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term40909;

    public Elements_empty_2079018060278() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term40909 = newInstance(Class.forName("org.jsoup.select.Elements"));
        Object term40965 = newInstance(Class.forName("org.jsoup.select.Elements"));
        Object term41021 = newInstance(Class.forName("org.jsoup.select.Elements"));
        setField(term40965, term40965.getClass(), "contents", term41021);
        setField(term40909, term40909.getClass(), "contents", term40965);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.select.Elements");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "empty", argTypes, term40909, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


