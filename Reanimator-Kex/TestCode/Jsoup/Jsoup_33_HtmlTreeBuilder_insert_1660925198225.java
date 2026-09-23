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
import java.lang.IllegalArgumentException;
import static org.jsoup.parser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class HtmlTreeBuilder_insert_1660925198225 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term422549;

    public HtmlTreeBuilder_insert_1660925198225() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term422549 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        Object term422631 = newInstance(Class.forName("org.jsoup.helper.DescendableLinkedList"));
        Object term422685 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        setField(term422549, term422549.getClass(), "stack", term422631);
        setField(term422549, term422549.getClass(), "doc", term422685);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Element");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "insert", argTypes, term422549, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


