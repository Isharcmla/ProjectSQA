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
import java.lang.ClassCastException;
import static org.jsoup.helper.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.LinkedHashMap;

public class HttpConnection_userAgent_34705087974 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29662;

    public HttpConnection_userAgent_34705087974() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term29896 = newInstance(Class.forName("java.lang.Object"));
        LinkedHashMap term29806 = new LinkedHashMap();
        ((LinkedHashMap) term29806).put(term29896, term29896);
        term29662 = newInstance(Class.forName("org.jsoup.helper.HttpConnection"));
        Object term29746 = newInstance(Class.forName("org.jsoup.helper.HttpConnection$Request"));
        setField(term29746, term29746.getClass(), "headers", term29806);
        setField(term29662, term29662.getClass(), "req", term29746);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.helper.HttpConnection");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "";
        try {
            callMethod(klass, "userAgent", argTypes, term29662, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


