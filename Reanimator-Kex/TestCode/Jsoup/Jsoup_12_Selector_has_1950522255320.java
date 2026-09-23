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

public class Selector_has_1950522255320 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term306406;

    public Selector_has_1950522255320() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term306406 = newInstance(Class.forName("org.jsoup.select.Selector"));
        Object term306466 = newInstance(Class.forName("org.jsoup.parser.TokenQueue"));
        setField(term306466, term306466.getClass(), "queue", "");
        setIntField(term306466, term306466.getClass(), "pos", 0);
        setField(term306406, term306406.getClass(), "tq", term306466);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.select.Selector");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "has", argTypes, term306406, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


