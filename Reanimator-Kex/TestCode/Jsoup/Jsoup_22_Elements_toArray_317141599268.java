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

public class Elements_toArray_317141599268 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39023;

    public Elements_toArray_317141599268() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term39023 = newInstance(Class.forName("org.jsoup.select.Elements"));
        Object term39079 = newInstance(Class.forName("org.jsoup.select.Elements"));
        Object term39135 = newInstance(Class.forName("org.jsoup.select.Elements"));
        setField(term39079, term39079.getClass(), "contents", term39135);
        setField(term39023, term39023.getClass(), "contents", term39079);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.select.Elements");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "toArray", argTypes, term39023, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


