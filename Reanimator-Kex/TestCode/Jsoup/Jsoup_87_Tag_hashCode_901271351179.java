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

public class Tag_hashCode_901271351179 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16004;
     Object term16063;

    public Tag_hashCode_901271351179() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16004 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term16004, term16004.getClass(), "tagName", "");
        setBooleanField(term16004, term16004.getClass(), "isBlock", true);
        setBooleanField(term16004, term16004.getClass(), "formatAsBlock", false);
        setBooleanField(term16004, term16004.getClass(), "canContainInline", true);
        setBooleanField(term16004, term16004.getClass(), "empty", false);
        setBooleanField(term16004, term16004.getClass(), "selfClosing", false);
        setBooleanField(term16004, term16004.getClass(), "preserveWhitespace", false);
        setBooleanField(term16004, term16004.getClass(), "formList", true);
        term16063 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term16063, term16063.getClass(), "tagName", "");
        setBooleanField(term16063, term16063.getClass(), "isBlock", true);
        setBooleanField(term16063, term16063.getClass(), "formatAsBlock", false);
        setBooleanField(term16063, term16063.getClass(), "canContainInline", true);
        setBooleanField(term16063, term16063.getClass(), "empty", false);
        setBooleanField(term16063, term16063.getClass(), "selfClosing", false);
        setBooleanField(term16063, term16063.getClass(), "preserveWhitespace", false);
        setBooleanField(term16063, term16063.getClass(), "formList", true);
        setBooleanField(term16063, term16063.getClass(), "formSubmit", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term16004, args);
        assertTrue(recursiveEquals(term16004, term16063));
        assertTrue(recursiveEquals(retValue, 1771439517));
    }

};


