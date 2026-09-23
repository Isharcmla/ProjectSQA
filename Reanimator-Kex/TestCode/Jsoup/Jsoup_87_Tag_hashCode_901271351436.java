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

public class Tag_hashCode_901271351436 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37754;
     Object term37953;

    public Tag_hashCode_901271351436() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term37754 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term37754, term37754.getClass(), "tagName", "");
        setBooleanField(term37754, term37754.getClass(), "isBlock", true);
        setBooleanField(term37754, term37754.getClass(), "formatAsBlock", true);
        setBooleanField(term37754, term37754.getClass(), "canContainInline", true);
        setBooleanField(term37754, term37754.getClass(), "empty", false);
        setBooleanField(term37754, term37754.getClass(), "selfClosing", true);
        setBooleanField(term37754, term37754.getClass(), "preserveWhitespace", true);
        term37953 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term37953, term37953.getClass(), "tagName", "");
        setBooleanField(term37953, term37953.getClass(), "isBlock", true);
        setBooleanField(term37953, term37953.getClass(), "formatAsBlock", true);
        setBooleanField(term37953, term37953.getClass(), "canContainInline", true);
        setBooleanField(term37953, term37953.getClass(), "empty", false);
        setBooleanField(term37953, term37953.getClass(), "selfClosing", true);
        setBooleanField(term37953, term37953.getClass(), "preserveWhitespace", true);
        setBooleanField(term37953, term37953.getClass(), "formList", false);
        setBooleanField(term37953, term37953.getClass(), "formSubmit", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term37754, args);
        assertTrue(recursiveEquals(term37754, term37953));
        assertTrue(recursiveEquals(retValue, -1635993377));
    }

};


