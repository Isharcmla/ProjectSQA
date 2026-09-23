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

public class Attributes_normalize_703706418198 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term356205;
     Object term428160;

    public Attributes_normalize_703706418198() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term356205 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term356136 = (Object[]) newArray("java.lang.String", 41);
        setIntField(term356205, term356205.getClass(), "size", 1);
        setField(term356205, term356205.getClass(), "keys", term356136);
        term428160 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term428203 = (Object[]) newArray("java.lang.String", 41);
        setIntField(term428160, term428160.getClass(), "size", 1);
        setElement(term428203, 0, "");
        setField(term428160, term428160.getClass(), "keys", term428203);
        setField(term428160, term428160.getClass(), "vals", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attributes");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "normalize", argTypes, term356205, args);
        assertTrue(recursiveEquals(term356205, term428160));
    }

};


