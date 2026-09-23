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

public class Tag_hashCode_901271351438 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37894;
     Object term38115;

    public Tag_hashCode_901271351438() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term37894 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term37894, term37894.getClass(), "tagName", "");
        setBooleanField(term37894, term37894.getClass(), "isBlock", false);
        setBooleanField(term37894, term37894.getClass(), "formatAsBlock", false);
        setBooleanField(term37894, term37894.getClass(), "canContainInline", false);
        setBooleanField(term37894, term37894.getClass(), "empty", true);
        setBooleanField(term37894, term37894.getClass(), "selfClosing", false);
        setBooleanField(term37894, term37894.getClass(), "preserveWhitespace", true);
        setBooleanField(term37894, term37894.getClass(), "formList", true);
        term38115 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term38115, term38115.getClass(), "tagName", "");
        setBooleanField(term38115, term38115.getClass(), "isBlock", false);
        setBooleanField(term38115, term38115.getClass(), "formatAsBlock", false);
        setBooleanField(term38115, term38115.getClass(), "canContainInline", false);
        setBooleanField(term38115, term38115.getClass(), "empty", true);
        setBooleanField(term38115, term38115.getClass(), "selfClosing", false);
        setBooleanField(term38115, term38115.getClass(), "preserveWhitespace", true);
        setBooleanField(term38115, term38115.getClass(), "formList", true);
        setBooleanField(term38115, term38115.getClass(), "formSubmit", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term37894, args);
        assertTrue(recursiveEquals(term37894, term38115));
        assertTrue(recursiveEquals(retValue, 924513));
    }

};


