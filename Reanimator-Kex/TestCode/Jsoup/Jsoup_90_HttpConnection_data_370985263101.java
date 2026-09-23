package org.jsoup.helper;

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
import static org.jsoup.helper.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.jsoup.helper.EqualityUtils.*;
import java.lang.Object;

public class HttpConnection_data_370985263101 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term53639;
     Object term53554;
     Object term53733;
     Object term53734;

    public HttpConnection_data_370985263101() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term53639 = newInstance(Class.forName("org.jsoup.helper.HttpConnection"));
        term53554 = (Object[]) newArray("java.lang.String", 0);
        term53733 = newInstance(Class.forName("org.jsoup.helper.HttpConnection"));
        setField(term53733, term53733.getClass(), "req", null);
        setField(term53733, term53733.getClass(), "res", null);
        term53734 = (Object[]) newArray("java.lang.String", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.helper.HttpConnection");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term53554;
        callMethod(klass, "data", argTypes, term53639, args);
        assertTrue(recursiveEquals(term53639, term53733));
        assertTrue(recursiveEquals(term53554, term53734));
    }

};


