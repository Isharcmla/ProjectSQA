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
     Object term1255;

    public W3CDom_init_7713842264() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1255 = newInstance(Class.forName("org.jsoup.helper.W3CDom"));
        Object term1256 = newInstance(Class.forName("com.sun.org.apache.xerces.internal.jaxp.DocumentBuilderFactoryImpl"));
        setField(term1256, term1256.getClass(), "attributes", null);
        setField(term1256, term1256.getClass(), "features", null);
        setField(term1256, term1256.getClass(), "grammar", null);
        setBooleanField(term1256, term1256.getClass(), "isXIncludeAware", false);
        setBooleanField(term1256, term1256.getClass(), "fSecureProcess", true);
        setBooleanField(term1256, term1256.getClass(), "validating", false);
        setBooleanField(term1256, term1256.getClass(), "namespaceAware", false);
        setBooleanField(term1256, term1256.getClass(), "whitespace", false);
        setBooleanField(term1256, term1256.getClass(), "expandEntityRef", true);
        setBooleanField(term1256, term1256.getClass(), "ignoreComments", false);
        setBooleanField(term1256, term1256.getClass(), "coalescing", false);
        setField(term1255, term1255.getClass(), "factory", term1256);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.helper.W3CDom");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term1255));
    }

};


