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

public class Tag_hashCode_901271351402 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34826;
     Object term35058;

    public Tag_hashCode_901271351402() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term34826 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term34826, term34826.getClass(), "tagName", "");
        setBooleanField(term34826, term34826.getClass(), "isBlock", false);
        setBooleanField(term34826, term34826.getClass(), "formatAsBlock", true);
        setBooleanField(term34826, term34826.getClass(), "canContainInline", true);
        setBooleanField(term34826, term34826.getClass(), "empty", true);
        setBooleanField(term34826, term34826.getClass(), "selfClosing", true);
        setBooleanField(term34826, term34826.getClass(), "preserveWhitespace", false);
        setBooleanField(term34826, term34826.getClass(), "formList", true);
        term35058 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term35058, term35058.getClass(), "tagName", "");
        setBooleanField(term35058, term35058.getClass(), "isBlock", false);
        setBooleanField(term35058, term35058.getClass(), "formatAsBlock", true);
        setBooleanField(term35058, term35058.getClass(), "canContainInline", true);
        setBooleanField(term35058, term35058.getClass(), "empty", true);
        setBooleanField(term35058, term35058.getClass(), "selfClosing", true);
        setBooleanField(term35058, term35058.getClass(), "preserveWhitespace", false);
        setBooleanField(term35058, term35058.getClass(), "formList", true);
        setBooleanField(term35058, term35058.getClass(), "formSubmit", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term34826, args);
        assertTrue(recursiveEquals(term34826, term35058));
        assertTrue(recursiveEquals(retValue, 917086175));
    }

};


