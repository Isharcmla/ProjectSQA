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
import static org.jsoup.parser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.jsoup.parser.EqualityUtils.*;

public class Tag_equals_134995802684 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6405;
     Object term6451;
     Object term6617;
     Object term6618;

    public Tag_equals_134995802684() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6405 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setBooleanField(term6405, term6405.getClass(), "canContainBlock", false);
        setBooleanField(term6405, term6405.getClass(), "canContainInline", false);
        term6451 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setBooleanField(term6451, term6451.getClass(), "canContainBlock", false);
        setBooleanField(term6451, term6451.getClass(), "canContainInline", true);
        term6617 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term6617, term6617.getClass(), "tagName", null);
        setBooleanField(term6617, term6617.getClass(), "isBlock", false);
        setBooleanField(term6617, term6617.getClass(), "formatAsBlock", false);
        setBooleanField(term6617, term6617.getClass(), "canContainBlock", false);
        setBooleanField(term6617, term6617.getClass(), "canContainInline", false);
        setBooleanField(term6617, term6617.getClass(), "empty", false);
        setBooleanField(term6617, term6617.getClass(), "selfClosing", false);
        setBooleanField(term6617, term6617.getClass(), "preserveWhitespace", false);
        term6618 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term6618, term6618.getClass(), "tagName", null);
        setBooleanField(term6618, term6618.getClass(), "isBlock", false);
        setBooleanField(term6618, term6618.getClass(), "formatAsBlock", false);
        setBooleanField(term6618, term6618.getClass(), "canContainBlock", false);
        setBooleanField(term6618, term6618.getClass(), "canContainInline", true);
        setBooleanField(term6618, term6618.getClass(), "empty", false);
        setBooleanField(term6618, term6618.getClass(), "selfClosing", false);
        setBooleanField(term6618, term6618.getClass(), "preserveWhitespace", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term6451;
        Object retValue = callMethod(klass, "equals", argTypes, term6405, args);
        assertTrue(recursiveEquals(term6405, term6617));
        assertTrue(recursiveEquals(term6451, term6618));
        assertTrue(recursiveEquals(retValue, false));
    }

};


