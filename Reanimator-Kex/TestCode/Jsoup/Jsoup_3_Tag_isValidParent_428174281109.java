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
import java.lang.Object;

public class Tag_isValidParent_428174281109 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23901;
     Object term23947;
     Object term24085;
     Object term24086;

    public Tag_isValidParent_428174281109() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23901 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setBooleanField(term23901, term23901.getClass(), "canContainBlock", false);
        setBooleanField(term23901, term23901.getClass(), "canContainInline", true);
        setBooleanField(term23901, term23901.getClass(), "empty", false);
        setBooleanField(term23901, term23901.getClass(), "isBlock", false);
        setBooleanField(term23901, term23901.getClass(), "optionalClosing", false);
        Object term24022 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setBooleanField(term24022, term24022.getClass(), "canContainBlock", false);
        setBooleanField(term24022, term24022.getClass(), "canContainInline", true);
        setBooleanField(term24022, term24022.getClass(), "empty", false);
        setBooleanField(term24022, term24022.getClass(), "isBlock", false);
        setBooleanField(term24022, term24022.getClass(), "optionalClosing", true);
        ArrayList term23999 = new ArrayList();
        ((ArrayList) term23999).add(term24022);
        term23947 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term23947, term23947.getClass(), "ancestors", term23999);
        term24085 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term24085, term24085.getClass(), "tagName", null);
        setBooleanField(term24085, term24085.getClass(), "isBlock", false);
        setBooleanField(term24085, term24085.getClass(), "canContainBlock", false);
        setBooleanField(term24085, term24085.getClass(), "canContainInline", true);
        setBooleanField(term24085, term24085.getClass(), "optionalClosing", false);
        setBooleanField(term24085, term24085.getClass(), "empty", false);
        setBooleanField(term24085, term24085.getClass(), "preserveWhitespace", false);
        setField(term24085, term24085.getClass(), "ancestors", null);
        Object term24089 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term24089, term24089.getClass(), "tagName", null);
        setBooleanField(term24089, term24089.getClass(), "isBlock", false);
        setBooleanField(term24089, term24089.getClass(), "canContainBlock", false);
        setBooleanField(term24089, term24089.getClass(), "canContainInline", true);
        setBooleanField(term24089, term24089.getClass(), "optionalClosing", true);
        setBooleanField(term24089, term24089.getClass(), "empty", false);
        setBooleanField(term24089, term24089.getClass(), "preserveWhitespace", false);
        setField(term24089, term24089.getClass(), "ancestors", null);
        ArrayList term24087 = new ArrayList();
        ((ArrayList) term24087).add(term24089);
        term24086 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term24086, term24086.getClass(), "tagName", null);
        setBooleanField(term24086, term24086.getClass(), "isBlock", false);
        setBooleanField(term24086, term24086.getClass(), "canContainBlock", false);
        setBooleanField(term24086, term24086.getClass(), "canContainInline", false);
        setBooleanField(term24086, term24086.getClass(), "optionalClosing", false);
        setBooleanField(term24086, term24086.getClass(), "empty", false);
        setBooleanField(term24086, term24086.getClass(), "preserveWhitespace", false);
        setField(term24086, term24086.getClass(), "ancestors", term24087);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Tag");
        Object[] args = new Object[1];
        args[0] = term23947;
        Object retValue = callMethod(klass, "isValidParent", argTypes, term23901, args);
        assertTrue(recursiveEquals(term23901, term24085));
        assertTrue(recursiveEquals(term23947, term24086));
        assertTrue(recursiveEquals(retValue, false));
    }

};


