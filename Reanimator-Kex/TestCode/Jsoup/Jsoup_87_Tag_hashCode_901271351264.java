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

public class Tag_hashCode_901271351264 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23161;
     Object term23364;

    public Tag_hashCode_901271351264() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23161 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term23161, term23161.getClass(), "tagName", "");
        setBooleanField(term23161, term23161.getClass(), "isBlock", false);
        setBooleanField(term23161, term23161.getClass(), "formatAsBlock", false);
        setBooleanField(term23161, term23161.getClass(), "canContainInline", false);
        setBooleanField(term23161, term23161.getClass(), "empty", false);
        setBooleanField(term23161, term23161.getClass(), "selfClosing", true);
        setBooleanField(term23161, term23161.getClass(), "preserveWhitespace", false);
        setBooleanField(term23161, term23161.getClass(), "formList", false);
        setBooleanField(term23161, term23161.getClass(), "formSubmit", true);
        term23364 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term23364, term23364.getClass(), "tagName", "");
        setBooleanField(term23364, term23364.getClass(), "isBlock", false);
        setBooleanField(term23364, term23364.getClass(), "formatAsBlock", false);
        setBooleanField(term23364, term23364.getClass(), "canContainInline", false);
        setBooleanField(term23364, term23364.getClass(), "empty", false);
        setBooleanField(term23364, term23364.getClass(), "selfClosing", true);
        setBooleanField(term23364, term23364.getClass(), "preserveWhitespace", false);
        setBooleanField(term23364, term23364.getClass(), "formList", false);
        setBooleanField(term23364, term23364.getClass(), "formSubmit", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term23161, args);
        assertTrue(recursiveEquals(term23161, term23364));
        assertTrue(recursiveEquals(retValue, 29792));
    }

};


