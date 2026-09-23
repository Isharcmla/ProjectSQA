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

public class Tag_hashCode_90127135181 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5423;
     Object term5482;

    public Tag_hashCode_90127135181() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5423 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term5423, term5423.getClass(), "tagName", "");
        setBooleanField(term5423, term5423.getClass(), "isBlock", false);
        setBooleanField(term5423, term5423.getClass(), "formatAsBlock", false);
        setBooleanField(term5423, term5423.getClass(), "canContainInline", true);
        setBooleanField(term5423, term5423.getClass(), "empty", false);
        setBooleanField(term5423, term5423.getClass(), "selfClosing", false);
        setBooleanField(term5423, term5423.getClass(), "preserveWhitespace", false);
        setBooleanField(term5423, term5423.getClass(), "formList", false);
        setBooleanField(term5423, term5423.getClass(), "formSubmit", true);
        term5482 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term5482, term5482.getClass(), "tagName", "");
        setBooleanField(term5482, term5482.getClass(), "isBlock", false);
        setBooleanField(term5482, term5482.getClass(), "formatAsBlock", false);
        setBooleanField(term5482, term5482.getClass(), "canContainInline", true);
        setBooleanField(term5482, term5482.getClass(), "empty", false);
        setBooleanField(term5482, term5482.getClass(), "selfClosing", false);
        setBooleanField(term5482, term5482.getClass(), "preserveWhitespace", false);
        setBooleanField(term5482, term5482.getClass(), "formList", false);
        setBooleanField(term5482, term5482.getClass(), "formSubmit", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term5423, args);
        assertTrue(recursiveEquals(term5423, term5482));
        assertTrue(recursiveEquals(retValue, 28629152));
    }

};


