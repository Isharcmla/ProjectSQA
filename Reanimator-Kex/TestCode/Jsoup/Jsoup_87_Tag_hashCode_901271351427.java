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

public class Tag_hashCode_901271351427 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37059;
     Object term37141;

    public Tag_hashCode_901271351427() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term37059 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term37059, term37059.getClass(), "tagName", "");
        setBooleanField(term37059, term37059.getClass(), "isBlock", false);
        setBooleanField(term37059, term37059.getClass(), "formatAsBlock", true);
        setBooleanField(term37059, term37059.getClass(), "canContainInline", false);
        setBooleanField(term37059, term37059.getClass(), "empty", true);
        setBooleanField(term37059, term37059.getClass(), "selfClosing", true);
        setBooleanField(term37059, term37059.getClass(), "preserveWhitespace", true);
        setBooleanField(term37059, term37059.getClass(), "formList", true);
        term37141 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term37141, term37141.getClass(), "tagName", "");
        setBooleanField(term37141, term37141.getClass(), "isBlock", false);
        setBooleanField(term37141, term37141.getClass(), "formatAsBlock", true);
        setBooleanField(term37141, term37141.getClass(), "canContainInline", false);
        setBooleanField(term37141, term37141.getClass(), "empty", true);
        setBooleanField(term37141, term37141.getClass(), "selfClosing", true);
        setBooleanField(term37141, term37141.getClass(), "preserveWhitespace", true);
        setBooleanField(term37141, term37141.getClass(), "formList", true);
        setBooleanField(term37141, term37141.getClass(), "formSubmit", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term37059, args);
        assertTrue(recursiveEquals(term37059, term37141));
        assertTrue(recursiveEquals(retValue, 888457985));
    }

};


