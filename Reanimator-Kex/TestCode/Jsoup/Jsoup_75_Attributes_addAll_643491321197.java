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

public class Attributes_addAll_643491321197 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term356075;
     Object term356133;

    public Attributes_addAll_643491321197() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term356075 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term355994 = (Object[]) newArray("java.lang.String", 49);
        setIntField(term356075, term356075.getClass(), "size", -1610596160);
        setField(term356075, term356075.getClass(), "keys", term355994);
        term356133 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setIntField(term356133, term356133.getClass(), "size", 2);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attributes");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Attributes");
        Object[] args = new Object[1];
        args[0] = term356133;
        try {
            callMethod(klass, "addAll", argTypes, term356075, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


