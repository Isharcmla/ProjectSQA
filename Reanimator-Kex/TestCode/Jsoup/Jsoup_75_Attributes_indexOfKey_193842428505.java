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

public class Attributes_indexOfKey_193842428505 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14177221;
     Object term14177331;

    public Attributes_indexOfKey_193842428505() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14177221 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term14176573 = (Object[]) newArray("java.lang.String", 12);
        setIntField(term14177221, term14177221.getClass(), "size", 6);
        setElement(term14176573, 3, "");
        setElement(term14176573, 4, "");
        setElement(term14176573, 5, "");
        setElement(term14176573, 6, "");
        setElement(term14176573, 7, "");
        setElement(term14176573, 8, "");
        setElement(term14176573, 9, "");
        setElement(term14176573, 10, "");
        setElement(term14176573, 11, "");
        setField(term14177221, term14177221.getClass(), "keys", term14176573);
        term14177331 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term14177332 = (Object[]) newArray("java.lang.String", 12);
        setIntField(term14177331, term14177331.getClass(), "size", 6);
        setElement(term14177332, 3, "");
        setElement(term14177332, 4, "");
        setElement(term14177332, 5, "");
        setElement(term14177332, 6, "");
        setElement(term14177332, 7, "");
        setElement(term14177332, 8, "");
        setElement(term14177332, 9, "");
        setElement(term14177332, 10, "");
        setElement(term14177332, 11, "");
        setField(term14177331, term14177331.getClass(), "keys", term14177332);
        setField(term14177331, term14177331.getClass(), "vals", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attributes");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "";
        Object retValue = callMethod(klass, "indexOfKey", argTypes, term14177221, args);
        assertTrue(recursiveEquals(term14177221, term14177331));
        assertTrue(recursiveEquals(retValue, 3));
    }

};


