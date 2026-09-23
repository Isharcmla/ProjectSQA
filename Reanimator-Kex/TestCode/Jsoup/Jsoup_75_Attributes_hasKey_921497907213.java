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

public class Attributes_hasKey_921497907213 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term582125;
     Object term582176;

    public Attributes_hasKey_921497907213() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term582125 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term582054 = (Object[]) newArray("java.lang.String", 489);
        setIntField(term582125, term582125.getClass(), "size", 1);
        setField(term582125, term582125.getClass(), "keys", term582054);
        term582176 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term582177 = (Object[]) newArray("java.lang.String", 489);
        setIntField(term582176, term582176.getClass(), "size", 1);
        setField(term582176, term582176.getClass(), "keys", term582177);
        setField(term582176, term582176.getClass(), "vals", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attributes");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "";
        Object retValue = callMethod(klass, "hasKey", argTypes, term582125, args);
        assertTrue(recursiveEquals(term582125, term582176));
        assertTrue(recursiveEquals(retValue, false));
    }

};


