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
import java.util.NoSuchElementException;
import static org.jsoup.parser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class XmlTreeBuilder_insert_420854838143 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term106091;
     Object term106243;

    public XmlTreeBuilder_insert_420854838143() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term106091 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        Object term106173 = newInstance(Class.forName("org.jsoup.helper.DescendableLinkedList"));
        setField(term106091, term106091.getClass(), "baseUri", null);
        setField(term106091, term106091.getClass(), "stack", term106173);
        term106243 = newInstance(Class.forName("org.jsoup.parser.Token$Character"));
        setField(term106243, term106243.getClass(), "data", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$Character");
        Object[] args = new Object[1];
        args[0] = term106243;
        try {
            callMethod(klass, "insert", argTypes, term106091, args);
            assertTrue(false);
        }
        catch (NoSuchElementException e) {
        }

    }

};


