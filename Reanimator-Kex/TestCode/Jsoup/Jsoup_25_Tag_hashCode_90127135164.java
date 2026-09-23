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

public class Tag_hashCode_90127135164 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4524;
     Object term4699;

    public Tag_hashCode_90127135164() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4524 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term4524, term4524.getClass(), "tagName", "");
        setBooleanField(term4524, term4524.getClass(), "isBlock", true);
        setBooleanField(term4524, term4524.getClass(), "formatAsBlock", false);
        setBooleanField(term4524, term4524.getClass(), "canContainBlock", true);
        setBooleanField(term4524, term4524.getClass(), "canContainInline", false);
        setBooleanField(term4524, term4524.getClass(), "empty", true);
        term4699 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term4699, term4699.getClass(), "tagName", "");
        setBooleanField(term4699, term4699.getClass(), "isBlock", true);
        setBooleanField(term4699, term4699.getClass(), "formatAsBlock", false);
        setBooleanField(term4699, term4699.getClass(), "canContainBlock", true);
        setBooleanField(term4699, term4699.getClass(), "canContainInline", false);
        setBooleanField(term4699, term4699.getClass(), "empty", true);
        setBooleanField(term4699, term4699.getClass(), "selfClosing", false);
        setBooleanField(term4699, term4699.getClass(), "preserveWhitespace", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term4524, args);
        assertTrue(recursiveEquals(term4524, term4699));
        assertTrue(recursiveEquals(retValue, 888428163));
    }

};


