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

public class Attributes_normalize_70370641860 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45570;
     Object term75551;

    public Attributes_normalize_70370641860() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term45570 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term45572 = (Object[]) newArray("java.lang.String", 0);
        Object[] term45573 = (Object[]) newArray("java.lang.String", 0);
        setIntField(term45570, term45570.getClass(), "size", -1179120542);
        setField(term45570, term45570.getClass(), "keys", term45572);
        setField(term45570, term45570.getClass(), "vals", term45573);
        term75551 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term75552 = (Object[]) newArray("java.lang.String", 0);
        Object[] term75553 = (Object[]) newArray("java.lang.String", 0);
        setIntField(term75551, term75551.getClass(), "size", -1179120542);
        setField(term75551, term75551.getClass(), "keys", term75552);
        setField(term75551, term75551.getClass(), "vals", term75553);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attributes");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "normalize", argTypes, term45570, args);
        assertTrue(recursiveEquals(term45570, term75551));
    }

};


