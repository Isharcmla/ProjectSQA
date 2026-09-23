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

public class Tag_hashCode_901271351143 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11242;
     Object term11320;

    public Tag_hashCode_901271351143() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11242 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term11242, term11242.getClass(), "tagName", "");
        setBooleanField(term11242, term11242.getClass(), "isBlock", true);
        setBooleanField(term11242, term11242.getClass(), "formatAsBlock", true);
        setBooleanField(term11242, term11242.getClass(), "canContainBlock", true);
        setBooleanField(term11242, term11242.getClass(), "canContainInline", false);
        setBooleanField(term11242, term11242.getClass(), "empty", false);
        setBooleanField(term11242, term11242.getClass(), "selfClosing", false);
        setBooleanField(term11242, term11242.getClass(), "preserveWhitespace", true);
        term11320 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term11320, term11320.getClass(), "tagName", "");
        setBooleanField(term11320, term11320.getClass(), "isBlock", true);
        setBooleanField(term11320, term11320.getClass(), "formatAsBlock", true);
        setBooleanField(term11320, term11320.getClass(), "canContainBlock", true);
        setBooleanField(term11320, term11320.getClass(), "canContainInline", false);
        setBooleanField(term11320, term11320.getClass(), "empty", false);
        setBooleanField(term11320, term11320.getClass(), "selfClosing", false);
        setBooleanField(term11320, term11320.getClass(), "preserveWhitespace", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term11242, args);
        assertTrue(recursiveEquals(term11242, term11320));
        assertTrue(recursiveEquals(retValue, 917056354));
    }

};


