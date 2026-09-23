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

public class Tag_hashCode_901271351369 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31939;
     Object term32044;

    public Tag_hashCode_901271351369() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term31939 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term31939, term31939.getClass(), "tagName", "");
        setBooleanField(term31939, term31939.getClass(), "isBlock", true);
        setBooleanField(term31939, term31939.getClass(), "formatAsBlock", true);
        setBooleanField(term31939, term31939.getClass(), "canContainInline", true);
        setBooleanField(term31939, term31939.getClass(), "empty", false);
        setBooleanField(term31939, term31939.getClass(), "selfClosing", true);
        setBooleanField(term31939, term31939.getClass(), "preserveWhitespace", false);
        setBooleanField(term31939, term31939.getClass(), "formList", true);
        term32044 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term32044, term32044.getClass(), "tagName", "");
        setBooleanField(term32044, term32044.getClass(), "isBlock", true);
        setBooleanField(term32044, term32044.getClass(), "formatAsBlock", true);
        setBooleanField(term32044, term32044.getClass(), "canContainInline", true);
        setBooleanField(term32044, term32044.getClass(), "empty", false);
        setBooleanField(term32044, term32044.getClass(), "selfClosing", true);
        setBooleanField(term32044, term32044.getClass(), "preserveWhitespace", false);
        setBooleanField(term32044, term32044.getClass(), "formList", true);
        setBooleanField(term32044, term32044.getClass(), "formSubmit", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term31939, args);
        assertTrue(recursiveEquals(term31939, term32044));
        assertTrue(recursiveEquals(retValue, -1635994307));
    }

};


