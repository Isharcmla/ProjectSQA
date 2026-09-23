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

public class Tag_canContain_237447391141 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29176;
     Object term29196;
     Object term29197;

    public Tag_canContain_237447391141() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29176 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setBooleanField(term29176, term29176.getClass(), "isBlock", true);
        setBooleanField(term29176, term29176.getClass(), "canContainBlock", true);
        term29196 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term29196, term29196.getClass(), "tagName", null);
        setBooleanField(term29196, term29196.getClass(), "isBlock", true);
        setBooleanField(term29196, term29196.getClass(), "canContainBlock", true);
        setBooleanField(term29196, term29196.getClass(), "canContainInline", false);
        setBooleanField(term29196, term29196.getClass(), "optionalClosing", false);
        setBooleanField(term29196, term29196.getClass(), "empty", false);
        setBooleanField(term29196, term29196.getClass(), "preserveWhitespace", false);
        setField(term29196, term29196.getClass(), "ancestors", null);
        term29197 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term29197, term29197.getClass(), "tagName", null);
        setBooleanField(term29197, term29197.getClass(), "isBlock", true);
        setBooleanField(term29197, term29197.getClass(), "canContainBlock", true);
        setBooleanField(term29197, term29197.getClass(), "canContainInline", false);
        setBooleanField(term29197, term29197.getClass(), "optionalClosing", false);
        setBooleanField(term29197, term29197.getClass(), "empty", false);
        setBooleanField(term29197, term29197.getClass(), "preserveWhitespace", false);
        setField(term29197, term29197.getClass(), "ancestors", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Tag");
        Object[] args = new Object[1];
        args[0] = term29176;
        Object retValue = callMethod(klass, "canContain", argTypes, term29176, args);
        assertTrue(recursiveEquals(term29176, term29196));
        assertTrue(recursiveEquals(term29176, term29197));
        assertTrue(recursiveEquals(retValue, false));
    }

};


