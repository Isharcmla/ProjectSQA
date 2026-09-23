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

public class Tag_register_3436246335 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term488;
     Object term1427;
     Object term1407;

    public Tag_register_3436246335() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term488 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term488, term488.getClass(), "tagName", "tbcdzjIfER");
        setBooleanField(term488, term488.getClass(), "isBlock", true);
        setBooleanField(term488, term488.getClass(), "formatAsBlock", false);
        setBooleanField(term488, term488.getClass(), "canContainBlock", true);
        setBooleanField(term488, term488.getClass(), "canContainInline", true);
        setBooleanField(term488, term488.getClass(), "empty", false);
        setBooleanField(term488, term488.getClass(), "selfClosing", false);
        setBooleanField(term488, term488.getClass(), "preserveWhitespace", true);
        term1427 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term1427, term1427.getClass(), "tagName", "tbcdzjIfER");
        setBooleanField(term1427, term1427.getClass(), "isBlock", true);
        setBooleanField(term1427, term1427.getClass(), "formatAsBlock", false);
        setBooleanField(term1427, term1427.getClass(), "canContainBlock", true);
        setBooleanField(term1427, term1427.getClass(), "canContainInline", true);
        setBooleanField(term1427, term1427.getClass(), "empty", false);
        setBooleanField(term1427, term1427.getClass(), "selfClosing", false);
        setBooleanField(term1427, term1427.getClass(), "preserveWhitespace", true);
        term1407 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term1407, term1407.getClass(), "tagName", "tbcdzjIfER");
        setBooleanField(term1407, term1407.getClass(), "isBlock", true);
        setBooleanField(term1407, term1407.getClass(), "formatAsBlock", false);
        setBooleanField(term1407, term1407.getClass(), "canContainBlock", true);
        setBooleanField(term1407, term1407.getClass(), "canContainInline", true);
        setBooleanField(term1407, term1407.getClass(), "empty", false);
        setBooleanField(term1407, term1407.getClass(), "selfClosing", false);
        setBooleanField(term1407, term1407.getClass(), "preserveWhitespace", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Tag");
        Object[] args = new Object[1];
        args[0] = term488;
        Object retValue = callMethod(klass, "register", argTypes, null, args);
        assertTrue(recursiveEquals(term488, term1427));
        assertTrue(recursiveEquals(retValue, term1407));
    }

};


