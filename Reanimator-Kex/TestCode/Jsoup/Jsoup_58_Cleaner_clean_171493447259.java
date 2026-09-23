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
import java.lang.NoClassDefFoundError;
import static org.jsoup.safety.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Cleaner_clean_171493447259 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23989;
     Object term24043;

    public Cleaner_clean_171493447259() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23989 = newInstance(Class.forName("org.jsoup.safety.Cleaner"));
        term24043 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        setField(term24043, term24043.getClass(), "baseUri", "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.safety.Cleaner");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Document");
        Object[] args = new Object[1];
        args[0] = term24043;
        try {
            callMethod(klass, "clean", argTypes, term23989, args);
            assertTrue(false);
        }
        catch (NoClassDefFoundError e) {
        }

    }

};


