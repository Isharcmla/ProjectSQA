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

public class Tag_hashCode_901271351569 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term48920;
     Object term49227;

    public Tag_hashCode_901271351569() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term48920 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term48920, term48920.getClass(), "tagName", "");
        setBooleanField(term48920, term48920.getClass(), "isBlock", false);
        setBooleanField(term48920, term48920.getClass(), "formatAsBlock", true);
        setBooleanField(term48920, term48920.getClass(), "canContainInline", true);
        setBooleanField(term48920, term48920.getClass(), "empty", true);
        setBooleanField(term48920, term48920.getClass(), "selfClosing", false);
        setBooleanField(term48920, term48920.getClass(), "preserveWhitespace", true);
        setBooleanField(term48920, term48920.getClass(), "formList", true);
        term49227 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term49227, term49227.getClass(), "tagName", "");
        setBooleanField(term49227, term49227.getClass(), "isBlock", false);
        setBooleanField(term49227, term49227.getClass(), "formatAsBlock", true);
        setBooleanField(term49227, term49227.getClass(), "canContainInline", true);
        setBooleanField(term49227, term49227.getClass(), "empty", true);
        setBooleanField(term49227, term49227.getClass(), "selfClosing", false);
        setBooleanField(term49227, term49227.getClass(), "preserveWhitespace", true);
        setBooleanField(term49227, term49227.getClass(), "formList", true);
        setBooleanField(term49227, term49227.getClass(), "formSubmit", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term48920, args);
        assertTrue(recursiveEquals(term48920, term49227));
        assertTrue(recursiveEquals(retValue, 917057345));
    }

};


