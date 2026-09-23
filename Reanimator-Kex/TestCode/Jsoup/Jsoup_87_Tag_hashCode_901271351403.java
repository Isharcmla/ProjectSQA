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

public class Tag_hashCode_901271351403 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34976;
     Object term35081;

    public Tag_hashCode_901271351403() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term34976 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term34976, term34976.getClass(), "tagName", "");
        setBooleanField(term34976, term34976.getClass(), "isBlock", false);
        setBooleanField(term34976, term34976.getClass(), "formatAsBlock", false);
        setBooleanField(term34976, term34976.getClass(), "canContainInline", true);
        setBooleanField(term34976, term34976.getClass(), "empty", false);
        setBooleanField(term34976, term34976.getClass(), "selfClosing", true);
        setBooleanField(term34976, term34976.getClass(), "preserveWhitespace", true);
        setBooleanField(term34976, term34976.getClass(), "formList", true);
        setBooleanField(term34976, term34976.getClass(), "formSubmit", true);
        term35081 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term35081, term35081.getClass(), "tagName", "");
        setBooleanField(term35081, term35081.getClass(), "isBlock", false);
        setBooleanField(term35081, term35081.getClass(), "formatAsBlock", false);
        setBooleanField(term35081, term35081.getClass(), "canContainInline", true);
        setBooleanField(term35081, term35081.getClass(), "empty", false);
        setBooleanField(term35081, term35081.getClass(), "selfClosing", true);
        setBooleanField(term35081, term35081.getClass(), "preserveWhitespace", true);
        setBooleanField(term35081, term35081.getClass(), "formList", true);
        setBooleanField(term35081, term35081.getClass(), "formSubmit", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term34976, args);
        assertTrue(recursiveEquals(term34976, term35081));
        assertTrue(recursiveEquals(retValue, 28659935));
    }

};


