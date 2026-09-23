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
import java.util.ArrayList;

public class Tag_isEmpty_150490848132 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term562;
     Object term2731;

    public Tag_isEmpty_150490848132() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term581 = new ArrayList();
        term562 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term562, term562.getClass(), "tagName", "JUmudUmaaV");
        setBooleanField(term562, term562.getClass(), "isBlock", false);
        setBooleanField(term562, term562.getClass(), "canContainBlock", true);
        setBooleanField(term562, term562.getClass(), "canContainInline", false);
        setBooleanField(term562, term562.getClass(), "optionalClosing", false);
        setBooleanField(term562, term562.getClass(), "empty", true);
        setBooleanField(term562, term562.getClass(), "preserveWhitespace", false);
        setField(term562, term562.getClass(), "ancestors", term581);
        ArrayList term2734 = new ArrayList();
        term2731 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term2731, term2731.getClass(), "tagName", "JUmudUmaaV");
        setBooleanField(term2731, term2731.getClass(), "isBlock", false);
        setBooleanField(term2731, term2731.getClass(), "canContainBlock", true);
        setBooleanField(term2731, term2731.getClass(), "canContainInline", false);
        setBooleanField(term2731, term2731.getClass(), "optionalClosing", false);
        setBooleanField(term2731, term2731.getClass(), "empty", true);
        setBooleanField(term2731, term2731.getClass(), "preserveWhitespace", false);
        setField(term2731, term2731.getClass(), "ancestors", term2734);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isEmpty", argTypes, term562, args);
        assertTrue(recursiveEquals(term562, term2731));
    }

};


