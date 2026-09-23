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

public class Attributes_put_265216405154 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term73317;
     Object term73373;
     Object term232431;
     Object term232438;
     Object term232399;

    public Attributes_put_265216405154() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term73317 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term73213 = (Object[]) newArray("java.lang.String", 0);
        Object[] term73216 = (Object[]) newArray("java.lang.String", 0);
        setIntField(term73317, term73317.getClass(), "size", 0);
        setField(term73317, term73317.getClass(), "keys", term73213);
        setField(term73317, term73317.getClass(), "vals", term73216);
        term73373 = newInstance(Class.forName("org.jsoup.nodes.Attribute"));
        setField(term73373, term73373.getClass(), "key", "");
        setField(term73373, term73373.getClass(), "val", "");
        term232431 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term232432 = (Object[]) newArray("java.lang.String", 4);
        Object[] term232435 = (Object[]) newArray("java.lang.String", 4);
        setIntField(term232431, term232431.getClass(), "size", 1);
        setElement(term232432, 0, "");
        setField(term232431, term232431.getClass(), "keys", term232432);
        setElement(term232435, 0, "");
        setField(term232431, term232431.getClass(), "vals", term232435);
        term232438 = newInstance(Class.forName("org.jsoup.nodes.Attribute"));
        Object term232443 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term232444 = (Object[]) newArray("java.lang.String", 4);
        Object[] term232447 = (Object[]) newArray("java.lang.String", 4);
        setField(term232438, term232438.getClass(), "key", "");
        setField(term232438, term232438.getClass(), "val", "");
        setIntField(term232443, term232443.getClass(), "size", 1);
        setElement(term232444, 0, "");
        setField(term232443, term232443.getClass(), "keys", term232444);
        setElement(term232447, 0, "");
        setField(term232443, term232443.getClass(), "vals", term232447);
        setField(term232438, term232438.getClass(), "parent", term232443);
        term232399 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term232401 = (Object[]) newArray("java.lang.String", 4);
        Object[] term232404 = (Object[]) newArray("java.lang.String", 4);
        setIntField(term232399, term232399.getClass(), "size", 1);
        setElement(term232401, 0, "");
        setField(term232399, term232399.getClass(), "keys", term232401);
        setElement(term232404, 0, "");
        setField(term232399, term232399.getClass(), "vals", term232404);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attributes");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Attribute");
        Object[] args = new Object[1];
        args[0] = term73373;
        Object retValue = callMethod(klass, "put", argTypes, term73317, args);
        assertTrue(recursiveEquals(term73317, term232431));
        assertTrue(recursiveEquals(term73373, term232438));
        assertTrue(recursiveEquals(retValue, term232399));
    }

};


