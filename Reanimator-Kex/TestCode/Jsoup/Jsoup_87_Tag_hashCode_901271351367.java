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

public class Tag_hashCode_901271351367 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31665;
     Object term31998;

    public Tag_hashCode_901271351367() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term31665 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term31665, term31665.getClass(), "tagName", "");
        setBooleanField(term31665, term31665.getClass(), "isBlock", false);
        setBooleanField(term31665, term31665.getClass(), "formatAsBlock", false);
        setBooleanField(term31665, term31665.getClass(), "canContainInline", true);
        setBooleanField(term31665, term31665.getClass(), "empty", false);
        setBooleanField(term31665, term31665.getClass(), "selfClosing", true);
        setBooleanField(term31665, term31665.getClass(), "preserveWhitespace", true);
        setBooleanField(term31665, term31665.getClass(), "formList", true);
        term31998 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term31998, term31998.getClass(), "tagName", "");
        setBooleanField(term31998, term31998.getClass(), "isBlock", false);
        setBooleanField(term31998, term31998.getClass(), "formatAsBlock", false);
        setBooleanField(term31998, term31998.getClass(), "canContainInline", true);
        setBooleanField(term31998, term31998.getClass(), "empty", false);
        setBooleanField(term31998, term31998.getClass(), "selfClosing", true);
        setBooleanField(term31998, term31998.getClass(), "preserveWhitespace", true);
        setBooleanField(term31998, term31998.getClass(), "formList", true);
        setBooleanField(term31998, term31998.getClass(), "formSubmit", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term31665, args);
        assertTrue(recursiveEquals(term31665, term31998));
        assertTrue(recursiveEquals(retValue, 28659934));
    }

};


