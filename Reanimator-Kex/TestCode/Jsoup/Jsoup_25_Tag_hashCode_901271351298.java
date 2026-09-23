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

public class Tag_hashCode_901271351298 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23647;
     Object term23871;

    public Tag_hashCode_901271351298() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23647 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term23647, term23647.getClass(), "tagName", "");
        setBooleanField(term23647, term23647.getClass(), "isBlock", true);
        setBooleanField(term23647, term23647.getClass(), "formatAsBlock", true);
        setBooleanField(term23647, term23647.getClass(), "canContainBlock", true);
        setBooleanField(term23647, term23647.getClass(), "canContainInline", true);
        setBooleanField(term23647, term23647.getClass(), "empty", false);
        setBooleanField(term23647, term23647.getClass(), "selfClosing", false);
        setBooleanField(term23647, term23647.getClass(), "preserveWhitespace", true);
        term23871 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term23871, term23871.getClass(), "tagName", "");
        setBooleanField(term23871, term23871.getClass(), "isBlock", true);
        setBooleanField(term23871, term23871.getClass(), "formatAsBlock", true);
        setBooleanField(term23871, term23871.getClass(), "canContainBlock", true);
        setBooleanField(term23871, term23871.getClass(), "canContainInline", true);
        setBooleanField(term23871, term23871.getClass(), "empty", false);
        setBooleanField(term23871, term23871.getClass(), "selfClosing", false);
        setBooleanField(term23871, term23871.getClass(), "preserveWhitespace", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term23647, args);
        assertTrue(recursiveEquals(term23647, term23871));
        assertTrue(recursiveEquals(retValue, 917086145));
    }

};


