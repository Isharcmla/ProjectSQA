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

public class Tag_hashCode_901271351473 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term41020;
     Object term41102;

    public Tag_hashCode_901271351473() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term41020 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term41020, term41020.getClass(), "tagName", "");
        setBooleanField(term41020, term41020.getClass(), "isBlock", false);
        setBooleanField(term41020, term41020.getClass(), "formatAsBlock", false);
        setBooleanField(term41020, term41020.getClass(), "canContainInline", false);
        setBooleanField(term41020, term41020.getClass(), "empty", true);
        setBooleanField(term41020, term41020.getClass(), "selfClosing", false);
        setBooleanField(term41020, term41020.getClass(), "preserveWhitespace", true);
        setBooleanField(term41020, term41020.getClass(), "formList", true);
        setBooleanField(term41020, term41020.getClass(), "formSubmit", true);
        term41102 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term41102, term41102.getClass(), "tagName", "");
        setBooleanField(term41102, term41102.getClass(), "isBlock", false);
        setBooleanField(term41102, term41102.getClass(), "formatAsBlock", false);
        setBooleanField(term41102, term41102.getClass(), "canContainInline", false);
        setBooleanField(term41102, term41102.getClass(), "empty", true);
        setBooleanField(term41102, term41102.getClass(), "selfClosing", false);
        setBooleanField(term41102, term41102.getClass(), "preserveWhitespace", true);
        setBooleanField(term41102, term41102.getClass(), "formList", true);
        setBooleanField(term41102, term41102.getClass(), "formSubmit", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term41020, args);
        assertTrue(recursiveEquals(term41020, term41102));
        assertTrue(recursiveEquals(retValue, 924514));
    }

};


