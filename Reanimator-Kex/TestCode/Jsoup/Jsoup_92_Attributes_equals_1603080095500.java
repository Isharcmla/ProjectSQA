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

public class Attributes_equals_1603080095500 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11606850;
     Object term11606879;
     Object term13810631;
     Object term13810632;

    public Attributes_equals_1603080095500() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11606850 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        term11606879 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        term13810631 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setIntField(term13810631, term13810631.getClass(), "size", 0);
        setField(term13810631, term13810631.getClass(), "keys", null);
        setField(term13810631, term13810631.getClass(), "vals", null);
        term13810632 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setIntField(term13810632, term13810632.getClass(), "size", 0);
        setField(term13810632, term13810632.getClass(), "keys", null);
        setField(term13810632, term13810632.getClass(), "vals", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attributes");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term11606879;
        Object retValue = callMethod(klass, "equals", argTypes, term11606850, args);
        assertTrue(recursiveEquals(term11606850, term13810631));
        assertTrue(recursiveEquals(term11606879, term13810632));
        assertTrue(recursiveEquals(retValue, true));
    }

};


