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

public class Attributes_indexOfKeyIgnoreCase_1848764230187 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term354903;
     Object term354952;

    public Attributes_indexOfKeyIgnoreCase_1848764230187() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term354903 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term354832 = (Object[]) newArray("java.lang.String", 489);
        setIntField(term354903, term354903.getClass(), "size", 1);
        setField(term354903, term354903.getClass(), "keys", term354832);
        term354952 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term354953 = (Object[]) newArray("java.lang.String", 489);
        setIntField(term354952, term354952.getClass(), "size", 1);
        setField(term354952, term354952.getClass(), "keys", term354953);
        setField(term354952, term354952.getClass(), "vals", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attributes");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "";
        Object retValue = callMethod(klass, "indexOfKeyIgnoreCase", argTypes, term354903, args);
        assertTrue(recursiveEquals(term354903, term354952));
        assertTrue(recursiveEquals(retValue, -1));
    }

};


