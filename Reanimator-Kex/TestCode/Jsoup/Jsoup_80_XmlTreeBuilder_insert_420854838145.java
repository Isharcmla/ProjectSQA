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

public class XmlTreeBuilder_insert_420854838145 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term245096;
     Object term245302;

    public XmlTreeBuilder_insert_420854838145() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term245186 = newInstance(Class.forName("java.lang.Object"));
        Object term245240 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        ArrayList term245148 = new ArrayList();
        ((ArrayList) term245148).add(term245186);
        ((ArrayList) term245148).add(term245186);
        ((ArrayList) term245148).add(term245186);
        ((ArrayList) term245148).add(term245186);
        ((ArrayList) term245148).add(term245186);
        ((ArrayList) term245148).add(term245186);
        ((ArrayList) term245148).add(term245186);
        ((ArrayList) term245148).add(term245186);
        ((ArrayList) term245148).add(term245186);
        ((ArrayList) term245148).add(term245186);
        ((ArrayList) term245148).add(term245186);
        ((ArrayList) term245148).add(term245186);
        ((ArrayList) term245148).add(term245186);
        ((ArrayList) term245148).add(term245186);
        ((ArrayList) term245148).add(term245186);
        ((ArrayList) term245148).add(term245186);
        ((ArrayList) term245148).add(term245186);
        ((ArrayList) term245148).add(term245186);
        ((ArrayList) term245148).add(term245186);
        ((ArrayList) term245148).add(term245186);
        ((ArrayList) term245148).add(term245186);
        ((ArrayList) term245148).add(term245186);
        ((ArrayList) term245148).add(term245186);
        ((ArrayList) term245148).add(term245186);
        ((ArrayList) term245148).add(term245186);
        ((ArrayList) term245148).add(term245186);
        ((ArrayList) term245148).add(term245186);
        ((ArrayList) term245148).add(term245186);
        ((ArrayList) term245148).add(term245186);
        ((ArrayList) term245148).add(term245186);
        ((ArrayList) term245148).add(term245186);
        ((ArrayList) term245148).add(term245186);
        ((ArrayList) term245148).add(term245186);
        ((ArrayList) term245148).add(term245186);
        ((ArrayList) term245148).add(term245186);
        ((ArrayList) term245148).add(term245186);
        ((ArrayList) term245148).add(term245186);
        ((ArrayList) term245148).add(term245186);
        ((ArrayList) term245148).add(term245186);
        ((ArrayList) term245148).add(term245186);
        ((ArrayList) term245148).add(term245186);
        ((ArrayList) term245148).add(term245186);
        ((ArrayList) term245148).add(term245186);
        ((ArrayList) term245148).add(term245186);
        ((ArrayList) term245148).add(term245186);
        ((ArrayList) term245148).add(term245186);
        ((ArrayList) term245148).add(term245186);
        ((ArrayList) term245148).add(term245186);
        ((ArrayList) term245148).add(term245186);
        ((ArrayList) term245148).add(term245186);
        ((ArrayList) term245148).add(term245186);
        ((ArrayList) term245148).add(term245186);
        ((ArrayList) term245148).add(term245186);
        ((ArrayList) term245148).add(term245186);
        ((ArrayList) term245148).add(term245186);
        ((ArrayList) term245148).add(term245186);
        ((ArrayList) term245148).add(term245186);
        ((ArrayList) term245148).add(term245186);
        ((ArrayList) term245148).add(term245186);
        ((ArrayList) term245148).add(term245186);
        ((ArrayList) term245148).add(term245186);
        ((ArrayList) term245148).add(term245186);
        ((ArrayList) term245148).add(term245186);
        ((ArrayList) term245148).add(term245240);
        term245096 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        setField(term245096, term245096.getClass(), "stack", term245148);
        term245302 = newInstance(Class.forName("org.jsoup.parser.Token$CData"));
        setField(term245302, term245302.getClass(), "data", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$Character");
        Object[] args = new Object[1];
        args[0] = term245302;
        try {
            callMethod(klass, "insert", argTypes, term245096, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


