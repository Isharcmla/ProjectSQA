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

public class Tag_hashCode_901271351171 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13234;
     Object term13554;

    public Tag_hashCode_901271351171() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13234 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term13234, term13234.getClass(), "tagName", "");
        setBooleanField(term13234, term13234.getClass(), "isBlock", false);
        setBooleanField(term13234, term13234.getClass(), "formatAsBlock", false);
        setBooleanField(term13234, term13234.getClass(), "canContainBlock", true);
        setBooleanField(term13234, term13234.getClass(), "canContainInline", false);
        setBooleanField(term13234, term13234.getClass(), "empty", false);
        setBooleanField(term13234, term13234.getClass(), "selfClosing", false);
        setBooleanField(term13234, term13234.getClass(), "preserveWhitespace", true);
        term13554 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term13554, term13554.getClass(), "tagName", "");
        setBooleanField(term13554, term13554.getClass(), "isBlock", false);
        setBooleanField(term13554, term13554.getClass(), "formatAsBlock", false);
        setBooleanField(term13554, term13554.getClass(), "canContainBlock", true);
        setBooleanField(term13554, term13554.getClass(), "canContainInline", false);
        setBooleanField(term13554, term13554.getClass(), "empty", false);
        setBooleanField(term13554, term13554.getClass(), "selfClosing", false);
        setBooleanField(term13554, term13554.getClass(), "preserveWhitespace", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term13234, args);
        assertTrue(recursiveEquals(term13234, term13554));
        assertTrue(recursiveEquals(retValue, 923522));
    }

};


