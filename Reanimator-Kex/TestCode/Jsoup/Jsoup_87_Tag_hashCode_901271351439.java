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

public class Tag_hashCode_901271351439 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38056;
     Object term38138;

    public Tag_hashCode_901271351439() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term38056 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term38056, term38056.getClass(), "tagName", "");
        setBooleanField(term38056, term38056.getClass(), "isBlock", true);
        setBooleanField(term38056, term38056.getClass(), "formatAsBlock", true);
        setBooleanField(term38056, term38056.getClass(), "canContainInline", true);
        setBooleanField(term38056, term38056.getClass(), "empty", true);
        setBooleanField(term38056, term38056.getClass(), "selfClosing", true);
        setBooleanField(term38056, term38056.getClass(), "preserveWhitespace", true);
        term38138 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term38138, term38138.getClass(), "tagName", "");
        setBooleanField(term38138, term38138.getClass(), "isBlock", true);
        setBooleanField(term38138, term38138.getClass(), "formatAsBlock", true);
        setBooleanField(term38138, term38138.getClass(), "canContainInline", true);
        setBooleanField(term38138, term38138.getClass(), "empty", true);
        setBooleanField(term38138, term38138.getClass(), "selfClosing", true);
        setBooleanField(term38138, term38138.getClass(), "preserveWhitespace", true);
        setBooleanField(term38138, term38138.getClass(), "formList", false);
        setBooleanField(term38138, term38138.getClass(), "formSubmit", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term38056, args);
        assertTrue(recursiveEquals(term38056, term38138));
        assertTrue(recursiveEquals(retValue, -1635069856));
    }

};


