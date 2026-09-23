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

public class Elements_isEmpty_1569264495321 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term56850;

    public Elements_isEmpty_1569264495321() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term56850 = newInstance(Class.forName("org.jsoup.select.Elements"));
        Object term56906 = newInstance(Class.forName("org.jsoup.select.Elements"));
        Object term56962 = newInstance(Class.forName("org.jsoup.select.Elements"));
        setField(term56906, term56906.getClass(), "contents", term56962);
        setField(term56850, term56850.getClass(), "contents", term56906);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.select.Elements");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "isEmpty", argTypes, term56850, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


