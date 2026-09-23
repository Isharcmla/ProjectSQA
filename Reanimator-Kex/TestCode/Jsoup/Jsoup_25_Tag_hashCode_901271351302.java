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

public class Tag_hashCode_901271351302 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23979;
     Object term24196;

    public Tag_hashCode_901271351302() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23979 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term23979, term23979.getClass(), "tagName", "");
        setBooleanField(term23979, term23979.getClass(), "isBlock", false);
        setBooleanField(term23979, term23979.getClass(), "formatAsBlock", true);
        setBooleanField(term23979, term23979.getClass(), "canContainBlock", false);
        setBooleanField(term23979, term23979.getClass(), "canContainInline", true);
        setBooleanField(term23979, term23979.getClass(), "empty", true);
        setBooleanField(term23979, term23979.getClass(), "selfClosing", true);
        setBooleanField(term23979, term23979.getClass(), "preserveWhitespace", true);
        term24196 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term24196, term24196.getClass(), "tagName", "");
        setBooleanField(term24196, term24196.getClass(), "isBlock", false);
        setBooleanField(term24196, term24196.getClass(), "formatAsBlock", true);
        setBooleanField(term24196, term24196.getClass(), "canContainBlock", false);
        setBooleanField(term24196, term24196.getClass(), "canContainInline", true);
        setBooleanField(term24196, term24196.getClass(), "empty", true);
        setBooleanField(term24196, term24196.getClass(), "selfClosing", true);
        setBooleanField(term24196, term24196.getClass(), "preserveWhitespace", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term23979, args);
        assertTrue(recursiveEquals(term23979, term24196));
        assertTrue(recursiveEquals(retValue, 28659935));
    }

};


