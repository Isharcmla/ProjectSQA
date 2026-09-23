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

public class Tag_hashCode_901271351327 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28421;
     Object term28503;

    public Tag_hashCode_901271351327() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28421 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term28421, term28421.getClass(), "tagName", "");
        setBooleanField(term28421, term28421.getClass(), "isBlock", false);
        setBooleanField(term28421, term28421.getClass(), "formatAsBlock", false);
        setBooleanField(term28421, term28421.getClass(), "canContainInline", true);
        setBooleanField(term28421, term28421.getClass(), "empty", false);
        setBooleanField(term28421, term28421.getClass(), "selfClosing", false);
        setBooleanField(term28421, term28421.getClass(), "preserveWhitespace", true);
        setBooleanField(term28421, term28421.getClass(), "formList", true);
        setBooleanField(term28421, term28421.getClass(), "formSubmit", true);
        term28503 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term28503, term28503.getClass(), "tagName", "");
        setBooleanField(term28503, term28503.getClass(), "isBlock", false);
        setBooleanField(term28503, term28503.getClass(), "formatAsBlock", false);
        setBooleanField(term28503, term28503.getClass(), "canContainInline", true);
        setBooleanField(term28503, term28503.getClass(), "empty", false);
        setBooleanField(term28503, term28503.getClass(), "selfClosing", false);
        setBooleanField(term28503, term28503.getClass(), "preserveWhitespace", true);
        setBooleanField(term28503, term28503.getClass(), "formList", true);
        setBooleanField(term28503, term28503.getClass(), "formSubmit", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term28421, args);
        assertTrue(recursiveEquals(term28421, term28503));
        assertTrue(recursiveEquals(retValue, 28630144));
    }

};


