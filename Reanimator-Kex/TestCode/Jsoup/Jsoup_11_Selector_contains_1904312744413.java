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

public class Selector_contains_1904312744413 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term748535;

    public Selector_contains_1904312744413() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term748535 = newInstance(Class.forName("org.jsoup.select.Selector"));
        Object term748595 = newInstance(Class.forName("org.jsoup.parser.TokenQueue"));
        setField(term748595, term748595.getClass(), "queue", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        ns ");
        setIntField(term748595, term748595.getClass(), "pos", 497);
        setField(term748535, term748535.getClass(), "tq", term748595);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.select.Selector");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = false;
        callMethod(klass, "contains", argTypes, term748535, args);
    }

};


