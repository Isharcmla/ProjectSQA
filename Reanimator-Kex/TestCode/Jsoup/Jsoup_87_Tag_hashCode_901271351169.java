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

public class Tag_hashCode_901271351169 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15148;
     Object term15207;

    public Tag_hashCode_901271351169() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15148 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term15148, term15148.getClass(), "tagName", "");
        setBooleanField(term15148, term15148.getClass(), "isBlock", false);
        setBooleanField(term15148, term15148.getClass(), "formatAsBlock", false);
        setBooleanField(term15148, term15148.getClass(), "canContainInline", true);
        setBooleanField(term15148, term15148.getClass(), "empty", false);
        setBooleanField(term15148, term15148.getClass(), "selfClosing", false);
        setBooleanField(term15148, term15148.getClass(), "preserveWhitespace", true);
        setBooleanField(term15148, term15148.getClass(), "formList", false);
        setBooleanField(term15148, term15148.getClass(), "formSubmit", true);
        term15207 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term15207, term15207.getClass(), "tagName", "");
        setBooleanField(term15207, term15207.getClass(), "isBlock", false);
        setBooleanField(term15207, term15207.getClass(), "formatAsBlock", false);
        setBooleanField(term15207, term15207.getClass(), "canContainInline", true);
        setBooleanField(term15207, term15207.getClass(), "empty", false);
        setBooleanField(term15207, term15207.getClass(), "selfClosing", false);
        setBooleanField(term15207, term15207.getClass(), "preserveWhitespace", true);
        setBooleanField(term15207, term15207.getClass(), "formList", false);
        setBooleanField(term15207, term15207.getClass(), "formSubmit", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term15148, args);
        assertTrue(recursiveEquals(term15148, term15207));
        assertTrue(recursiveEquals(retValue, 28630113));
    }

};


