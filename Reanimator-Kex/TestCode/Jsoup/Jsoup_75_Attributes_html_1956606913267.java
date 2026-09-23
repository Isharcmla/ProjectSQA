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

public class Attributes_html_1956606913267 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1820338;
     Object term1825692;

    public Attributes_html_1956606913267() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1820338 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        term1825692 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setIntField(term1825692, term1825692.getClass(), "size", 0);
        setField(term1825692, term1825692.getClass(), "keys", null);
        setField(term1825692, term1825692.getClass(), "vals", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attributes");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "html", argTypes, term1820338, args);
        assertTrue(recursiveEquals(term1820338, term1825692));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


