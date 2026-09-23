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

public class Tag_hashCode_901271351167 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13052;
     Object term13130;

    public Tag_hashCode_901271351167() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13052 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term13052, term13052.getClass(), "tagName", "");
        setBooleanField(term13052, term13052.getClass(), "isBlock", false);
        setBooleanField(term13052, term13052.getClass(), "formatAsBlock", false);
        setBooleanField(term13052, term13052.getClass(), "canContainBlock", true);
        setBooleanField(term13052, term13052.getClass(), "canContainInline", true);
        term13130 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term13130, term13130.getClass(), "tagName", "");
        setBooleanField(term13130, term13130.getClass(), "isBlock", false);
        setBooleanField(term13130, term13130.getClass(), "formatAsBlock", false);
        setBooleanField(term13130, term13130.getClass(), "canContainBlock", true);
        setBooleanField(term13130, term13130.getClass(), "canContainInline", true);
        setBooleanField(term13130, term13130.getClass(), "empty", false);
        setBooleanField(term13130, term13130.getClass(), "selfClosing", false);
        setBooleanField(term13130, term13130.getClass(), "preserveWhitespace", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term13052, args);
        assertTrue(recursiveEquals(term13052, term13130));
        assertTrue(recursiveEquals(retValue, 953312));
    }

};


