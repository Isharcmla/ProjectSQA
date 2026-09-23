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

public class Parser_addChildToParent_71584410935 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27766;
     Object term27872;

    public Parser_addChildToParent_71584410935() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedList term27820 = new LinkedList();
        term27766 = newInstance(Class.forName("org.jsoup.parser.Parser"));
        setField(term27766, term27766.getClass(), "stack", term27820);
        term27872 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        setField(term27872, term27872.getClass(), "tag", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Parser");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.jsoup.nodes.Element");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term27872;
        args[1] = false;
        try {
            callMethod(klass, "addChildToParent", argTypes, term27766, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


