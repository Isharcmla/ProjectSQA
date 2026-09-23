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

public class Tag_hashCode_901271351262 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20504;
     Object term20705;

    public Tag_hashCode_901271351262() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20504 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term20504, term20504.getClass(), "tagName", "");
        setBooleanField(term20504, term20504.getClass(), "isBlock", false);
        setBooleanField(term20504, term20504.getClass(), "formatAsBlock", false);
        setBooleanField(term20504, term20504.getClass(), "canContainBlock", true);
        setBooleanField(term20504, term20504.getClass(), "canContainInline", false);
        setBooleanField(term20504, term20504.getClass(), "empty", true);
        setBooleanField(term20504, term20504.getClass(), "selfClosing", false);
        setBooleanField(term20504, term20504.getClass(), "preserveWhitespace", true);
        term20705 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term20705, term20705.getClass(), "tagName", "");
        setBooleanField(term20705, term20705.getClass(), "isBlock", false);
        setBooleanField(term20705, term20705.getClass(), "formatAsBlock", false);
        setBooleanField(term20705, term20705.getClass(), "canContainBlock", true);
        setBooleanField(term20705, term20705.getClass(), "canContainInline", false);
        setBooleanField(term20705, term20705.getClass(), "empty", true);
        setBooleanField(term20705, term20705.getClass(), "selfClosing", false);
        setBooleanField(term20705, term20705.getClass(), "preserveWhitespace", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term20504, args);
        assertTrue(recursiveEquals(term20504, term20705));
        assertTrue(recursiveEquals(retValue, 924483));
    }

};


