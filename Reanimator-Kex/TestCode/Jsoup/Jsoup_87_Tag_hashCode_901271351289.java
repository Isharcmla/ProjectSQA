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

public class Tag_hashCode_901271351289 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25332;
     Object term25391;

    public Tag_hashCode_901271351289() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25332 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term25332, term25332.getClass(), "tagName", "");
        setBooleanField(term25332, term25332.getClass(), "isBlock", false);
        setBooleanField(term25332, term25332.getClass(), "formatAsBlock", true);
        setBooleanField(term25332, term25332.getClass(), "canContainInline", false);
        setBooleanField(term25332, term25332.getClass(), "empty", true);
        setBooleanField(term25332, term25332.getClass(), "selfClosing", true);
        setBooleanField(term25332, term25332.getClass(), "preserveWhitespace", false);
        setBooleanField(term25332, term25332.getClass(), "formList", false);
        setBooleanField(term25332, term25332.getClass(), "formSubmit", true);
        term25391 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term25391, term25391.getClass(), "tagName", "");
        setBooleanField(term25391, term25391.getClass(), "isBlock", false);
        setBooleanField(term25391, term25391.getClass(), "formatAsBlock", true);
        setBooleanField(term25391, term25391.getClass(), "canContainInline", false);
        setBooleanField(term25391, term25391.getClass(), "empty", true);
        setBooleanField(term25391, term25391.getClass(), "selfClosing", true);
        setBooleanField(term25391, term25391.getClass(), "preserveWhitespace", false);
        setBooleanField(term25391, term25391.getClass(), "formList", false);
        setBooleanField(term25391, term25391.getClass(), "formSubmit", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term25332, args);
        assertTrue(recursiveEquals(term25332, term25391));
        assertTrue(recursiveEquals(retValue, 888456994));
    }

};


