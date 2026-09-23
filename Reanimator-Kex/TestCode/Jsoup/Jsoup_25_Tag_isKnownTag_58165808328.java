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

public class Tag_isKnownTag_58165808328 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term285;
     Object term1086;

    public Tag_isKnownTag_58165808328() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term285 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term285, term285.getClass(), "tagName", "NRdvgJlhkX");
        setBooleanField(term285, term285.getClass(), "isBlock", false);
        setBooleanField(term285, term285.getClass(), "formatAsBlock", true);
        setBooleanField(term285, term285.getClass(), "canContainBlock", false);
        setBooleanField(term285, term285.getClass(), "canContainInline", false);
        setBooleanField(term285, term285.getClass(), "empty", false);
        setBooleanField(term285, term285.getClass(), "selfClosing", false);
        setBooleanField(term285, term285.getClass(), "preserveWhitespace", true);
        term1086 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term1086, term1086.getClass(), "tagName", "NRdvgJlhkX");
        setBooleanField(term1086, term1086.getClass(), "isBlock", false);
        setBooleanField(term1086, term1086.getClass(), "formatAsBlock", true);
        setBooleanField(term1086, term1086.getClass(), "canContainBlock", false);
        setBooleanField(term1086, term1086.getClass(), "canContainInline", false);
        setBooleanField(term1086, term1086.getClass(), "empty", false);
        setBooleanField(term1086, term1086.getClass(), "selfClosing", false);
        setBooleanField(term1086, term1086.getClass(), "preserveWhitespace", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isKnownTag", argTypes, term285, args);
        assertTrue(recursiveEquals(term285, term1086));
    }

};


