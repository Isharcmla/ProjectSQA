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

public class Tag_hashCode_901271351308 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24462;
     Object term24685;

    public Tag_hashCode_901271351308() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term24462 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term24462, term24462.getClass(), "tagName", "");
        setBooleanField(term24462, term24462.getClass(), "isBlock", false);
        setBooleanField(term24462, term24462.getClass(), "formatAsBlock", true);
        setBooleanField(term24462, term24462.getClass(), "canContainBlock", true);
        setBooleanField(term24462, term24462.getClass(), "canContainInline", true);
        setBooleanField(term24462, term24462.getClass(), "empty", true);
        setBooleanField(term24462, term24462.getClass(), "selfClosing", true);
        term24685 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term24685, term24685.getClass(), "tagName", "");
        setBooleanField(term24685, term24685.getClass(), "isBlock", false);
        setBooleanField(term24685, term24685.getClass(), "formatAsBlock", true);
        setBooleanField(term24685, term24685.getClass(), "canContainBlock", true);
        setBooleanField(term24685, term24685.getClass(), "canContainInline", true);
        setBooleanField(term24685, term24685.getClass(), "empty", true);
        setBooleanField(term24685, term24685.getClass(), "selfClosing", true);
        setBooleanField(term24685, term24685.getClass(), "preserveWhitespace", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term24462, args);
        assertTrue(recursiveEquals(term24462, term24685));
        assertTrue(recursiveEquals(retValue, 29583455));
    }

};


