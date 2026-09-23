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

public class Cleaner_createSafeElement_50646280423 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10889;
     Object term10941;

    public Cleaner_createSafeElement_50646280423() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10889 = newInstance(Class.forName("org.jsoup.safety.Cleaner"));
        LinkedHashMap term11181 = new LinkedHashMap();
        term10941 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term10987 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term11121 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term10987, term10987.getClass(), "tagName", "");
        setField(term10941, term10941.getClass(), "tag", term10987);
        setField(term10941, term10941.getClass(), "baseUri", "                                                                                                                    ");
        setField(term11121, term11121.getClass(), "attributes", term11181);
        setField(term10941, term10941.getClass(), "attributes", term11121);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.safety.Cleaner");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Element");
        Object[] args = new Object[1];
        args[0] = term10941;
        try {
            callMethod(klass, "createSafeElement", argTypes, term10889, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


