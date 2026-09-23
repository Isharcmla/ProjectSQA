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

public class Tag_hashCode_901271351165 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14826;
     Object term14885;

    public Tag_hashCode_901271351165() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14826 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term14826, term14826.getClass(), "tagName", "");
        setBooleanField(term14826, term14826.getClass(), "isBlock", false);
        setBooleanField(term14826, term14826.getClass(), "formatAsBlock", false);
        setBooleanField(term14826, term14826.getClass(), "canContainInline", false);
        setBooleanField(term14826, term14826.getClass(), "empty", false);
        setBooleanField(term14826, term14826.getClass(), "selfClosing", true);
        term14885 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term14885, term14885.getClass(), "tagName", "");
        setBooleanField(term14885, term14885.getClass(), "isBlock", false);
        setBooleanField(term14885, term14885.getClass(), "formatAsBlock", false);
        setBooleanField(term14885, term14885.getClass(), "canContainInline", false);
        setBooleanField(term14885, term14885.getClass(), "empty", false);
        setBooleanField(term14885, term14885.getClass(), "selfClosing", true);
        setBooleanField(term14885, term14885.getClass(), "preserveWhitespace", false);
        setBooleanField(term14885, term14885.getClass(), "formList", false);
        setBooleanField(term14885, term14885.getClass(), "formSubmit", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term14826, args);
        assertTrue(recursiveEquals(term14826, term14885));
        assertTrue(recursiveEquals(retValue, 29791));
    }

};


