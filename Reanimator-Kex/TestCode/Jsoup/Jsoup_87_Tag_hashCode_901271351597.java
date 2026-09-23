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

public class Tag_hashCode_901271351597 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term51575;
     Object term51657;

    public Tag_hashCode_901271351597() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term51575 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term51575, term51575.getClass(), "tagName", "");
        setBooleanField(term51575, term51575.getClass(), "isBlock", true);
        setBooleanField(term51575, term51575.getClass(), "formatAsBlock", false);
        setBooleanField(term51575, term51575.getClass(), "canContainInline", false);
        setBooleanField(term51575, term51575.getClass(), "empty", false);
        setBooleanField(term51575, term51575.getClass(), "selfClosing", true);
        setBooleanField(term51575, term51575.getClass(), "preserveWhitespace", true);
        setBooleanField(term51575, term51575.getClass(), "formList", false);
        setBooleanField(term51575, term51575.getClass(), "formSubmit", true);
        term51657 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term51657, term51657.getClass(), "tagName", "");
        setBooleanField(term51657, term51657.getClass(), "isBlock", true);
        setBooleanField(term51657, term51657.getClass(), "formatAsBlock", false);
        setBooleanField(term51657, term51657.getClass(), "canContainInline", false);
        setBooleanField(term51657, term51657.getClass(), "empty", false);
        setBooleanField(term51657, term51657.getClass(), "selfClosing", true);
        setBooleanField(term51657, term51657.getClass(), "preserveWhitespace", true);
        setBooleanField(term51657, term51657.getClass(), "formList", false);
        setBooleanField(term51657, term51657.getClass(), "formSubmit", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term51575, args);
        assertTrue(recursiveEquals(term51575, term51657));
        assertTrue(recursiveEquals(retValue, 1742841088));
    }

};


