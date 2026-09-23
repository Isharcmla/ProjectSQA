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

public class Tag_canContainBlock_57544282123 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term135;
     Object term859;

    public Tag_canContainBlock_57544282123() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term135 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term135, term135.getClass(), "tagName", "EGtDIRbSSb");
        setBooleanField(term135, term135.getClass(), "isBlock", true);
        setBooleanField(term135, term135.getClass(), "formatAsBlock", true);
        setBooleanField(term135, term135.getClass(), "canContainBlock", true);
        setBooleanField(term135, term135.getClass(), "canContainInline", true);
        setBooleanField(term135, term135.getClass(), "empty", false);
        setBooleanField(term135, term135.getClass(), "selfClosing", false);
        setBooleanField(term135, term135.getClass(), "preserveWhitespace", false);
        term859 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term859, term859.getClass(), "tagName", "EGtDIRbSSb");
        setBooleanField(term859, term859.getClass(), "isBlock", true);
        setBooleanField(term859, term859.getClass(), "formatAsBlock", true);
        setBooleanField(term859, term859.getClass(), "canContainBlock", true);
        setBooleanField(term859, term859.getClass(), "canContainInline", true);
        setBooleanField(term859, term859.getClass(), "empty", false);
        setBooleanField(term859, term859.getClass(), "selfClosing", false);
        setBooleanField(term859, term859.getClass(), "preserveWhitespace", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "canContainBlock", argTypes, term135, args);
        assertTrue(recursiveEquals(term135, term859));
    }

};


