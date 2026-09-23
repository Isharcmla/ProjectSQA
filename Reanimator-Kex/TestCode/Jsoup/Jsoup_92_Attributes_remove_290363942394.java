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

public class Attributes_remove_290363942394 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7524620;
     Object term8287849;

    public Attributes_remove_290363942394() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7524620 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term7524517 = (Object[]) newArray("java.lang.String", 489);
        setIntField(term7524620, term7524620.getClass(), "size", 1);
        setElement(term7524517, 0, "");
        setField(term7524620, term7524620.getClass(), "keys", term7524517);
        setField(term7524620, term7524620.getClass(), "vals", term7524517);
        term8287849 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term8287850 = (Object[]) newArray("java.lang.String", 489);
        Object[] term8287851 = (Object[]) newArray("java.lang.String", 489);
        setIntField(term8287849, term8287849.getClass(), "size", 0);
        setField(term8287849, term8287849.getClass(), "keys", term8287850);
        setField(term8287849, term8287849.getClass(), "vals", term8287851);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attributes");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "";
        callMethod(klass, "remove", argTypes, term7524620, args);
        assertTrue(recursiveEquals(term7524620, term8287849));
    }

};


