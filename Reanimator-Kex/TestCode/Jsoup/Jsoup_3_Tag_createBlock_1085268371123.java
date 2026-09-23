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

public class Tag_createBlock_1085268371123 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26242;

    public Tag_createBlock_1085268371123() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term26261 = new ArrayList();
        ((ArrayList) term26261).add((Object)null);
        Object term26253 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term26253, term26253.getClass(), "tagName", "");
        setBooleanField(term26253, term26253.getClass(), "isBlock", true);
        setBooleanField(term26253, term26253.getClass(), "canContainBlock", true);
        setBooleanField(term26253, term26253.getClass(), "canContainInline", true);
        setBooleanField(term26253, term26253.getClass(), "optionalClosing", false);
        setBooleanField(term26253, term26253.getClass(), "empty", false);
        setBooleanField(term26253, term26253.getClass(), "preserveWhitespace", false);
        setField(term26253, term26253.getClass(), "ancestors", term26261);
        ArrayList term26251 = new ArrayList();
        ((ArrayList) term26251).add(term26253);
        term26242 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term26242, term26242.getClass(), "tagName", "");
        setBooleanField(term26242, term26242.getClass(), "isBlock", true);
        setBooleanField(term26242, term26242.getClass(), "canContainBlock", true);
        setBooleanField(term26242, term26242.getClass(), "canContainInline", true);
        setBooleanField(term26242, term26242.getClass(), "optionalClosing", false);
        setBooleanField(term26242, term26242.getClass(), "empty", false);
        setBooleanField(term26242, term26242.getClass(), "preserveWhitespace", false);
        setField(term26242, term26242.getClass(), "ancestors", term26251);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "";
        Object retValue = callMethod(klass, "createBlock", argTypes, null, args);
        assertTrue(recursiveEquals(retValue, term26242));
    }

};


