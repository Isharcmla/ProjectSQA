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

public class Tag_equals_134995802676 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5447;
     Object term5493;
     Object term5741;
     Object term5742;

    public Tag_equals_134995802676() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5447 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setBooleanField(term5447, term5447.getClass(), "canContainBlock", false);
        setBooleanField(term5447, term5447.getClass(), "canContainInline", false);
        setBooleanField(term5447, term5447.getClass(), "empty", true);
        setBooleanField(term5447, term5447.getClass(), "formatAsBlock", false);
        setBooleanField(term5447, term5447.getClass(), "isBlock", false);
        setBooleanField(term5447, term5447.getClass(), "preserveWhitespace", true);
        term5493 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setBooleanField(term5493, term5493.getClass(), "canContainBlock", false);
        setBooleanField(term5493, term5493.getClass(), "canContainInline", false);
        setBooleanField(term5493, term5493.getClass(), "empty", true);
        setBooleanField(term5493, term5493.getClass(), "formatAsBlock", false);
        setBooleanField(term5493, term5493.getClass(), "isBlock", false);
        setBooleanField(term5493, term5493.getClass(), "preserveWhitespace", false);
        term5741 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term5741, term5741.getClass(), "tagName", null);
        setBooleanField(term5741, term5741.getClass(), "isBlock", false);
        setBooleanField(term5741, term5741.getClass(), "formatAsBlock", false);
        setBooleanField(term5741, term5741.getClass(), "canContainBlock", false);
        setBooleanField(term5741, term5741.getClass(), "canContainInline", false);
        setBooleanField(term5741, term5741.getClass(), "empty", true);
        setBooleanField(term5741, term5741.getClass(), "selfClosing", false);
        setBooleanField(term5741, term5741.getClass(), "preserveWhitespace", true);
        term5742 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term5742, term5742.getClass(), "tagName", null);
        setBooleanField(term5742, term5742.getClass(), "isBlock", false);
        setBooleanField(term5742, term5742.getClass(), "formatAsBlock", false);
        setBooleanField(term5742, term5742.getClass(), "canContainBlock", false);
        setBooleanField(term5742, term5742.getClass(), "canContainInline", false);
        setBooleanField(term5742, term5742.getClass(), "empty", true);
        setBooleanField(term5742, term5742.getClass(), "selfClosing", false);
        setBooleanField(term5742, term5742.getClass(), "preserveWhitespace", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term5493;
        Object retValue = callMethod(klass, "equals", argTypes, term5447, args);
        assertTrue(recursiveEquals(term5447, term5741));
        assertTrue(recursiveEquals(term5493, term5742));
        assertTrue(recursiveEquals(retValue, false));
    }

};


