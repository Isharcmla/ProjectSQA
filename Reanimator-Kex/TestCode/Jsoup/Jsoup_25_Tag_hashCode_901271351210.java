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

public class Tag_hashCode_901271351210 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16331;
     Object term16524;

    public Tag_hashCode_901271351210() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16331 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term16331, term16331.getClass(), "tagName", "");
        setBooleanField(term16331, term16331.getClass(), "isBlock", true);
        setBooleanField(term16331, term16331.getClass(), "formatAsBlock", true);
        setBooleanField(term16331, term16331.getClass(), "canContainBlock", false);
        setBooleanField(term16331, term16331.getClass(), "canContainInline", true);
        setBooleanField(term16331, term16331.getClass(), "empty", true);
        setBooleanField(term16331, term16331.getClass(), "selfClosing", true);
        term16524 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term16524, term16524.getClass(), "tagName", "");
        setBooleanField(term16524, term16524.getClass(), "isBlock", true);
        setBooleanField(term16524, term16524.getClass(), "formatAsBlock", true);
        setBooleanField(term16524, term16524.getClass(), "canContainBlock", false);
        setBooleanField(term16524, term16524.getClass(), "canContainInline", true);
        setBooleanField(term16524, term16524.getClass(), "empty", true);
        setBooleanField(term16524, term16524.getClass(), "selfClosing", true);
        setBooleanField(term16524, term16524.getClass(), "preserveWhitespace", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term16331, args);
        assertTrue(recursiveEquals(term16331, term16524));
        assertTrue(recursiveEquals(retValue, 916163615));
    }

};


