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

public class Tag_hashCode_901271351256 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22500;
     Object term22702;

    public Tag_hashCode_901271351256() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term22500 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term22500, term22500.getClass(), "tagName", "");
        setBooleanField(term22500, term22500.getClass(), "isBlock", false);
        setBooleanField(term22500, term22500.getClass(), "formatAsBlock", false);
        setBooleanField(term22500, term22500.getClass(), "canContainInline", false);
        setBooleanField(term22500, term22500.getClass(), "empty", true);
        setBooleanField(term22500, term22500.getClass(), "selfClosing", true);
        setBooleanField(term22500, term22500.getClass(), "preserveWhitespace", false);
        setBooleanField(term22500, term22500.getClass(), "formList", false);
        setBooleanField(term22500, term22500.getClass(), "formSubmit", true);
        term22702 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term22702, term22702.getClass(), "tagName", "");
        setBooleanField(term22702, term22702.getClass(), "isBlock", false);
        setBooleanField(term22702, term22702.getClass(), "formatAsBlock", false);
        setBooleanField(term22702, term22702.getClass(), "canContainInline", false);
        setBooleanField(term22702, term22702.getClass(), "empty", true);
        setBooleanField(term22702, term22702.getClass(), "selfClosing", true);
        setBooleanField(term22702, term22702.getClass(), "preserveWhitespace", false);
        setBooleanField(term22702, term22702.getClass(), "formList", false);
        setBooleanField(term22702, term22702.getClass(), "formSubmit", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term22500, args);
        assertTrue(recursiveEquals(term22500, term22702));
        assertTrue(recursiveEquals(retValue, 953313));
    }

};


