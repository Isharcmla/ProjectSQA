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

public class Cleaner_createSafeElement_50646280431 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13983;
     Object term14035;

    public Cleaner_createSafeElement_50646280431() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13983 = newInstance(Class.forName("org.jsoup.safety.Cleaner"));
        LinkedHashMap term14275 = new LinkedHashMap();
        term14035 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term14081 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term14215 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term14081, term14081.getClass(), "tagName", "");
        setField(term14035, term14035.getClass(), "tag", term14081);
        setField(term14035, term14035.getClass(), "baseUri", "                                                                                                                    ");
        setField(term14215, term14215.getClass(), "attributes", term14275);
        setField(term14035, term14035.getClass(), "attributes", term14215);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.safety.Cleaner");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Element");
        Object[] args = new Object[1];
        args[0] = term14035;
        try {
            callMethod(klass, "createSafeElement", argTypes, term13983, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


