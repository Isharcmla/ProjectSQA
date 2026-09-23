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

public class Tag_hashCode_901271351386 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33308;
     Object term33542;

    public Tag_hashCode_901271351386() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term33308 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term33308, term33308.getClass(), "tagName", "");
        setBooleanField(term33308, term33308.getClass(), "isBlock", false);
        setBooleanField(term33308, term33308.getClass(), "formatAsBlock", true);
        setBooleanField(term33308, term33308.getClass(), "canContainInline", true);
        setBooleanField(term33308, term33308.getClass(), "empty", false);
        setBooleanField(term33308, term33308.getClass(), "selfClosing", true);
        setBooleanField(term33308, term33308.getClass(), "preserveWhitespace", true);
        term33542 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term33542, term33542.getClass(), "tagName", "");
        setBooleanField(term33542, term33542.getClass(), "isBlock", false);
        setBooleanField(term33542, term33542.getClass(), "formatAsBlock", true);
        setBooleanField(term33542, term33542.getClass(), "canContainInline", true);
        setBooleanField(term33542, term33542.getClass(), "empty", false);
        setBooleanField(term33542, term33542.getClass(), "selfClosing", true);
        setBooleanField(term33542, term33542.getClass(), "preserveWhitespace", true);
        setBooleanField(term33542, term33542.getClass(), "formList", false);
        setBooleanField(term33542, term33542.getClass(), "formSubmit", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term33308, args);
        assertTrue(recursiveEquals(term33308, term33542));
        assertTrue(recursiveEquals(retValue, 916163584));
    }

};


