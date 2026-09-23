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

public class Tag_hashCode_901271351342 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29605;
     Object term29814;

    public Tag_hashCode_901271351342() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29605 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term29605, term29605.getClass(), "tagName", "");
        setBooleanField(term29605, term29605.getClass(), "isBlock", true);
        setBooleanField(term29605, term29605.getClass(), "formatAsBlock", true);
        setBooleanField(term29605, term29605.getClass(), "canContainInline", false);
        setBooleanField(term29605, term29605.getClass(), "empty", false);
        setBooleanField(term29605, term29605.getClass(), "selfClosing", true);
        setBooleanField(term29605, term29605.getClass(), "preserveWhitespace", false);
        setBooleanField(term29605, term29605.getClass(), "formList", true);
        setBooleanField(term29605, term29605.getClass(), "formSubmit", true);
        term29814 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term29814, term29814.getClass(), "tagName", "");
        setBooleanField(term29814, term29814.getClass(), "isBlock", true);
        setBooleanField(term29814, term29814.getClass(), "formatAsBlock", true);
        setBooleanField(term29814, term29814.getClass(), "canContainInline", false);
        setBooleanField(term29814, term29814.getClass(), "empty", false);
        setBooleanField(term29814, term29814.getClass(), "selfClosing", true);
        setBooleanField(term29814, term29814.getClass(), "preserveWhitespace", false);
        setBooleanField(term29814, term29814.getClass(), "formList", true);
        setBooleanField(term29814, term29814.getClass(), "formSubmit", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term29605, args);
        assertTrue(recursiveEquals(term29605, term29814));
        assertTrue(recursiveEquals(retValue, -1664623457));
    }

};


