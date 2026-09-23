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

public class Tag_isSelfClosing_150217477927 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term255;
     Object term1041;

    public Tag_isSelfClosing_150217477927() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term255 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term255, term255.getClass(), "tagName", "RMFIsYGgne");
        setBooleanField(term255, term255.getClass(), "isBlock", true);
        setBooleanField(term255, term255.getClass(), "formatAsBlock", false);
        setBooleanField(term255, term255.getClass(), "canContainBlock", false);
        setBooleanField(term255, term255.getClass(), "canContainInline", true);
        setBooleanField(term255, term255.getClass(), "empty", false);
        setBooleanField(term255, term255.getClass(), "selfClosing", true);
        setBooleanField(term255, term255.getClass(), "preserveWhitespace", false);
        term1041 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term1041, term1041.getClass(), "tagName", "RMFIsYGgne");
        setBooleanField(term1041, term1041.getClass(), "isBlock", true);
        setBooleanField(term1041, term1041.getClass(), "formatAsBlock", false);
        setBooleanField(term1041, term1041.getClass(), "canContainBlock", false);
        setBooleanField(term1041, term1041.getClass(), "canContainInline", true);
        setBooleanField(term1041, term1041.getClass(), "empty", false);
        setBooleanField(term1041, term1041.getClass(), "selfClosing", true);
        setBooleanField(term1041, term1041.getClass(), "preserveWhitespace", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "isSelfClosing", argTypes, term255, args);
        assertTrue(recursiveEquals(term255, term1041));
        assertTrue(recursiveEquals(retValue, true));
    }

};


