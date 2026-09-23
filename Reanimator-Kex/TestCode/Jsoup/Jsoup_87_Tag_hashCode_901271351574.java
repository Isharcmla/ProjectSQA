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

public class Tag_hashCode_901271351574 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term49496;
     Object term49723;

    public Tag_hashCode_901271351574() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term49496 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term49496, term49496.getClass(), "tagName", "");
        setBooleanField(term49496, term49496.getClass(), "isBlock", false);
        setBooleanField(term49496, term49496.getClass(), "formatAsBlock", true);
        setBooleanField(term49496, term49496.getClass(), "canContainInline", true);
        setBooleanField(term49496, term49496.getClass(), "empty", true);
        setBooleanField(term49496, term49496.getClass(), "selfClosing", false);
        setBooleanField(term49496, term49496.getClass(), "preserveWhitespace", true);
        setBooleanField(term49496, term49496.getClass(), "formList", false);
        setBooleanField(term49496, term49496.getClass(), "formSubmit", true);
        term49723 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term49723, term49723.getClass(), "tagName", "");
        setBooleanField(term49723, term49723.getClass(), "isBlock", false);
        setBooleanField(term49723, term49723.getClass(), "formatAsBlock", true);
        setBooleanField(term49723, term49723.getClass(), "canContainInline", true);
        setBooleanField(term49723, term49723.getClass(), "empty", true);
        setBooleanField(term49723, term49723.getClass(), "selfClosing", false);
        setBooleanField(term49723, term49723.getClass(), "preserveWhitespace", true);
        setBooleanField(term49723, term49723.getClass(), "formList", false);
        setBooleanField(term49723, term49723.getClass(), "formSubmit", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term49496, args);
        assertTrue(recursiveEquals(term49496, term49723));
        assertTrue(recursiveEquals(retValue, 917057315));
    }

};


