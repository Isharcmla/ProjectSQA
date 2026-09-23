package org.jsoup.parser;

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
import java.lang.ClassCastException;
import static org.jsoup.parser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.LinkedList;

public class Parser_parse_16582043093 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term50575;

    public Parser_parse_16582043093() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term50779 = newInstance(Class.forName("java.lang.Object"));
        LinkedList term50689 = new LinkedList();
        ((LinkedList) term50689).add(term50779);
        ((LinkedList) term50689).add((Object)null);
        term50575 = newInstance(Class.forName("org.jsoup.parser.Parser"));
        Object term50635 = newInstance(Class.forName("org.jsoup.parser.TokenQueue"));
        setField(term50635, term50635.getClass(), "queue", term50689);
        setField(term50575, term50575.getClass(), "tq", term50635);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Parser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "parse", argTypes, term50575, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


