package org.jsoup.nodes;

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
import static org.jsoup.nodes.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.jsoup.nodes.EqualityUtils.*;
import java.util.LinkedHashMap;

public class Attributes_clone_115616870073 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15482;
     Object term15927;
     Object term15920;

    public Attributes_clone_115616870073() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedHashMap term15542 = new LinkedHashMap();
        term15482 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term15482, term15482.getClass(), "attributes", term15542);
        LinkedHashMap term15928 = new LinkedHashMap();
        term15927 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term15927, term15927.getClass(), "attributes", term15928);
        LinkedHashMap term15921 = new LinkedHashMap();
        term15920 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term15920, term15920.getClass(), "attributes", term15921);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attributes");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "clone", argTypes, term15482, args);
        assertTrue(recursiveEquals(term15482, term15927));
        assertTrue(recursiveEquals(retValue, term15920));
    }

};


