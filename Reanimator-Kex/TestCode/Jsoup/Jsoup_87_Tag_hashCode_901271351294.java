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

public class Tag_hashCode_901271351294 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25629;
     Object term25854;

    public Tag_hashCode_901271351294() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25629 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term25629, term25629.getClass(), "tagName", "");
        setBooleanField(term25629, term25629.getClass(), "isBlock", true);
        setBooleanField(term25629, term25629.getClass(), "formatAsBlock", true);
        setBooleanField(term25629, term25629.getClass(), "canContainInline", true);
        setBooleanField(term25629, term25629.getClass(), "empty", true);
        term25854 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term25854, term25854.getClass(), "tagName", "");
        setBooleanField(term25854, term25854.getClass(), "isBlock", true);
        setBooleanField(term25854, term25854.getClass(), "formatAsBlock", true);
        setBooleanField(term25854, term25854.getClass(), "canContainInline", true);
        setBooleanField(term25854, term25854.getClass(), "empty", true);
        setBooleanField(term25854, term25854.getClass(), "selfClosing", false);
        setBooleanField(term25854, term25854.getClass(), "preserveWhitespace", false);
        setBooleanField(term25854, term25854.getClass(), "formList", false);
        setBooleanField(term25854, term25854.getClass(), "formSubmit", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term25629, args);
        assertTrue(recursiveEquals(term25629, term25854));
        assertTrue(recursiveEquals(retValue, -1635100608));
    }

};


