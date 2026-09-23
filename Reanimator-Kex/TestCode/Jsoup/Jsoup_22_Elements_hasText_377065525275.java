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

public class Elements_hasText_377065525275 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term40372;

    public Elements_hasText_377065525275() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term40372 = newInstance(Class.forName("org.jsoup.select.Elements"));
        Object term40428 = newInstance(Class.forName("org.jsoup.select.Elements"));
        Object term40484 = newInstance(Class.forName("org.jsoup.select.Elements"));
        setField(term40428, term40428.getClass(), "contents", term40484);
        setField(term40372, term40372.getClass(), "contents", term40428);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.select.Elements");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "hasText", argTypes, term40372, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


