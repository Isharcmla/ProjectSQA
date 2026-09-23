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

public class Tag_hashCode_901271351157 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14203;
     Object term14262;

    public Tag_hashCode_901271351157() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14203 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term14203, term14203.getClass(), "tagName", "");
        setBooleanField(term14203, term14203.getClass(), "isBlock", false);
        setBooleanField(term14203, term14203.getClass(), "formatAsBlock", false);
        setBooleanField(term14203, term14203.getClass(), "canContainInline", true);
        setBooleanField(term14203, term14203.getClass(), "empty", false);
        setBooleanField(term14203, term14203.getClass(), "selfClosing", true);
        term14262 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term14262, term14262.getClass(), "tagName", "");
        setBooleanField(term14262, term14262.getClass(), "isBlock", false);
        setBooleanField(term14262, term14262.getClass(), "formatAsBlock", false);
        setBooleanField(term14262, term14262.getClass(), "canContainInline", true);
        setBooleanField(term14262, term14262.getClass(), "empty", false);
        setBooleanField(term14262, term14262.getClass(), "selfClosing", true);
        setBooleanField(term14262, term14262.getClass(), "preserveWhitespace", false);
        setBooleanField(term14262, term14262.getClass(), "formList", false);
        setBooleanField(term14262, term14262.getClass(), "formSubmit", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term14203, args);
        assertTrue(recursiveEquals(term14203, term14262));
        assertTrue(recursiveEquals(retValue, 28658942));
    }

};


