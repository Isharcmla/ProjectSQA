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

public class Cleaner_createSafeElement_50646280427 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12748;
     Object term12800;

    public Cleaner_createSafeElement_50646280427() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12748 = newInstance(Class.forName("org.jsoup.safety.Cleaner"));
        term12800 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term12846 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term12846, term12846.getClass(), "tagName", null);
        setField(term12800, term12800.getClass(), "tag", term12846);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.safety.Cleaner");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Element");
        Object[] args = new Object[1];
        args[0] = term12800;
        try {
            callMethod(klass, "createSafeElement", argTypes, term12748, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


