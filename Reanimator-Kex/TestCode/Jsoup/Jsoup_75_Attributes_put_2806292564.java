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

public class Attributes_put_2806292564 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term59777;
     Object term59907;
     Object term59903;

    public Attributes_put_2806292564() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term59777 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setIntField(term59777, term59777.getClass(), "size", 0);
        term59907 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setIntField(term59907, term59907.getClass(), "size", 0);
        setField(term59907, term59907.getClass(), "keys", null);
        setField(term59907, term59907.getClass(), "vals", null);
        term59903 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setIntField(term59903, term59903.getClass(), "size", 0);
        setField(term59903, term59903.getClass(), "keys", null);
        setField(term59903, term59903.getClass(), "vals", null);
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
        Object retValue = callMethod(klass, "put", argTypes, term59777, args);
        assertTrue(recursiveEquals(term59777, term59907));
        assertTrue(recursiveEquals(retValue, term59903));
    }

};


