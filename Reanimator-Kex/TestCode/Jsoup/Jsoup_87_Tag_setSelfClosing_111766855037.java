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

public class Tag_setSelfClosing_111766855037 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term464;
     Object term1599;
     Object term1578;

    public Tag_setSelfClosing_111766855037() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term464 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term464, term464.getClass(), "tagName", "ZiaGIbnzTs");
        setBooleanField(term464, term464.getClass(), "isBlock", true);
        setBooleanField(term464, term464.getClass(), "formatAsBlock", false);
        setBooleanField(term464, term464.getClass(), "canContainInline", true);
        setBooleanField(term464, term464.getClass(), "empty", true);
        setBooleanField(term464, term464.getClass(), "selfClosing", false);
        setBooleanField(term464, term464.getClass(), "preserveWhitespace", false);
        setBooleanField(term464, term464.getClass(), "formList", true);
        setBooleanField(term464, term464.getClass(), "formSubmit", true);
        term1599 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term1599, term1599.getClass(), "tagName", "ZiaGIbnzTs");
        setBooleanField(term1599, term1599.getClass(), "isBlock", true);
        setBooleanField(term1599, term1599.getClass(), "formatAsBlock", false);
        setBooleanField(term1599, term1599.getClass(), "canContainInline", true);
        setBooleanField(term1599, term1599.getClass(), "empty", true);
        setBooleanField(term1599, term1599.getClass(), "selfClosing", true);
        setBooleanField(term1599, term1599.getClass(), "preserveWhitespace", false);
        setBooleanField(term1599, term1599.getClass(), "formList", true);
        setBooleanField(term1599, term1599.getClass(), "formSubmit", true);
        term1578 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term1578, term1578.getClass(), "tagName", "ZiaGIbnzTs");
        setBooleanField(term1578, term1578.getClass(), "isBlock", true);
        setBooleanField(term1578, term1578.getClass(), "formatAsBlock", false);
        setBooleanField(term1578, term1578.getClass(), "canContainInline", true);
        setBooleanField(term1578, term1578.getClass(), "empty", true);
        setBooleanField(term1578, term1578.getClass(), "selfClosing", true);
        setBooleanField(term1578, term1578.getClass(), "preserveWhitespace", false);
        setBooleanField(term1578, term1578.getClass(), "formList", true);
        setBooleanField(term1578, term1578.getClass(), "formSubmit", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "setSelfClosing", argTypes, term464, args);
        assertTrue(recursiveEquals(term464, term1599));
        assertTrue(recursiveEquals(retValue, term1578));
    }

};


