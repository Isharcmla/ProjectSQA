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

public class Selector_byTag_1723829414165 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term288228;

    public Selector_byTag_1723829414165() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term288228 = newInstance(Class.forName("org.jsoup.select.Selector"));
        Object term288288 = newInstance(Class.forName("org.jsoup.parser.TokenQueue"));
        setIntField(term288288, term288288.getClass(), "pos", 0);
        setField(term288288, term288288.getClass(), "queue", "");
        setField(term288228, term288228.getClass(), "tq", term288288);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.select.Selector");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "byTag", argTypes, term288228, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


