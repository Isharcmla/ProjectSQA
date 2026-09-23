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

public class XmlTreeBuilder_insert_42085483879 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term209802;
     Object term209954;

    public XmlTreeBuilder_insert_42085483879() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term209892 = newInstance(Class.forName("java.lang.Object"));
        ArrayList term209854 = new ArrayList();
        ((ArrayList) term209854).add(term209892);
        ((ArrayList) term209854).add(term209892);
        ((ArrayList) term209854).add(term209892);
        ((ArrayList) term209854).add(term209892);
        ((ArrayList) term209854).add(term209892);
        ((ArrayList) term209854).add(term209892);
        ((ArrayList) term209854).add(term209892);
        ((ArrayList) term209854).add(term209892);
        ((ArrayList) term209854).add(term209892);
        ((ArrayList) term209854).add(term209892);
        ((ArrayList) term209854).add(term209892);
        ((ArrayList) term209854).add(term209892);
        ((ArrayList) term209854).add(term209892);
        ((ArrayList) term209854).add(term209892);
        ((ArrayList) term209854).add(term209892);
        ((ArrayList) term209854).add(term209892);
        ((ArrayList) term209854).add(term209892);
        ((ArrayList) term209854).add(term209892);
        ((ArrayList) term209854).add(term209892);
        ((ArrayList) term209854).add(term209892);
        ((ArrayList) term209854).add(term209892);
        ((ArrayList) term209854).add(term209892);
        ((ArrayList) term209854).add(term209892);
        ((ArrayList) term209854).add(term209892);
        ((ArrayList) term209854).add(term209892);
        ((ArrayList) term209854).add(term209892);
        ((ArrayList) term209854).add(term209892);
        ((ArrayList) term209854).add(term209892);
        ((ArrayList) term209854).add(term209892);
        ((ArrayList) term209854).add(term209892);
        ((ArrayList) term209854).add(term209892);
        ((ArrayList) term209854).add(term209892);
        ((ArrayList) term209854).add(term209892);
        ((ArrayList) term209854).add(term209892);
        ((ArrayList) term209854).add(term209892);
        ((ArrayList) term209854).add(term209892);
        ((ArrayList) term209854).add(term209892);
        ((ArrayList) term209854).add(term209892);
        ((ArrayList) term209854).add(term209892);
        ((ArrayList) term209854).add(term209892);
        ((ArrayList) term209854).add(term209892);
        ((ArrayList) term209854).add(term209892);
        ((ArrayList) term209854).add(term209892);
        ((ArrayList) term209854).add(term209892);
        term209802 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        setField(term209802, term209802.getClass(), "stack", term209854);
        term209954 = newInstance(Class.forName("org.jsoup.parser.Token$CData"));
        setField(term209954, term209954.getClass(), "data", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$Character");
        Object[] args = new Object[1];
        args[0] = term209954;
        try {
            callMethod(klass, "insert", argTypes, term209802, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


