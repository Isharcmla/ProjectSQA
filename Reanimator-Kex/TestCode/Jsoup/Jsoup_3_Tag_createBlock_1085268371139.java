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

public class Tag_createBlock_1085268371139 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29008;

    public Tag_createBlock_1085268371139() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term29027 = new ArrayList();
        ((ArrayList) term29027).add((Object)null);
        Object term29019 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term29019, term29019.getClass(), "tagName", "");
        setBooleanField(term29019, term29019.getClass(), "isBlock", true);
        setBooleanField(term29019, term29019.getClass(), "canContainBlock", true);
        setBooleanField(term29019, term29019.getClass(), "canContainInline", true);
        setBooleanField(term29019, term29019.getClass(), "optionalClosing", false);
        setBooleanField(term29019, term29019.getClass(), "empty", false);
        setBooleanField(term29019, term29019.getClass(), "preserveWhitespace", false);
        setField(term29019, term29019.getClass(), "ancestors", term29027);
        ArrayList term29017 = new ArrayList();
        ((ArrayList) term29017).add(term29019);
        term29008 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term29008, term29008.getClass(), "tagName", "");
        setBooleanField(term29008, term29008.getClass(), "isBlock", true);
        setBooleanField(term29008, term29008.getClass(), "canContainBlock", true);
        setBooleanField(term29008, term29008.getClass(), "canContainInline", true);
        setBooleanField(term29008, term29008.getClass(), "optionalClosing", false);
        setBooleanField(term29008, term29008.getClass(), "empty", false);
        setBooleanField(term29008, term29008.getClass(), "preserveWhitespace", false);
        setField(term29008, term29008.getClass(), "ancestors", term29017);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "";
        Object retValue = callMethod(klass, "createBlock", argTypes, null, args);
        assertTrue(recursiveEquals(retValue, term29008));
    }

};


