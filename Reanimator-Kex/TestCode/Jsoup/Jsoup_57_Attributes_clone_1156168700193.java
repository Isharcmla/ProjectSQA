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
import java.util.LinkedHashMap;

public class Attributes_clone_1156168700193 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5039843;
     Object term5039923;
     Object term5039916;

    public Attributes_clone_1156168700193() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedHashMap term5039903 = new LinkedHashMap();
        term5039843 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term5039843, term5039843.getClass(), "attributes", term5039903);
        LinkedHashMap term5039924 = new LinkedHashMap();
        term5039923 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term5039923, term5039923.getClass(), "attributes", term5039924);
        LinkedHashMap term5039917 = new LinkedHashMap();
        term5039916 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term5039916, term5039916.getClass(), "attributes", term5039917);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attributes");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "clone", argTypes, term5039843, args);
        assertTrue(recursiveEquals(term5039843, term5039923));
        assertTrue(recursiveEquals(retValue, term5039916));
    }

};


