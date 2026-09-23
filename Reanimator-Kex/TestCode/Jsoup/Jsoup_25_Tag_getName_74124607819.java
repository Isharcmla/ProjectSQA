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

public class Tag_getName_74124607819 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23;
     Object term617;

    public Tag_getName_74124607819() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term23, term23.getClass(), "tagName", "sjlJAEtRrb");
        setBooleanField(term23, term23.getClass(), "isBlock", false);
        setBooleanField(term23, term23.getClass(), "formatAsBlock", false);
        setBooleanField(term23, term23.getClass(), "canContainBlock", false);
        setBooleanField(term23, term23.getClass(), "canContainInline", false);
        setBooleanField(term23, term23.getClass(), "empty", true);
        setBooleanField(term23, term23.getClass(), "selfClosing", true);
        setBooleanField(term23, term23.getClass(), "preserveWhitespace", true);
        term617 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term617, term617.getClass(), "tagName", "sjlJAEtRrb");
        setBooleanField(term617, term617.getClass(), "isBlock", false);
        setBooleanField(term617, term617.getClass(), "formatAsBlock", false);
        setBooleanField(term617, term617.getClass(), "canContainBlock", false);
        setBooleanField(term617, term617.getClass(), "canContainInline", false);
        setBooleanField(term617, term617.getClass(), "empty", true);
        setBooleanField(term617, term617.getClass(), "selfClosing", true);
        setBooleanField(term617, term617.getClass(), "preserveWhitespace", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getName", argTypes, term23, args);
        assertTrue(recursiveEquals(term23, term617));
        assertTrue(recursiveEquals(retValue, "sjlJAEtRrb"));
    }

};


