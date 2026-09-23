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

public class Tag_isFormSubmittable_105576051636 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term433;
     Object term1555;

    public Tag_isFormSubmittable_105576051636() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term433 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term433, term433.getClass(), "tagName", "aJlieCFVtF");
        setBooleanField(term433, term433.getClass(), "isBlock", true);
        setBooleanField(term433, term433.getClass(), "formatAsBlock", true);
        setBooleanField(term433, term433.getClass(), "canContainInline", true);
        setBooleanField(term433, term433.getClass(), "empty", true);
        setBooleanField(term433, term433.getClass(), "selfClosing", false);
        setBooleanField(term433, term433.getClass(), "preserveWhitespace", false);
        setBooleanField(term433, term433.getClass(), "formList", true);
        setBooleanField(term433, term433.getClass(), "formSubmit", true);
        term1555 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term1555, term1555.getClass(), "tagName", "aJlieCFVtF");
        setBooleanField(term1555, term1555.getClass(), "isBlock", true);
        setBooleanField(term1555, term1555.getClass(), "formatAsBlock", true);
        setBooleanField(term1555, term1555.getClass(), "canContainInline", true);
        setBooleanField(term1555, term1555.getClass(), "empty", true);
        setBooleanField(term1555, term1555.getClass(), "selfClosing", false);
        setBooleanField(term1555, term1555.getClass(), "preserveWhitespace", false);
        setBooleanField(term1555, term1555.getClass(), "formList", true);
        setBooleanField(term1555, term1555.getClass(), "formSubmit", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isFormSubmittable", argTypes, term433, args);
        assertTrue(recursiveEquals(term433, term1555));
    }

};


