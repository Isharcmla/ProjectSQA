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
import java.lang.IllegalArgumentException;
import static org.jsoup.parser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class XmlTreeBuilder_insert_126113140055 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term83836;
     Object term83970;

    public XmlTreeBuilder_insert_126113140055() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term83836 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        Object term83902 = newInstance(Class.forName("org.jsoup.parser.ParseSettings"));
        setBooleanField(term83902, term83902.getClass(), "preserveTagCase", false);
        setField(term83836, term83836.getClass(), "settings", term83902);
        term83970 = newInstance(Class.forName("org.jsoup.parser.Token$StartTag"));
        setField(term83970, term83970.getClass(), "tagName", "                 ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$StartTag");
        Object[] args = new Object[1];
        args[0] = term83970;
        try {
            callMethod(klass, "insert", argTypes, term83836, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


