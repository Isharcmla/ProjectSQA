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

public class Attributes_put_180316978555 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14505826;
     Object term14507146;
     Object term14506574;

    public Attributes_put_180316978555() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14505826 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term14505087 = (Object[]) newArray("java.lang.String", 5);
        Object[] term14505704 = (Object[]) newArray("java.lang.String", 236);
        setIntField(term14505826, term14505826.getClass(), "size", 2);
        setElement(term14505087, 0, "         ");
        setElement(term14505087, 1, "\u0001                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 ");
        setElement(term14505087, 2, "                                                 ");
        setField(term14505826, term14505826.getClass(), "keys", term14505087);
        setField(term14505826, term14505826.getClass(), "vals", term14505704);
        term14507146 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term14507147 = (Object[]) newArray("java.lang.String", 5);
        Object[] term14507154 = (Object[]) newArray("java.lang.String", 236);
        setIntField(term14507146, term14507146.getClass(), "size", 3);
        setElement(term14507147, 0, "         ");
        setElement(term14507147, 1, "\u0001                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 ");
        setElement(term14507147, 2, "                                                 ");
        setField(term14507146, term14507146.getClass(), "keys", term14507147);
        setField(term14507146, term14507146.getClass(), "vals", term14507154);
        term14506574 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term14506576 = (Object[]) newArray("java.lang.String", 5);
        Object[] term14507139 = (Object[]) newArray("java.lang.String", 236);
        setIntField(term14506574, term14506574.getClass(), "size", 3);
        setElement(term14506576, 0, "         ");
        setElement(term14506576, 1, "\u0001                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 ");
        setElement(term14506576, 2, "                                                 ");
        setField(term14506574, term14506574.getClass(), "keys", term14506576);
        setField(term14506574, term14506574.getClass(), "vals", term14507139);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attributes");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = "                                                 ";
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term14505826, args);
        assertTrue(recursiveEquals(term14505826, term14507146));
        assertTrue(recursiveEquals(retValue, term14506574));
    }

};


