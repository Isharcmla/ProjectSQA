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
     Object term258524;
     Object term258752;

    public XmlTreeBuilder_insert_1967925292177() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term258614 = newInstance(Class.forName("java.lang.Object"));
        Object term258686 = newInstance(Class.forName("org.jsoup.nodes.PseudoTextElement"));
        setField(term258686, term258686.getClass(), "childNodes", null);
        ArrayList term258576 = new ArrayList();
        ((ArrayList) term258576).add((Object)null);
        ((ArrayList) term258576).add((Object)null);
        ((ArrayList) term258576).add(term258614);
        ((ArrayList) term258576).add(term258686);
        term258524 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        setField(term258524, term258524.getClass(), "stack", term258576);
        char[] term258359 = (char[]) newCharArray(0);
        StringBuilder term258812 = new StringBuilder();
        ((StringBuilder) term258812).append(term258359);
        term258752 = newInstance(Class.forName("org.jsoup.parser.Token$Comment"));
        setField(term258752, term258752.getClass(), "data", term258812);
        setBooleanField(term258752, term258752.getClass(), "bogus", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$Comment");
        Object[] args = new Object[1];
        args[0] = term258752;
        try {
            callMethod(klass, "insert", argTypes, term258524, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


