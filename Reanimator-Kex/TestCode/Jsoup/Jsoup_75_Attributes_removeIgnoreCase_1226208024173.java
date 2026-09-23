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

public class Attributes_removeIgnoreCase_1226208024173 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term346807;
     Object term346857;

    public Attributes_removeIgnoreCase_1226208024173() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term346807 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term346736 = (Object[]) newArray("java.lang.String", 489);
        setIntField(term346807, term346807.getClass(), "size", 1);
        setField(term346807, term346807.getClass(), "keys", term346736);
        term346857 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term346858 = (Object[]) newArray("java.lang.String", 489);
        setIntField(term346857, term346857.getClass(), "size", 1);
        setField(term346857, term346857.getClass(), "keys", term346858);
        setField(term346857, term346857.getClass(), "vals", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attributes");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "";
        callMethod(klass, "removeIgnoreCase", argTypes, term346807, args);
        assertTrue(recursiveEquals(term346807, term346857));
    }

};


