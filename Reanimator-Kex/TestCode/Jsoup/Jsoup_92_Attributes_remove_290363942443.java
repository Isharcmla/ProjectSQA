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

public class Attributes_remove_290363942443 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9875604;
     Object term9875706;

    public Attributes_remove_290363942443() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9875604 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term9873944 = (Object[]) newArray("java.lang.String", 489);
        setIntField(term9875604, term9875604.getClass(), "size", 5);
        setElement(term9873944, 2, "");
        setField(term9875604, term9875604.getClass(), "keys", term9873944);
        term9875706 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term9875707 = (Object[]) newArray("java.lang.String", 489);
        setIntField(term9875706, term9875706.getClass(), "size", 5);
        setElement(term9875707, 2, "");
        setField(term9875706, term9875706.getClass(), "keys", term9875707);
        setField(term9875706, term9875706.getClass(), "vals", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attributes");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "  ";
        callMethod(klass, "remove", argTypes, term9875604, args);
        assertTrue(recursiveEquals(term9875604, term9875706));
    }

};


