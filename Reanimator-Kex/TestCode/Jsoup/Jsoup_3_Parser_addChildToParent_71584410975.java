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

public class Parser_addChildToParent_71584410975 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term46518;
     Object term46626;

    public Parser_addChildToParent_71584410975() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedList term46572 = new LinkedList();
        term46518 = newInstance(Class.forName("org.jsoup.parser.Parser"));
        setField(term46518, term46518.getClass(), "stack", term46572);
        term46626 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        Object term46672 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term46626, term46626.getClass(), "tag", term46672);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Parser");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.jsoup.nodes.Element");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term46626;
        args[1] = false;
        try {
            callMethod(klass, "addChildToParent", argTypes, term46518, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


