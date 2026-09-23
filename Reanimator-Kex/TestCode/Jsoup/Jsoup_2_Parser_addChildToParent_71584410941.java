package org.jsoup.parser;

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
import java.lang.ClassCastException;
import static org.jsoup.parser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.LinkedList;
import java.lang.Object;

public class Parser_addChildToParent_71584410941 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31824;
     Object term32020;

    public Parser_addChildToParent_71584410941() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term31968 = newInstance(Class.forName("java.lang.Object"));
        LinkedList term31878 = new LinkedList();
        ((LinkedList) term31878).add(term31968);
        term31824 = newInstance(Class.forName("org.jsoup.parser.Parser"));
        setField(term31824, term31824.getClass(), "stack", term31878);
        term32020 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        setField(term32020, term32020.getClass(), "tag", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Parser");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.jsoup.nodes.Element");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term32020;
        args[1] = false;
        try {
            callMethod(klass, "addChildToParent", argTypes, term31824, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


