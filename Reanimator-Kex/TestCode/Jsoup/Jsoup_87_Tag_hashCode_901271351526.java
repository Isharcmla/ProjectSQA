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

public class Tag_hashCode_901271351526 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45320;
     Object term45530;

    public Tag_hashCode_901271351526() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term45320 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term45320, term45320.getClass(), "tagName", "");
        setBooleanField(term45320, term45320.getClass(), "isBlock", true);
        setBooleanField(term45320, term45320.getClass(), "formatAsBlock", false);
        setBooleanField(term45320, term45320.getClass(), "canContainInline", true);
        setBooleanField(term45320, term45320.getClass(), "empty", true);
        setBooleanField(term45320, term45320.getClass(), "selfClosing", false);
        setBooleanField(term45320, term45320.getClass(), "preserveWhitespace", false);
        setBooleanField(term45320, term45320.getClass(), "formList", true);
        setBooleanField(term45320, term45320.getClass(), "formSubmit", true);
        term45530 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term45530, term45530.getClass(), "tagName", "");
        setBooleanField(term45530, term45530.getClass(), "isBlock", true);
        setBooleanField(term45530, term45530.getClass(), "formatAsBlock", false);
        setBooleanField(term45530, term45530.getClass(), "canContainInline", true);
        setBooleanField(term45530, term45530.getClass(), "empty", true);
        setBooleanField(term45530, term45530.getClass(), "selfClosing", false);
        setBooleanField(term45530, term45530.getClass(), "preserveWhitespace", false);
        setBooleanField(term45530, term45530.getClass(), "formList", true);
        setBooleanField(term45530, term45530.getClass(), "formSubmit", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term45320, args);
        assertTrue(recursiveEquals(term45320, term45530));
        assertTrue(recursiveEquals(retValue, 1772363039));
    }

};


