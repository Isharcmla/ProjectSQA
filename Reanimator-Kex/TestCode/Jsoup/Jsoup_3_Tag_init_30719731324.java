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

public class Tag_init_30719731324 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1739;

    public Tag_init_30719731324() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1739 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term1739, term1739.getClass(), "tagName", "paebtnzttd");
        setBooleanField(term1739, term1739.getClass(), "isBlock", true);
        setBooleanField(term1739, term1739.getClass(), "canContainBlock", true);
        setBooleanField(term1739, term1739.getClass(), "canContainInline", true);
        setBooleanField(term1739, term1739.getClass(), "optionalClosing", false);
        setBooleanField(term1739, term1739.getClass(), "empty", false);
        setBooleanField(term1739, term1739.getClass(), "preserveWhitespace", false);
        setField(term1739, term1739.getClass(), "ancestors", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "PAEBtnZtTD";
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term1739));
    }

};


