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

public class Attributes_normalize_703706418312 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2328713;
     Object term5262052;

    public Attributes_normalize_703706418312() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2328713 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term2328632 = (Object[]) newArray("java.lang.String", 489);
        setIntField(term2328713, term2328713.getClass(), "size", 2);
        setField(term2328713, term2328713.getClass(), "keys", term2328632);
        term5262052 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term5262053 = (Object[]) newArray("java.lang.String", 489);
        setIntField(term5262052, term5262052.getClass(), "size", 2);
        setElement(term5262053, 0, "");
        setElement(term5262053, 1, "");
        setField(term5262052, term5262052.getClass(), "keys", term5262053);
        setField(term5262052, term5262052.getClass(), "vals", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attributes");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "normalize", argTypes, term2328713, args);
        assertTrue(recursiveEquals(term2328713, term5262052));
    }

};


