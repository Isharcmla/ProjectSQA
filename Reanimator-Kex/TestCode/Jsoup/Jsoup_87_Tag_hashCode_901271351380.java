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

public class Tag_hashCode_901271351380 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32818;
     Object term33039;

    public Tag_hashCode_901271351380() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term32818 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term32818, term32818.getClass(), "tagName", "");
        setBooleanField(term32818, term32818.getClass(), "isBlock", true);
        setBooleanField(term32818, term32818.getClass(), "formatAsBlock", false);
        setBooleanField(term32818, term32818.getClass(), "canContainInline", false);
        setBooleanField(term32818, term32818.getClass(), "empty", false);
        setBooleanField(term32818, term32818.getClass(), "selfClosing", false);
        setBooleanField(term32818, term32818.getClass(), "preserveWhitespace", true);
        setBooleanField(term32818, term32818.getClass(), "formList", true);
        setBooleanField(term32818, term32818.getClass(), "formSubmit", true);
        term33039 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term33039, term33039.getClass(), "tagName", "");
        setBooleanField(term33039, term33039.getClass(), "isBlock", true);
        setBooleanField(term33039, term33039.getClass(), "formatAsBlock", false);
        setBooleanField(term33039, term33039.getClass(), "canContainInline", false);
        setBooleanField(term33039, term33039.getClass(), "empty", false);
        setBooleanField(term33039, term33039.getClass(), "selfClosing", false);
        setBooleanField(term33039, term33039.getClass(), "preserveWhitespace", true);
        setBooleanField(term33039, term33039.getClass(), "formList", true);
        setBooleanField(term33039, term33039.getClass(), "formSubmit", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term32818, args);
        assertTrue(recursiveEquals(term32818, term33039));
        assertTrue(recursiveEquals(retValue, 1742811328));
    }

};


