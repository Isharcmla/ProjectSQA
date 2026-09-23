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
import java.lang.IllegalArgumentException;
import static org.jsoup.select.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Selector_indexLessThan_1966692131319 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term305299;

    public Selector_indexLessThan_1966692131319() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term305299 = newInstance(Class.forName("org.jsoup.select.Selector"));
        Object term305359 = newInstance(Class.forName("org.jsoup.parser.TokenQueue"));
        setField(term305299, term305299.getClass(), "root", null);
        setField(term305359, term305359.getClass(), "queue", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        ");
        setIntField(term305359, term305359.getClass(), "pos", 632);
        setField(term305299, term305299.getClass(), "tq", term305359);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.select.Selector");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "indexLessThan", argTypes, term305299, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


