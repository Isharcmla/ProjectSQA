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

public class Tag_hashCode_901271351124 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9685;
     Object term9900;

    public Tag_hashCode_901271351124() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9685 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term9685, term9685.getClass(), "tagName", "");
        setBooleanField(term9685, term9685.getClass(), "isBlock", true);
        setBooleanField(term9685, term9685.getClass(), "formatAsBlock", false);
        setBooleanField(term9685, term9685.getClass(), "canContainBlock", false);
        setBooleanField(term9685, term9685.getClass(), "canContainInline", false);
        setBooleanField(term9685, term9685.getClass(), "empty", true);
        term9900 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term9900, term9900.getClass(), "tagName", "");
        setBooleanField(term9900, term9900.getClass(), "isBlock", true);
        setBooleanField(term9900, term9900.getClass(), "formatAsBlock", false);
        setBooleanField(term9900, term9900.getClass(), "canContainBlock", false);
        setBooleanField(term9900, term9900.getClass(), "canContainInline", false);
        setBooleanField(term9900, term9900.getClass(), "empty", true);
        setBooleanField(term9900, term9900.getClass(), "selfClosing", false);
        setBooleanField(term9900, term9900.getClass(), "preserveWhitespace", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term9685, args);
        assertTrue(recursiveEquals(term9685, term9900));
        assertTrue(recursiveEquals(retValue, 887504642));
    }

};


