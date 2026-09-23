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

public class Tag_canContain_237447391153 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33673;
     Object term33734;
     Object term33804;
     Object term33807;

    public Tag_canContain_237447391153() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term33673 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setBooleanField(term33673, term33673.getClass(), "canContainInline", true);
        setBooleanField(term33673, term33673.getClass(), "optionalClosing", true);
        setBooleanField(term33673, term33673.getClass(), "canContainBlock", true);
        setBooleanField(term33673, term33673.getClass(), "empty", false);
        setBooleanField(term33673, term33673.getClass(), "isBlock", false);
        setField(term33673, term33673.getClass(), "tagName", "java.lang.Class");
        term33734 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setBooleanField(term33734, term33734.getClass(), "isBlock", false);
        setBooleanField(term33734, term33734.getClass(), "canContainBlock", true);
        setBooleanField(term33734, term33734.getClass(), "canContainInline", true);
        setBooleanField(term33734, term33734.getClass(), "empty", false);
        setBooleanField(term33734, term33734.getClass(), "optionalClosing", false);
        term33804 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term33804, term33804.getClass(), "tagName", "java.lang.Class");
        setBooleanField(term33804, term33804.getClass(), "isBlock", false);
        setBooleanField(term33804, term33804.getClass(), "canContainBlock", true);
        setBooleanField(term33804, term33804.getClass(), "canContainInline", true);
        setBooleanField(term33804, term33804.getClass(), "optionalClosing", true);
        setBooleanField(term33804, term33804.getClass(), "empty", false);
        setBooleanField(term33804, term33804.getClass(), "preserveWhitespace", false);
        setField(term33804, term33804.getClass(), "ancestors", null);
        term33807 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term33807, term33807.getClass(), "tagName", null);
        setBooleanField(term33807, term33807.getClass(), "isBlock", false);
        setBooleanField(term33807, term33807.getClass(), "canContainBlock", true);
        setBooleanField(term33807, term33807.getClass(), "canContainInline", true);
        setBooleanField(term33807, term33807.getClass(), "optionalClosing", false);
        setBooleanField(term33807, term33807.getClass(), "empty", false);
        setBooleanField(term33807, term33807.getClass(), "preserveWhitespace", false);
        setField(term33807, term33807.getClass(), "ancestors", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Tag");
        Object[] args = new Object[1];
        args[0] = term33734;
        Object retValue = callMethod(klass, "canContain", argTypes, term33673, args);
        assertTrue(recursiveEquals(term33673, term33804));
        assertTrue(recursiveEquals(term33734, term33807));
        assertTrue(recursiveEquals(retValue, true));
    }

};


