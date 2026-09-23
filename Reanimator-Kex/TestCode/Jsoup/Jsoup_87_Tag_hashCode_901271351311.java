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

public class Tag_hashCode_901271351311 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27110;
     Object term27192;

    public Tag_hashCode_901271351311() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term27110 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term27110, term27110.getClass(), "tagName", "");
        setBooleanField(term27110, term27110.getClass(), "isBlock", false);
        setBooleanField(term27110, term27110.getClass(), "formatAsBlock", false);
        setBooleanField(term27110, term27110.getClass(), "canContainInline", false);
        setBooleanField(term27110, term27110.getClass(), "empty", false);
        setBooleanField(term27110, term27110.getClass(), "selfClosing", true);
        setBooleanField(term27110, term27110.getClass(), "preserveWhitespace", false);
        setBooleanField(term27110, term27110.getClass(), "formList", true);
        setBooleanField(term27110, term27110.getClass(), "formSubmit", true);
        term27192 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term27192, term27192.getClass(), "tagName", "");
        setBooleanField(term27192, term27192.getClass(), "isBlock", false);
        setBooleanField(term27192, term27192.getClass(), "formatAsBlock", false);
        setBooleanField(term27192, term27192.getClass(), "canContainInline", false);
        setBooleanField(term27192, term27192.getClass(), "empty", false);
        setBooleanField(term27192, term27192.getClass(), "selfClosing", true);
        setBooleanField(term27192, term27192.getClass(), "preserveWhitespace", false);
        setBooleanField(term27192, term27192.getClass(), "formList", true);
        setBooleanField(term27192, term27192.getClass(), "formSubmit", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term27110, args);
        assertTrue(recursiveEquals(term27110, term27192));
        assertTrue(recursiveEquals(retValue, 29823));
    }

};


