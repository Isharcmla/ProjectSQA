package org.jsoup.helper;

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
import static org.jsoup.helper.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.jsoup.helper.EqualityUtils.*;
import java.lang.Object;

public class W3CDom_init_7713842264 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45522;

    public W3CDom_init_7713842264() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term45522 = newInstance(Class.forName("org.jsoup.helper.W3CDom"));
        Object term45523 = newInstance(Class.forName("com.sun.org.apache.xerces.internal.jaxp.DocumentBuilderFactoryImpl"));
        setField(term45523, term45523.getClass(), "attributes", null);
        setField(term45523, term45523.getClass(), "features", null);
        setField(term45523, term45523.getClass(), "grammar", null);
        setBooleanField(term45523, term45523.getClass(), "isXIncludeAware", false);
        setBooleanField(term45523, term45523.getClass(), "fSecureProcess", true);
        setBooleanField(term45523, term45523.getClass(), "validating", false);
        setBooleanField(term45523, term45523.getClass(), "namespaceAware", false);
        setBooleanField(term45523, term45523.getClass(), "whitespace", false);
        setBooleanField(term45523, term45523.getClass(), "expandEntityRef", true);
        setBooleanField(term45523, term45523.getClass(), "ignoreComments", false);
        setBooleanField(term45523, term45523.getClass(), "coalescing", false);
        setField(term45522, term45522.getClass(), "factory", term45523);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.helper.W3CDom");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term45522));
    }

};


