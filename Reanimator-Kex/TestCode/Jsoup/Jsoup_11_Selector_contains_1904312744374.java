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

public class Selector_contains_1904312744374 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term706625;

    public Selector_contains_1904312744374() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term706625 = newInstance(Class.forName("org.jsoup.select.Selector"));
        Object term706685 = newInstance(Class.forName("org.jsoup.parser.TokenQueue"));
        setField(term706685, term706685.getClass(), "queue", ":containsOwn                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ");
        setIntField(term706685, term706685.getClass(), "pos", 477);
        setField(term706625, term706625.getClass(), "tq", term706685);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.select.Selector");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = true;
        try {
            callMethod(klass, "contains", argTypes, term706625, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


