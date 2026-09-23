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
import java.lang.StringBuilder;

public class XmlTreeBuilder_insert_1967925292399 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term360750;
     Object term360978;

    public XmlTreeBuilder_insert_1967925292399() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term360840 = newInstance(Class.forName("java.lang.Object"));
        Object term360912 = newInstance(Class.forName("org.jsoup.nodes.PseudoTextElement"));
        setField(term360912, term360912.getClass(), "childNodes", null);
        ArrayList term360802 = new ArrayList();
        ((ArrayList) term360802).add((Object)null);
        ((ArrayList) term360802).add((Object)null);
        ((ArrayList) term360802).add(term360840);
        ((ArrayList) term360802).add(term360912);
        term360750 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        setField(term360750, term360750.getClass(), "stack", term360802);
        char[] term360583 = (char[]) newCharArray(0);
        StringBuilder term361038 = new StringBuilder();
        ((StringBuilder) term361038).append(term360583);
        term360978 = newInstance(Class.forName("org.jsoup.parser.Token$Comment"));
        setField(term360978, term360978.getClass(), "data", term361038);
        setBooleanField(term360978, term360978.getClass(), "bogus", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$Comment");
        Object[] args = new Object[1];
        args[0] = term360978;
        try {
            callMethod(klass, "insert", argTypes, term360750, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


