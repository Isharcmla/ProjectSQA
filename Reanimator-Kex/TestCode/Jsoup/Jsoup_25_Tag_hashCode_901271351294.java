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

public class Tag_hashCode_901271351294 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23339;
     Object term23538;

    public Tag_hashCode_901271351294() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23339 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term23339, term23339.getClass(), "tagName", "");
        setBooleanField(term23339, term23339.getClass(), "isBlock", true);
        setBooleanField(term23339, term23339.getClass(), "formatAsBlock", true);
        setBooleanField(term23339, term23339.getClass(), "canContainBlock", false);
        setBooleanField(term23339, term23339.getClass(), "canContainInline", true);
        setBooleanField(term23339, term23339.getClass(), "empty", false);
        setBooleanField(term23339, term23339.getClass(), "selfClosing", true);
        setBooleanField(term23339, term23339.getClass(), "preserveWhitespace", true);
        term23538 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term23538, term23538.getClass(), "tagName", "");
        setBooleanField(term23538, term23538.getClass(), "isBlock", true);
        setBooleanField(term23538, term23538.getClass(), "formatAsBlock", true);
        setBooleanField(term23538, term23538.getClass(), "canContainBlock", false);
        setBooleanField(term23538, term23538.getClass(), "canContainInline", true);
        setBooleanField(term23538, term23538.getClass(), "empty", false);
        setBooleanField(term23538, term23538.getClass(), "selfClosing", true);
        setBooleanField(term23538, term23538.getClass(), "preserveWhitespace", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term23339, args);
        assertTrue(recursiveEquals(term23339, term23538));
        assertTrue(recursiveEquals(retValue, 916162655));
    }

};


