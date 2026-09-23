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

public class Attributes_removeIgnoreCase_1226208024296 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2323769;
     Object term5001813;

    public Attributes_removeIgnoreCase_1226208024296() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2323769 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term2323674 = (Object[]) newArray("java.lang.String", 1);
        Object[] term2323675 = (Object[]) newArray("java.lang.String", 41);
        setIntField(term2323769, term2323769.getClass(), "size", 1);
        setField(term2323769, term2323769.getClass(), "keys", term2323674);
        setField(term2323769, term2323769.getClass(), "vals", term2323675);
        term5001813 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term5001814 = (Object[]) newArray("java.lang.String", 1);
        Object[] term5001815 = (Object[]) newArray("java.lang.String", 41);
        setIntField(term5001813, term5001813.getClass(), "size", 1);
        setField(term5001813, term5001813.getClass(), "keys", term5001814);
        setField(term5001813, term5001813.getClass(), "vals", term5001815);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attributes");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "";
        callMethod(klass, "removeIgnoreCase", argTypes, term2323769, args);
        assertTrue(recursiveEquals(term2323769, term5001813));
    }

};


