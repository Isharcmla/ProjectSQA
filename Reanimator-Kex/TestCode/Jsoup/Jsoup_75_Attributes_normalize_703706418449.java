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

public class Attributes_normalize_703706418449 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8779940;
     Object term8785403;

    public Attributes_normalize_703706418449() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8779940 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term8779859 = (Object[]) newArray("java.lang.String", 489);
        setIntField(term8779940, term8779940.getClass(), "size", 2);
        setField(term8779940, term8779940.getClass(), "keys", term8779859);
        term8785403 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term8785404 = (Object[]) newArray("java.lang.String", 489);
        setIntField(term8785403, term8785403.getClass(), "size", 2);
        setElement(term8785404, 0, "");
        setElement(term8785404, 1, "");
        setField(term8785403, term8785403.getClass(), "keys", term8785404);
        setField(term8785403, term8785403.getClass(), "vals", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attributes");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "normalize", argTypes, term8779940, args);
        assertTrue(recursiveEquals(term8779940, term8785403));
    }

};


