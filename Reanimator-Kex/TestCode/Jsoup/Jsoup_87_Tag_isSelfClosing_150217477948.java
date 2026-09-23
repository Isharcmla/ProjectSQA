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

public class Tag_isSelfClosing_150217477948 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2420;
     Object term2487;

    public Tag_isSelfClosing_150217477948() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2420 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setBooleanField(term2420, term2420.getClass(), "empty", false);
        setBooleanField(term2420, term2420.getClass(), "selfClosing", false);
        term2487 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term2487, term2487.getClass(), "tagName", null);
        setBooleanField(term2487, term2487.getClass(), "isBlock", false);
        setBooleanField(term2487, term2487.getClass(), "formatAsBlock", false);
        setBooleanField(term2487, term2487.getClass(), "canContainInline", false);
        setBooleanField(term2487, term2487.getClass(), "empty", false);
        setBooleanField(term2487, term2487.getClass(), "selfClosing", false);
        setBooleanField(term2487, term2487.getClass(), "preserveWhitespace", false);
        setBooleanField(term2487, term2487.getClass(), "formList", false);
        setBooleanField(term2487, term2487.getClass(), "formSubmit", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "isSelfClosing", argTypes, term2420, args);
        assertTrue(recursiveEquals(term2420, term2487));
        assertTrue(recursiveEquals(retValue, false));
    }

};


