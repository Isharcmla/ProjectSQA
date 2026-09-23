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

public class HtmlTreeBuilder_insert_657242602386 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term477127;
     Object term477195;

    public HtmlTreeBuilder_insert_657242602386() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term477127 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term477127, term477127.getClass(), "settings", null);
        term477195 = newInstance(Class.forName("org.jsoup.parser.Token$StartTag"));
        setBooleanField(term477195, term477195.getClass(), "selfClosing", true);
        setField(term477195, term477195.getClass(), "tagName", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$StartTag");
        Object[] args = new Object[1];
        args[0] = term477195;
        try {
            callMethod(klass, "insert", argTypes, term477127, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


