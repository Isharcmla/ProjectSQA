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
import java.lang.ArrayIndexOutOfBoundsException;
import static org.jsoup.nodes.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Attributes_put_28062925557 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14509734;

    public Attributes_put_28062925557() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14509734 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term14508637 = (Object[]) newArray("java.lang.String", 44);
        Object[] term14508660 = (Object[]) newArray("java.lang.String", 0);
        setIntField(term14509734, term14509734.getClass(), "size", 9);
        setElement(term14508637, 8, "\u0002\u0001\u0001\u0001");
        setField(term14509734, term14509734.getClass(), "keys", term14508637);
        setField(term14509734, term14509734.getClass(), "vals", term14508660);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attributes");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = "\u0002\u0001\u0001\u0001";
        args[1] = false;
        try {
            callMethod(klass, "put", argTypes, term14509734, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


