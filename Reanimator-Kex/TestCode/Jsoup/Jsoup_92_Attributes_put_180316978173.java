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

public class Attributes_put_180316978173 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term471121;

    public Attributes_put_180316978173() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term471121 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term470527 = (Object[]) newArray("java.lang.String", 1);
        setIntField(term471121, term471121.getClass(), "size", 1);
        setElement(term470527, 0, "\uFF80\uFF80                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       ");
        setField(term471121, term471121.getClass(), "keys", term470527);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attributes");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = "";
        args[1] = null;
        try {
            callMethod(klass, "put", argTypes, term471121, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


