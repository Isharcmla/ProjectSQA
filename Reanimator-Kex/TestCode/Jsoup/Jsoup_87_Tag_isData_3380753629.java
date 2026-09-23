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

public class Tag_isData_3380753629 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term225;
     Object term1246;

    public Tag_isData_3380753629() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term225 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term225, term225.getClass(), "tagName", "hRNSzYYIrc");
        setBooleanField(term225, term225.getClass(), "isBlock", true);
        setBooleanField(term225, term225.getClass(), "formatAsBlock", true);
        setBooleanField(term225, term225.getClass(), "canContainInline", false);
        setBooleanField(term225, term225.getClass(), "empty", true);
        setBooleanField(term225, term225.getClass(), "selfClosing", true);
        setBooleanField(term225, term225.getClass(), "preserveWhitespace", true);
        setBooleanField(term225, term225.getClass(), "formList", false);
        setBooleanField(term225, term225.getClass(), "formSubmit", true);
        term1246 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term1246, term1246.getClass(), "tagName", "hRNSzYYIrc");
        setBooleanField(term1246, term1246.getClass(), "isBlock", true);
        setBooleanField(term1246, term1246.getClass(), "formatAsBlock", true);
        setBooleanField(term1246, term1246.getClass(), "canContainInline", false);
        setBooleanField(term1246, term1246.getClass(), "empty", true);
        setBooleanField(term1246, term1246.getClass(), "selfClosing", true);
        setBooleanField(term1246, term1246.getClass(), "preserveWhitespace", true);
        setBooleanField(term1246, term1246.getClass(), "formList", false);
        setBooleanField(term1246, term1246.getClass(), "formSubmit", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "isData", argTypes, term225, args);
        assertTrue(recursiveEquals(term225, term1246));
        assertTrue(recursiveEquals(retValue, false));
    }

};


