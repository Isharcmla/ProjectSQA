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

public class Tag_hashCode_901271351108 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8195;
     Object term8416;

    public Tag_hashCode_901271351108() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8195 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term8195, term8195.getClass(), "tagName", "");
        setBooleanField(term8195, term8195.getClass(), "isBlock", true);
        setBooleanField(term8195, term8195.getClass(), "formatAsBlock", false);
        setBooleanField(term8195, term8195.getClass(), "canContainBlock", true);
        setBooleanField(term8195, term8195.getClass(), "canContainInline", true);
        setBooleanField(term8195, term8195.getClass(), "empty", false);
        setBooleanField(term8195, term8195.getClass(), "selfClosing", false);
        setBooleanField(term8195, term8195.getClass(), "preserveWhitespace", true);
        term8416 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term8416, term8416.getClass(), "tagName", "");
        setBooleanField(term8416, term8416.getClass(), "isBlock", true);
        setBooleanField(term8416, term8416.getClass(), "formatAsBlock", false);
        setBooleanField(term8416, term8416.getClass(), "canContainBlock", true);
        setBooleanField(term8416, term8416.getClass(), "canContainInline", true);
        setBooleanField(term8416, term8416.getClass(), "empty", false);
        setBooleanField(term8416, term8416.getClass(), "selfClosing", false);
        setBooleanField(term8416, term8416.getClass(), "preserveWhitespace", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term8195, args);
        assertTrue(recursiveEquals(term8195, term8416));
        assertTrue(recursiveEquals(retValue, 888456994));
    }

};


