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

public class Attributes_put_28062925349 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5576599;
     Object term6311043;
     Object term6310714;

    public Attributes_put_28062925349() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5576599 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term5574269 = (Object[]) newArray("java.lang.String", 495);
        setIntField(term5576599, term5576599.getClass(), "size", 10);
        setElement(term5574269, 2, "                                                                ");
        setElement(term5574269, 7, "                                                                                                                                                                                                                                                                ");
        setField(term5576599, term5576599.getClass(), "keys", term5574269);
        term6311043 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term6311044 = (Object[]) newArray("java.lang.String", 495);
        setIntField(term6311043, term6311043.getClass(), "size", 10);
        setElement(term6311044, 2, "                                                                ");
        setElement(term6311044, 7, "                                                                                                                                                                                                                                                                ");
        setField(term6311043, term6311043.getClass(), "keys", term6311044);
        setField(term6311043, term6311043.getClass(), "vals", null);
        term6310714 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term6310716 = (Object[]) newArray("java.lang.String", 495);
        setIntField(term6310714, term6310714.getClass(), "size", 10);
        setElement(term6310716, 2, "                                                                ");
        setElement(term6310716, 7, "                                                                                                                                                                                                                                                                ");
        setField(term6310714, term6310714.getClass(), "keys", term6310716);
        setField(term6310714, term6310714.getClass(), "vals", null);
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
        Object retValue = callMethod(klass, "put", argTypes, term5576599, args);
        assertTrue(recursiveEquals(term5576599, term6311043));
        assertTrue(recursiveEquals(retValue, term6310714));
    }

};


