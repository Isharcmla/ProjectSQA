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

public class Attributes_put_28062925327 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5307934;
     Object term5311161;
     Object term5311141;

    public Attributes_put_28062925327() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5307934 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term5306581 = (Object[]) newArray("java.lang.String", 11);
        setIntField(term5307934, term5307934.getClass(), "size", 6);
        setElement(term5306581, 1, " ");
        setElement(term5306581, 5, "");
        setElement(term5306581, 6, "");
        setElement(term5306581, 7, "");
        setElement(term5306581, 8, "");
        setElement(term5306581, 9, "");
        setElement(term5306581, 10, "");
        setField(term5307934, term5307934.getClass(), "keys", term5306581);
        term5311161 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term5311162 = (Object[]) newArray("java.lang.String", 11);
        setIntField(term5311161, term5311161.getClass(), "size", 6);
        setElement(term5311162, 1, " ");
        setElement(term5311162, 5, "");
        setElement(term5311162, 6, "");
        setElement(term5311162, 7, "");
        setElement(term5311162, 8, "");
        setElement(term5311162, 9, "");
        setElement(term5311162, 10, "");
        setField(term5311161, term5311161.getClass(), "keys", term5311162);
        setField(term5311161, term5311161.getClass(), "vals", null);
        term5311141 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term5311143 = (Object[]) newArray("java.lang.String", 11);
        setIntField(term5311141, term5311141.getClass(), "size", 6);
        setElement(term5311143, 1, " ");
        setElement(term5311143, 5, "");
        setElement(term5311143, 6, "");
        setElement(term5311143, 7, "");
        setElement(term5311143, 8, "");
        setElement(term5311143, 9, "");
        setElement(term5311143, 10, "");
        setField(term5311141, term5311141.getClass(), "keys", term5311143);
        setField(term5311141, term5311141.getClass(), "vals", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attributes");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = "                                ";
        args[1] = false;
        Object retValue = callMethod(klass, "put", argTypes, term5307934, args);
        assertTrue(recursiveEquals(term5307934, term5311161));
        assertTrue(recursiveEquals(retValue, term5311141));
    }

};


