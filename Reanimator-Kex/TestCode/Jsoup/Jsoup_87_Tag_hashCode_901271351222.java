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

public class Tag_hashCode_901271351222 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19694;
     Object term19890;

    public Tag_hashCode_901271351222() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19694 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term19694, term19694.getClass(), "tagName", "");
        setBooleanField(term19694, term19694.getClass(), "isBlock", true);
        setBooleanField(term19694, term19694.getClass(), "formatAsBlock", true);
        setBooleanField(term19694, term19694.getClass(), "canContainInline", true);
        setBooleanField(term19694, term19694.getClass(), "empty", false);
        setBooleanField(term19694, term19694.getClass(), "selfClosing", false);
        setBooleanField(term19694, term19694.getClass(), "preserveWhitespace", false);
        setBooleanField(term19694, term19694.getClass(), "formList", false);
        setBooleanField(term19694, term19694.getClass(), "formSubmit", true);
        term19890 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term19890, term19890.getClass(), "tagName", "");
        setBooleanField(term19890, term19890.getClass(), "isBlock", true);
        setBooleanField(term19890, term19890.getClass(), "formatAsBlock", true);
        setBooleanField(term19890, term19890.getClass(), "canContainInline", true);
        setBooleanField(term19890, term19890.getClass(), "empty", false);
        setBooleanField(term19890, term19890.getClass(), "selfClosing", false);
        setBooleanField(term19890, term19890.getClass(), "preserveWhitespace", false);
        setBooleanField(term19890, term19890.getClass(), "formList", false);
        setBooleanField(term19890, term19890.getClass(), "formSubmit", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term19694, args);
        assertTrue(recursiveEquals(term19694, term19890));
        assertTrue(recursiveEquals(retValue, -1636024128));
    }

};


