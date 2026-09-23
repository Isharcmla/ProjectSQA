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
import java.util.ArrayList;
import java.lang.Object;

public class XmlTreeBuilder_insert_126113140073 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term89704;
     Object term89862;

    public XmlTreeBuilder_insert_126113140073() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term89794 = new ArrayList();
        term89704 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        setField(term89704, term89704.getClass(), "baseUri", "");
        setField(term89704, term89704.getClass(), "stack", term89794);
        term89862 = newInstance(Class.forName("org.jsoup.parser.Token$StartTag"));
        Object term89958 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term89862, term89862.getClass(), "tagName", "            ");
        setField(term89862, term89862.getClass(), "attributes", term89958);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$StartTag");
        Object[] args = new Object[1];
        args[0] = term89862;
        try {
            callMethod(klass, "insert", argTypes, term89704, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


