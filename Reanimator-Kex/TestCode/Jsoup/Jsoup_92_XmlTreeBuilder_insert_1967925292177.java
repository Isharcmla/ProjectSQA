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

public class XmlTreeBuilder_insert_1967925292177 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term261394;
     Object term261566;

    public XmlTreeBuilder_insert_1967925292177() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term261500 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        ArrayList term261446 = new ArrayList();
        ((ArrayList) term261446).add((Object)null);
        ((ArrayList) term261446).add((Object)null);
        ((ArrayList) term261446).add((Object)null);
        ((ArrayList) term261446).add(term261500);
        term261394 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        setField(term261394, term261394.getClass(), "stack", term261446);
        char[] term260952 = (char[]) newCharArray(106);
        StringBuilder term261626 = new StringBuilder();
        ((StringBuilder) term261626).append(term260952);
        term261566 = newInstance(Class.forName("org.jsoup.parser.Token$Comment"));
        setField(term261566, term261566.getClass(), "data", term261626);
        setBooleanField(term261566, term261566.getClass(), "bogus", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$Comment");
        Object[] args = new Object[1];
        args[0] = term261566;
        try {
            callMethod(klass, "insert", argTypes, term261394, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


