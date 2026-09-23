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

public class Selector_combinator_382623539392 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term716548;

    public Selector_combinator_382623539392() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term716548 = newInstance(Class.forName("org.jsoup.select.Selector"));
        Object term716608 = newInstance(Class.forName("org.jsoup.parser.TokenQueue"));
        setField(term716608, term716608.getClass(), "queue", "");
        setIntField(term716608, term716608.getClass(), "pos", 0);
        setField(term716548, term716548.getClass(), "tq", term716608);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.select.Selector");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "~";
        try {
            callMethod(klass, "combinator", argTypes, term716548, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


