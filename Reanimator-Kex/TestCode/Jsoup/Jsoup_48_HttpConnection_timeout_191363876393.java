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
import java.lang.IllegalArgumentException;
import static org.jsoup.helper.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class HttpConnection_timeout_191363876393 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39970;

    public HttpConnection_timeout_191363876393() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term39970 = newInstance(Class.forName("org.jsoup.helper.HttpConnection"));
        Object term40054 = newInstance(Class.forName("org.jsoup.helper.HttpConnection$Request"));
        setField(term39970, term39970.getClass(), "req", term40054);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.helper.HttpConnection");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = -1;
        try {
            callMethod(klass, "timeout", argTypes, term39970, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


