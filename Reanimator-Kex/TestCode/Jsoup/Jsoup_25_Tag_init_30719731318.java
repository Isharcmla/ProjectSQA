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

public class Tag_init_30719731318 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term550;

    public Tag_init_30719731318() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term550 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term550, term550.getClass(), "tagName", "paebtnzttd");
        setBooleanField(term550, term550.getClass(), "isBlock", true);
        setBooleanField(term550, term550.getClass(), "formatAsBlock", true);
        setBooleanField(term550, term550.getClass(), "canContainBlock", true);
        setBooleanField(term550, term550.getClass(), "canContainInline", true);
        setBooleanField(term550, term550.getClass(), "empty", false);
        setBooleanField(term550, term550.getClass(), "selfClosing", false);
        setBooleanField(term550, term550.getClass(), "preserveWhitespace", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "PAEBtnZtTD";
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term550));
    }

};


