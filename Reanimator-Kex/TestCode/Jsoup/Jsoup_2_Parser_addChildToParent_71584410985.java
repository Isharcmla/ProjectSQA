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

public class Parser_addChildToParent_71584410985 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47531;
     Object term47729;

    public Parser_addChildToParent_71584410985() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term47675 = newInstance(Class.forName("java.lang.Object"));
        LinkedList term47585 = new LinkedList();
        ((LinkedList) term47585).add(term47675);
        term47531 = newInstance(Class.forName("org.jsoup.parser.Parser"));
        setField(term47531, term47531.getClass(), "stack", term47585);
        term47729 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        setField(term47729, term47729.getClass(), "tag", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Parser");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.jsoup.nodes.Element");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term47729;
        args[1] = false;
        try {
            callMethod(klass, "addChildToParent", argTypes, term47531, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


