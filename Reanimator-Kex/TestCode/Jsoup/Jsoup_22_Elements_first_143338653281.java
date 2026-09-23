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

public class Elements_first_143338653281 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term41446;

    public Elements_first_143338653281() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term41446 = newInstance(Class.forName("org.jsoup.select.Elements"));
        Object term41502 = newInstance(Class.forName("org.jsoup.select.Elements"));
        Object term41558 = newInstance(Class.forName("org.jsoup.select.Elements"));
        setField(term41502, term41502.getClass(), "contents", term41558);
        setField(term41446, term41446.getClass(), "contents", term41502);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.select.Elements");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "first", argTypes, term41446, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


