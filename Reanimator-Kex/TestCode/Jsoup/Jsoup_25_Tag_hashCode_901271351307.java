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

public class Tag_hashCode_901271351307 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24325;
     Object term24664;

    public Tag_hashCode_901271351307() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term24325 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term24325, term24325.getClass(), "tagName", "");
        setBooleanField(term24325, term24325.getClass(), "isBlock", false);
        setBooleanField(term24325, term24325.getClass(), "formatAsBlock", true);
        setBooleanField(term24325, term24325.getClass(), "canContainBlock", true);
        setBooleanField(term24325, term24325.getClass(), "canContainInline", true);
        setBooleanField(term24325, term24325.getClass(), "empty", true);
        setBooleanField(term24325, term24325.getClass(), "selfClosing", false);
        setBooleanField(term24325, term24325.getClass(), "preserveWhitespace", true);
        term24664 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term24664, term24664.getClass(), "tagName", "");
        setBooleanField(term24664, term24664.getClass(), "isBlock", false);
        setBooleanField(term24664, term24664.getClass(), "formatAsBlock", true);
        setBooleanField(term24664, term24664.getClass(), "canContainBlock", true);
        setBooleanField(term24664, term24664.getClass(), "canContainInline", true);
        setBooleanField(term24664, term24664.getClass(), "empty", true);
        setBooleanField(term24664, term24664.getClass(), "selfClosing", false);
        setBooleanField(term24664, term24664.getClass(), "preserveWhitespace", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term24325, args);
        assertTrue(recursiveEquals(term24325, term24664));
        assertTrue(recursiveEquals(retValue, 29583425));
    }

};


