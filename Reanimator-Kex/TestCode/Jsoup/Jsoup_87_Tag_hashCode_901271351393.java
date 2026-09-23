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

public class Tag_hashCode_901271351393 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33898;
     Object term34218;

    public Tag_hashCode_901271351393() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term33898 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term33898, term33898.getClass(), "tagName", "");
        setBooleanField(term33898, term33898.getClass(), "isBlock", true);
        setBooleanField(term33898, term33898.getClass(), "formatAsBlock", false);
        setBooleanField(term33898, term33898.getClass(), "canContainInline", true);
        setBooleanField(term33898, term33898.getClass(), "empty", true);
        setBooleanField(term33898, term33898.getClass(), "selfClosing", true);
        setBooleanField(term33898, term33898.getClass(), "preserveWhitespace", false);
        setBooleanField(term33898, term33898.getClass(), "formList", false);
        setBooleanField(term33898, term33898.getClass(), "formSubmit", true);
        term34218 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term34218, term34218.getClass(), "tagName", "");
        setBooleanField(term34218, term34218.getClass(), "isBlock", true);
        setBooleanField(term34218, term34218.getClass(), "formatAsBlock", false);
        setBooleanField(term34218, term34218.getClass(), "canContainInline", true);
        setBooleanField(term34218, term34218.getClass(), "empty", true);
        setBooleanField(term34218, term34218.getClass(), "selfClosing", true);
        setBooleanField(term34218, term34218.getClass(), "preserveWhitespace", false);
        setBooleanField(term34218, term34218.getClass(), "formList", false);
        setBooleanField(term34218, term34218.getClass(), "formSubmit", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term33898, args);
        assertTrue(recursiveEquals(term33898, term34218));
        assertTrue(recursiveEquals(retValue, 1772392799));
    }

};


