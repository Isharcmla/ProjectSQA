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

public class Cleaner_copySafeNodes_155774425255 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22919;
     Object term22971;

    public Cleaner_copySafeNodes_155774425255() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term22919 = newInstance(Class.forName("org.jsoup.safety.Cleaner"));
        term22971 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term23017 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term23017, term23017.getClass(), "tagName", "");
        setField(term22971, term22971.getClass(), "tag", term23017);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.safety.Cleaner");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.jsoup.nodes.Element");
        argTypes[1] = Class.forName("org.jsoup.nodes.Element");
        Object[] args = new Object[2];
        args[0] = term22971;
        args[1] = null;
        try {
            callMethod(klass, "copySafeNodes", argTypes, term22919, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


