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
import static org.jsoup.select.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Selector_contains_1904312744296 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term294021;

    public Selector_contains_1904312744296() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term294021 = newInstance(Class.forName("org.jsoup.select.Selector"));
        Object term294081 = newInstance(Class.forName("org.jsoup.parser.TokenQueue"));
        setField(term294081, term294081.getClass(), "queue", "");
        setIntField(term294081, term294081.getClass(), "pos", 0);
        setField(term294021, term294021.getClass(), "tq", term294081);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.select.Selector");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = true;
        try {
            callMethod(klass, "contains", argTypes, term294021, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


