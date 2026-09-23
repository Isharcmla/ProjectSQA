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
import java.util.NoSuchElementException;
import static org.jsoup.parser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.LinkedList;

public class Parser_parseAttribute_147721330359 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term40173;

    public Parser_parseAttribute_147721330359() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedList term40287 = new LinkedList();
        term40173 = newInstance(Class.forName("org.jsoup.parser.Parser"));
        Object term40233 = newInstance(Class.forName("org.jsoup.parser.TokenQueue"));
        setField(term40233, term40233.getClass(), "queue", term40287);
        setField(term40173, term40173.getClass(), "tq", term40233);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Parser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "parseAttribute", argTypes, term40173, args);
            assertTrue(false);
        }
        catch (NoSuchElementException e) {
        }

    }

};


