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

public class Tag_hashCode_901271351131 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12091;
     Object term12150;

    public Tag_hashCode_901271351131() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12091 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term12091, term12091.getClass(), "tagName", "");
        setBooleanField(term12091, term12091.getClass(), "isBlock", true);
        setBooleanField(term12091, term12091.getClass(), "formatAsBlock", false);
        setBooleanField(term12091, term12091.getClass(), "canContainInline", false);
        setBooleanField(term12091, term12091.getClass(), "empty", false);
        setBooleanField(term12091, term12091.getClass(), "selfClosing", false);
        setBooleanField(term12091, term12091.getClass(), "preserveWhitespace", true);
        term12150 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term12150, term12150.getClass(), "tagName", "");
        setBooleanField(term12150, term12150.getClass(), "isBlock", true);
        setBooleanField(term12150, term12150.getClass(), "formatAsBlock", false);
        setBooleanField(term12150, term12150.getClass(), "canContainInline", false);
        setBooleanField(term12150, term12150.getClass(), "empty", false);
        setBooleanField(term12150, term12150.getClass(), "selfClosing", false);
        setBooleanField(term12150, term12150.getClass(), "preserveWhitespace", true);
        setBooleanField(term12150, term12150.getClass(), "formList", false);
        setBooleanField(term12150, term12150.getClass(), "formSubmit", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term12091, args);
        assertTrue(recursiveEquals(term12091, term12150));
        assertTrue(recursiveEquals(retValue, 1742811296));
    }

};


