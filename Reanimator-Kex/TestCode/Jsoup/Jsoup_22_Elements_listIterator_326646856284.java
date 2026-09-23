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

public class Elements_listIterator_326646856284 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term41986;

    public Elements_listIterator_326646856284() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term41986 = newInstance(Class.forName("org.jsoup.select.Elements"));
        Object term42042 = newInstance(Class.forName("org.jsoup.select.Elements"));
        Object term42098 = newInstance(Class.forName("org.jsoup.select.Elements"));
        setField(term42042, term42042.getClass(), "contents", term42098);
        setField(term41986, term41986.getClass(), "contents", term42042);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.select.Elements");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        try {
            callMethod(klass, "listIterator", argTypes, term41986, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


