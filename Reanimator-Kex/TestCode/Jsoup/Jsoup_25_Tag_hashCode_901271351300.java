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

public class Tag_hashCode_901271351300 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23814;
     Object term24036;

    public Tag_hashCode_901271351300() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23814 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term23814, term23814.getClass(), "tagName", "");
        setBooleanField(term23814, term23814.getClass(), "isBlock", true);
        setBooleanField(term23814, term23814.getClass(), "formatAsBlock", true);
        setBooleanField(term23814, term23814.getClass(), "canContainBlock", true);
        setBooleanField(term23814, term23814.getClass(), "canContainInline", true);
        setBooleanField(term23814, term23814.getClass(), "empty", false);
        setBooleanField(term23814, term23814.getClass(), "selfClosing", true);
        setBooleanField(term23814, term23814.getClass(), "preserveWhitespace", true);
        term24036 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term24036, term24036.getClass(), "tagName", "");
        setBooleanField(term24036, term24036.getClass(), "isBlock", true);
        setBooleanField(term24036, term24036.getClass(), "formatAsBlock", true);
        setBooleanField(term24036, term24036.getClass(), "canContainBlock", true);
        setBooleanField(term24036, term24036.getClass(), "canContainInline", true);
        setBooleanField(term24036, term24036.getClass(), "empty", false);
        setBooleanField(term24036, term24036.getClass(), "selfClosing", true);
        setBooleanField(term24036, term24036.getClass(), "preserveWhitespace", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term23814, args);
        assertTrue(recursiveEquals(term23814, term24036));
        assertTrue(recursiveEquals(retValue, 917086176));
    }

};


