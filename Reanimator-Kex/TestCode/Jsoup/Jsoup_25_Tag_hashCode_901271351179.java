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

public class Tag_hashCode_901271351179 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13979;
     Object term14078;

    public Tag_hashCode_901271351179() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13979 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term13979, term13979.getClass(), "tagName", "");
        setBooleanField(term13979, term13979.getClass(), "isBlock", true);
        setBooleanField(term13979, term13979.getClass(), "formatAsBlock", false);
        setBooleanField(term13979, term13979.getClass(), "canContainBlock", true);
        setBooleanField(term13979, term13979.getClass(), "canContainInline", true);
        setBooleanField(term13979, term13979.getClass(), "empty", true);
        setBooleanField(term13979, term13979.getClass(), "selfClosing", false);
        setBooleanField(term13979, term13979.getClass(), "preserveWhitespace", true);
        term14078 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term14078, term14078.getClass(), "tagName", "");
        setBooleanField(term14078, term14078.getClass(), "isBlock", true);
        setBooleanField(term14078, term14078.getClass(), "formatAsBlock", false);
        setBooleanField(term14078, term14078.getClass(), "canContainBlock", true);
        setBooleanField(term14078, term14078.getClass(), "canContainInline", true);
        setBooleanField(term14078, term14078.getClass(), "empty", true);
        setBooleanField(term14078, term14078.getClass(), "selfClosing", false);
        setBooleanField(term14078, term14078.getClass(), "preserveWhitespace", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term13979, args);
        assertTrue(recursiveEquals(term13979, term14078));
        assertTrue(recursiveEquals(retValue, 888457955));
    }

};


