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

public class Cleaner_createSafeElement_50646280429 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11913;
     Object term11965;

    public Cleaner_createSafeElement_50646280429() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11913 = newInstance(Class.forName("org.jsoup.safety.Cleaner"));
        term11965 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term12011 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term12145 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term12011, term12011.getClass(), "tagName", "");
        setField(term11965, term11965.getClass(), "tag", term12011);
        setField(term11965, term11965.getClass(), "baseUri", "");
        setField(term12145, term12145.getClass(), "attributes", null);
        setField(term11965, term11965.getClass(), "attributes", term12145);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.safety.Cleaner");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Element");
        Object[] args = new Object[1];
        args[0] = term11965;
        try {
            callMethod(klass, "createSafeElement", argTypes, term11913, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


