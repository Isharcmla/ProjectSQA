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

public class Tag_hashCode_901271351299 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26142;
     Object term26201;

    public Tag_hashCode_901271351299() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26142 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term26142, term26142.getClass(), "tagName", "");
        setBooleanField(term26142, term26142.getClass(), "isBlock", true);
        setBooleanField(term26142, term26142.getClass(), "formatAsBlock", false);
        setBooleanField(term26142, term26142.getClass(), "canContainInline", false);
        setBooleanField(term26142, term26142.getClass(), "empty", true);
        setBooleanField(term26142, term26142.getClass(), "selfClosing", true);
        term26201 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term26201, term26201.getClass(), "tagName", "");
        setBooleanField(term26201, term26201.getClass(), "isBlock", true);
        setBooleanField(term26201, term26201.getClass(), "formatAsBlock", false);
        setBooleanField(term26201, term26201.getClass(), "canContainInline", false);
        setBooleanField(term26201, term26201.getClass(), "empty", true);
        setBooleanField(term26201, term26201.getClass(), "selfClosing", true);
        setBooleanField(term26201, term26201.getClass(), "preserveWhitespace", false);
        setBooleanField(term26201, term26201.getClass(), "formList", false);
        setBooleanField(term26201, term26201.getClass(), "formSubmit", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term26142, args);
        assertTrue(recursiveEquals(term26142, term26201));
        assertTrue(recursiveEquals(retValue, 1743763647));
    }

};


