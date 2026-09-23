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

public class Attributes_remove_29036394285 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term62721;
     Object term62785;

    public Attributes_remove_29036394285() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term62721 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term62649 = (Object[]) newArray("java.lang.String", 489);
        setIntField(term62721, term62721.getClass(), "size", 1);
        setField(term62721, term62721.getClass(), "keys", term62649);
        term62785 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term62786 = (Object[]) newArray("java.lang.String", 489);
        setIntField(term62785, term62785.getClass(), "size", 1);
        setField(term62785, term62785.getClass(), "keys", term62786);
        setField(term62785, term62785.getClass(), "vals", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attributes");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "";
        callMethod(klass, "remove", argTypes, term62721, args);
        assertTrue(recursiveEquals(term62721, term62785));
    }

};


