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

public class Tag_isEmpty_150490848126 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term225;
     Object term995;

    public Tag_isEmpty_150490848126() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term225 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term225, term225.getClass(), "tagName", "hRNSzYYIrc");
        setBooleanField(term225, term225.getClass(), "isBlock", true);
        setBooleanField(term225, term225.getClass(), "formatAsBlock", true);
        setBooleanField(term225, term225.getClass(), "canContainBlock", false);
        setBooleanField(term225, term225.getClass(), "canContainInline", true);
        setBooleanField(term225, term225.getClass(), "empty", true);
        setBooleanField(term225, term225.getClass(), "selfClosing", true);
        setBooleanField(term225, term225.getClass(), "preserveWhitespace", false);
        term995 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term995, term995.getClass(), "tagName", "hRNSzYYIrc");
        setBooleanField(term995, term995.getClass(), "isBlock", true);
        setBooleanField(term995, term995.getClass(), "formatAsBlock", true);
        setBooleanField(term995, term995.getClass(), "canContainBlock", false);
        setBooleanField(term995, term995.getClass(), "canContainInline", true);
        setBooleanField(term995, term995.getClass(), "empty", true);
        setBooleanField(term995, term995.getClass(), "selfClosing", true);
        setBooleanField(term995, term995.getClass(), "preserveWhitespace", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isEmpty", argTypes, term225, args);
        assertTrue(recursiveEquals(term225, term995));
    }

};


