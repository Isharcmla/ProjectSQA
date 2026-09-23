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

public class Attributes_toString_643633730498 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11606462;
     Object term13792928;

    public Attributes_toString_643633730498() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11606462 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        term13792928 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setIntField(term13792928, term13792928.getClass(), "size", 0);
        setField(term13792928, term13792928.getClass(), "keys", null);
        setField(term13792928, term13792928.getClass(), "vals", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attributes");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "toString", argTypes, term11606462, args);
        assertTrue(recursiveEquals(term11606462, term13792928));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


