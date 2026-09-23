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

public class Tag_hashCode_901271351373 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32158;
     Object term32506;

    public Tag_hashCode_901271351373() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term32158 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term32158, term32158.getClass(), "tagName", "");
        setBooleanField(term32158, term32158.getClass(), "isBlock", false);
        setBooleanField(term32158, term32158.getClass(), "formatAsBlock", true);
        setBooleanField(term32158, term32158.getClass(), "canContainInline", false);
        setBooleanField(term32158, term32158.getClass(), "empty", false);
        setBooleanField(term32158, term32158.getClass(), "selfClosing", true);
        setBooleanField(term32158, term32158.getClass(), "preserveWhitespace", false);
        setBooleanField(term32158, term32158.getClass(), "formList", true);
        setBooleanField(term32158, term32158.getClass(), "formSubmit", true);
        term32506 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term32506, term32506.getClass(), "tagName", "");
        setBooleanField(term32506, term32506.getClass(), "isBlock", false);
        setBooleanField(term32506, term32506.getClass(), "formatAsBlock", true);
        setBooleanField(term32506, term32506.getClass(), "canContainInline", false);
        setBooleanField(term32506, term32506.getClass(), "empty", false);
        setBooleanField(term32506, term32506.getClass(), "selfClosing", true);
        setBooleanField(term32506, term32506.getClass(), "preserveWhitespace", false);
        setBooleanField(term32506, term32506.getClass(), "formList", true);
        setBooleanField(term32506, term32506.getClass(), "formSubmit", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term32158, args);
        assertTrue(recursiveEquals(term32158, term32506));
        assertTrue(recursiveEquals(retValue, 887533504));
    }

};


