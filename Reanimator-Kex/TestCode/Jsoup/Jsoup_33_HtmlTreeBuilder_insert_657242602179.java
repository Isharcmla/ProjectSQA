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

public class HtmlTreeBuilder_insert_657242602179 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term409210;
     Object term409278;

    public HtmlTreeBuilder_insert_657242602179() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term409210 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        term409278 = newInstance(Class.forName("org.jsoup.parser.Token$StartTag"));
        setBooleanField(term409278, term409278.getClass(), "selfClosing", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$StartTag");
        Object[] args = new Object[1];
        args[0] = term409278;
        try {
            callMethod(klass, "insert", argTypes, term409210, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


