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

public class Tag_isInline_25036527928 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term194;
     Object term1197;

    public Tag_isInline_25036527928() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term194 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term194, term194.getClass(), "tagName", "MjGYSRKTNF");
        setBooleanField(term194, term194.getClass(), "isBlock", false);
        setBooleanField(term194, term194.getClass(), "formatAsBlock", true);
        setBooleanField(term194, term194.getClass(), "canContainInline", true);
        setBooleanField(term194, term194.getClass(), "empty", true);
        setBooleanField(term194, term194.getClass(), "selfClosing", true);
        setBooleanField(term194, term194.getClass(), "preserveWhitespace", false);
        setBooleanField(term194, term194.getClass(), "formList", false);
        setBooleanField(term194, term194.getClass(), "formSubmit", false);
        term1197 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term1197, term1197.getClass(), "tagName", "MjGYSRKTNF");
        setBooleanField(term1197, term1197.getClass(), "isBlock", false);
        setBooleanField(term1197, term1197.getClass(), "formatAsBlock", true);
        setBooleanField(term1197, term1197.getClass(), "canContainInline", true);
        setBooleanField(term1197, term1197.getClass(), "empty", true);
        setBooleanField(term1197, term1197.getClass(), "selfClosing", true);
        setBooleanField(term1197, term1197.getClass(), "preserveWhitespace", false);
        setBooleanField(term1197, term1197.getClass(), "formList", false);
        setBooleanField(term1197, term1197.getClass(), "formSubmit", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "isInline", argTypes, term194, args);
        assertTrue(recursiveEquals(term194, term1197));
        assertTrue(recursiveEquals(retValue, true));
    }

};


