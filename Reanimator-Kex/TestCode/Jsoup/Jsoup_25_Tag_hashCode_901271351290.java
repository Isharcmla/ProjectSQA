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

public class Tag_hashCode_901271351290 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22988;
     Object term23209;

    public Tag_hashCode_901271351290() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term22988 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term22988, term22988.getClass(), "tagName", "");
        setBooleanField(term22988, term22988.getClass(), "isBlock", false);
        setBooleanField(term22988, term22988.getClass(), "formatAsBlock", true);
        setBooleanField(term22988, term22988.getClass(), "canContainBlock", true);
        setBooleanField(term22988, term22988.getClass(), "canContainInline", false);
        setBooleanField(term22988, term22988.getClass(), "empty", true);
        term23209 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term23209, term23209.getClass(), "tagName", "");
        setBooleanField(term23209, term23209.getClass(), "isBlock", false);
        setBooleanField(term23209, term23209.getClass(), "formatAsBlock", true);
        setBooleanField(term23209, term23209.getClass(), "canContainBlock", true);
        setBooleanField(term23209, term23209.getClass(), "canContainInline", false);
        setBooleanField(term23209, term23209.getClass(), "empty", true);
        setBooleanField(term23209, term23209.getClass(), "selfClosing", false);
        setBooleanField(term23209, term23209.getClass(), "preserveWhitespace", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term22988, args);
        assertTrue(recursiveEquals(term22988, term23209));
        assertTrue(recursiveEquals(retValue, 29553633));
    }

};


