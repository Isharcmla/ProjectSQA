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

public class Tag_hashCode_901271351143 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13061;
     Object term13120;

    public Tag_hashCode_901271351143() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13061 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term13061, term13061.getClass(), "tagName", "");
        setBooleanField(term13061, term13061.getClass(), "isBlock", false);
        setBooleanField(term13061, term13061.getClass(), "formatAsBlock", false);
        setBooleanField(term13061, term13061.getClass(), "canContainInline", true);
        setBooleanField(term13061, term13061.getClass(), "empty", false);
        setBooleanField(term13061, term13061.getClass(), "selfClosing", false);
        setBooleanField(term13061, term13061.getClass(), "preserveWhitespace", true);
        setBooleanField(term13061, term13061.getClass(), "formList", true);
        term13120 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term13120, term13120.getClass(), "tagName", "");
        setBooleanField(term13120, term13120.getClass(), "isBlock", false);
        setBooleanField(term13120, term13120.getClass(), "formatAsBlock", false);
        setBooleanField(term13120, term13120.getClass(), "canContainInline", true);
        setBooleanField(term13120, term13120.getClass(), "empty", false);
        setBooleanField(term13120, term13120.getClass(), "selfClosing", false);
        setBooleanField(term13120, term13120.getClass(), "preserveWhitespace", true);
        setBooleanField(term13120, term13120.getClass(), "formList", true);
        setBooleanField(term13120, term13120.getClass(), "formSubmit", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term13061, args);
        assertTrue(recursiveEquals(term13061, term13120));
        assertTrue(recursiveEquals(retValue, 28630143));
    }

};


