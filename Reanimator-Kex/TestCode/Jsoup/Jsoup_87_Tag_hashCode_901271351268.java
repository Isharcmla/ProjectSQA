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

public class Tag_hashCode_901271351268 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23501;
     Object term23692;

    public Tag_hashCode_901271351268() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23501 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term23501, term23501.getClass(), "tagName", "");
        setBooleanField(term23501, term23501.getClass(), "isBlock", true);
        setBooleanField(term23501, term23501.getClass(), "formatAsBlock", false);
        setBooleanField(term23501, term23501.getClass(), "canContainInline", false);
        setBooleanField(term23501, term23501.getClass(), "empty", false);
        setBooleanField(term23501, term23501.getClass(), "selfClosing", true);
        setBooleanField(term23501, term23501.getClass(), "preserveWhitespace", false);
        setBooleanField(term23501, term23501.getClass(), "formList", false);
        setBooleanField(term23501, term23501.getClass(), "formSubmit", true);
        term23692 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term23692, term23692.getClass(), "tagName", "");
        setBooleanField(term23692, term23692.getClass(), "isBlock", true);
        setBooleanField(term23692, term23692.getClass(), "formatAsBlock", false);
        setBooleanField(term23692, term23692.getClass(), "canContainInline", false);
        setBooleanField(term23692, term23692.getClass(), "empty", false);
        setBooleanField(term23692, term23692.getClass(), "selfClosing", true);
        setBooleanField(term23692, term23692.getClass(), "preserveWhitespace", false);
        setBooleanField(term23692, term23692.getClass(), "formList", false);
        setBooleanField(term23692, term23692.getClass(), "formSubmit", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term23501, args);
        assertTrue(recursiveEquals(term23501, term23692));
        assertTrue(recursiveEquals(retValue, 1742840127));
    }

};


