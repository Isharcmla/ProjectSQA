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

public class XmlTreeBuilder_insert_42085483895 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term219008;
     Object term219214;

    public XmlTreeBuilder_insert_42085483895() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term219098 = newInstance(Class.forName("java.lang.Object"));
        Object term219152 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        ArrayList term219060 = new ArrayList();
        ((ArrayList) term219060).add(term219098);
        ((ArrayList) term219060).add(term219098);
        ((ArrayList) term219060).add(term219098);
        ((ArrayList) term219060).add(term219098);
        ((ArrayList) term219060).add(term219098);
        ((ArrayList) term219060).add(term219098);
        ((ArrayList) term219060).add(term219098);
        ((ArrayList) term219060).add(term219098);
        ((ArrayList) term219060).add(term219098);
        ((ArrayList) term219060).add(term219098);
        ((ArrayList) term219060).add(term219098);
        ((ArrayList) term219060).add(term219098);
        ((ArrayList) term219060).add(term219098);
        ((ArrayList) term219060).add(term219098);
        ((ArrayList) term219060).add(term219098);
        ((ArrayList) term219060).add(term219098);
        ((ArrayList) term219060).add(term219098);
        ((ArrayList) term219060).add(term219098);
        ((ArrayList) term219060).add(term219098);
        ((ArrayList) term219060).add(term219098);
        ((ArrayList) term219060).add(term219098);
        ((ArrayList) term219060).add(term219098);
        ((ArrayList) term219060).add(term219098);
        ((ArrayList) term219060).add(term219098);
        ((ArrayList) term219060).add(term219098);
        ((ArrayList) term219060).add(term219098);
        ((ArrayList) term219060).add(term219098);
        ((ArrayList) term219060).add(term219098);
        ((ArrayList) term219060).add(term219098);
        ((ArrayList) term219060).add(term219098);
        ((ArrayList) term219060).add(term219098);
        ((ArrayList) term219060).add(term219098);
        ((ArrayList) term219060).add(term219098);
        ((ArrayList) term219060).add(term219098);
        ((ArrayList) term219060).add(term219098);
        ((ArrayList) term219060).add(term219098);
        ((ArrayList) term219060).add(term219098);
        ((ArrayList) term219060).add(term219098);
        ((ArrayList) term219060).add(term219098);
        ((ArrayList) term219060).add(term219098);
        ((ArrayList) term219060).add(term219098);
        ((ArrayList) term219060).add(term219098);
        ((ArrayList) term219060).add(term219098);
        ((ArrayList) term219060).add(term219098);
        ((ArrayList) term219060).add(term219098);
        ((ArrayList) term219060).add(term219098);
        ((ArrayList) term219060).add(term219098);
        ((ArrayList) term219060).add(term219098);
        ((ArrayList) term219060).add(term219098);
        ((ArrayList) term219060).add(term219098);
        ((ArrayList) term219060).add(term219098);
        ((ArrayList) term219060).add(term219098);
        ((ArrayList) term219060).add(term219098);
        ((ArrayList) term219060).add(term219098);
        ((ArrayList) term219060).add(term219098);
        ((ArrayList) term219060).add(term219098);
        ((ArrayList) term219060).add(term219098);
        ((ArrayList) term219060).add(term219098);
        ((ArrayList) term219060).add(term219098);
        ((ArrayList) term219060).add(term219098);
        ((ArrayList) term219060).add(term219098);
        ((ArrayList) term219060).add(term219098);
        ((ArrayList) term219060).add(term219098);
        ((ArrayList) term219060).add(term219152);
        term219008 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        setField(term219008, term219008.getClass(), "stack", term219060);
        term219214 = newInstance(Class.forName("org.jsoup.parser.Token$CData"));
        setField(term219214, term219214.getClass(), "data", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$Character");
        Object[] args = new Object[1];
        args[0] = term219214;
        try {
            callMethod(klass, "insert", argTypes, term219008, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


