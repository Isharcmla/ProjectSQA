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

public class Attributes_remove_290363942487 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10766925;
     Object term11742962;

    public Attributes_remove_290363942487() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10766925 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term10764596 = (Object[]) newArray("java.lang.String", 495);
        setIntField(term10766925, term10766925.getClass(), "size", 10);
        setElement(term10764596, 2, "                                                                ");
        setElement(term10764596, 7, "                                                                                                                                                                                                                                                                ");
        setField(term10766925, term10766925.getClass(), "keys", term10764596);
        term11742962 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term11742963 = (Object[]) newArray("java.lang.String", 495);
        setIntField(term11742962, term11742962.getClass(), "size", 10);
        setElement(term11742963, 2, "                                                                ");
        setElement(term11742963, 7, "                                                                                                                                                                                                                                                                ");
        setField(term11742962, term11742962.getClass(), "keys", term11742963);
        setField(term11742962, term11742962.getClass(), "vals", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attributes");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "";
        callMethod(klass, "remove", argTypes, term10766925, args);
        assertTrue(recursiveEquals(term10766925, term11742962));
    }

};


