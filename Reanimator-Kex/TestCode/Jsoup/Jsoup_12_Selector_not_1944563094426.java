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

public class Selector_not_1944563094426 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term368457;

    public Selector_not_1944563094426() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term368457 = newInstance(Class.forName("org.jsoup.select.Selector"));
        Object term368517 = newInstance(Class.forName("org.jsoup.parser.TokenQueue"));
        setField(term368517, term368517.getClass(), "queue", "");
        setIntField(term368517, term368517.getClass(), "pos", 0);
        setField(term368457, term368457.getClass(), "tq", term368517);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.select.Selector");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "not", argTypes, term368457, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


