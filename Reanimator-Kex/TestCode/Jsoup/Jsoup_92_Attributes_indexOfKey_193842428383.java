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

public class Attributes_indexOfKey_193842428383 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6795262;
     Object term8244492;

    public Attributes_indexOfKey_193842428383() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6795262 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setIntField(term6795262, term6795262.getClass(), "size", 0);
        term8244492 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setIntField(term8244492, term8244492.getClass(), "size", 0);
        setField(term8244492, term8244492.getClass(), "keys", null);
        setField(term8244492, term8244492.getClass(), "vals", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attributes");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "";
        Object retValue = callMethod(klass, "indexOfKey", argTypes, term6795262, args);
        assertTrue(recursiveEquals(term6795262, term8244492));
        assertTrue(recursiveEquals(retValue, -1));
    }

};


