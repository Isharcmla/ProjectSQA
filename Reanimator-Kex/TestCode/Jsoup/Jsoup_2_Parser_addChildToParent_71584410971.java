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

public class Parser_addChildToParent_71584410971 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term42108;
     Object term42320;

    public Parser_addChildToParent_71584410971() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedList term42162 = new LinkedList();
        term42108 = newInstance(Class.forName("org.jsoup.parser.Parser"));
        setField(term42108, term42108.getClass(), "stack", term42162);
        term42320 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        setField(term42320, term42320.getClass(), "tag", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Parser");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.jsoup.nodes.Element");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term42320;
        args[1] = false;
        try {
            callMethod(klass, "addChildToParent", argTypes, term42108, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


