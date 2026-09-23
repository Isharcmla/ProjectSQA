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

public class Tag_hashCode_90127135150 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3366;
     Object term3530;

    public Tag_hashCode_90127135150() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3366 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term3366, term3366.getClass(), "tagName", "");
        setBooleanField(term3366, term3366.getClass(), "isBlock", true);
        setBooleanField(term3366, term3366.getClass(), "formatAsBlock", false);
        setBooleanField(term3366, term3366.getClass(), "canContainBlock", true);
        setBooleanField(term3366, term3366.getClass(), "canContainInline", false);
        setBooleanField(term3366, term3366.getClass(), "empty", false);
        setBooleanField(term3366, term3366.getClass(), "selfClosing", false);
        term3530 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term3530, term3530.getClass(), "tagName", "");
        setBooleanField(term3530, term3530.getClass(), "isBlock", true);
        setBooleanField(term3530, term3530.getClass(), "formatAsBlock", false);
        setBooleanField(term3530, term3530.getClass(), "canContainBlock", true);
        setBooleanField(term3530, term3530.getClass(), "canContainInline", false);
        setBooleanField(term3530, term3530.getClass(), "empty", false);
        setBooleanField(term3530, term3530.getClass(), "selfClosing", false);
        setBooleanField(term3530, term3530.getClass(), "preserveWhitespace", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term3366, args);
        assertTrue(recursiveEquals(term3366, term3530));
        assertTrue(recursiveEquals(retValue, 888427202));
    }

};


