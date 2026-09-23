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

public class Elements_html_1639128830272 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39835;

    public Elements_html_1639128830272() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term39835 = newInstance(Class.forName("org.jsoup.select.Elements"));
        Object term39891 = newInstance(Class.forName("org.jsoup.select.Elements"));
        Object term39947 = newInstance(Class.forName("org.jsoup.select.Elements"));
        setField(term39891, term39891.getClass(), "contents", term39947);
        setField(term39835, term39835.getClass(), "contents", term39891);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.select.Elements");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "html", argTypes, term39835, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


