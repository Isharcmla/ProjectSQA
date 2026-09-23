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

public class HtmlTreeBuilder_insertForm_605839044351 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term510283;
     Object term510351;

    public HtmlTreeBuilder_insertForm_605839044351() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term510283 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        term510351 = newInstance(Class.forName("org.jsoup.parser.Token$StartTag"));
        setField(term510351, term510351.getClass(), "tagName", "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$StartTag");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term510351;
        args[1] = false;
        try {
            callMethod(klass, "insertForm", argTypes, term510283, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


