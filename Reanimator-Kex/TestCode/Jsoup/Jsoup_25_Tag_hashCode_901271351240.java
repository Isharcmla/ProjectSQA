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

public class Tag_hashCode_901271351240 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18685;
     Object term18928;

    public Tag_hashCode_901271351240() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term18685 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term18685, term18685.getClass(), "tagName", "");
        setBooleanField(term18685, term18685.getClass(), "isBlock", true);
        setBooleanField(term18685, term18685.getClass(), "formatAsBlock", false);
        setBooleanField(term18685, term18685.getClass(), "canContainBlock", false);
        setBooleanField(term18685, term18685.getClass(), "canContainInline", true);
        setBooleanField(term18685, term18685.getClass(), "empty", false);
        setBooleanField(term18685, term18685.getClass(), "selfClosing", true);
        setBooleanField(term18685, term18685.getClass(), "preserveWhitespace", true);
        term18928 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term18928, term18928.getClass(), "tagName", "");
        setBooleanField(term18928, term18928.getClass(), "isBlock", true);
        setBooleanField(term18928, term18928.getClass(), "formatAsBlock", false);
        setBooleanField(term18928, term18928.getClass(), "canContainBlock", false);
        setBooleanField(term18928, term18928.getClass(), "canContainInline", true);
        setBooleanField(term18928, term18928.getClass(), "empty", false);
        setBooleanField(term18928, term18928.getClass(), "selfClosing", true);
        setBooleanField(term18928, term18928.getClass(), "preserveWhitespace", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term18685, args);
        assertTrue(recursiveEquals(term18685, term18928));
        assertTrue(recursiveEquals(retValue, 887533504));
    }

};


