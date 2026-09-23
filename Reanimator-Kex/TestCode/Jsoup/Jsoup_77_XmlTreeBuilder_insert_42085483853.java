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

public class XmlTreeBuilder_insert_42085483853 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term199692;
     Object term199806;

    public XmlTreeBuilder_insert_42085483853() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term199744 = new ArrayList();
        term199692 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        setField(term199692, term199692.getClass(), "stack", term199744);
        term199806 = newInstance(Class.forName("org.jsoup.parser.Token$CData"));
        setField(term199806, term199806.getClass(), "data", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$Character");
        Object[] args = new Object[1];
        args[0] = term199806;
        try {
            callMethod(klass, "insert", argTypes, term199692, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


