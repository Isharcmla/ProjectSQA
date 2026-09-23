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

public class HttpConnection_data_214247176675 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30424;
     Object term30476;
     Object term31061;
     Object term31062;

    public HttpConnection_data_214247176675() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term30424 = newInstance(Class.forName("org.jsoup.helper.HttpConnection"));
        term30476 = new ArrayList();
        term31061 = newInstance(Class.forName("org.jsoup.helper.HttpConnection"));
        setField(term31061, term31061.getClass(), "req", null);
        setField(term31061, term31061.getClass(), "res", null);
        term31062 = new ArrayList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.helper.HttpConnection");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Collection");
        Object[] args = new Object[1];
        args[0] = term30476;
        callMethod(klass, "data", argTypes, term30424, args);
        assertTrue(recursiveEquals(term30424, term31061));
        assertTrue(recursiveEquals(term30476, term31062));
    }

};


