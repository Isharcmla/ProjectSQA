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

public class Attributes_addAll_643491321431 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8764615;
     Object term8764673;

    public Attributes_addAll_643491321431() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8764615 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term8764509 = (Object[]) newArray("java.lang.String", 2);
        setIntField(term8764615, term8764615.getClass(), "size", -2146806528);
        setField(term8764615, term8764615.getClass(), "keys", term8764509);
        term8764673 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term8764514 = (Object[]) newArray("java.lang.String", 120);
        Object[] term8764515 = (Object[]) newArray("java.lang.String", 10);
        setIntField(term8764673, term8764673.getClass(), "size", 50724933);
        setField(term8764673, term8764673.getClass(), "keys", term8764514);
        setField(term8764673, term8764673.getClass(), "vals", term8764515);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attributes");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Attributes");
        Object[] args = new Object[1];
        args[0] = term8764673;
        try {
            callMethod(klass, "addAll", argTypes, term8764615, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


