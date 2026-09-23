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

public class Tag_hashCode_901271351119 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11189;
     Object term11248;

    public Tag_hashCode_901271351119() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11189 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term11189, term11189.getClass(), "tagName", "");
        setBooleanField(term11189, term11189.getClass(), "isBlock", false);
        setBooleanField(term11189, term11189.getClass(), "formatAsBlock", false);
        setBooleanField(term11189, term11189.getClass(), "canContainInline", false);
        setBooleanField(term11189, term11189.getClass(), "empty", false);
        setBooleanField(term11189, term11189.getClass(), "selfClosing", false);
        setBooleanField(term11189, term11189.getClass(), "preserveWhitespace", false);
        setBooleanField(term11189, term11189.getClass(), "formList", false);
        setBooleanField(term11189, term11189.getClass(), "formSubmit", true);
        term11248 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term11248, term11248.getClass(), "tagName", "");
        setBooleanField(term11248, term11248.getClass(), "isBlock", false);
        setBooleanField(term11248, term11248.getClass(), "formatAsBlock", false);
        setBooleanField(term11248, term11248.getClass(), "canContainInline", false);
        setBooleanField(term11248, term11248.getClass(), "empty", false);
        setBooleanField(term11248, term11248.getClass(), "selfClosing", false);
        setBooleanField(term11248, term11248.getClass(), "preserveWhitespace", false);
        setBooleanField(term11248, term11248.getClass(), "formList", false);
        setBooleanField(term11248, term11248.getClass(), "formSubmit", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term11189, args);
        assertTrue(recursiveEquals(term11189, term11248));
        assertTrue(recursiveEquals(retValue, 1));
    }

};


