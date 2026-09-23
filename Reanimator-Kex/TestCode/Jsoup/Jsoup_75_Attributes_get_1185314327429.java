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

public class Attributes_get_1185314327429 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8764127;
     Object term8764281;

    public Attributes_get_1185314327429() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8764127 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term8763773 = (Object[]) newArray("java.lang.String", 8);
        setIntField(term8764127, term8764127.getClass(), "size", 4);
        setElement(term8763773, 3, "        ");
        setElement(term8763773, 4, "        ");
        setElement(term8763773, 5, "        ");
        setElement(term8763773, 6, "        ");
        setElement(term8763773, 7, "        ");
        setField(term8764127, term8764127.getClass(), "keys", term8763773);
        term8764281 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term8764282 = (Object[]) newArray("java.lang.String", 8);
        setIntField(term8764281, term8764281.getClass(), "size", 4);
        setElement(term8764282, 3, "        ");
        setElement(term8764282, 4, "        ");
        setElement(term8764282, 5, "        ");
        setElement(term8764282, 6, "        ");
        setElement(term8764282, 7, "        ");
        setField(term8764281, term8764281.getClass(), "keys", term8764282);
        setField(term8764281, term8764281.getClass(), "vals", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attributes");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "";
        Object retValue = callMethod(klass, "get", argTypes, term8764127, args);
        assertTrue(recursiveEquals(term8764127, term8764281));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


