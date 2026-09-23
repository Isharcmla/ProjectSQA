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

public class Attributes_indexOfKey_193842428574 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14694891;
     Object term15607152;

    public Attributes_indexOfKey_193842428574() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14694891 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term14693539 = (Object[]) newArray("java.lang.String", 11);
        setIntField(term14694891, term14694891.getClass(), "size", 6);
        setElement(term14693539, 1, " ");
        setElement(term14693539, 5, "");
        setElement(term14693539, 6, "");
        setElement(term14693539, 7, "");
        setElement(term14693539, 8, "");
        setElement(term14693539, 9, "");
        setElement(term14693539, 10, "");
        setField(term14694891, term14694891.getClass(), "keys", term14693539);
        term15607152 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term15607153 = (Object[]) newArray("java.lang.String", 11);
        setIntField(term15607152, term15607152.getClass(), "size", 6);
        setElement(term15607153, 1, " ");
        setElement(term15607153, 5, "");
        setElement(term15607153, 6, "");
        setElement(term15607153, 7, "");
        setElement(term15607153, 8, "");
        setElement(term15607153, 9, "");
        setElement(term15607153, 10, "");
        setField(term15607152, term15607152.getClass(), "keys", term15607153);
        setField(term15607152, term15607152.getClass(), "vals", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attributes");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "                                ";
        Object retValue = callMethod(klass, "indexOfKey", argTypes, term14694891, args);
        assertTrue(recursiveEquals(term14694891, term15607152));
        assertTrue(recursiveEquals(retValue, -1));
    }

};


