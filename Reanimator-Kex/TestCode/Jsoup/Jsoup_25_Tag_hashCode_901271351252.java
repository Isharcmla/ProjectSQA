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

public class Tag_hashCode_901271351252 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19679;
     Object term19892;

    public Tag_hashCode_901271351252() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19679 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term19679, term19679.getClass(), "tagName", "");
        setBooleanField(term19679, term19679.getClass(), "isBlock", false);
        setBooleanField(term19679, term19679.getClass(), "formatAsBlock", true);
        setBooleanField(term19679, term19679.getClass(), "canContainBlock", false);
        setBooleanField(term19679, term19679.getClass(), "canContainInline", true);
        setBooleanField(term19679, term19679.getClass(), "empty", true);
        setBooleanField(term19679, term19679.getClass(), "selfClosing", true);
        term19892 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term19892, term19892.getClass(), "tagName", "");
        setBooleanField(term19892, term19892.getClass(), "isBlock", false);
        setBooleanField(term19892, term19892.getClass(), "formatAsBlock", true);
        setBooleanField(term19892, term19892.getClass(), "canContainBlock", false);
        setBooleanField(term19892, term19892.getClass(), "canContainInline", true);
        setBooleanField(term19892, term19892.getClass(), "empty", true);
        setBooleanField(term19892, term19892.getClass(), "selfClosing", true);
        setBooleanField(term19892, term19892.getClass(), "preserveWhitespace", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term19679, args);
        assertTrue(recursiveEquals(term19679, term19892));
        assertTrue(recursiveEquals(retValue, 28659934));
    }

};


