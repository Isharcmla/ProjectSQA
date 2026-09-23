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

public class XmlTreeBuilder_insert_1967925292241 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term289087;
     Object term289303;

    public XmlTreeBuilder_insert_1967925292241() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term289177 = newInstance(Class.forName("java.lang.Object"));
        Object term289237 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        ArrayList term289139 = new ArrayList();
        ((ArrayList) term289139).add((Object)null);
        ((ArrayList) term289139).add((Object)null);
        ((ArrayList) term289139).add(term289177);
        ((ArrayList) term289139).add(term289237);
        term289087 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        setField(term289087, term289087.getClass(), "stack", term289139);
        char[] term288927 = (char[]) newCharArray(0);
        StringBuilder term289363 = new StringBuilder();
        ((StringBuilder) term289363).append(term288927);
        term289303 = newInstance(Class.forName("org.jsoup.parser.Token$Comment"));
        setField(term289303, term289303.getClass(), "data", term289363);
        setBooleanField(term289303, term289303.getClass(), "bogus", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$Comment");
        Object[] args = new Object[1];
        args[0] = term289303;
        try {
            callMethod(klass, "insert", argTypes, term289087, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


