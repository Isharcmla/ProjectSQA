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
import java.lang.Object;

public class HttpConnection_execute_1142184204117 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term289594;

    public HttpConnection_execute_1142184204117() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term289594 = newInstance(Class.forName("org.jsoup.helper.HttpConnection"));
        Object term289678 = newInstance(Class.forName("org.jsoup.helper.HttpConnection$Request"));
        Object term289762 = newInstance(Class.forName("org.jsoup.helper.HttpConnection$Request"));
        setField(term289678, term289678.getClass(), "url", term289762);
        setField(term289594, term289594.getClass(), "req", term289678);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.helper.HttpConnection");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "execute", argTypes, term289594, args);
    }

};


