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

public class Tag_hashCode_901271351338 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29233;
     Object term29466;

    public Tag_hashCode_901271351338() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29233 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term29233, term29233.getClass(), "tagName", "");
        setBooleanField(term29233, term29233.getClass(), "isBlock", true);
        setBooleanField(term29233, term29233.getClass(), "formatAsBlock", false);
        setBooleanField(term29233, term29233.getClass(), "canContainInline", true);
        setBooleanField(term29233, term29233.getClass(), "empty", true);
        setBooleanField(term29233, term29233.getClass(), "selfClosing", true);
        term29466 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term29466, term29466.getClass(), "tagName", "");
        setBooleanField(term29466, term29466.getClass(), "isBlock", true);
        setBooleanField(term29466, term29466.getClass(), "formatAsBlock", false);
        setBooleanField(term29466, term29466.getClass(), "canContainInline", true);
        setBooleanField(term29466, term29466.getClass(), "empty", true);
        setBooleanField(term29466, term29466.getClass(), "selfClosing", true);
        setBooleanField(term29466, term29466.getClass(), "preserveWhitespace", false);
        setBooleanField(term29466, term29466.getClass(), "formList", false);
        setBooleanField(term29466, term29466.getClass(), "formSubmit", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term29233, args);
        assertTrue(recursiveEquals(term29233, term29466));
        assertTrue(recursiveEquals(retValue, 1772392798));
    }

};


