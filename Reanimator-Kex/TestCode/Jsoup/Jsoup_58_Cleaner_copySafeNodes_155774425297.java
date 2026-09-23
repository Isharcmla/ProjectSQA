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
import java.lang.NullPointerException;
import static org.jsoup.safety.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Cleaner_copySafeNodes_155774425297 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term35256;
     Object term35308;
     Object term35406;

    public Cleaner_copySafeNodes_155774425297() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term35256 = newInstance(Class.forName("org.jsoup.safety.Cleaner"));
        term35308 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term35354 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term35354, term35354.getClass(), "tagName", null);
        setField(term35308, term35308.getClass(), "tag", term35354);
        term35406 = newInstance(Class.forName("org.jsoup.nodes.Element"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.safety.Cleaner");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.jsoup.nodes.Element");
        argTypes[1] = Class.forName("org.jsoup.nodes.Element");
        Object[] args = new Object[2];
        args[0] = term35308;
        args[1] = term35406;
        try {
            callMethod(klass, "copySafeNodes", argTypes, term35256, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


