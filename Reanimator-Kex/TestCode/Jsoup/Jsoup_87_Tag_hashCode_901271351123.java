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

public class Tag_hashCode_901271351123 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11505;
     Object term11564;

    public Tag_hashCode_901271351123() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11505 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term11505, term11505.getClass(), "tagName", "");
        setBooleanField(term11505, term11505.getClass(), "isBlock", true);
        setBooleanField(term11505, term11505.getClass(), "formatAsBlock", false);
        setBooleanField(term11505, term11505.getClass(), "canContainInline", false);
        setBooleanField(term11505, term11505.getClass(), "empty", true);
        term11564 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term11564, term11564.getClass(), "tagName", "");
        setBooleanField(term11564, term11564.getClass(), "isBlock", true);
        setBooleanField(term11564, term11564.getClass(), "formatAsBlock", false);
        setBooleanField(term11564, term11564.getClass(), "canContainInline", false);
        setBooleanField(term11564, term11564.getClass(), "empty", true);
        setBooleanField(term11564, term11564.getClass(), "selfClosing", false);
        setBooleanField(term11564, term11564.getClass(), "preserveWhitespace", false);
        setBooleanField(term11564, term11564.getClass(), "formList", false);
        setBooleanField(term11564, term11564.getClass(), "formSubmit", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term11505, args);
        assertTrue(recursiveEquals(term11505, term11564));
        assertTrue(recursiveEquals(retValue, 1743733856));
    }

};


