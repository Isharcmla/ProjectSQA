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

public class Attributes_get_1185314327303 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2342606;
     Object term2342678;

    public Attributes_get_1185314327303() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2342606 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term2341904 = (Object[]) newArray("java.lang.String", 499);
        setIntField(term2342606, term2342606.getClass(), "size", 11);
        setField(term2342606, term2342606.getClass(), "keys", term2341904);
        term2342678 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term2342679 = (Object[]) newArray("java.lang.String", 499);
        setIntField(term2342678, term2342678.getClass(), "size", 11);
        setField(term2342678, term2342678.getClass(), "keys", term2342679);
        setField(term2342678, term2342678.getClass(), "vals", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attributes");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "";
        Object retValue = callMethod(klass, "get", argTypes, term2342606, args);
        assertTrue(recursiveEquals(term2342606, term2342678));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


