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

public class Attributes_html_1956606913581 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14779211;
     Object term14800979;

    public Attributes_html_1956606913581() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14779211 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        term14800979 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setIntField(term14800979, term14800979.getClass(), "size", 0);
        setField(term14800979, term14800979.getClass(), "keys", null);
        setField(term14800979, term14800979.getClass(), "vals", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attributes");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "html", argTypes, term14779211, args);
        assertTrue(recursiveEquals(term14779211, term14800979));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


