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

public class Tag_hashCode_901271351230 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20317;
     Object term20555;

    public Tag_hashCode_901271351230() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20317 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term20317, term20317.getClass(), "tagName", "");
        setBooleanField(term20317, term20317.getClass(), "isBlock", false);
        setBooleanField(term20317, term20317.getClass(), "formatAsBlock", true);
        setBooleanField(term20317, term20317.getClass(), "canContainInline", false);
        setBooleanField(term20317, term20317.getClass(), "empty", false);
        setBooleanField(term20317, term20317.getClass(), "selfClosing", true);
        setBooleanField(term20317, term20317.getClass(), "preserveWhitespace", false);
        setBooleanField(term20317, term20317.getClass(), "formList", false);
        setBooleanField(term20317, term20317.getClass(), "formSubmit", true);
        term20555 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term20555, term20555.getClass(), "tagName", "");
        setBooleanField(term20555, term20555.getClass(), "isBlock", false);
        setBooleanField(term20555, term20555.getClass(), "formatAsBlock", true);
        setBooleanField(term20555, term20555.getClass(), "canContainInline", false);
        setBooleanField(term20555, term20555.getClass(), "empty", false);
        setBooleanField(term20555, term20555.getClass(), "selfClosing", true);
        setBooleanField(term20555, term20555.getClass(), "preserveWhitespace", false);
        setBooleanField(term20555, term20555.getClass(), "formList", false);
        setBooleanField(term20555, term20555.getClass(), "formSubmit", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term20317, args);
        assertTrue(recursiveEquals(term20317, term20555));
        assertTrue(recursiveEquals(retValue, 887533473));
    }

};


