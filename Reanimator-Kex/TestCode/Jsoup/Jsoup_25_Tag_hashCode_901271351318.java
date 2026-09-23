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

public class Tag_hashCode_901271351318 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25305;
     Object term25489;

    public Tag_hashCode_901271351318() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25305 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term25305, term25305.getClass(), "tagName", "");
        setBooleanField(term25305, term25305.getClass(), "isBlock", true);
        setBooleanField(term25305, term25305.getClass(), "formatAsBlock", false);
        setBooleanField(term25305, term25305.getClass(), "canContainBlock", false);
        setBooleanField(term25305, term25305.getClass(), "canContainInline", false);
        setBooleanField(term25305, term25305.getClass(), "empty", true);
        setBooleanField(term25305, term25305.getClass(), "selfClosing", false);
        setBooleanField(term25305, term25305.getClass(), "preserveWhitespace", true);
        term25489 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term25489, term25489.getClass(), "tagName", "");
        setBooleanField(term25489, term25489.getClass(), "isBlock", true);
        setBooleanField(term25489, term25489.getClass(), "formatAsBlock", false);
        setBooleanField(term25489, term25489.getClass(), "canContainBlock", false);
        setBooleanField(term25489, term25489.getClass(), "canContainInline", false);
        setBooleanField(term25489, term25489.getClass(), "empty", true);
        setBooleanField(term25489, term25489.getClass(), "selfClosing", false);
        setBooleanField(term25489, term25489.getClass(), "preserveWhitespace", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term25305, args);
        assertTrue(recursiveEquals(term25305, term25489));
        assertTrue(recursiveEquals(retValue, 887504643));
    }

};


