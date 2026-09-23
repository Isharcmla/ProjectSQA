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

public class Tag_hashCode_901271351409 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term35509;
     Object term35591;

    public Tag_hashCode_901271351409() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term35509 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term35509, term35509.getClass(), "tagName", "");
        setBooleanField(term35509, term35509.getClass(), "isBlock", false);
        setBooleanField(term35509, term35509.getClass(), "formatAsBlock", true);
        setBooleanField(term35509, term35509.getClass(), "canContainInline", true);
        setBooleanField(term35509, term35509.getClass(), "empty", true);
        setBooleanField(term35509, term35509.getClass(), "selfClosing", true);
        setBooleanField(term35509, term35509.getClass(), "preserveWhitespace", true);
        term35591 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term35591, term35591.getClass(), "tagName", "");
        setBooleanField(term35591, term35591.getClass(), "isBlock", false);
        setBooleanField(term35591, term35591.getClass(), "formatAsBlock", true);
        setBooleanField(term35591, term35591.getClass(), "canContainInline", true);
        setBooleanField(term35591, term35591.getClass(), "empty", true);
        setBooleanField(term35591, term35591.getClass(), "selfClosing", true);
        setBooleanField(term35591, term35591.getClass(), "preserveWhitespace", true);
        setBooleanField(term35591, term35591.getClass(), "formList", false);
        setBooleanField(term35591, term35591.getClass(), "formSubmit", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term35509, args);
        assertTrue(recursiveEquals(term35509, term35591));
        assertTrue(recursiveEquals(retValue, 917087105));
    }

};


