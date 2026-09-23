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

public class Selector_indexLessThan_1966692131364 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term329182;

    public Selector_indexLessThan_1966692131364() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term329182 = newInstance(Class.forName("org.jsoup.select.Selector"));
        Object term329242 = newInstance(Class.forName("org.jsoup.parser.TokenQueue"));
        setField(term329182, term329182.getClass(), "root", null);
        setField(term329242, term329242.getClass(), "queue", "");
        setIntField(term329242, term329242.getClass(), "pos", 0);
        setField(term329182, term329182.getClass(), "tq", term329242);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.select.Selector");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "indexLessThan", argTypes, term329182, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


