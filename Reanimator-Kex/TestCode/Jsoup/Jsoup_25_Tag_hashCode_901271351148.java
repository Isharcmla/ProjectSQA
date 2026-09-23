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

public class Tag_hashCode_901271351148 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11548;
     Object term11770;

    public Tag_hashCode_901271351148() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11548 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term11548, term11548.getClass(), "tagName", "");
        setBooleanField(term11548, term11548.getClass(), "isBlock", false);
        setBooleanField(term11548, term11548.getClass(), "formatAsBlock", true);
        setBooleanField(term11548, term11548.getClass(), "canContainBlock", false);
        setBooleanField(term11548, term11548.getClass(), "canContainInline", false);
        setBooleanField(term11548, term11548.getClass(), "empty", false);
        setBooleanField(term11548, term11548.getClass(), "selfClosing", true);
        term11770 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term11770, term11770.getClass(), "tagName", "");
        setBooleanField(term11770, term11770.getClass(), "isBlock", false);
        setBooleanField(term11770, term11770.getClass(), "formatAsBlock", true);
        setBooleanField(term11770, term11770.getClass(), "canContainBlock", false);
        setBooleanField(term11770, term11770.getClass(), "canContainInline", false);
        setBooleanField(term11770, term11770.getClass(), "empty", false);
        setBooleanField(term11770, term11770.getClass(), "selfClosing", true);
        setBooleanField(term11770, term11770.getClass(), "preserveWhitespace", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term11548, args);
        assertTrue(recursiveEquals(term11548, term11770));
        assertTrue(recursiveEquals(retValue, 28629182));
    }

};


