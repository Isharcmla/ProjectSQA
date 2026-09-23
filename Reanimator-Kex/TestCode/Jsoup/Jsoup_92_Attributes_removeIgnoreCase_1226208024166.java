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

public class Attributes_removeIgnoreCase_1226208024166 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term306147;
     Object term443086;

    public Attributes_removeIgnoreCase_1226208024166() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term306147 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term306076 = (Object[]) newArray("java.lang.String", 489);
        setIntField(term306147, term306147.getClass(), "size", 1);
        setField(term306147, term306147.getClass(), "keys", term306076);
        term443086 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term443087 = (Object[]) newArray("java.lang.String", 489);
        setIntField(term443086, term443086.getClass(), "size", 1);
        setField(term443086, term443086.getClass(), "keys", term443087);
        setField(term443086, term443086.getClass(), "vals", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attributes");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "";
        callMethod(klass, "removeIgnoreCase", argTypes, term306147, args);
        assertTrue(recursiveEquals(term306147, term443086));
    }

};


