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

public class Tag_hashCode_901271351553 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47691;
     Object term47773;

    public Tag_hashCode_901271351553() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term47691 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term47691, term47691.getClass(), "tagName", "");
        setBooleanField(term47691, term47691.getClass(), "isBlock", false);
        setBooleanField(term47691, term47691.getClass(), "formatAsBlock", true);
        setBooleanField(term47691, term47691.getClass(), "canContainInline", false);
        setBooleanField(term47691, term47691.getClass(), "empty", true);
        setBooleanField(term47691, term47691.getClass(), "selfClosing", true);
        setBooleanField(term47691, term47691.getClass(), "preserveWhitespace", false);
        setBooleanField(term47691, term47691.getClass(), "formList", true);
        setBooleanField(term47691, term47691.getClass(), "formSubmit", true);
        term47773 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term47773, term47773.getClass(), "tagName", "");
        setBooleanField(term47773, term47773.getClass(), "isBlock", false);
        setBooleanField(term47773, term47773.getClass(), "formatAsBlock", true);
        setBooleanField(term47773, term47773.getClass(), "canContainInline", false);
        setBooleanField(term47773, term47773.getClass(), "empty", true);
        setBooleanField(term47773, term47773.getClass(), "selfClosing", true);
        setBooleanField(term47773, term47773.getClass(), "preserveWhitespace", false);
        setBooleanField(term47773, term47773.getClass(), "formList", true);
        setBooleanField(term47773, term47773.getClass(), "formSubmit", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term47691, args);
        assertTrue(recursiveEquals(term47691, term47773));
        assertTrue(recursiveEquals(retValue, 888457025));
    }

};


