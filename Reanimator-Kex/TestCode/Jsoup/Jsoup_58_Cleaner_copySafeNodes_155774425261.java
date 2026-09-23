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

public class Cleaner_copySafeNodes_155774425261 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24613;
     Object term24665;
     Object term24717;

    public Cleaner_copySafeNodes_155774425261() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term24613 = newInstance(Class.forName("org.jsoup.safety.Cleaner"));
        term24665 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        setField(term24665, term24665.getClass(), "tag", null);
        term24717 = newInstance(Class.forName("org.jsoup.nodes.Element"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.safety.Cleaner");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.jsoup.nodes.Element");
        argTypes[1] = Class.forName("org.jsoup.nodes.Element");
        Object[] args = new Object[2];
        args[0] = term24665;
        args[1] = term24717;
        try {
            callMethod(klass, "copySafeNodes", argTypes, term24613, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


