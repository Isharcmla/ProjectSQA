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

public class Attributes_clone_115616870086 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20119;
     Object term20189;
     Object term20187;

    public Attributes_clone_115616870086() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20119 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term20119, term20119.getClass(), "attributes", null);
        term20189 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term20189, term20189.getClass(), "attributes", null);
        term20187 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term20187, term20187.getClass(), "attributes", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attributes");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "clone", argTypes, term20119, args);
        assertTrue(recursiveEquals(term20119, term20189));
        assertTrue(recursiveEquals(retValue, term20187));
    }

};


