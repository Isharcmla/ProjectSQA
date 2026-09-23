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

public class Tag_equals_134995802690 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6846;
     Object term6892;
     Object term7059;
     Object term7060;

    public Tag_equals_134995802690() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6846 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setBooleanField(term6846, term6846.getClass(), "canContainBlock", false);
        setBooleanField(term6846, term6846.getClass(), "canContainInline", false);
        setBooleanField(term6846, term6846.getClass(), "empty", false);
        setBooleanField(term6846, term6846.getClass(), "formatAsBlock", false);
        setBooleanField(term6846, term6846.getClass(), "isBlock", true);
        term6892 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setBooleanField(term6892, term6892.getClass(), "canContainBlock", false);
        setBooleanField(term6892, term6892.getClass(), "canContainInline", false);
        setBooleanField(term6892, term6892.getClass(), "empty", false);
        setBooleanField(term6892, term6892.getClass(), "formatAsBlock", false);
        setBooleanField(term6892, term6892.getClass(), "isBlock", false);
        term7059 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term7059, term7059.getClass(), "tagName", null);
        setBooleanField(term7059, term7059.getClass(), "isBlock", true);
        setBooleanField(term7059, term7059.getClass(), "formatAsBlock", false);
        setBooleanField(term7059, term7059.getClass(), "canContainBlock", false);
        setBooleanField(term7059, term7059.getClass(), "canContainInline", false);
        setBooleanField(term7059, term7059.getClass(), "empty", false);
        setBooleanField(term7059, term7059.getClass(), "selfClosing", false);
        setBooleanField(term7059, term7059.getClass(), "preserveWhitespace", false);
        term7060 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term7060, term7060.getClass(), "tagName", null);
        setBooleanField(term7060, term7060.getClass(), "isBlock", false);
        setBooleanField(term7060, term7060.getClass(), "formatAsBlock", false);
        setBooleanField(term7060, term7060.getClass(), "canContainBlock", false);
        setBooleanField(term7060, term7060.getClass(), "canContainInline", false);
        setBooleanField(term7060, term7060.getClass(), "empty", false);
        setBooleanField(term7060, term7060.getClass(), "selfClosing", false);
        setBooleanField(term7060, term7060.getClass(), "preserveWhitespace", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term6892;
        Object retValue = callMethod(klass, "equals", argTypes, term6846, args);
        assertTrue(recursiveEquals(term6846, term7059));
        assertTrue(recursiveEquals(term6892, term7060));
        assertTrue(recursiveEquals(retValue, false));
    }

};


