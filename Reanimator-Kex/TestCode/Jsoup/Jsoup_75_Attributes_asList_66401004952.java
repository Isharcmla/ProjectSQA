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
import java.lang.IllegalArgumentException;
import static org.jsoup.nodes.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Attributes_asList_66401004952 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term597;

    public Attributes_asList_66401004952() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term597 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term599 = (Object[]) newArray("java.lang.String", 0);
        Object[] term600 = (Object[]) newArray("java.lang.String", 0);
        setIntField(term597, term597.getClass(), "size", -117576464);
        setField(term597, term597.getClass(), "keys", term599);
        setField(term597, term597.getClass(), "vals", term600);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attributes");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "asList", argTypes, term597, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


