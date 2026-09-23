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
import java.lang.NullPointerException;
import static org.jsoup.helper.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class HttpConnection_header_169765301159 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1268677;

    public HttpConnection_header_169765301159() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1268677 = newInstance(Class.forName("org.jsoup.helper.HttpConnection"));
        Object term1268761 = newInstance(Class.forName("org.jsoup.helper.HttpConnection$Request"));
        setField(term1268761, term1268761.getClass(), "headers", null);
        setField(term1268677, term1268677.getClass(), "req", term1268761);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.helper.HttpConnection");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ";
        args[1] = "";
        try {
            callMethod(klass, "header", argTypes, term1268677, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


