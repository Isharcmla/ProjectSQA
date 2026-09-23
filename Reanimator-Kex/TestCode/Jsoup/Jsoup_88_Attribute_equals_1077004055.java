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

public class Attribute_equals_1077004055 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term140596;
     Object term140682;
     Object term140693;
     Object term140694;

    public Attribute_equals_1077004055() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term140596 = newInstance(Class.forName("org.jsoup.nodes.Attribute"));
        term140682 = newInstance(Class.forName("java.util.zip.ZipFile$ZipFileInputStream"));
        term140693 = newInstance(Class.forName("org.jsoup.nodes.Attribute"));
        setField(term140693, term140693.getClass(), "key", null);
        setField(term140693, term140693.getClass(), "val", null);
        setField(term140693, term140693.getClass(), "parent", null);
        term140694 = newInstance(Class.forName("java.util.zip.ZipFile$ZipFileInputStream"));
        setBooleanField(term140694, term140694.getClass(), "closeRequested", false);
        setLongField(term140694, term140694.getClass(), "pos", 0L);
        setLongField(term140694, term140694.getClass(), "rem", 0L);
        setLongField(term140694, term140694.getClass(), "size", 0L);
        setField(term140694, term140694.getClass(), "this$0", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attribute");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term140682;
        Object retValue = callMethod(klass, "equals", argTypes, term140596, args);
        assertTrue(recursiveEquals(term140596, term140693));
        assertTrue(recursiveEquals(term140682, term140694));
        assertTrue(recursiveEquals(retValue, false));
    }

};


