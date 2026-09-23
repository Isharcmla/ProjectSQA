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

public class Tag_hashCode_901271351442 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38249;
     Object term38460;

    public Tag_hashCode_901271351442() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term38249 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term38249, term38249.getClass(), "tagName", "");
        setBooleanField(term38249, term38249.getClass(), "isBlock", false);
        setBooleanField(term38249, term38249.getClass(), "formatAsBlock", false);
        setBooleanField(term38249, term38249.getClass(), "canContainInline", false);
        setBooleanField(term38249, term38249.getClass(), "empty", true);
        setBooleanField(term38249, term38249.getClass(), "selfClosing", false);
        setBooleanField(term38249, term38249.getClass(), "preserveWhitespace", true);
        setBooleanField(term38249, term38249.getClass(), "formList", false);
        setBooleanField(term38249, term38249.getClass(), "formSubmit", true);
        term38460 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term38460, term38460.getClass(), "tagName", "");
        setBooleanField(term38460, term38460.getClass(), "isBlock", false);
        setBooleanField(term38460, term38460.getClass(), "formatAsBlock", false);
        setBooleanField(term38460, term38460.getClass(), "canContainInline", false);
        setBooleanField(term38460, term38460.getClass(), "empty", true);
        setBooleanField(term38460, term38460.getClass(), "selfClosing", false);
        setBooleanField(term38460, term38460.getClass(), "preserveWhitespace", true);
        setBooleanField(term38460, term38460.getClass(), "formList", false);
        setBooleanField(term38460, term38460.getClass(), "formSubmit", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term38249, args);
        assertTrue(recursiveEquals(term38249, term38460));
        assertTrue(recursiveEquals(retValue, 924483));
    }

};


