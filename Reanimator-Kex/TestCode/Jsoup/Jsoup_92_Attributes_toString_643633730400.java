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

public class Attributes_toString_643633730400 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8291005;
     Object term8313248;

    public Attributes_toString_643633730400() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8291005 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        term8313248 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setIntField(term8313248, term8313248.getClass(), "size", 0);
        setField(term8313248, term8313248.getClass(), "keys", null);
        setField(term8313248, term8313248.getClass(), "vals", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attributes");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "toString", argTypes, term8291005, args);
        assertTrue(recursiveEquals(term8291005, term8313248));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


