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

public class Attributes_hashCode_115439342058 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45562;
     Object term75283;

    public Attributes_hashCode_115439342058() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term45562 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term45564 = (Object[]) newArray("java.lang.String", 0);
        Object[] term45565 = (Object[]) newArray("java.lang.String", 0);
        setIntField(term45562, term45562.getClass(), "size", -244121226);
        setField(term45562, term45562.getClass(), "keys", term45564);
        setField(term45562, term45562.getClass(), "vals", term45565);
        term75283 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term75284 = (Object[]) newArray("java.lang.String", 0);
        Object[] term75285 = (Object[]) newArray("java.lang.String", 0);
        setIntField(term75283, term75283.getClass(), "size", -244121226);
        setField(term75283, term75283.getClass(), "keys", term75284);
        setField(term75283, term75283.getClass(), "vals", term75285);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attributes");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term45562, args);
        assertTrue(recursiveEquals(term45562, term75283));
        assertTrue(recursiveEquals(retValue, 1622703126));
    }

};


