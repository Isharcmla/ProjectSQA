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
import java.util.LinkedHashMap;

public class Cleaner_createSafeElement_50646280467 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26478;
     Object term26530;

    public Cleaner_createSafeElement_50646280467() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26478 = newInstance(Class.forName("org.jsoup.safety.Cleaner"));
        setField(term26478, term26478.getClass(), "whitelist", null);
        LinkedHashMap term26732 = new LinkedHashMap();
        term26530 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term26576 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term26672 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term26576, term26576.getClass(), "tagName", "");
        setField(term26530, term26530.getClass(), "tag", term26576);
        setField(term26530, term26530.getClass(), "baseUri", "");
        setField(term26672, term26672.getClass(), "attributes", term26732);
        setField(term26530, term26530.getClass(), "attributes", term26672);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.safety.Cleaner");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Element");
        Object[] args = new Object[1];
        args[0] = term26530;
        try {
            callMethod(klass, "createSafeElement", argTypes, term26478, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


