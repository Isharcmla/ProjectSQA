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

public class Tag_hashCode_901271351126 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9843;
     Object term10063;

    public Tag_hashCode_901271351126() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9843 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term9843, term9843.getClass(), "tagName", "");
        setBooleanField(term9843, term9843.getClass(), "isBlock", true);
        setBooleanField(term9843, term9843.getClass(), "formatAsBlock", true);
        setBooleanField(term9843, term9843.getClass(), "canContainBlock", false);
        setBooleanField(term9843, term9843.getClass(), "canContainInline", true);
        setBooleanField(term9843, term9843.getClass(), "empty", false);
        setBooleanField(term9843, term9843.getClass(), "selfClosing", true);
        term10063 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term10063, term10063.getClass(), "tagName", "");
        setBooleanField(term10063, term10063.getClass(), "isBlock", true);
        setBooleanField(term10063, term10063.getClass(), "formatAsBlock", true);
        setBooleanField(term10063, term10063.getClass(), "canContainBlock", false);
        setBooleanField(term10063, term10063.getClass(), "canContainInline", true);
        setBooleanField(term10063, term10063.getClass(), "empty", false);
        setBooleanField(term10063, term10063.getClass(), "selfClosing", true);
        setBooleanField(term10063, term10063.getClass(), "preserveWhitespace", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term9843, args);
        assertTrue(recursiveEquals(term9843, term10063));
        assertTrue(recursiveEquals(retValue, 916162654));
    }

};


