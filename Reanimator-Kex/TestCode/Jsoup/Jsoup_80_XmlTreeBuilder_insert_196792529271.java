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
     Object term202063;
     Object term202241;

    public XmlTreeBuilder_insert_196792529271() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuilder term202271 = new StringBuilder();
        Object[] term201959 = (Object[]) newArray("java.lang.Object", 2);
        setElement(term201959, 0, term202271);
        setElement(term201959, 1, term201959);
        ArrayList term202115 = new ArrayList();
        ((ArrayList) term202115).add(term202271);
        ((ArrayList) term202115).add((Object)term201959);
        term202063 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        setField(term202063, term202063.getClass(), "stack", term202115);
        term202241 = newInstance(Class.forName("org.jsoup.parser.Token$Comment"));
        setField(term202241, term202241.getClass(), "data", term202271);
        setBooleanField(term202241, term202241.getClass(), "bogus", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$Comment");
        Object[] args = new Object[1];
        args[0] = term202241;
        try {
            callMethod(klass, "insert", argTypes, term202063, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


