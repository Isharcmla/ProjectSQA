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

public class Attributes_addAll_643491321527 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14337025;
     Object term14337083;

    public Attributes_addAll_643491321527() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14337025 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term14336924 = (Object[]) newArray("java.lang.String", 0);
        Object[] term14336927 = (Object[]) newArray("java.lang.String", 0);
        setIntField(term14337025, term14337025.getClass(), "size", -1012924416);
        setField(term14337025, term14337025.getClass(), "keys", term14336924);
        setField(term14337025, term14337025.getClass(), "vals", term14336927);
        term14337083 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setIntField(term14337083, term14337083.getClass(), "size", 1012924420);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attributes");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Attributes");
        Object[] args = new Object[1];
        args[0] = term14337083;
        try {
            callMethod(klass, "addAll", argTypes, term14337025, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


