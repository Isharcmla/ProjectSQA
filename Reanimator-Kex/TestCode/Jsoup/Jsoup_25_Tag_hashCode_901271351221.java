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

public class Tag_hashCode_901271351221 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17284;
     Object term17341;

    public Tag_hashCode_901271351221() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17284 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term17284, term17284.getClass(), "tagName", "");
        setBooleanField(term17284, term17284.getClass(), "isBlock", true);
        setBooleanField(term17284, term17284.getClass(), "formatAsBlock", true);
        setBooleanField(term17284, term17284.getClass(), "canContainBlock", true);
        setBooleanField(term17284, term17284.getClass(), "canContainInline", false);
        setBooleanField(term17284, term17284.getClass(), "empty", false);
        setBooleanField(term17284, term17284.getClass(), "selfClosing", true);
        setBooleanField(term17284, term17284.getClass(), "preserveWhitespace", true);
        term17341 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term17341, term17341.getClass(), "tagName", "");
        setBooleanField(term17341, term17341.getClass(), "isBlock", true);
        setBooleanField(term17341, term17341.getClass(), "formatAsBlock", true);
        setBooleanField(term17341, term17341.getClass(), "canContainBlock", true);
        setBooleanField(term17341, term17341.getClass(), "canContainInline", false);
        setBooleanField(term17341, term17341.getClass(), "empty", false);
        setBooleanField(term17341, term17341.getClass(), "selfClosing", true);
        setBooleanField(term17341, term17341.getClass(), "preserveWhitespace", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term17284, args);
        assertTrue(recursiveEquals(term17284, term17341));
        assertTrue(recursiveEquals(retValue, 917056385));
    }

};


