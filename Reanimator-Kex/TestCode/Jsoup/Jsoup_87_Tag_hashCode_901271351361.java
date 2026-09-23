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

public class Tag_hashCode_901271351361 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31135;
     Object term31513;

    public Tag_hashCode_901271351361() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term31135 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term31135, term31135.getClass(), "tagName", "");
        setBooleanField(term31135, term31135.getClass(), "isBlock", true);
        setBooleanField(term31135, term31135.getClass(), "formatAsBlock", false);
        setBooleanField(term31135, term31135.getClass(), "canContainInline", false);
        setBooleanField(term31135, term31135.getClass(), "empty", true);
        setBooleanField(term31135, term31135.getClass(), "selfClosing", false);
        setBooleanField(term31135, term31135.getClass(), "preserveWhitespace", true);
        setBooleanField(term31135, term31135.getClass(), "formList", true);
        term31513 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term31513, term31513.getClass(), "tagName", "");
        setBooleanField(term31513, term31513.getClass(), "isBlock", true);
        setBooleanField(term31513, term31513.getClass(), "formatAsBlock", false);
        setBooleanField(term31513, term31513.getClass(), "canContainInline", false);
        setBooleanField(term31513, term31513.getClass(), "empty", true);
        setBooleanField(term31513, term31513.getClass(), "selfClosing", false);
        setBooleanField(term31513, term31513.getClass(), "preserveWhitespace", true);
        setBooleanField(term31513, term31513.getClass(), "formList", true);
        setBooleanField(term31513, term31513.getClass(), "formSubmit", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term31135, args);
        assertTrue(recursiveEquals(term31135, term31513));
        assertTrue(recursiveEquals(retValue, 1743734848));
    }

};


