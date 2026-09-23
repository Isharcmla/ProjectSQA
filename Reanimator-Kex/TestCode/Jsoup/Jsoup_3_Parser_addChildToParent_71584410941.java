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
     Object term29779;
     Object term29975;

    public Parser_addChildToParent_71584410941() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term29923 = newInstance(Class.forName("java.lang.Object"));
        LinkedList term29833 = new LinkedList();
        ((LinkedList) term29833).add(term29923);
        term29779 = newInstance(Class.forName("org.jsoup.parser.Parser"));
        setField(term29779, term29779.getClass(), "stack", term29833);
        term29975 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        setField(term29975, term29975.getClass(), "tag", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Parser");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.jsoup.nodes.Element");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term29975;
        args[1] = false;
        try {
            callMethod(klass, "addChildToParent", argTypes, term29779, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


