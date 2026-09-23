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

public class W3CDom_asString_1204268277 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1235;
     Object term4148;

    public W3CDom_asString_1204268277() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1235 = newInstance(Class.forName("org.jsoup.helper.W3CDom"));
        Object term1236 = newInstance(Class.forName("com.sun.org.apache.xerces.internal.jaxp.DocumentBuilderFactoryImpl"));
        setField(term1236, term1236.getClass(), "attributes", null);
        setField(term1236, term1236.getClass(), "features", null);
        setField(term1236, term1236.getClass(), "grammar", null);
        setBooleanField(term1236, term1236.getClass(), "isXIncludeAware", false);
        setBooleanField(term1236, term1236.getClass(), "fSecureProcess", true);
        setBooleanField(term1236, term1236.getClass(), "validating", false);
        setBooleanField(term1236, term1236.getClass(), "namespaceAware", false);
        setBooleanField(term1236, term1236.getClass(), "whitespace", false);
        setBooleanField(term1236, term1236.getClass(), "expandEntityRef", true);
        setBooleanField(term1236, term1236.getClass(), "ignoreComments", false);
        setBooleanField(term1236, term1236.getClass(), "coalescing", false);
        setField(term1235, term1235.getClass(), "factory", term1236);
        term4148 = newInstance(Class.forName("org.jsoup.helper.W3CDom"));
        Object term4149 = newInstance(Class.forName("com.sun.org.apache.xerces.internal.jaxp.DocumentBuilderFactoryImpl"));
        setField(term4149, term4149.getClass(), "attributes", null);
        setField(term4149, term4149.getClass(), "features", null);
        setField(term4149, term4149.getClass(), "grammar", null);
        setBooleanField(term4149, term4149.getClass(), "isXIncludeAware", false);
        setBooleanField(term4149, term4149.getClass(), "fSecureProcess", true);
        setBooleanField(term4149, term4149.getClass(), "validating", false);
        setBooleanField(term4149, term4149.getClass(), "namespaceAware", false);
        setBooleanField(term4149, term4149.getClass(), "whitespace", false);
        setBooleanField(term4149, term4149.getClass(), "expandEntityRef", true);
        setBooleanField(term4149, term4149.getClass(), "ignoreComments", false);
        setBooleanField(term4149, term4149.getClass(), "coalescing", false);
        setField(term4148, term4148.getClass(), "factory", term4149);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.helper.W3CDom");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.w3c.dom.Document");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "asString", argTypes, term1235, args);
        assertTrue(recursiveEquals(term1235, term4148));
        assertTrue(recursiveEquals(retValue, "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"no\"?>"));
    }

};


