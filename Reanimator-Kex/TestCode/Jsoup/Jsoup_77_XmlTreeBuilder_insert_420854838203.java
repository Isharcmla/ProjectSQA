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
import java.lang.NullPointerException;
import static org.jsoup.parser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;

public class XmlTreeBuilder_insert_420854838203 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term338990;
     Object term339166;

    public XmlTreeBuilder_insert_420854838203() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term339096 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        ArrayList term339042 = new ArrayList();
        ((ArrayList) term339042).add(term339096);
        term338990 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        setField(term338990, term338990.getClass(), "stack", term339042);
        term339166 = newInstance(Class.forName("org.jsoup.parser.Token$Character"));
        setField(term339166, term339166.getClass(), "data", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$Character");
        Object[] args = new Object[1];
        args[0] = term339166;
        try {
            callMethod(klass, "insert", argTypes, term338990, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


