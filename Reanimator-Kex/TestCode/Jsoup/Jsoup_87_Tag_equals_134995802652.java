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

public class Tag_equals_134995802652 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2599;
     Object term2714;
     Object term2715;

    public Tag_equals_134995802652() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2599 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        term2714 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term2714, term2714.getClass(), "tagName", null);
        setBooleanField(term2714, term2714.getClass(), "isBlock", false);
        setBooleanField(term2714, term2714.getClass(), "formatAsBlock", false);
        setBooleanField(term2714, term2714.getClass(), "canContainInline", false);
        setBooleanField(term2714, term2714.getClass(), "empty", false);
        setBooleanField(term2714, term2714.getClass(), "selfClosing", false);
        setBooleanField(term2714, term2714.getClass(), "preserveWhitespace", false);
        setBooleanField(term2714, term2714.getClass(), "formList", false);
        setBooleanField(term2714, term2714.getClass(), "formSubmit", false);
        term2715 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term2715, term2715.getClass(), "tagName", null);
        setBooleanField(term2715, term2715.getClass(), "isBlock", false);
        setBooleanField(term2715, term2715.getClass(), "formatAsBlock", false);
        setBooleanField(term2715, term2715.getClass(), "canContainInline", false);
        setBooleanField(term2715, term2715.getClass(), "empty", false);
        setBooleanField(term2715, term2715.getClass(), "selfClosing", false);
        setBooleanField(term2715, term2715.getClass(), "preserveWhitespace", false);
        setBooleanField(term2715, term2715.getClass(), "formList", false);
        setBooleanField(term2715, term2715.getClass(), "formSubmit", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term2599;
        Object retValue = callMethod(klass, "equals", argTypes, term2599, args);
        assertTrue(recursiveEquals(term2599, term2714));
        assertTrue(recursiveEquals(term2599, term2715));
        assertTrue(recursiveEquals(retValue, true));
    }

};


