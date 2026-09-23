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

public class Tag_hashCode_901271351240 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21171;
     Object term21380;

    public Tag_hashCode_901271351240() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term21171 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term21171, term21171.getClass(), "tagName", "");
        setBooleanField(term21171, term21171.getClass(), "isBlock", true);
        setBooleanField(term21171, term21171.getClass(), "formatAsBlock", false);
        setBooleanField(term21171, term21171.getClass(), "canContainInline", false);
        setBooleanField(term21171, term21171.getClass(), "empty", true);
        setBooleanField(term21171, term21171.getClass(), "selfClosing", false);
        setBooleanField(term21171, term21171.getClass(), "preserveWhitespace", true);
        term21380 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term21380, term21380.getClass(), "tagName", "");
        setBooleanField(term21380, term21380.getClass(), "isBlock", true);
        setBooleanField(term21380, term21380.getClass(), "formatAsBlock", false);
        setBooleanField(term21380, term21380.getClass(), "canContainInline", false);
        setBooleanField(term21380, term21380.getClass(), "empty", true);
        setBooleanField(term21380, term21380.getClass(), "selfClosing", false);
        setBooleanField(term21380, term21380.getClass(), "preserveWhitespace", true);
        setBooleanField(term21380, term21380.getClass(), "formList", false);
        setBooleanField(term21380, term21380.getClass(), "formSubmit", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term21171, args);
        assertTrue(recursiveEquals(term21171, term21380));
        assertTrue(recursiveEquals(retValue, 1743734817));
    }

};


