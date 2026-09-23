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

public class Tag_hashCode_901271351464 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term40175;
     Object term40386;

    public Tag_hashCode_901271351464() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term40175 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term40175, term40175.getClass(), "tagName", "");
        setBooleanField(term40175, term40175.getClass(), "isBlock", false);
        setBooleanField(term40175, term40175.getClass(), "formatAsBlock", true);
        setBooleanField(term40175, term40175.getClass(), "canContainInline", true);
        setBooleanField(term40175, term40175.getClass(), "empty", false);
        setBooleanField(term40175, term40175.getClass(), "selfClosing", false);
        setBooleanField(term40175, term40175.getClass(), "preserveWhitespace", true);
        setBooleanField(term40175, term40175.getClass(), "formList", true);
        term40386 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term40386, term40386.getClass(), "tagName", "");
        setBooleanField(term40386, term40386.getClass(), "isBlock", false);
        setBooleanField(term40386, term40386.getClass(), "formatAsBlock", true);
        setBooleanField(term40386, term40386.getClass(), "canContainInline", true);
        setBooleanField(term40386, term40386.getClass(), "empty", false);
        setBooleanField(term40386, term40386.getClass(), "selfClosing", false);
        setBooleanField(term40386, term40386.getClass(), "preserveWhitespace", true);
        setBooleanField(term40386, term40386.getClass(), "formList", true);
        setBooleanField(term40386, term40386.getClass(), "formSubmit", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term40175, args);
        assertTrue(recursiveEquals(term40175, term40386));
        assertTrue(recursiveEquals(retValue, 916133824));
    }

};


