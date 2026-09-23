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
import java.lang.Object;

public class Attributes_addAll_643491321273 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1826768;
     Object term1826826;

    public Attributes_addAll_643491321273() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1826768 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term1826668 = (Object[]) newArray("java.lang.String", 0);
        setIntField(term1826768, term1826768.getClass(), "size", -2063594126);
        setField(term1826768, term1826768.getClass(), "keys", term1826668);
        term1826826 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term1826673 = (Object[]) newArray("java.lang.String", 492);
        setIntField(term1826826, term1826826.getClass(), "size", 201681170);
        setField(term1826826, term1826826.getClass(), "keys", term1826673);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attributes");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Attributes");
        Object[] args = new Object[1];
        args[0] = term1826826;
        try {
            callMethod(klass, "addAll", argTypes, term1826768, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


