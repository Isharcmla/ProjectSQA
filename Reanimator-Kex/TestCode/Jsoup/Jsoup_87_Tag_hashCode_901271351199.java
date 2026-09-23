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

public class Tag_hashCode_901271351199 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17694;
     Object term17753;

    public Tag_hashCode_901271351199() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17694 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term17694, term17694.getClass(), "tagName", "");
        setBooleanField(term17694, term17694.getClass(), "isBlock", true);
        setBooleanField(term17694, term17694.getClass(), "formatAsBlock", true);
        setBooleanField(term17694, term17694.getClass(), "canContainInline", false);
        setBooleanField(term17694, term17694.getClass(), "empty", false);
        setBooleanField(term17694, term17694.getClass(), "selfClosing", true);
        setBooleanField(term17694, term17694.getClass(), "preserveWhitespace", false);
        setBooleanField(term17694, term17694.getClass(), "formList", false);
        setBooleanField(term17694, term17694.getClass(), "formSubmit", true);
        term17753 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term17753, term17753.getClass(), "tagName", "");
        setBooleanField(term17753, term17753.getClass(), "isBlock", true);
        setBooleanField(term17753, term17753.getClass(), "formatAsBlock", true);
        setBooleanField(term17753, term17753.getClass(), "canContainInline", false);
        setBooleanField(term17753, term17753.getClass(), "empty", false);
        setBooleanField(term17753, term17753.getClass(), "selfClosing", true);
        setBooleanField(term17753, term17753.getClass(), "preserveWhitespace", false);
        setBooleanField(term17753, term17753.getClass(), "formList", false);
        setBooleanField(term17753, term17753.getClass(), "formSubmit", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term17694, args);
        assertTrue(recursiveEquals(term17694, term17753));
        assertTrue(recursiveEquals(retValue, -1664623488));
    }

};


