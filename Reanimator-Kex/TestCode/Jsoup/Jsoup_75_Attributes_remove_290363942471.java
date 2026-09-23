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

public class Attributes_remove_290363942471 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9043726;
     Object term9784967;

    public Attributes_remove_290363942471() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9043726 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term9042374 = (Object[]) newArray("java.lang.String", 11);
        setIntField(term9043726, term9043726.getClass(), "size", 6);
        setElement(term9042374, 1, " ");
        setElement(term9042374, 5, "");
        setElement(term9042374, 6, "");
        setElement(term9042374, 7, "");
        setElement(term9042374, 8, "");
        setElement(term9042374, 9, "");
        setElement(term9042374, 10, "");
        setField(term9043726, term9043726.getClass(), "keys", term9042374);
        term9784967 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term9784968 = (Object[]) newArray("java.lang.String", 11);
        setIntField(term9784967, term9784967.getClass(), "size", 6);
        setElement(term9784968, 1, " ");
        setElement(term9784968, 5, "");
        setElement(term9784968, 6, "");
        setElement(term9784968, 7, "");
        setElement(term9784968, 8, "");
        setElement(term9784968, 9, "");
        setElement(term9784968, 10, "");
        setField(term9784967, term9784967.getClass(), "keys", term9784968);
        setField(term9784967, term9784967.getClass(), "vals", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attributes");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "                                ";
        callMethod(klass, "remove", argTypes, term9043726, args);
        assertTrue(recursiveEquals(term9043726, term9784967));
    }

};


