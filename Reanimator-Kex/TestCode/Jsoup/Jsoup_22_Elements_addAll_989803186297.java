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

public class Elements_addAll_989803186297 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term52058;

    public Elements_addAll_989803186297() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term52058 = newInstance(Class.forName("org.jsoup.select.Elements"));
        Object term52114 = newInstance(Class.forName("org.jsoup.select.Elements"));
        Object term52170 = newInstance(Class.forName("org.jsoup.select.Elements"));
        Object term52226 = newInstance(Class.forName("org.jsoup.select.Elements"));
        setField(term52170, term52170.getClass(), "contents", term52226);
        setField(term52114, term52114.getClass(), "contents", term52170);
        setField(term52058, term52058.getClass(), "contents", term52114);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.select.Elements");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Collection");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "addAll", argTypes, term52058, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


