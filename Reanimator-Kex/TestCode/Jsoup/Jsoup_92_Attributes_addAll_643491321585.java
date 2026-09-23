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

public class Attributes_addAll_643491321585 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14802297;
     Object term14802355;

    public Attributes_addAll_643491321585() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14802297 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term14802191 = (Object[]) newArray("java.lang.String", 2);
        setIntField(term14802297, term14802297.getClass(), "size", -2146806528);
        setField(term14802297, term14802297.getClass(), "keys", term14802191);
        term14802355 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term14802196 = (Object[]) newArray("java.lang.String", 120);
        Object[] term14802197 = (Object[]) newArray("java.lang.String", 10);
        setIntField(term14802355, term14802355.getClass(), "size", 50724933);
        setField(term14802355, term14802355.getClass(), "keys", term14802196);
        setField(term14802355, term14802355.getClass(), "vals", term14802197);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attributes");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Attributes");
        Object[] args = new Object[1];
        args[0] = term14802355;
        try {
            callMethod(klass, "addAll", argTypes, term14802297, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


