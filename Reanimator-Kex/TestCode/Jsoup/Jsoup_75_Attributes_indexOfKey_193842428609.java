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

public class Attributes_indexOfKey_193842428609 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15697938;
     Object term15698039;

    public Attributes_indexOfKey_193842428609() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15697938 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term15696278 = (Object[]) newArray("java.lang.String", 489);
        setIntField(term15697938, term15697938.getClass(), "size", 5);
        setElement(term15696278, 2, "");
        setField(term15697938, term15697938.getClass(), "keys", term15696278);
        term15698039 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term15698040 = (Object[]) newArray("java.lang.String", 489);
        setIntField(term15698039, term15698039.getClass(), "size", 5);
        setElement(term15698040, 2, "");
        setField(term15698039, term15698039.getClass(), "keys", term15698040);
        setField(term15698039, term15698039.getClass(), "vals", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attributes");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "  ";
        Object retValue = callMethod(klass, "indexOfKey", argTypes, term15697938, args);
        assertTrue(recursiveEquals(term15697938, term15698039));
        assertTrue(recursiveEquals(retValue, -1));
    }

};


