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

public class Tag_hashCode_901271351433 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37563;
     Object term37652;

    public Tag_hashCode_901271351433() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term37563 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term37563, term37563.getClass(), "tagName", "");
        setBooleanField(term37563, term37563.getClass(), "isBlock", true);
        setBooleanField(term37563, term37563.getClass(), "formatAsBlock", false);
        setBooleanField(term37563, term37563.getClass(), "canContainInline", true);
        setBooleanField(term37563, term37563.getClass(), "empty", true);
        setBooleanField(term37563, term37563.getClass(), "selfClosing", true);
        setBooleanField(term37563, term37563.getClass(), "preserveWhitespace", true);
        term37652 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term37652, term37652.getClass(), "tagName", "");
        setBooleanField(term37652, term37652.getClass(), "isBlock", true);
        setBooleanField(term37652, term37652.getClass(), "formatAsBlock", false);
        setBooleanField(term37652, term37652.getClass(), "canContainInline", true);
        setBooleanField(term37652, term37652.getClass(), "empty", true);
        setBooleanField(term37652, term37652.getClass(), "selfClosing", true);
        setBooleanField(term37652, term37652.getClass(), "preserveWhitespace", true);
        setBooleanField(term37652, term37652.getClass(), "formList", false);
        setBooleanField(term37652, term37652.getClass(), "formSubmit", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term37563, args);
        assertTrue(recursiveEquals(term37563, term37652));
        assertTrue(recursiveEquals(retValue, 1772393759));
    }

};


