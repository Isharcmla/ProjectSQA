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

public class Tag_createInline_204283515177 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15538;

    public Tag_createInline_204283515177() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term15557 = new ArrayList();
        ((ArrayList) term15557).add((Object)null);
        Object term15549 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term15549, term15549.getClass(), "tagName", "");
        setBooleanField(term15549, term15549.getClass(), "isBlock", true);
        setBooleanField(term15549, term15549.getClass(), "canContainBlock", true);
        setBooleanField(term15549, term15549.getClass(), "canContainInline", true);
        setBooleanField(term15549, term15549.getClass(), "optionalClosing", false);
        setBooleanField(term15549, term15549.getClass(), "empty", false);
        setBooleanField(term15549, term15549.getClass(), "preserveWhitespace", false);
        setField(term15549, term15549.getClass(), "ancestors", term15557);
        ArrayList term15547 = new ArrayList();
        ((ArrayList) term15547).add(term15549);
        term15538 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term15538, term15538.getClass(), "tagName", "");
        setBooleanField(term15538, term15538.getClass(), "isBlock", false);
        setBooleanField(term15538, term15538.getClass(), "canContainBlock", false);
        setBooleanField(term15538, term15538.getClass(), "canContainInline", true);
        setBooleanField(term15538, term15538.getClass(), "optionalClosing", false);
        setBooleanField(term15538, term15538.getClass(), "empty", false);
        setBooleanField(term15538, term15538.getClass(), "preserveWhitespace", false);
        setField(term15538, term15538.getClass(), "ancestors", term15547);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "";
        Object retValue = callMethod(klass, "createInline", argTypes, null, args);
        assertTrue(recursiveEquals(retValue, term15538));
    }

};


