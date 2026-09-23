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

public class Tag_hashCode_901271351256 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20009;
     Object term20212;

    public Tag_hashCode_901271351256() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20009 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term20009, term20009.getClass(), "tagName", "");
        setBooleanField(term20009, term20009.getClass(), "isBlock", false);
        setBooleanField(term20009, term20009.getClass(), "formatAsBlock", false);
        setBooleanField(term20009, term20009.getClass(), "canContainBlock", false);
        setBooleanField(term20009, term20009.getClass(), "canContainInline", true);
        setBooleanField(term20009, term20009.getClass(), "empty", false);
        setBooleanField(term20009, term20009.getClass(), "selfClosing", true);
        term20212 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term20212, term20212.getClass(), "tagName", "");
        setBooleanField(term20212, term20212.getClass(), "isBlock", false);
        setBooleanField(term20212, term20212.getClass(), "formatAsBlock", false);
        setBooleanField(term20212, term20212.getClass(), "canContainBlock", false);
        setBooleanField(term20212, term20212.getClass(), "canContainInline", true);
        setBooleanField(term20212, term20212.getClass(), "empty", false);
        setBooleanField(term20212, term20212.getClass(), "selfClosing", true);
        setBooleanField(term20212, term20212.getClass(), "preserveWhitespace", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term20009, args);
        assertTrue(recursiveEquals(term20009, term20212));
        assertTrue(recursiveEquals(retValue, 29822));
    }

};


