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

public class HtmlTreeBuilder_insertEmpty_2019874171364 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term296088;
     Object term296156;

    public HtmlTreeBuilder_insertEmpty_2019874171364() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term296088 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        term296156 = newInstance(Class.forName("org.jsoup.parser.Token$StartTag"));
        setField(term296156, term296156.getClass(), "tagName", "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$StartTag");
        Object[] args = new Object[1];
        args[0] = term296156;
        try {
            callMethod(klass, "insertEmpty", argTypes, term296088, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


