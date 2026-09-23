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

public class Tag_isData_3380753645 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2319;
     Object term2354;

    public Tag_isData_3380753645() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2319 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setBooleanField(term2319, term2319.getClass(), "canContainInline", false);
        setBooleanField(term2319, term2319.getClass(), "empty", false);
        term2354 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term2354, term2354.getClass(), "tagName", null);
        setBooleanField(term2354, term2354.getClass(), "isBlock", false);
        setBooleanField(term2354, term2354.getClass(), "formatAsBlock", false);
        setBooleanField(term2354, term2354.getClass(), "canContainInline", false);
        setBooleanField(term2354, term2354.getClass(), "empty", false);
        setBooleanField(term2354, term2354.getClass(), "selfClosing", false);
        setBooleanField(term2354, term2354.getClass(), "preserveWhitespace", false);
        setBooleanField(term2354, term2354.getClass(), "formList", false);
        setBooleanField(term2354, term2354.getClass(), "formSubmit", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "isData", argTypes, term2319, args);
        assertTrue(recursiveEquals(term2319, term2354));
        assertTrue(recursiveEquals(retValue, true));
    }

};


