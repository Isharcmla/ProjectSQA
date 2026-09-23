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

public class HtmlTreeBuilder_insert_657242602372 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term300213;
     Object term300281;

    public HtmlTreeBuilder_insert_657242602372() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term300213 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term300213, term300213.getClass(), "settings", null);
        term300281 = newInstance(Class.forName("org.jsoup.parser.Token$StartTag"));
        setBooleanField(term300281, term300281.getClass(), "selfClosing", true);
        setField(term300281, term300281.getClass(), "tagName", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$StartTag");
        Object[] args = new Object[1];
        args[0] = term300281;
        try {
            callMethod(klass, "insert", argTypes, term300213, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


