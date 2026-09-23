package org.jsoup.safety;

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
import static org.jsoup.safety.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Cleaner_createSafeElement_50646280483 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31209;
     Object term31263;

    public Cleaner_createSafeElement_50646280483() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term31209 = newInstance(Class.forName("org.jsoup.safety.Cleaner"));
        term31263 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        Object term31309 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term31309, term31309.getClass(), "tagName", "");
        setField(term31263, term31263.getClass(), "tag", term31309);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.safety.Cleaner");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Element");
        Object[] args = new Object[1];
        args[0] = term31263;
        try {
            callMethod(klass, "createSafeElement", argTypes, term31209, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


