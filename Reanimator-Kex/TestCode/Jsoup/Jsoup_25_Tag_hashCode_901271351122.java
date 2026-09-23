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

public class Tag_hashCode_901271351122 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9536;
     Object term9742;

    public Tag_hashCode_901271351122() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9536 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term9536, term9536.getClass(), "tagName", "");
        setBooleanField(term9536, term9536.getClass(), "isBlock", true);
        setBooleanField(term9536, term9536.getClass(), "formatAsBlock", true);
        setBooleanField(term9536, term9536.getClass(), "canContainBlock", false);
        setBooleanField(term9536, term9536.getClass(), "canContainInline", false);
        setBooleanField(term9536, term9536.getClass(), "empty", true);
        term9742 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term9742, term9742.getClass(), "tagName", "");
        setBooleanField(term9742, term9742.getClass(), "isBlock", true);
        setBooleanField(term9742, term9742.getClass(), "formatAsBlock", true);
        setBooleanField(term9742, term9742.getClass(), "canContainBlock", false);
        setBooleanField(term9742, term9742.getClass(), "canContainInline", false);
        setBooleanField(term9742, term9742.getClass(), "empty", true);
        setBooleanField(term9742, term9742.getClass(), "selfClosing", false);
        setBooleanField(term9742, term9742.getClass(), "preserveWhitespace", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term9536, args);
        assertTrue(recursiveEquals(term9536, term9742));
        assertTrue(recursiveEquals(retValue, 916133793));
    }

};


