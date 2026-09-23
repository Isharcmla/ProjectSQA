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

public class Tag_hashCode_90127135185 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17150;
     Object term17205;

    public Tag_hashCode_90127135185() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17150 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term17150, term17150.getClass(), "tagName", "");
        setBooleanField(term17150, term17150.getClass(), "isBlock", false);
        setBooleanField(term17150, term17150.getClass(), "canContainBlock", true);
        setBooleanField(term17150, term17150.getClass(), "canContainInline", true);
        term17205 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term17205, term17205.getClass(), "tagName", "");
        setBooleanField(term17205, term17205.getClass(), "isBlock", false);
        setBooleanField(term17205, term17205.getClass(), "canContainBlock", true);
        setBooleanField(term17205, term17205.getClass(), "canContainInline", true);
        setBooleanField(term17205, term17205.getClass(), "optionalClosing", false);
        setBooleanField(term17205, term17205.getClass(), "empty", false);
        setBooleanField(term17205, term17205.getClass(), "preserveWhitespace", false);
        setField(term17205, term17205.getClass(), "ancestors", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term17150, args);
        assertTrue(recursiveEquals(term17150, term17205));
        assertTrue(recursiveEquals(retValue, 30752));
    }

};


