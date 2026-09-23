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
import java.lang.ClassCastException;
import static org.jsoup.parser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.StringBuilder;
import java.lang.Object;

public class XmlTreeBuilder_insert_196792529271 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term207468;
     Object term207646;

    public XmlTreeBuilder_insert_196792529271() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuilder term207676 = new StringBuilder();
        Object[] term207364 = (Object[]) newArray("java.lang.Object", 2);
        setElement(term207364, 0, term207676);
        setElement(term207364, 1, term207364);
        ArrayList term207520 = new ArrayList();
        ((ArrayList) term207520).add(term207676);
        ((ArrayList) term207520).add((Object)term207364);
        term207468 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        setField(term207468, term207468.getClass(), "stack", term207520);
        term207646 = newInstance(Class.forName("org.jsoup.parser.Token$Comment"));
        setField(term207646, term207646.getClass(), "data", term207676);
        setBooleanField(term207646, term207646.getClass(), "bogus", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$Comment");
        Object[] args = new Object[1];
        args[0] = term207646;
        try {
            callMethod(klass, "insert", argTypes, term207468, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


