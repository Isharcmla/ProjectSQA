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

public class Attributes_put_2806292596 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term81096;
     Object term81222;
     Object term81217;

    public Attributes_put_2806292596() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term81096 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term81023 = (Object[]) newArray("java.lang.String", 489);
        setIntField(term81096, term81096.getClass(), "size", 1);
        setField(term81096, term81096.getClass(), "keys", term81023);
        term81222 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term81223 = (Object[]) newArray("java.lang.String", 489);
        setIntField(term81222, term81222.getClass(), "size", 1);
        setField(term81222, term81222.getClass(), "keys", term81223);
        setField(term81222, term81222.getClass(), "vals", null);
        term81217 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term81219 = (Object[]) newArray("java.lang.String", 489);
        setIntField(term81217, term81217.getClass(), "size", 1);
        setField(term81217, term81217.getClass(), "keys", term81219);
        setField(term81217, term81217.getClass(), "vals", null);
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
        Object retValue = callMethod(klass, "put", argTypes, term81096, args);
        assertTrue(recursiveEquals(term81096, term81222));
        assertTrue(recursiveEquals(retValue, term81217));
    }

};


