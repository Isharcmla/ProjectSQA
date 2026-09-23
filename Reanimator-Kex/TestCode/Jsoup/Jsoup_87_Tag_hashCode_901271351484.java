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

public class Tag_hashCode_901271351484 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term41849;
     Object term42053;

    public Tag_hashCode_901271351484() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term41849 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term41849, term41849.getClass(), "tagName", "");
        setBooleanField(term41849, term41849.getClass(), "isBlock", true);
        setBooleanField(term41849, term41849.getClass(), "formatAsBlock", false);
        setBooleanField(term41849, term41849.getClass(), "canContainInline", false);
        setBooleanField(term41849, term41849.getClass(), "empty", true);
        setBooleanField(term41849, term41849.getClass(), "selfClosing", true);
        setBooleanField(term41849, term41849.getClass(), "preserveWhitespace", true);
        setBooleanField(term41849, term41849.getClass(), "formList", true);
        term42053 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term42053, term42053.getClass(), "tagName", "");
        setBooleanField(term42053, term42053.getClass(), "isBlock", true);
        setBooleanField(term42053, term42053.getClass(), "formatAsBlock", false);
        setBooleanField(term42053, term42053.getClass(), "canContainInline", false);
        setBooleanField(term42053, term42053.getClass(), "empty", true);
        setBooleanField(term42053, term42053.getClass(), "selfClosing", true);
        setBooleanField(term42053, term42053.getClass(), "preserveWhitespace", true);
        setBooleanField(term42053, term42053.getClass(), "formList", true);
        setBooleanField(term42053, term42053.getClass(), "formSubmit", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term41849, args);
        assertTrue(recursiveEquals(term41849, term42053));
        assertTrue(recursiveEquals(retValue, 1743764639));
    }

};


