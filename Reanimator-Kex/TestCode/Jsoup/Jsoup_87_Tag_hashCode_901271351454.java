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

public class Tag_hashCode_901271351454 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39319;
     Object term39530;

    public Tag_hashCode_901271351454() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term39319 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term39319, term39319.getClass(), "tagName", "");
        setBooleanField(term39319, term39319.getClass(), "isBlock", true);
        setBooleanField(term39319, term39319.getClass(), "formatAsBlock", true);
        setBooleanField(term39319, term39319.getClass(), "canContainInline", false);
        setBooleanField(term39319, term39319.getClass(), "empty", true);
        setBooleanField(term39319, term39319.getClass(), "selfClosing", true);
        setBooleanField(term39319, term39319.getClass(), "preserveWhitespace", true);
        term39530 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term39530, term39530.getClass(), "tagName", "");
        setBooleanField(term39530, term39530.getClass(), "isBlock", true);
        setBooleanField(term39530, term39530.getClass(), "formatAsBlock", true);
        setBooleanField(term39530, term39530.getClass(), "canContainInline", false);
        setBooleanField(term39530, term39530.getClass(), "empty", true);
        setBooleanField(term39530, term39530.getClass(), "selfClosing", true);
        setBooleanField(term39530, term39530.getClass(), "preserveWhitespace", true);
        setBooleanField(term39530, term39530.getClass(), "formList", false);
        setBooleanField(term39530, term39530.getClass(), "formSubmit", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term39319, args);
        assertTrue(recursiveEquals(term39319, term39530));
        assertTrue(recursiveEquals(retValue, -1663699007));
    }

};


