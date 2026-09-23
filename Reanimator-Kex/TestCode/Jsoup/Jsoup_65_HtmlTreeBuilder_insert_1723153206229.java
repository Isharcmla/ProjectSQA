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
import java.lang.StringBuilder;

public class HtmlTreeBuilder_insert_1723153206229 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term206093;
     Object term206211;

    public HtmlTreeBuilder_insert_1723153206229() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term206145 = new ArrayList();
        term206093 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term206093, term206093.getClass(), "stack", term206145);
        StringBuilder term206271 = new StringBuilder();
        term206211 = newInstance(Class.forName("org.jsoup.parser.Token$Comment"));
        setField(term206211, term206211.getClass(), "data", term206271);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$Comment");
        Object[] args = new Object[1];
        args[0] = term206211;
        try {
            callMethod(klass, "insert", argTypes, term206093, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


