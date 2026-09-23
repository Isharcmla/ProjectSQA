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

public class Tag_isSelfClosing_150217477931 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term287;
     Object term1339;

    public Tag_isSelfClosing_150217477931() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term287 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term287, term287.getClass(), "tagName", "NRdvgJlhkX");
        setBooleanField(term287, term287.getClass(), "isBlock", false);
        setBooleanField(term287, term287.getClass(), "formatAsBlock", false);
        setBooleanField(term287, term287.getClass(), "canContainInline", false);
        setBooleanField(term287, term287.getClass(), "empty", false);
        setBooleanField(term287, term287.getClass(), "selfClosing", true);
        setBooleanField(term287, term287.getClass(), "preserveWhitespace", true);
        setBooleanField(term287, term287.getClass(), "formList", false);
        setBooleanField(term287, term287.getClass(), "formSubmit", false);
        term1339 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term1339, term1339.getClass(), "tagName", "NRdvgJlhkX");
        setBooleanField(term1339, term1339.getClass(), "isBlock", false);
        setBooleanField(term1339, term1339.getClass(), "formatAsBlock", false);
        setBooleanField(term1339, term1339.getClass(), "canContainInline", false);
        setBooleanField(term1339, term1339.getClass(), "empty", false);
        setBooleanField(term1339, term1339.getClass(), "selfClosing", true);
        setBooleanField(term1339, term1339.getClass(), "preserveWhitespace", true);
        setBooleanField(term1339, term1339.getClass(), "formList", false);
        setBooleanField(term1339, term1339.getClass(), "formSubmit", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "isSelfClosing", argTypes, term287, args);
        assertTrue(recursiveEquals(term287, term1339));
        assertTrue(recursiveEquals(retValue, true));
    }

};


