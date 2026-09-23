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

public class Tag_hashCode_901271351201 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17855;
     Object term17914;

    public Tag_hashCode_901271351201() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17855 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term17855, term17855.getClass(), "tagName", "");
        setBooleanField(term17855, term17855.getClass(), "isBlock", false);
        setBooleanField(term17855, term17855.getClass(), "formatAsBlock", false);
        setBooleanField(term17855, term17855.getClass(), "canContainInline", false);
        setBooleanField(term17855, term17855.getClass(), "empty", false);
        setBooleanField(term17855, term17855.getClass(), "selfClosing", true);
        setBooleanField(term17855, term17855.getClass(), "preserveWhitespace", false);
        setBooleanField(term17855, term17855.getClass(), "formList", true);
        term17914 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term17914, term17914.getClass(), "tagName", "");
        setBooleanField(term17914, term17914.getClass(), "isBlock", false);
        setBooleanField(term17914, term17914.getClass(), "formatAsBlock", false);
        setBooleanField(term17914, term17914.getClass(), "canContainInline", false);
        setBooleanField(term17914, term17914.getClass(), "empty", false);
        setBooleanField(term17914, term17914.getClass(), "selfClosing", true);
        setBooleanField(term17914, term17914.getClass(), "preserveWhitespace", false);
        setBooleanField(term17914, term17914.getClass(), "formList", true);
        setBooleanField(term17914, term17914.getClass(), "formSubmit", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term17855, args);
        assertTrue(recursiveEquals(term17855, term17914));
        assertTrue(recursiveEquals(retValue, 29822));
    }

};


