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

public class Tag_isValidParent_428174281125 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26349;
     Object term26395;
     Object term26468;
     Object term26469;

    public Tag_isValidParent_428174281125() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26349 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        ArrayList term26447 = new ArrayList();
        term26395 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term26395, term26395.getClass(), "ancestors", term26447);
        term26468 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term26468, term26468.getClass(), "tagName", null);
        setBooleanField(term26468, term26468.getClass(), "isBlock", false);
        setBooleanField(term26468, term26468.getClass(), "canContainBlock", false);
        setBooleanField(term26468, term26468.getClass(), "canContainInline", false);
        setBooleanField(term26468, term26468.getClass(), "optionalClosing", false);
        setBooleanField(term26468, term26468.getClass(), "empty", false);
        setBooleanField(term26468, term26468.getClass(), "preserveWhitespace", false);
        setField(term26468, term26468.getClass(), "ancestors", null);
        ArrayList term26470 = new ArrayList();
        term26469 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term26469, term26469.getClass(), "tagName", null);
        setBooleanField(term26469, term26469.getClass(), "isBlock", false);
        setBooleanField(term26469, term26469.getClass(), "canContainBlock", false);
        setBooleanField(term26469, term26469.getClass(), "canContainInline", false);
        setBooleanField(term26469, term26469.getClass(), "optionalClosing", false);
        setBooleanField(term26469, term26469.getClass(), "empty", false);
        setBooleanField(term26469, term26469.getClass(), "preserveWhitespace", false);
        setField(term26469, term26469.getClass(), "ancestors", term26470);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Tag");
        Object[] args = new Object[1];
        args[0] = term26395;
        Object retValue = callMethod(klass, "isValidParent", argTypes, term26349, args);
        assertTrue(recursiveEquals(term26349, term26468));
        assertTrue(recursiveEquals(term26395, term26469));
        assertTrue(recursiveEquals(retValue, true));
    }

};


