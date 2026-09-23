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

public class Attributes_put_265216405457 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8787829;
     Object term8787923;

    public Attributes_put_265216405457() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8787829 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term8787722 = (Object[]) newArray("java.lang.String", 41);
        setIntField(term8787829, term8787829.getClass(), "size", 1);
        setElement(term8787722, 0, "         ");
        setElement(term8787722, 1, "         ");
        setElement(term8787722, 2, "         ");
        setElement(term8787722, 3, "         ");
        setElement(term8787722, 4, "         ");
        setElement(term8787722, 5, "         ");
        setElement(term8787722, 6, "         ");
        setElement(term8787722, 7, "         ");
        setElement(term8787722, 8, "         ");
        setElement(term8787722, 9, "         ");
        setElement(term8787722, 10, "         ");
        setElement(term8787722, 11, "         ");
        setElement(term8787722, 12, "         ");
        setElement(term8787722, 13, "         ");
        setElement(term8787722, 14, "         ");
        setElement(term8787722, 15, "         ");
        setElement(term8787722, 16, "         ");
        setElement(term8787722, 17, "         ");
        setElement(term8787722, 18, "         ");
        setElement(term8787722, 19, "         ");
        setElement(term8787722, 20, "         ");
        setElement(term8787722, 21, "         ");
        setElement(term8787722, 22, "         ");
        setElement(term8787722, 23, "         ");
        setElement(term8787722, 24, "         ");
        setElement(term8787722, 25, "         ");
        setElement(term8787722, 26, "         ");
        setElement(term8787722, 27, "         ");
        setElement(term8787722, 28, "         ");
        setElement(term8787722, 29, "         ");
        setElement(term8787722, 30, "         ");
        setElement(term8787722, 31, "         ");
        setElement(term8787722, 32, "         ");
        setElement(term8787722, 33, "         ");
        setElement(term8787722, 34, "         ");
        setElement(term8787722, 35, "         ");
        setElement(term8787722, 36, "         ");
        setElement(term8787722, 37, "         ");
        setElement(term8787722, 38, "         ");
        setElement(term8787722, 39, "         ");
        setElement(term8787722, 40, "         ");
        setField(term8787829, term8787829.getClass(), "keys", term8787722);
        term8787923 = newInstance(Class.forName("org.jsoup.nodes.Attribute"));
        setField(term8787923, term8787923.getClass(), "key", "  ");
        setField(term8787923, term8787923.getClass(), "val", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attributes");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Attribute");
        Object[] args = new Object[1];
        args[0] = term8787923;
        try {
            callMethod(klass, "put", argTypes, term8787829, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


