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

public class Tag_hashCode_901271351496 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term42720;
     Object term42927;

    public Tag_hashCode_901271351496() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term42720 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term42720, term42720.getClass(), "tagName", "");
        setBooleanField(term42720, term42720.getClass(), "isBlock", false);
        setBooleanField(term42720, term42720.getClass(), "formatAsBlock", true);
        setBooleanField(term42720, term42720.getClass(), "canContainInline", true);
        setBooleanField(term42720, term42720.getClass(), "empty", true);
        setBooleanField(term42720, term42720.getClass(), "selfClosing", false);
        setBooleanField(term42720, term42720.getClass(), "preserveWhitespace", false);
        setBooleanField(term42720, term42720.getClass(), "formList", true);
        setBooleanField(term42720, term42720.getClass(), "formSubmit", true);
        term42927 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term42927, term42927.getClass(), "tagName", "");
        setBooleanField(term42927, term42927.getClass(), "isBlock", false);
        setBooleanField(term42927, term42927.getClass(), "formatAsBlock", true);
        setBooleanField(term42927, term42927.getClass(), "canContainInline", true);
        setBooleanField(term42927, term42927.getClass(), "empty", true);
        setBooleanField(term42927, term42927.getClass(), "selfClosing", false);
        setBooleanField(term42927, term42927.getClass(), "preserveWhitespace", false);
        setBooleanField(term42927, term42927.getClass(), "formList", true);
        setBooleanField(term42927, term42927.getClass(), "formSubmit", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term42720, args);
        assertTrue(recursiveEquals(term42720, term42927));
        assertTrue(recursiveEquals(retValue, 917056385));
    }

};


