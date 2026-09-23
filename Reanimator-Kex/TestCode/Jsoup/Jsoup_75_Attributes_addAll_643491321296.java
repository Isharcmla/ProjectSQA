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
import java.lang.OutOfMemoryError;
import static org.jsoup.nodes.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Attributes_addAll_643491321296 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1839486;
     Object term1839544;

    public Attributes_addAll_643491321296() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1839486 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term1839398 = (Object[]) newArray("java.lang.String", 490);
        setIntField(term1839486, term1839486.getClass(), "size", -265);
        setField(term1839486, term1839486.getClass(), "keys", term1839398);
        term1839544 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setIntField(term1839544, term1839544.getClass(), "size", 2147483400);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attributes");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Attributes");
        Object[] args = new Object[1];
        args[0] = term1839544;
        try {
            callMethod(klass, "addAll", argTypes, term1839486, args);
            assertTrue(false);
        }
        catch (OutOfMemoryError e) {
        }

    }

};


