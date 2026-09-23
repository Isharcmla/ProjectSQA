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

public class Tag_hashCode_901271351280 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24471;
     Object term24704;

    public Tag_hashCode_901271351280() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term24471 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term24471, term24471.getClass(), "tagName", "");
        setBooleanField(term24471, term24471.getClass(), "isBlock", true);
        setBooleanField(term24471, term24471.getClass(), "formatAsBlock", false);
        setBooleanField(term24471, term24471.getClass(), "canContainInline", true);
        setBooleanField(term24471, term24471.getClass(), "empty", true);
        setBooleanField(term24471, term24471.getClass(), "selfClosing", false);
        setBooleanField(term24471, term24471.getClass(), "preserveWhitespace", true);
        term24704 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term24704, term24704.getClass(), "tagName", "");
        setBooleanField(term24704, term24704.getClass(), "isBlock", true);
        setBooleanField(term24704, term24704.getClass(), "formatAsBlock", false);
        setBooleanField(term24704, term24704.getClass(), "canContainInline", true);
        setBooleanField(term24704, term24704.getClass(), "empty", true);
        setBooleanField(term24704, term24704.getClass(), "selfClosing", false);
        setBooleanField(term24704, term24704.getClass(), "preserveWhitespace", true);
        setBooleanField(term24704, term24704.getClass(), "formList", false);
        setBooleanField(term24704, term24704.getClass(), "formSubmit", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term24471, args);
        assertTrue(recursiveEquals(term24471, term24704));
        assertTrue(recursiveEquals(retValue, 1772363968));
    }

};


