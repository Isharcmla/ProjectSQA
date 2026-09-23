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

public class XmlTreeBuilder_insert_1967925292110 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term224997;
     Object term225169;

    public XmlTreeBuilder_insert_1967925292110() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term225103 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        ArrayList term225049 = new ArrayList();
        ((ArrayList) term225049).add((Object)null);
        ((ArrayList) term225049).add((Object)null);
        ((ArrayList) term225049).add((Object)null);
        ((ArrayList) term225049).add(term225103);
        term224997 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        setField(term224997, term224997.getClass(), "stack", term225049);
        char[] term224555 = (char[]) newCharArray(106);
        StringBuilder term225229 = new StringBuilder();
        ((StringBuilder) term225229).append(term224555);
        term225169 = newInstance(Class.forName("org.jsoup.parser.Token$Comment"));
        setField(term225169, term225169.getClass(), "data", term225229);
        setBooleanField(term225169, term225169.getClass(), "bogus", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$Comment");
        Object[] args = new Object[1];
        args[0] = term225169;
        try {
            callMethod(klass, "insert", argTypes, term224997, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


