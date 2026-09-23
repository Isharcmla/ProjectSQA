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

public class Tag_register_3436246393 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20381;
     Object term20458;
     Object term20429;

    public Tag_register_3436246393() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20381 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term20381, term20381.getClass(), "ancestors", null);
        ArrayList term20463 = new ArrayList();
        ((ArrayList) term20463).add((Object)null);
        Object term20461 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term20461, term20461.getClass(), "tagName", "");
        setBooleanField(term20461, term20461.getClass(), "isBlock", true);
        setBooleanField(term20461, term20461.getClass(), "canContainBlock", true);
        setBooleanField(term20461, term20461.getClass(), "canContainInline", true);
        setBooleanField(term20461, term20461.getClass(), "optionalClosing", false);
        setBooleanField(term20461, term20461.getClass(), "empty", false);
        setBooleanField(term20461, term20461.getClass(), "preserveWhitespace", false);
        setField(term20461, term20461.getClass(), "ancestors", term20463);
        ArrayList term20459 = new ArrayList();
        ((ArrayList) term20459).add(term20461);
        term20458 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term20458, term20458.getClass(), "tagName", null);
        setBooleanField(term20458, term20458.getClass(), "isBlock", false);
        setBooleanField(term20458, term20458.getClass(), "canContainBlock", false);
        setBooleanField(term20458, term20458.getClass(), "canContainInline", false);
        setBooleanField(term20458, term20458.getClass(), "optionalClosing", false);
        setBooleanField(term20458, term20458.getClass(), "empty", false);
        setBooleanField(term20458, term20458.getClass(), "preserveWhitespace", false);
        setField(term20458, term20458.getClass(), "ancestors", term20459);
        ArrayList term20446 = new ArrayList();
        ((ArrayList) term20446).add((Object)null);
        Object term20438 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term20438, term20438.getClass(), "tagName", "");
        setBooleanField(term20438, term20438.getClass(), "isBlock", true);
        setBooleanField(term20438, term20438.getClass(), "canContainBlock", true);
        setBooleanField(term20438, term20438.getClass(), "canContainInline", true);
        setBooleanField(term20438, term20438.getClass(), "optionalClosing", false);
        setBooleanField(term20438, term20438.getClass(), "empty", false);
        setBooleanField(term20438, term20438.getClass(), "preserveWhitespace", false);
        setField(term20438, term20438.getClass(), "ancestors", term20446);
        ArrayList term20436 = new ArrayList();
        ((ArrayList) term20436).add(term20438);
        term20429 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term20429, term20429.getClass(), "tagName", null);
        setBooleanField(term20429, term20429.getClass(), "isBlock", false);
        setBooleanField(term20429, term20429.getClass(), "canContainBlock", false);
        setBooleanField(term20429, term20429.getClass(), "canContainInline", false);
        setBooleanField(term20429, term20429.getClass(), "optionalClosing", false);
        setBooleanField(term20429, term20429.getClass(), "empty", false);
        setBooleanField(term20429, term20429.getClass(), "preserveWhitespace", false);
        setField(term20429, term20429.getClass(), "ancestors", term20436);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Tag");
        Object[] args = new Object[1];
        args[0] = term20381;
        Object retValue = callMethod(klass, "register", argTypes, null, args);
        assertTrue(recursiveEquals(term20381, term20458));
        assertTrue(recursiveEquals(retValue, term20429));
    }

};


