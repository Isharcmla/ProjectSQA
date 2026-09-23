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

public class XmlTreeBuilder_insert_126113140089 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term110644;
     Object term110778;

    public XmlTreeBuilder_insert_126113140089() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term110644 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        Object term110710 = newInstance(Class.forName("org.jsoup.parser.ParseSettings"));
        setBooleanField(term110710, term110710.getClass(), "preserveTagCase", false);
        setBooleanField(term110710, term110710.getClass(), "preserveAttributeCase", true);
        setField(term110644, term110644.getClass(), "settings", term110710);
        setField(term110644, term110644.getClass(), "baseUri", null);
        term110778 = newInstance(Class.forName("org.jsoup.parser.Token$StartTag"));
        setField(term110778, term110778.getClass(), "tagName", "                                                                                                                                                                                                                                         ");
        setField(term110778, term110778.getClass(), "attributes", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$StartTag");
        Object[] args = new Object[1];
        args[0] = term110778;
        try {
            callMethod(klass, "insert", argTypes, term110644, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


