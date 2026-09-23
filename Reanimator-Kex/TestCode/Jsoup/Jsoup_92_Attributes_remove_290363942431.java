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
import java.lang.NullPointerException;
import static org.jsoup.nodes.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Attributes_remove_290363942431 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8343212;

    public Attributes_remove_290363942431() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8343212 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term8342828 = (Object[]) newArray("java.lang.String", 10);
        setIntField(term8343212, term8343212.getClass(), "size", 5);
        setElement(term8342828, 3, "");
        setElement(term8342828, 4, "");
        setElement(term8342828, 5, "");
        setElement(term8342828, 6, "");
        setElement(term8342828, 7, "");
        setElement(term8342828, 8, "");
        setElement(term8342828, 9, "");
        setField(term8343212, term8343212.getClass(), "keys", term8342828);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attributes");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "";
        try {
            callMethod(klass, "remove", argTypes, term8343212, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


