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
import java.lang.Object;

public class Attributes_put_28062925364 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5820422;
     Object term7039776;
     Object term7039769;

    public Attributes_put_28062925364() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5820422 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term5819402 = (Object[]) newArray("java.lang.String", 493);
        setIntField(term5820422, term5820422.getClass(), "size", 7);
        setElement(term5819402, 5, "");
        setField(term5820422, term5820422.getClass(), "keys", term5819402);
        term7039776 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term7039777 = (Object[]) newArray("java.lang.String", 493);
        setIntField(term7039776, term7039776.getClass(), "size", 7);
        setElement(term7039777, 5, "");
        setField(term7039776, term7039776.getClass(), "keys", term7039777);
        setField(term7039776, term7039776.getClass(), "vals", null);
        term7039769 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term7039771 = (Object[]) newArray("java.lang.String", 493);
        setIntField(term7039769, term7039769.getClass(), "size", 7);
        setElement(term7039771, 5, "");
        setField(term7039769, term7039769.getClass(), "keys", term7039771);
        setField(term7039769, term7039769.getClass(), "vals", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attributes");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = " ";
        args[1] = false;
        Object retValue = callMethod(klass, "put", argTypes, term5820422, args);
        assertTrue(recursiveEquals(term5820422, term7039776));
        assertTrue(recursiveEquals(retValue, term7039769));
    }

};


