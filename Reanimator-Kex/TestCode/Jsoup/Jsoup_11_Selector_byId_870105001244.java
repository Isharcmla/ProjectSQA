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

public class Selector_byId_870105001244 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term544783;

    public Selector_byId_870105001244() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term544783 = newInstance(Class.forName("org.jsoup.select.Selector"));
        Object term544843 = newInstance(Class.forName("org.jsoup.parser.TokenQueue"));
        setIntField(term544843, term544843.getClass(), "pos", 0);
        setField(term544843, term544843.getClass(), "queue", "");
        setField(term544783, term544783.getClass(), "tq", term544843);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.select.Selector");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "byId", argTypes, term544783, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


