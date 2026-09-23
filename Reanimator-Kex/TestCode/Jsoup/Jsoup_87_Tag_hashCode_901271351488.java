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

public class Tag_hashCode_901271351488 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term42186;
     Object term42391;

    public Tag_hashCode_901271351488() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term42186 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term42186, term42186.getClass(), "tagName", "");
        setBooleanField(term42186, term42186.getClass(), "isBlock", true);
        setBooleanField(term42186, term42186.getClass(), "formatAsBlock", true);
        setBooleanField(term42186, term42186.getClass(), "canContainInline", true);
        setBooleanField(term42186, term42186.getClass(), "empty", true);
        setBooleanField(term42186, term42186.getClass(), "selfClosing", true);
        setBooleanField(term42186, term42186.getClass(), "preserveWhitespace", false);
        setBooleanField(term42186, term42186.getClass(), "formList", true);
        term42391 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term42391, term42391.getClass(), "tagName", "");
        setBooleanField(term42391, term42391.getClass(), "isBlock", true);
        setBooleanField(term42391, term42391.getClass(), "formatAsBlock", true);
        setBooleanField(term42391, term42391.getClass(), "canContainInline", true);
        setBooleanField(term42391, term42391.getClass(), "empty", true);
        setBooleanField(term42391, term42391.getClass(), "selfClosing", true);
        setBooleanField(term42391, term42391.getClass(), "preserveWhitespace", false);
        setBooleanField(term42391, term42391.getClass(), "formList", true);
        setBooleanField(term42391, term42391.getClass(), "formSubmit", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term42186, args);
        assertTrue(recursiveEquals(term42186, term42391));
        assertTrue(recursiveEquals(retValue, -1635070786));
    }

};


