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
     Object term45480;
     Object term51401;

    public W3CDom_asString_1204268277() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term45480 = newInstance(Class.forName("org.jsoup.helper.W3CDom"));
        Object term45481 = newInstance(Class.forName("com.sun.org.apache.xerces.internal.jaxp.DocumentBuilderFactoryImpl"));
        setField(term45481, term45481.getClass(), "attributes", null);
        setField(term45481, term45481.getClass(), "features", null);
        setField(term45481, term45481.getClass(), "grammar", null);
        setBooleanField(term45481, term45481.getClass(), "isXIncludeAware", false);
        setBooleanField(term45481, term45481.getClass(), "fSecureProcess", true);
        setBooleanField(term45481, term45481.getClass(), "validating", false);
        setBooleanField(term45481, term45481.getClass(), "namespaceAware", false);
        setBooleanField(term45481, term45481.getClass(), "whitespace", false);
        setBooleanField(term45481, term45481.getClass(), "expandEntityRef", true);
        setBooleanField(term45481, term45481.getClass(), "ignoreComments", false);
        setBooleanField(term45481, term45481.getClass(), "coalescing", false);
        setField(term45480, term45480.getClass(), "factory", term45481);
        term51401 = newInstance(Class.forName("org.jsoup.helper.W3CDom"));
        Object term51402 = newInstance(Class.forName("com.sun.org.apache.xerces.internal.jaxp.DocumentBuilderFactoryImpl"));
        setField(term51402, term51402.getClass(), "attributes", null);
        setField(term51402, term51402.getClass(), "features", null);
        setField(term51402, term51402.getClass(), "grammar", null);
        setBooleanField(term51402, term51402.getClass(), "isXIncludeAware", false);
        setBooleanField(term51402, term51402.getClass(), "fSecureProcess", true);
        setBooleanField(term51402, term51402.getClass(), "validating", false);
        setBooleanField(term51402, term51402.getClass(), "namespaceAware", false);
        setBooleanField(term51402, term51402.getClass(), "whitespace", false);
        setBooleanField(term51402, term51402.getClass(), "expandEntityRef", true);
        setBooleanField(term51402, term51402.getClass(), "ignoreComments", false);
        setBooleanField(term51402, term51402.getClass(), "coalescing", false);
        setField(term51401, term51401.getClass(), "factory", term51402);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.helper.W3CDom");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.w3c.dom.Document");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "asString", argTypes, term45480, args);
        assertTrue(recursiveEquals(term45480, term51401));
        assertTrue(recursiveEquals(retValue, "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"no\"?>"));
    }

};


