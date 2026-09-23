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

public class HtmlTreeBuilder_insert_657242602365 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term516065;
     Object term516199;

    public HtmlTreeBuilder_insert_657242602365() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term516065 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        Object term516131 = newInstance(Class.forName("org.jsoup.parser.ParseSettings"));
        setField(term516065, term516065.getClass(), "settings", term516131);
        term516199 = newInstance(Class.forName("org.jsoup.parser.Token$StartTag"));
        setBooleanField(term516199, term516199.getClass(), "selfClosing", false);
        setField(term516199, term516199.getClass(), "tagName", "                  ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$StartTag");
        Object[] args = new Object[1];
        args[0] = term516199;
        try {
            callMethod(klass, "insert", argTypes, term516065, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


