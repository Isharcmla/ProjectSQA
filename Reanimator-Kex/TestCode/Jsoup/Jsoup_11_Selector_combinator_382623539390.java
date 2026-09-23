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

public class Selector_combinator_382623539390 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term715894;

    public Selector_combinator_382623539390() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term715894 = newInstance(Class.forName("org.jsoup.select.Selector"));
        Object term715954 = newInstance(Class.forName("org.jsoup.parser.TokenQueue"));
        setField(term715954, term715954.getClass(), "queue", "");
        setIntField(term715954, term715954.getClass(), "pos", 0);
        setField(term715894, term715894.getClass(), "tq", term715954);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.select.Selector");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "+";
        try {
            callMethod(klass, "combinator", argTypes, term715894, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


