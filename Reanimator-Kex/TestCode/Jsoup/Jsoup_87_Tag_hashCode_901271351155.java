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

public class Tag_hashCode_901271351155 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14054;
     Object term14113;

    public Tag_hashCode_901271351155() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14054 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term14054, term14054.getClass(), "tagName", "");
        setBooleanField(term14054, term14054.getClass(), "isBlock", false);
        setBooleanField(term14054, term14054.getClass(), "formatAsBlock", false);
        setBooleanField(term14054, term14054.getClass(), "canContainInline", true);
        setBooleanField(term14054, term14054.getClass(), "empty", true);
        setBooleanField(term14054, term14054.getClass(), "selfClosing", true);
        setBooleanField(term14054, term14054.getClass(), "preserveWhitespace", true);
        setBooleanField(term14054, term14054.getClass(), "formList", false);
        setBooleanField(term14054, term14054.getClass(), "formSubmit", true);
        term14113 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term14113, term14113.getClass(), "tagName", "");
        setBooleanField(term14113, term14113.getClass(), "isBlock", false);
        setBooleanField(term14113, term14113.getClass(), "formatAsBlock", false);
        setBooleanField(term14113, term14113.getClass(), "canContainInline", true);
        setBooleanField(term14113, term14113.getClass(), "empty", true);
        setBooleanField(term14113, term14113.getClass(), "selfClosing", true);
        setBooleanField(term14113, term14113.getClass(), "preserveWhitespace", true);
        setBooleanField(term14113, term14113.getClass(), "formList", false);
        setBooleanField(term14113, term14113.getClass(), "formSubmit", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term14054, args);
        assertTrue(recursiveEquals(term14054, term14113));
        assertTrue(recursiveEquals(retValue, 29583425));
    }

};


