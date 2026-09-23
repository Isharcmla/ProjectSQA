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

public class Tag_hashCode_901271351189 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16801;
     Object term16860;

    public Tag_hashCode_901271351189() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16801 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term16801, term16801.getClass(), "tagName", "");
        setBooleanField(term16801, term16801.getClass(), "isBlock", false);
        setBooleanField(term16801, term16801.getClass(), "formatAsBlock", true);
        setBooleanField(term16801, term16801.getClass(), "canContainInline", false);
        setBooleanField(term16801, term16801.getClass(), "empty", false);
        setBooleanField(term16801, term16801.getClass(), "selfClosing", false);
        setBooleanField(term16801, term16801.getClass(), "preserveWhitespace", false);
        setBooleanField(term16801, term16801.getClass(), "formList", true);
        term16860 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term16860, term16860.getClass(), "tagName", "");
        setBooleanField(term16860, term16860.getClass(), "isBlock", false);
        setBooleanField(term16860, term16860.getClass(), "formatAsBlock", true);
        setBooleanField(term16860, term16860.getClass(), "canContainInline", false);
        setBooleanField(term16860, term16860.getClass(), "empty", false);
        setBooleanField(term16860, term16860.getClass(), "selfClosing", false);
        setBooleanField(term16860, term16860.getClass(), "preserveWhitespace", false);
        setBooleanField(term16860, term16860.getClass(), "formList", true);
        setBooleanField(term16860, term16860.getClass(), "formSubmit", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term16801, args);
        assertTrue(recursiveEquals(term16801, term16860));
        assertTrue(recursiveEquals(retValue, 887503712));
    }

};


