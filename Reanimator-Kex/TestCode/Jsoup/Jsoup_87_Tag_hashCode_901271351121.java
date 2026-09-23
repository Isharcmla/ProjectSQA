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

public class Tag_hashCode_901271351121 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11361;
     Object term11420;

    public Tag_hashCode_901271351121() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11361 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term11361, term11361.getClass(), "tagName", "");
        setBooleanField(term11361, term11361.getClass(), "isBlock", true);
        setBooleanField(term11361, term11361.getClass(), "formatAsBlock", false);
        setBooleanField(term11361, term11361.getClass(), "canContainInline", false);
        setBooleanField(term11361, term11361.getClass(), "empty", false);
        setBooleanField(term11361, term11361.getClass(), "selfClosing", false);
        setBooleanField(term11361, term11361.getClass(), "preserveWhitespace", false);
        setBooleanField(term11361, term11361.getClass(), "formList", false);
        setBooleanField(term11361, term11361.getClass(), "formSubmit", true);
        term11420 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term11420, term11420.getClass(), "tagName", "");
        setBooleanField(term11420, term11420.getClass(), "isBlock", true);
        setBooleanField(term11420, term11420.getClass(), "formatAsBlock", false);
        setBooleanField(term11420, term11420.getClass(), "canContainInline", false);
        setBooleanField(term11420, term11420.getClass(), "empty", false);
        setBooleanField(term11420, term11420.getClass(), "selfClosing", false);
        setBooleanField(term11420, term11420.getClass(), "preserveWhitespace", false);
        setBooleanField(term11420, term11420.getClass(), "formList", false);
        setBooleanField(term11420, term11420.getClass(), "formSubmit", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term11361, args);
        assertTrue(recursiveEquals(term11361, term11420));
        assertTrue(recursiveEquals(retValue, 1742810336));
    }

};


