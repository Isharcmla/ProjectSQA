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

public class Tag_hashCode_901271351363 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31454;
     Object term31559;

    public Tag_hashCode_901271351363() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term31454 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term31454, term31454.getClass(), "tagName", "");
        setBooleanField(term31454, term31454.getClass(), "isBlock", true);
        setBooleanField(term31454, term31454.getClass(), "formatAsBlock", false);
        setBooleanField(term31454, term31454.getClass(), "canContainInline", false);
        setBooleanField(term31454, term31454.getClass(), "empty", false);
        setBooleanField(term31454, term31454.getClass(), "selfClosing", true);
        setBooleanField(term31454, term31454.getClass(), "preserveWhitespace", false);
        setBooleanField(term31454, term31454.getClass(), "formList", true);
        setBooleanField(term31454, term31454.getClass(), "formSubmit", true);
        term31559 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term31559, term31559.getClass(), "tagName", "");
        setBooleanField(term31559, term31559.getClass(), "isBlock", true);
        setBooleanField(term31559, term31559.getClass(), "formatAsBlock", false);
        setBooleanField(term31559, term31559.getClass(), "canContainInline", false);
        setBooleanField(term31559, term31559.getClass(), "empty", false);
        setBooleanField(term31559, term31559.getClass(), "selfClosing", true);
        setBooleanField(term31559, term31559.getClass(), "preserveWhitespace", false);
        setBooleanField(term31559, term31559.getClass(), "formList", true);
        setBooleanField(term31559, term31559.getClass(), "formSubmit", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term31454, args);
        assertTrue(recursiveEquals(term31454, term31559));
        assertTrue(recursiveEquals(retValue, 1742840158));
    }

};


