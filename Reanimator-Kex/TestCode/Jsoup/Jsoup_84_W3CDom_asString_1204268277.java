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
     Object term45502;
     Object term50209;

    public W3CDom_asString_1204268277() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term45502 = newInstance(Class.forName("org.jsoup.helper.W3CDom"));
        Object term45503 = newInstance(Class.forName("com.sun.org.apache.xerces.internal.jaxp.DocumentBuilderFactoryImpl"));
        setField(term45503, term45503.getClass(), "attributes", null);
        setField(term45503, term45503.getClass(), "features", null);
        setField(term45503, term45503.getClass(), "grammar", null);
        setBooleanField(term45503, term45503.getClass(), "isXIncludeAware", false);
        setBooleanField(term45503, term45503.getClass(), "fSecureProcess", true);
        setBooleanField(term45503, term45503.getClass(), "validating", false);
        setBooleanField(term45503, term45503.getClass(), "namespaceAware", false);
        setBooleanField(term45503, term45503.getClass(), "whitespace", false);
        setBooleanField(term45503, term45503.getClass(), "expandEntityRef", true);
        setBooleanField(term45503, term45503.getClass(), "ignoreComments", false);
        setBooleanField(term45503, term45503.getClass(), "coalescing", false);
        setField(term45502, term45502.getClass(), "factory", term45503);
        term50209 = newInstance(Class.forName("org.jsoup.helper.W3CDom"));
        Object term50210 = newInstance(Class.forName("com.sun.org.apache.xerces.internal.jaxp.DocumentBuilderFactoryImpl"));
        setField(term50210, term50210.getClass(), "attributes", null);
        setField(term50210, term50210.getClass(), "features", null);
        setField(term50210, term50210.getClass(), "grammar", null);
        setBooleanField(term50210, term50210.getClass(), "isXIncludeAware", false);
        setBooleanField(term50210, term50210.getClass(), "fSecureProcess", true);
        setBooleanField(term50210, term50210.getClass(), "validating", false);
        setBooleanField(term50210, term50210.getClass(), "namespaceAware", false);
        setBooleanField(term50210, term50210.getClass(), "whitespace", false);
        setBooleanField(term50210, term50210.getClass(), "expandEntityRef", true);
        setBooleanField(term50210, term50210.getClass(), "ignoreComments", false);
        setBooleanField(term50210, term50210.getClass(), "coalescing", false);
        setField(term50209, term50209.getClass(), "factory", term50210);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.helper.W3CDom");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.w3c.dom.Document");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "asString", argTypes, term45502, args);
        assertTrue(recursiveEquals(term45502, term50209));
        assertTrue(recursiveEquals(retValue, "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"no\"?>"));
    }

};


