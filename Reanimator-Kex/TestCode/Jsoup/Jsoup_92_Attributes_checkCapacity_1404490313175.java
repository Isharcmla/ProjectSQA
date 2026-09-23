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

public class Attributes_checkCapacity_1404490313175 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term476020;
     Object term476037;

    public Attributes_checkCapacity_1404490313175() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term476020 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term475924 = (Object[]) newArray("java.lang.String", 514);
        Object[] term475927 = (Object[]) newArray("java.lang.String", 242);
        setIntField(term476020, term476020.getClass(), "size", 384);
        setField(term476020, term476020.getClass(), "keys", term475924);
        setField(term476020, term476020.getClass(), "vals", term475927);
        term476037 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term476038 = (Object[]) newArray("java.lang.String", 768);
        Object[] term476039 = (Object[]) newArray("java.lang.String", 768);
        setIntField(term476037, term476037.getClass(), "size", 384);
        setField(term476037, term476037.getClass(), "keys", term476038);
        setField(term476037, term476037.getClass(), "vals", term476039);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attributes");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 515;
        callMethod(klass, "checkCapacity", argTypes, term476020, args);
        assertTrue(recursiveEquals(term476020, term476037));
    }

};


