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

public class Attributes_normalize_703706418601 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15688135;
     Object term15688192;

    public Attributes_normalize_703706418601() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15688135 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term15688049 = (Object[]) newArray("java.lang.String", 492);
        setIntField(term15688135, term15688135.getClass(), "size", 2);
        setElement(term15688049, 1, "");
        setField(term15688135, term15688135.getClass(), "keys", term15688049);
        term15688192 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term15688193 = (Object[]) newArray("java.lang.String", 492);
        setIntField(term15688192, term15688192.getClass(), "size", 2);
        setElement(term15688193, 0, "");
        setElement(term15688193, 1, "");
        setField(term15688192, term15688192.getClass(), "keys", term15688193);
        setField(term15688192, term15688192.getClass(), "vals", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attributes");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "normalize", argTypes, term15688135, args);
        assertTrue(recursiveEquals(term15688135, term15688192));
    }

};


