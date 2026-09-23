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

public class HtmlTreeBuilder_insert_1723153206332 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term389202;
     Object term389374;

    public HtmlTreeBuilder_insert_1723153206332() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term389254 = new ArrayList();
        term389202 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        Object term389308 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        setField(term389202, term389202.getClass(), "stack", term389254);
        setField(term389202, term389202.getClass(), "doc", term389308);
        StringBuilder term389434 = new StringBuilder();
        term389374 = newInstance(Class.forName("org.jsoup.parser.Token$Comment"));
        setField(term389374, term389374.getClass(), "data", term389434);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$Comment");
        Object[] args = new Object[1];
        args[0] = term389374;
        try {
            callMethod(klass, "insert", argTypes, term389202, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


