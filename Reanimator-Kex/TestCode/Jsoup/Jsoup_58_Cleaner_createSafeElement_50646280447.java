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

public class Cleaner_createSafeElement_50646280447 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21049;
     Object term21101;

    public Cleaner_createSafeElement_50646280447() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term21049 = newInstance(Class.forName("org.jsoup.safety.Cleaner"));
        term21101 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term21147 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term21147, term21147.getClass(), "tagName", "");
        setField(term21101, term21101.getClass(), "tag", term21147);
        setField(term21101, term21101.getClass(), "baseUri", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.safety.Cleaner");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Element");
        Object[] args = new Object[1];
        args[0] = term21101;
        try {
            callMethod(klass, "createSafeElement", argTypes, term21049, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


