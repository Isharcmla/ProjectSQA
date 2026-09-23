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

public class Tag_hashCode_901271351362 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31303;
     Object term31536;

    public Tag_hashCode_901271351362() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term31303 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term31303, term31303.getClass(), "tagName", "");
        setBooleanField(term31303, term31303.getClass(), "isBlock", true);
        setBooleanField(term31303, term31303.getClass(), "formatAsBlock", false);
        setBooleanField(term31303, term31303.getClass(), "canContainInline", true);
        setBooleanField(term31303, term31303.getClass(), "empty", true);
        setBooleanField(term31303, term31303.getClass(), "selfClosing", false);
        setBooleanField(term31303, term31303.getClass(), "preserveWhitespace", true);
        setBooleanField(term31303, term31303.getClass(), "formList", true);
        term31536 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term31536, term31536.getClass(), "tagName", "");
        setBooleanField(term31536, term31536.getClass(), "isBlock", true);
        setBooleanField(term31536, term31536.getClass(), "formatAsBlock", false);
        setBooleanField(term31536, term31536.getClass(), "canContainInline", true);
        setBooleanField(term31536, term31536.getClass(), "empty", true);
        setBooleanField(term31536, term31536.getClass(), "selfClosing", false);
        setBooleanField(term31536, term31536.getClass(), "preserveWhitespace", true);
        setBooleanField(term31536, term31536.getClass(), "formList", true);
        setBooleanField(term31536, term31536.getClass(), "formSubmit", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term31303, args);
        assertTrue(recursiveEquals(term31303, term31536));
        assertTrue(recursiveEquals(retValue, 1772363999));
    }

};


