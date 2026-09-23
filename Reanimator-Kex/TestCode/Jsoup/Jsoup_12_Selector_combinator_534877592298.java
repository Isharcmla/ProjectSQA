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

public class Selector_combinator_534877592298 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term294596;

    public Selector_combinator_534877592298() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term294596 = newInstance(Class.forName("org.jsoup.select.Selector"));
        Object term294656 = newInstance(Class.forName("org.jsoup.parser.TokenQueue"));
        setField(term294656, term294656.getClass(), "queue", "  ");
        setIntField(term294656, term294656.getClass(), "pos", 2);
        setField(term294596, term294596.getClass(), "tq", term294656);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.select.Selector");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = char.class;
        Object[] args = new Object[1];
        args[0] = (char) 62;
        try {
            callMethod(klass, "combinator", argTypes, term294596, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


