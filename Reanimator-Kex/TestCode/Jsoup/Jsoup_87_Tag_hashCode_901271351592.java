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

public class Tag_hashCode_901271351592 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term51079;
     Object term51283;

    public Tag_hashCode_901271351592() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term51079 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term51079, term51079.getClass(), "tagName", "");
        setBooleanField(term51079, term51079.getClass(), "isBlock", false);
        setBooleanField(term51079, term51079.getClass(), "formatAsBlock", true);
        setBooleanField(term51079, term51079.getClass(), "canContainInline", false);
        setBooleanField(term51079, term51079.getClass(), "empty", false);
        setBooleanField(term51079, term51079.getClass(), "selfClosing", true);
        setBooleanField(term51079, term51079.getClass(), "preserveWhitespace", true);
        setBooleanField(term51079, term51079.getClass(), "formList", true);
        setBooleanField(term51079, term51079.getClass(), "formSubmit", true);
        term51283 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term51283, term51283.getClass(), "tagName", "");
        setBooleanField(term51283, term51283.getClass(), "isBlock", false);
        setBooleanField(term51283, term51283.getClass(), "formatAsBlock", true);
        setBooleanField(term51283, term51283.getClass(), "canContainInline", false);
        setBooleanField(term51283, term51283.getClass(), "empty", false);
        setBooleanField(term51283, term51283.getClass(), "selfClosing", true);
        setBooleanField(term51283, term51283.getClass(), "preserveWhitespace", true);
        setBooleanField(term51283, term51283.getClass(), "formList", true);
        setBooleanField(term51283, term51283.getClass(), "formSubmit", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term51079, args);
        assertTrue(recursiveEquals(term51079, term51283));
        assertTrue(recursiveEquals(retValue, 887534465));
    }

};


