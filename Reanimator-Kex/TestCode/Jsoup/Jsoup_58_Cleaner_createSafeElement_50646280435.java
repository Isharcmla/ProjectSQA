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

public class Cleaner_createSafeElement_50646280435 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15888;
     Object term15940;

    public Cleaner_createSafeElement_50646280435() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15888 = newInstance(Class.forName("org.jsoup.safety.Cleaner"));
        LinkedHashMap term16180 = new LinkedHashMap();
        term15940 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term15986 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term16120 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term15986, term15986.getClass(), "tagName", "");
        setField(term15940, term15940.getClass(), "tag", term15986);
        setField(term15940, term15940.getClass(), "baseUri", "                                                                                                                    ");
        setField(term16120, term16120.getClass(), "attributes", term16180);
        setField(term15940, term15940.getClass(), "attributes", term16120);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.safety.Cleaner");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Element");
        Object[] args = new Object[1];
        args[0] = term15940;
        try {
            callMethod(klass, "createSafeElement", argTypes, term15888, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


