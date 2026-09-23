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

public class Tag_hashCode_901271351263 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20648;
     Object term20726;

    public Tag_hashCode_901271351263() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20648 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term20648, term20648.getClass(), "tagName", "");
        setBooleanField(term20648, term20648.getClass(), "isBlock", false);
        setBooleanField(term20648, term20648.getClass(), "formatAsBlock", true);
        setBooleanField(term20648, term20648.getClass(), "canContainBlock", true);
        setBooleanField(term20648, term20648.getClass(), "canContainInline", true);
        setBooleanField(term20648, term20648.getClass(), "empty", false);
        setBooleanField(term20648, term20648.getClass(), "selfClosing", true);
        setBooleanField(term20648, term20648.getClass(), "preserveWhitespace", true);
        term20726 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term20726, term20726.getClass(), "tagName", "");
        setBooleanField(term20726, term20726.getClass(), "isBlock", false);
        setBooleanField(term20726, term20726.getClass(), "formatAsBlock", true);
        setBooleanField(term20726, term20726.getClass(), "canContainBlock", true);
        setBooleanField(term20726, term20726.getClass(), "canContainInline", true);
        setBooleanField(term20726, term20726.getClass(), "empty", false);
        setBooleanField(term20726, term20726.getClass(), "selfClosing", true);
        setBooleanField(term20726, term20726.getClass(), "preserveWhitespace", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term20648, args);
        assertTrue(recursiveEquals(term20648, term20726));
        assertTrue(recursiveEquals(retValue, 29582495));
    }

};


