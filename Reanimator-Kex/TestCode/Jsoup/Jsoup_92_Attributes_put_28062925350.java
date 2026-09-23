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

public class Attributes_put_28062925350 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5577423;

    public Attributes_put_28062925350() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5577423 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term5577038 = (Object[]) newArray("java.lang.String", 10);
        setIntField(term5577423, term5577423.getClass(), "size", 5);
        setElement(term5577038, 3, "");
        setElement(term5577038, 4, "");
        setElement(term5577038, 5, "");
        setElement(term5577038, 6, "");
        setElement(term5577038, 7, "");
        setElement(term5577038, 8, "");
        setElement(term5577038, 9, "");
        setField(term5577423, term5577423.getClass(), "keys", term5577038);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attributes");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = "";
        args[1] = false;
        try {
            callMethod(klass, "put", argTypes, term5577423, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


