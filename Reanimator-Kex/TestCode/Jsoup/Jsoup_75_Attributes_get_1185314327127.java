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

public class Attributes_get_1185314327127 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term68731;
     Object term69055;

    public Attributes_get_1185314327127() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term68731 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term68660 = (Object[]) newArray("java.lang.String", 489);
        setIntField(term68731, term68731.getClass(), "size", 1);
        setField(term68731, term68731.getClass(), "keys", term68660);
        term69055 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term69056 = (Object[]) newArray("java.lang.String", 489);
        setIntField(term69055, term69055.getClass(), "size", 1);
        setField(term69055, term69055.getClass(), "keys", term69056);
        setField(term69055, term69055.getClass(), "vals", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attributes");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "";
        Object retValue = callMethod(klass, "get", argTypes, term68731, args);
        assertTrue(recursiveEquals(term68731, term69055));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


