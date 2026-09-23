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

public class Tag_hashCode_901271351159 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14376;
     Object term14435;

    public Tag_hashCode_901271351159() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14376 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term14376, term14376.getClass(), "tagName", "");
        setBooleanField(term14376, term14376.getClass(), "isBlock", false);
        setBooleanField(term14376, term14376.getClass(), "formatAsBlock", false);
        setBooleanField(term14376, term14376.getClass(), "canContainInline", true);
        setBooleanField(term14376, term14376.getClass(), "empty", true);
        setBooleanField(term14376, term14376.getClass(), "selfClosing", true);
        setBooleanField(term14376, term14376.getClass(), "preserveWhitespace", false);
        setBooleanField(term14376, term14376.getClass(), "formList", true);
        setBooleanField(term14376, term14376.getClass(), "formSubmit", true);
        term14435 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term14435, term14435.getClass(), "tagName", "");
        setBooleanField(term14435, term14435.getClass(), "isBlock", false);
        setBooleanField(term14435, term14435.getClass(), "formatAsBlock", false);
        setBooleanField(term14435, term14435.getClass(), "canContainInline", true);
        setBooleanField(term14435, term14435.getClass(), "empty", true);
        setBooleanField(term14435, term14435.getClass(), "selfClosing", true);
        setBooleanField(term14435, term14435.getClass(), "preserveWhitespace", false);
        setBooleanField(term14435, term14435.getClass(), "formList", true);
        setBooleanField(term14435, term14435.getClass(), "formSubmit", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term14376, args);
        assertTrue(recursiveEquals(term14376, term14435));
        assertTrue(recursiveEquals(retValue, 29582495));
    }

};


