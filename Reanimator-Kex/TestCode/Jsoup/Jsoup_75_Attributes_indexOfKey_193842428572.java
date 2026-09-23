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

public class Attributes_indexOfKey_193842428572 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14688686;
     Object term15570554;

    public Attributes_indexOfKey_193842428572() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14688686 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term14688138 = (Object[]) newArray("java.lang.String", 9);
        setIntField(term14688686, term14688686.getClass(), "size", 7);
        setElement(term14688138, 1, "");
        setElement(term14688138, 2, "");
        setElement(term14688138, 6, "                                          ");
        setElement(term14688138, 7, "                                          ");
        setElement(term14688138, 8, "                                          ");
        setField(term14688686, term14688686.getClass(), "keys", term14688138);
        term15570554 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term15570555 = (Object[]) newArray("java.lang.String", 9);
        setIntField(term15570554, term15570554.getClass(), "size", 7);
        setElement(term15570555, 1, "");
        setElement(term15570555, 2, "");
        setElement(term15570555, 6, "                                          ");
        setElement(term15570555, 7, "                                          ");
        setElement(term15570555, 8, "                                          ");
        setField(term15570554, term15570554.getClass(), "keys", term15570555);
        setField(term15570554, term15570554.getClass(), "vals", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attributes");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "                                          ";
        Object retValue = callMethod(klass, "indexOfKey", argTypes, term14688686, args);
        assertTrue(recursiveEquals(term14688686, term15570554));
        assertTrue(recursiveEquals(retValue, 6));
    }

};


