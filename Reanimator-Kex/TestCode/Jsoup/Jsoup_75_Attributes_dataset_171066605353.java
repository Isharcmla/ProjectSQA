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

public class Attributes_dataset_171066605353 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term601;
     Object term50034;
     Object term50029;

    public Attributes_dataset_171066605353() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term601 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term603 = (Object[]) newArray("java.lang.String", 0);
        Object[] term604 = (Object[]) newArray("java.lang.String", 0);
        setIntField(term601, term601.getClass(), "size", -1007160944);
        setField(term601, term601.getClass(), "keys", term603);
        setField(term601, term601.getClass(), "vals", term604);
        term50034 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term50035 = (Object[]) newArray("java.lang.String", 0);
        Object[] term50036 = (Object[]) newArray("java.lang.String", 0);
        setIntField(term50034, term50034.getClass(), "size", -1007160944);
        setField(term50034, term50034.getClass(), "keys", term50035);
        setField(term50034, term50034.getClass(), "vals", term50036);
        term50029 = newInstance(Class.forName("org.jsoup.nodes.Attributes$Dataset"));
        Object term50030 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term50032 = (Object[]) newArray("java.lang.String", 0);
        Object[] term50033 = (Object[]) newArray("java.lang.String", 0);
        setIntField(term50030, term50030.getClass(), "size", -1007160944);
        setField(term50030, term50030.getClass(), "keys", term50032);
        setField(term50030, term50030.getClass(), "vals", term50033);
        setField(term50029, term50029.getClass(), "attributes", term50030);
        setField(term50029, term50029.getClass(), "keySet", null);
        setField(term50029, term50029.getClass(), "values", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attributes");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "dataset", argTypes, term601, args);
        assertTrue(recursiveEquals(term601, term50034));
        assertTrue(recursiveEquals(retValue, term50029));
    }

};


