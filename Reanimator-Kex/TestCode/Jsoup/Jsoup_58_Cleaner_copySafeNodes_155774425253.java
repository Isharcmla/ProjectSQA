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
import static org.jsoup.safety.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.jsoup.safety.EqualityUtils.*;

public class Cleaner_copySafeNodes_155774425253 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22726;
     Object term22778;
     Object term22796;
     Object term22797;

    public Cleaner_copySafeNodes_155774425253() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term22726 = newInstance(Class.forName("org.jsoup.safety.Cleaner"));
        term22778 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        term22796 = newInstance(Class.forName("org.jsoup.safety.Cleaner"));
        setField(term22796, term22796.getClass(), "whitelist", null);
        term22797 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        setField(term22797, term22797.getClass(), "tag", null);
        setField(term22797, term22797.getClass(), "parentNode", null);
        setField(term22797, term22797.getClass(), "childNodes", null);
        setField(term22797, term22797.getClass(), "attributes", null);
        setField(term22797, term22797.getClass(), "baseUri", null);
        setIntField(term22797, term22797.getClass(), "siblingIndex", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.safety.Cleaner");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.jsoup.nodes.Element");
        argTypes[1] = Class.forName("org.jsoup.nodes.Element");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term22778;
        Object retValue = callMethod(klass, "copySafeNodes", argTypes, term22726, args);
        assertTrue(recursiveEquals(term22726, term22796));
        assertTrue(recursiveEquals(term22778, term22797));
        assertTrue(recursiveEquals(retValue, 0));
    }

};


