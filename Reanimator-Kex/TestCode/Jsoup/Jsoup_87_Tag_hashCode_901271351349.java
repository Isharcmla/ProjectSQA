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

public class Tag_hashCode_901271351349 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30101;
     Object term30476;

    public Tag_hashCode_901271351349() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term30101 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term30101, term30101.getClass(), "tagName", "");
        setBooleanField(term30101, term30101.getClass(), "isBlock", false);
        setBooleanField(term30101, term30101.getClass(), "formatAsBlock", false);
        setBooleanField(term30101, term30101.getClass(), "canContainInline", true);
        setBooleanField(term30101, term30101.getClass(), "empty", false);
        setBooleanField(term30101, term30101.getClass(), "selfClosing", true);
        setBooleanField(term30101, term30101.getClass(), "preserveWhitespace", false);
        setBooleanField(term30101, term30101.getClass(), "formList", true);
        setBooleanField(term30101, term30101.getClass(), "formSubmit", true);
        term30476 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term30476, term30476.getClass(), "tagName", "");
        setBooleanField(term30476, term30476.getClass(), "isBlock", false);
        setBooleanField(term30476, term30476.getClass(), "formatAsBlock", false);
        setBooleanField(term30476, term30476.getClass(), "canContainInline", true);
        setBooleanField(term30476, term30476.getClass(), "empty", false);
        setBooleanField(term30476, term30476.getClass(), "selfClosing", true);
        setBooleanField(term30476, term30476.getClass(), "preserveWhitespace", false);
        setBooleanField(term30476, term30476.getClass(), "formList", true);
        setBooleanField(term30476, term30476.getClass(), "formSubmit", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term30101, args);
        assertTrue(recursiveEquals(term30101, term30476));
        assertTrue(recursiveEquals(retValue, 28658974));
    }

};


