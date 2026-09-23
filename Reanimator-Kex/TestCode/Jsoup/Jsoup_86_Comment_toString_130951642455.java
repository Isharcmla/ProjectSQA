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

public class Comment_toString_130951642455 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term154894;
     Object term206000;

    public Comment_toString_130951642455() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term154894 = newInstance(Class.forName("org.jsoup.nodes.Comment"));
        term206000 = newInstance(Class.forName("org.jsoup.nodes.Comment"));
        setField(term206000, term206000.getClass(), "value", null);
        setField(term206000, term206000.getClass(), "parentNode", null);
        setIntField(term206000, term206000.getClass(), "siblingIndex", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Comment");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "toString", argTypes, term154894, args);
        assertTrue(recursiveEquals(term154894, term206000));
        assertTrue(recursiveEquals(retValue, "\n<!--null-->"));
    }

};


