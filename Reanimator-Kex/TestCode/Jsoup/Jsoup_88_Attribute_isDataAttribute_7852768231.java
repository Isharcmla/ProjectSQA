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

public class Attribute_isDataAttribute_7852768231 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47920;
     Object term123904;

    public Attribute_isDataAttribute_7852768231() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term47920 = newInstance(Class.forName("org.jsoup.nodes.Attribute"));
        Object term47945 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term47947 = (Object[]) newArray("java.lang.String", 0);
        Object[] term47948 = (Object[]) newArray("java.lang.String", 0);
        setField(term47920, term47920.getClass(), "key", "BYqFIqCKAV");
        setField(term47920, term47920.getClass(), "val", "vrQLuWIDJX");
        setIntField(term47945, term47945.getClass(), "size", 1227103734);
        setField(term47945, term47945.getClass(), "keys", term47947);
        setField(term47945, term47945.getClass(), "vals", term47948);
        setField(term47920, term47920.getClass(), "parent", term47945);
        term123904 = newInstance(Class.forName("org.jsoup.nodes.Attribute"));
        Object term123909 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term123910 = (Object[]) newArray("java.lang.String", 0);
        Object[] term123911 = (Object[]) newArray("java.lang.String", 0);
        setField(term123904, term123904.getClass(), "key", "BYqFIqCKAV");
        setField(term123904, term123904.getClass(), "val", "vrQLuWIDJX");
        setIntField(term123909, term123909.getClass(), "size", 1227103734);
        setField(term123909, term123909.getClass(), "keys", term123910);
        setField(term123909, term123909.getClass(), "vals", term123911);
        setField(term123904, term123904.getClass(), "parent", term123909);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attribute");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isDataAttribute", argTypes, term47920, args);
        assertTrue(recursiveEquals(term47920, term123904));
    }

};


