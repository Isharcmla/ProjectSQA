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

public class Attributes_get_1185314327397 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7284943;
     Object term7285049;

    public Attributes_get_1185314327397() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7284943 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term7283924 = (Object[]) newArray("java.lang.String", 493);
        setIntField(term7284943, term7284943.getClass(), "size", 7);
        setElement(term7283924, 5, "");
        setField(term7284943, term7284943.getClass(), "keys", term7283924);
        term7285049 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term7285050 = (Object[]) newArray("java.lang.String", 493);
        setIntField(term7285049, term7285049.getClass(), "size", 7);
        setElement(term7285050, 5, "");
        setField(term7285049, term7285049.getClass(), "keys", term7285050);
        setField(term7285049, term7285049.getClass(), "vals", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attributes");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = " ";
        Object retValue = callMethod(klass, "get", argTypes, term7284943, args);
        assertTrue(recursiveEquals(term7284943, term7285049));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


