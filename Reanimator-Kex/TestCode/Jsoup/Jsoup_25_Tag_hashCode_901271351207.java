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

public class Tag_hashCode_901271351207 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16137;
     Object term16229;

    public Tag_hashCode_901271351207() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16137 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term16137, term16137.getClass(), "tagName", "");
        setBooleanField(term16137, term16137.getClass(), "isBlock", true);
        setBooleanField(term16137, term16137.getClass(), "formatAsBlock", true);
        setBooleanField(term16137, term16137.getClass(), "canContainBlock", true);
        setBooleanField(term16137, term16137.getClass(), "canContainInline", true);
        setBooleanField(term16137, term16137.getClass(), "empty", true);
        term16229 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term16229, term16229.getClass(), "tagName", "");
        setBooleanField(term16229, term16229.getClass(), "isBlock", true);
        setBooleanField(term16229, term16229.getClass(), "formatAsBlock", true);
        setBooleanField(term16229, term16229.getClass(), "canContainBlock", true);
        setBooleanField(term16229, term16229.getClass(), "canContainInline", true);
        setBooleanField(term16229, term16229.getClass(), "empty", true);
        setBooleanField(term16229, term16229.getClass(), "selfClosing", false);
        setBooleanField(term16229, term16229.getClass(), "preserveWhitespace", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term16137, args);
        assertTrue(recursiveEquals(term16137, term16229));
        assertTrue(recursiveEquals(retValue, 917087105));
    }

};


