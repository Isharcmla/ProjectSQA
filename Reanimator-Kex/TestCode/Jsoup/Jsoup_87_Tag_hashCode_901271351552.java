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

public class Tag_hashCode_901271351552 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47540;
     Object term47750;

    public Tag_hashCode_901271351552() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term47540 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term47540, term47540.getClass(), "tagName", "");
        setBooleanField(term47540, term47540.getClass(), "isBlock", true);
        setBooleanField(term47540, term47540.getClass(), "formatAsBlock", false);
        setBooleanField(term47540, term47540.getClass(), "canContainInline", false);
        setBooleanField(term47540, term47540.getClass(), "empty", true);
        setBooleanField(term47540, term47540.getClass(), "selfClosing", false);
        setBooleanField(term47540, term47540.getClass(), "preserveWhitespace", true);
        setBooleanField(term47540, term47540.getClass(), "formList", false);
        setBooleanField(term47540, term47540.getClass(), "formSubmit", true);
        term47750 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term47750, term47750.getClass(), "tagName", "");
        setBooleanField(term47750, term47750.getClass(), "isBlock", true);
        setBooleanField(term47750, term47750.getClass(), "formatAsBlock", false);
        setBooleanField(term47750, term47750.getClass(), "canContainInline", false);
        setBooleanField(term47750, term47750.getClass(), "empty", true);
        setBooleanField(term47750, term47750.getClass(), "selfClosing", false);
        setBooleanField(term47750, term47750.getClass(), "preserveWhitespace", true);
        setBooleanField(term47750, term47750.getClass(), "formList", false);
        setBooleanField(term47750, term47750.getClass(), "formSubmit", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term47540, args);
        assertTrue(recursiveEquals(term47540, term47750));
        assertTrue(recursiveEquals(retValue, 1743734818));
    }

};


