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
import java.lang.Object;

public class XmlTreeBuilder_insert_42085483870 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term207193;
     Object term207345;

    public XmlTreeBuilder_insert_42085483870() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term207283 = newInstance(Class.forName("java.lang.Object"));
        ArrayList term207245 = new ArrayList();
        ((ArrayList) term207245).add(term207283);
        ((ArrayList) term207245).add(term207283);
        ((ArrayList) term207245).add(term207283);
        ((ArrayList) term207245).add(term207283);
        ((ArrayList) term207245).add(term207283);
        ((ArrayList) term207245).add(term207283);
        ((ArrayList) term207245).add(term207283);
        ((ArrayList) term207245).add(term207283);
        ((ArrayList) term207245).add(term207283);
        ((ArrayList) term207245).add(term207283);
        ((ArrayList) term207245).add(term207283);
        ((ArrayList) term207245).add(term207283);
        ((ArrayList) term207245).add(term207283);
        ((ArrayList) term207245).add(term207283);
        ((ArrayList) term207245).add(term207283);
        ((ArrayList) term207245).add(term207283);
        ((ArrayList) term207245).add(term207283);
        ((ArrayList) term207245).add(term207283);
        ((ArrayList) term207245).add(term207283);
        ((ArrayList) term207245).add(term207283);
        ((ArrayList) term207245).add(term207283);
        ((ArrayList) term207245).add(term207283);
        ((ArrayList) term207245).add(term207283);
        ((ArrayList) term207245).add(term207283);
        ((ArrayList) term207245).add(term207283);
        ((ArrayList) term207245).add(term207283);
        ((ArrayList) term207245).add(term207283);
        ((ArrayList) term207245).add(term207283);
        ((ArrayList) term207245).add(term207283);
        ((ArrayList) term207245).add(term207283);
        ((ArrayList) term207245).add(term207283);
        ((ArrayList) term207245).add(term207283);
        ((ArrayList) term207245).add(term207283);
        ((ArrayList) term207245).add(term207283);
        ((ArrayList) term207245).add(term207283);
        ((ArrayList) term207245).add(term207283);
        ((ArrayList) term207245).add(term207283);
        ((ArrayList) term207245).add(term207283);
        ((ArrayList) term207245).add(term207283);
        ((ArrayList) term207245).add(term207283);
        ((ArrayList) term207245).add(term207283);
        ((ArrayList) term207245).add(term207283);
        ((ArrayList) term207245).add(term207283);
        ((ArrayList) term207245).add(term207283);
        term207193 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        setField(term207193, term207193.getClass(), "stack", term207245);
        term207345 = newInstance(Class.forName("org.jsoup.parser.Token$CData"));
        setField(term207345, term207345.getClass(), "data", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$Character");
        Object[] args = new Object[1];
        args[0] = term207345;
        try {
            callMethod(klass, "insert", argTypes, term207193, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


