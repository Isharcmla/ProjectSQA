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

public class XmlTreeBuilder_insert_42085483855 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term80157;
     Object term80371;

    public XmlTreeBuilder_insert_42085483855() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term80301 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        setField(term80301, term80301.getClass(), "childNodes", null);
        ArrayList term80247 = new ArrayList();
        ((ArrayList) term80247).add((Object)null);
        ((ArrayList) term80247).add((Object)null);
        ((ArrayList) term80247).add((Object)null);
        ((ArrayList) term80247).add(term80301);
        term80157 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        setField(term80157, term80157.getClass(), "baseUri", "");
        setField(term80157, term80157.getClass(), "stack", term80247);
        term80371 = newInstance(Class.forName("org.jsoup.parser.Token$Character"));
        setField(term80371, term80371.getClass(), "data", "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$Character");
        Object[] args = new Object[1];
        args[0] = term80371;
        try {
            callMethod(klass, "insert", argTypes, term80157, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


