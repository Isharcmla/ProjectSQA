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

public class Cleaner_createSafeElement_50646280421 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9418;
     Object term9470;

    public Cleaner_createSafeElement_50646280421() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9418 = newInstance(Class.forName("org.jsoup.safety.Cleaner"));
        LinkedHashMap term9710 = new LinkedHashMap();
        term9470 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term9516 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term9650 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term9516, term9516.getClass(), "tagName", "");
        setField(term9470, term9470.getClass(), "tag", term9516);
        setField(term9470, term9470.getClass(), "baseUri", "                                                                                                                    ");
        setField(term9650, term9650.getClass(), "attributes", term9710);
        setField(term9470, term9470.getClass(), "attributes", term9650);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.safety.Cleaner");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Element");
        Object[] args = new Object[1];
        args[0] = term9470;
        try {
            callMethod(klass, "createSafeElement", argTypes, term9418, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


