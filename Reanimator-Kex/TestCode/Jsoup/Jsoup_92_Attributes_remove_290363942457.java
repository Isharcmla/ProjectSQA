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

public class Attributes_remove_290363942457 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10131347;
     Object term10861862;

    public Attributes_remove_290363942457() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10131347 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term10127510 = (Object[]) newArray("java.lang.String", 495);
        setIntField(term10131347, term10131347.getClass(), "size", 8);
        setElement(term10127510, 2, " ");
        setElement(term10127510, 4, "                    ");
        setElement(term10127510, 6, "  ");
        setField(term10131347, term10131347.getClass(), "keys", term10127510);
        term10861862 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term10861863 = (Object[]) newArray("java.lang.String", 495);
        setIntField(term10861862, term10861862.getClass(), "size", 8);
        setElement(term10861863, 2, " ");
        setElement(term10861863, 4, "                    ");
        setElement(term10861863, 6, "  ");
        setField(term10861862, term10861862.getClass(), "keys", term10861863);
        setField(term10861862, term10861862.getClass(), "vals", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attributes");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "                                                 ";
        callMethod(klass, "remove", argTypes, term10131347, args);
        assertTrue(recursiveEquals(term10131347, term10861862));
    }

};


