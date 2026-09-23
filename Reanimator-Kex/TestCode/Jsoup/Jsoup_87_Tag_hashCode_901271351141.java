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

public class Tag_hashCode_901271351141 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12897;
     Object term12956;

    public Tag_hashCode_901271351141() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12897 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term12897, term12897.getClass(), "tagName", "");
        setBooleanField(term12897, term12897.getClass(), "isBlock", true);
        setBooleanField(term12897, term12897.getClass(), "formatAsBlock", true);
        setBooleanField(term12897, term12897.getClass(), "canContainInline", false);
        setBooleanField(term12897, term12897.getClass(), "empty", false);
        setBooleanField(term12897, term12897.getClass(), "selfClosing", false);
        setBooleanField(term12897, term12897.getClass(), "preserveWhitespace", false);
        setBooleanField(term12897, term12897.getClass(), "formList", true);
        term12956 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term12956, term12956.getClass(), "tagName", "");
        setBooleanField(term12956, term12956.getClass(), "isBlock", true);
        setBooleanField(term12956, term12956.getClass(), "formatAsBlock", true);
        setBooleanField(term12956, term12956.getClass(), "canContainInline", false);
        setBooleanField(term12956, term12956.getClass(), "empty", false);
        setBooleanField(term12956, term12956.getClass(), "selfClosing", false);
        setBooleanField(term12956, term12956.getClass(), "preserveWhitespace", false);
        setBooleanField(term12956, term12956.getClass(), "formList", true);
        setBooleanField(term12956, term12956.getClass(), "formSubmit", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term12897, args);
        assertTrue(recursiveEquals(term12897, term12956));
        assertTrue(recursiveEquals(retValue, -1664653249));
    }

};


