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

public class Tag_hashCode_901271351481 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term41666;
     Object term41740;

    public Tag_hashCode_901271351481() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term41666 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term41666, term41666.getClass(), "tagName", "");
        setBooleanField(term41666, term41666.getClass(), "isBlock", true);
        setBooleanField(term41666, term41666.getClass(), "formatAsBlock", false);
        setBooleanField(term41666, term41666.getClass(), "canContainInline", false);
        setBooleanField(term41666, term41666.getClass(), "empty", true);
        setBooleanField(term41666, term41666.getClass(), "selfClosing", true);
        setBooleanField(term41666, term41666.getClass(), "preserveWhitespace", true);
        setBooleanField(term41666, term41666.getClass(), "formList", false);
        setBooleanField(term41666, term41666.getClass(), "formSubmit", true);
        term41740 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term41740, term41740.getClass(), "tagName", "");
        setBooleanField(term41740, term41740.getClass(), "isBlock", true);
        setBooleanField(term41740, term41740.getClass(), "formatAsBlock", false);
        setBooleanField(term41740, term41740.getClass(), "canContainInline", false);
        setBooleanField(term41740, term41740.getClass(), "empty", true);
        setBooleanField(term41740, term41740.getClass(), "selfClosing", true);
        setBooleanField(term41740, term41740.getClass(), "preserveWhitespace", true);
        setBooleanField(term41740, term41740.getClass(), "formList", false);
        setBooleanField(term41740, term41740.getClass(), "formSubmit", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term41666, args);
        assertTrue(recursiveEquals(term41666, term41740));
        assertTrue(recursiveEquals(retValue, 1743764609));
    }

};


