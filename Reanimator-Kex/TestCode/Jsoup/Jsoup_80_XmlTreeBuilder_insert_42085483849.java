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

public class XmlTreeBuilder_insert_42085483849 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term190911;
     Object term191025;

    public XmlTreeBuilder_insert_42085483849() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term190963 = new ArrayList();
        term190911 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        setField(term190911, term190911.getClass(), "stack", term190963);
        term191025 = newInstance(Class.forName("org.jsoup.parser.Token$CData"));
        setField(term191025, term191025.getClass(), "data", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$Character");
        Object[] args = new Object[1];
        args[0] = term191025;
        try {
            callMethod(klass, "insert", argTypes, term190911, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


