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

public class Tag_hashCode_901271351477 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term41373;
     Object term41455;

    public Tag_hashCode_901271351477() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term41373 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term41373, term41373.getClass(), "tagName", "");
        setBooleanField(term41373, term41373.getClass(), "isBlock", true);
        setBooleanField(term41373, term41373.getClass(), "formatAsBlock", true);
        setBooleanField(term41373, term41373.getClass(), "canContainInline", false);
        setBooleanField(term41373, term41373.getClass(), "empty", false);
        setBooleanField(term41373, term41373.getClass(), "selfClosing", true);
        setBooleanField(term41373, term41373.getClass(), "preserveWhitespace", true);
        setBooleanField(term41373, term41373.getClass(), "formList", true);
        setBooleanField(term41373, term41373.getClass(), "formSubmit", true);
        term41455 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term41455, term41455.getClass(), "tagName", "");
        setBooleanField(term41455, term41455.getClass(), "isBlock", true);
        setBooleanField(term41455, term41455.getClass(), "formatAsBlock", true);
        setBooleanField(term41455, term41455.getClass(), "canContainInline", false);
        setBooleanField(term41455, term41455.getClass(), "empty", false);
        setBooleanField(term41455, term41455.getClass(), "selfClosing", true);
        setBooleanField(term41455, term41455.getClass(), "preserveWhitespace", true);
        setBooleanField(term41455, term41455.getClass(), "formList", true);
        setBooleanField(term41455, term41455.getClass(), "formSubmit", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term41373, args);
        assertTrue(recursiveEquals(term41373, term41455));
        assertTrue(recursiveEquals(retValue, -1664622496));
    }

};


