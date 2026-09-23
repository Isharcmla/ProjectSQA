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

public class Attributes_addAll_643491321376 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4490720;
     Object term4490787;

    public Attributes_addAll_643491321376() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4490720 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term4488982 = (Object[]) newArray("java.lang.String", 1);
        setIntField(term4490720, term4490720.getClass(), "size", 0);
        setField(term4490720, term4490720.getClass(), "keys", term4488982);
        term4490787 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setIntField(term4490787, term4490787.getClass(), "size", 4);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attributes");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Attributes");
        Object[] args = new Object[1];
        args[0] = term4490787;
        try {
            callMethod(klass, "addAll", argTypes, term4490720, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


