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
import java.util.ArrayList;
import java.lang.Object;
import java.lang.StringBuilder;

public class HtmlTreeBuilder_insert_1723153206291 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term332816;
     Object term332988;

    public HtmlTreeBuilder_insert_1723153206291() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term332868 = new ArrayList();
        term332816 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        Object term332922 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        setField(term332816, term332816.getClass(), "stack", term332868);
        setField(term332816, term332816.getClass(), "doc", term332922);
        StringBuilder term333048 = new StringBuilder();
        term332988 = newInstance(Class.forName("org.jsoup.parser.Token$Comment"));
        setField(term332988, term332988.getClass(), "data", term333048);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$Comment");
        Object[] args = new Object[1];
        args[0] = term332988;
        try {
            callMethod(klass, "insert", argTypes, term332816, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


