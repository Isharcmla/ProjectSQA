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
import java.util.ArrayList;

public class HttpConnection_data_214247176699 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term49431;
     Object term49483;
     Object term49525;
     Object term49526;

    public HttpConnection_data_214247176699() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term49431 = newInstance(Class.forName("org.jsoup.helper.HttpConnection"));
        term49483 = new ArrayList();
        term49525 = newInstance(Class.forName("org.jsoup.helper.HttpConnection"));
        setField(term49525, term49525.getClass(), "req", null);
        setField(term49525, term49525.getClass(), "res", null);
        term49526 = new ArrayList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.helper.HttpConnection");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Collection");
        Object[] args = new Object[1];
        args[0] = term49483;
        callMethod(klass, "data", argTypes, term49431, args);
        assertTrue(recursiveEquals(term49431, term49525));
        assertTrue(recursiveEquals(term49483, term49526));
    }

};


