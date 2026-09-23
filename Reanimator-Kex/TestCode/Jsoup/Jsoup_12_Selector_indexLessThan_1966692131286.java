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

public class Selector_indexLessThan_1966692131286 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term290889;

    public Selector_indexLessThan_1966692131286() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term290889 = newInstance(Class.forName("org.jsoup.select.Selector"));
        Object term290949 = newInstance(Class.forName("org.jsoup.parser.TokenQueue"));
        setField(term290889, term290889.getClass(), "root", null);
        setField(term290949, term290949.getClass(), "queue", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
        setIntField(term290949, term290949.getClass(), "pos", 489);
        setField(term290889, term290889.getClass(), "tq", term290949);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.select.Selector");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "indexLessThan", argTypes, term290889, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


