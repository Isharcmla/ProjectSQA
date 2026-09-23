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

public class Selector_matches_1435034516322 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term307938;

    public Selector_matches_1435034516322() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term307938 = newInstance(Class.forName("org.jsoup.select.Selector"));
        Object term307998 = newInstance(Class.forName("org.jsoup.parser.TokenQueue"));
        setField(term307998, term307998.getClass(), "queue", "");
        setIntField(term307998, term307998.getClass(), "pos", 0);
        setField(term307938, term307938.getClass(), "tq", term307998);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.select.Selector");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = false;
        try {
            callMethod(klass, "matches", argTypes, term307938, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


