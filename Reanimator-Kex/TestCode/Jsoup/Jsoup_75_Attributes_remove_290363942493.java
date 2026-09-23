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

public class Attributes_remove_290363942493 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12246645;

    public Attributes_remove_290363942493() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12246645 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term12246261 = (Object[]) newArray("java.lang.String", 10);
        setIntField(term12246645, term12246645.getClass(), "size", 5);
        setElement(term12246261, 3, "");
        setElement(term12246261, 4, "");
        setElement(term12246261, 5, "");
        setElement(term12246261, 6, "");
        setElement(term12246261, 7, "");
        setElement(term12246261, 8, "");
        setElement(term12246261, 9, "");
        setField(term12246645, term12246645.getClass(), "keys", term12246261);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attributes");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "";
        try {
            callMethod(klass, "remove", argTypes, term12246645, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


