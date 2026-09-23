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

public class Attributes_put_28062925380 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6794188;
     Object term8013158;
     Object term7982604;

    public Attributes_put_28062925380() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6794188 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term6792527 = (Object[]) newArray("java.lang.String", 489);
        setIntField(term6794188, term6794188.getClass(), "size", 5);
        setElement(term6792527, 2, "");
        setField(term6794188, term6794188.getClass(), "keys", term6792527);
        term8013158 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term8013271 = (Object[]) newArray("java.lang.String", 489);
        setIntField(term8013158, term8013158.getClass(), "size", 5);
        setElement(term8013271, 2, "");
        setField(term8013158, term8013158.getClass(), "keys", term8013271);
        setField(term8013158, term8013158.getClass(), "vals", null);
        term7982604 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term7982629 = (Object[]) newArray("java.lang.String", 489);
        setIntField(term7982604, term7982604.getClass(), "size", 5);
        setElement(term7982629, 2, "");
        setField(term7982604, term7982604.getClass(), "keys", term7982629);
        setField(term7982604, term7982604.getClass(), "vals", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attributes");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = "  ";
        args[1] = false;
        Object retValue = callMethod(klass, "put", argTypes, term6794188, args);
        assertTrue(recursiveEquals(term6794188, term8013158));
        assertTrue(recursiveEquals(retValue, term7982604));
    }

};


