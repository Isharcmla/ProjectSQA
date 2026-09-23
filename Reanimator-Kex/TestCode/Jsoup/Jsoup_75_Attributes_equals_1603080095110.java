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

public class Attributes_equals_1603080095110 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term66492;
     Object term66521;
     Object term66814;
     Object term66815;

    public Attributes_equals_1603080095110() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term66492 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        term66521 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        term66814 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setIntField(term66814, term66814.getClass(), "size", 0);
        setField(term66814, term66814.getClass(), "keys", null);
        setField(term66814, term66814.getClass(), "vals", null);
        term66815 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setIntField(term66815, term66815.getClass(), "size", 0);
        setField(term66815, term66815.getClass(), "keys", null);
        setField(term66815, term66815.getClass(), "vals", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attributes");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term66521;
        Object retValue = callMethod(klass, "equals", argTypes, term66492, args);
        assertTrue(recursiveEquals(term66492, term66814));
        assertTrue(recursiveEquals(term66521, term66815));
        assertTrue(recursiveEquals(retValue, true));
    }

};


