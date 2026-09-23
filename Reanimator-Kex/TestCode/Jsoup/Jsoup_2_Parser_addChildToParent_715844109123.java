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
import java.lang.NullPointerException;
import static org.jsoup.parser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.LinkedList;
import java.lang.Object;
import java.util.ArrayList;

public class Parser_addChildToParent_715844109123 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term69118;
     Object term69314;

    public Parser_addChildToParent_715844109123() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedList term69172 = new LinkedList();
        term69118 = newInstance(Class.forName("org.jsoup.parser.Parser"));
        setField(term69118, term69118.getClass(), "stack", term69172);
        setField(term69118, term69118.getClass(), "baseUri", "byte");
        Object term69435 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term69473 = newInstance(Class.forName("java.lang.Object"));
        ArrayList term69389 = new ArrayList();
        ((ArrayList) term69389).add(term69435);
        ((ArrayList) term69389).add(term69473);
        term69314 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term69337 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term69337, term69337.getClass(), "ancestors", term69389);
        setField(term69314, term69314.getClass(), "tag", term69337);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Parser");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.jsoup.nodes.Element");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term69314;
        args[1] = false;
        try {
            callMethod(klass, "addChildToParent", argTypes, term69118, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


