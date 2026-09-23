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
import java.lang.Boolean;

public class Selector_matches_143503451654 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2645;
     Object term2646;

    public Selector_matches_143503451654() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2645 = newInstance(Class.forName("org.jsoup.select.Selector"));
        setField(term2645, term2645.getClass(), "root", null);
        setField(term2645, term2645.getClass(), "elements", null);
        setField(term2645, term2645.getClass(), "query", null);
        setField(term2645, term2645.getClass(), "tq", null);
        term2646 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.select.Selector");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term2646;
        try {
            callMethod(klass, "matches", argTypes, term2645, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


