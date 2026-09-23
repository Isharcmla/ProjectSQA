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
import java.lang.NullPointerException;
import static org.jsoup.nodes.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Attributes_addAll_643491321123 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term67954;
     Object term68012;

    public Attributes_addAll_643491321123() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term67954 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setIntField(term67954, term67954.getClass(), "size", -1890916576);
        term68012 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setIntField(term68012, term68012.getClass(), "size", -1890916576);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attributes");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Attributes");
        Object[] args = new Object[1];
        args[0] = term68012;
        try {
            callMethod(klass, "addAll", argTypes, term67954, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


