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

public class Tag_hashCode_901271351153 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13881;
     Object term13940;

    public Tag_hashCode_901271351153() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13881 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term13881, term13881.getClass(), "tagName", "");
        setBooleanField(term13881, term13881.getClass(), "isBlock", false);
        setBooleanField(term13881, term13881.getClass(), "formatAsBlock", false);
        setBooleanField(term13881, term13881.getClass(), "canContainInline", true);
        setBooleanField(term13881, term13881.getClass(), "empty", false);
        setBooleanField(term13881, term13881.getClass(), "selfClosing", false);
        setBooleanField(term13881, term13881.getClass(), "preserveWhitespace", false);
        setBooleanField(term13881, term13881.getClass(), "formList", true);
        setBooleanField(term13881, term13881.getClass(), "formSubmit", true);
        term13940 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term13940, term13940.getClass(), "tagName", "");
        setBooleanField(term13940, term13940.getClass(), "isBlock", false);
        setBooleanField(term13940, term13940.getClass(), "formatAsBlock", false);
        setBooleanField(term13940, term13940.getClass(), "canContainInline", true);
        setBooleanField(term13940, term13940.getClass(), "empty", false);
        setBooleanField(term13940, term13940.getClass(), "selfClosing", false);
        setBooleanField(term13940, term13940.getClass(), "preserveWhitespace", false);
        setBooleanField(term13940, term13940.getClass(), "formList", true);
        setBooleanField(term13940, term13940.getClass(), "formSubmit", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term13881, args);
        assertTrue(recursiveEquals(term13881, term13940));
        assertTrue(recursiveEquals(retValue, 28629183));
    }

};


