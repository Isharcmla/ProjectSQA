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

public class XmlTreeBuilder_insert_1967925292597 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term449545;
     Object term449717;

    public XmlTreeBuilder_insert_1967925292597() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term449651 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        setField(term449651, term449651.getClass(), "childNodes", null);
        ArrayList term449597 = new ArrayList();
        ((ArrayList) term449597).add((Object)null);
        ((ArrayList) term449597).add((Object)null);
        ((ArrayList) term449597).add((Object)null);
        ((ArrayList) term449597).add(term449651);
        term449545 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        setField(term449545, term449545.getClass(), "stack", term449597);
        char[] term449263 = (char[]) newCharArray(49);
        setCharElement(term449263, 1, (char) 16);
        setCharElement(term449263, 2, (char) 16);
        setCharElement(term449263, 3, (char) 16);
        setCharElement(term449263, 4, (char) 16);
        setCharElement(term449263, 5, (char) 16);
        setCharElement(term449263, 6, (char) 16);
        setCharElement(term449263, 7, (char) 16);
        setCharElement(term449263, 8, (char) 16);
        setCharElement(term449263, 9, (char) 16);
        setCharElement(term449263, 10, (char) 16);
        setCharElement(term449263, 11, (char) 16);
        setCharElement(term449263, 12, (char) 16);
        setCharElement(term449263, 13, (char) 16);
        setCharElement(term449263, 14, (char) 16);
        setCharElement(term449263, 15, (char) 16);
        setCharElement(term449263, 16, (char) 16);
        setCharElement(term449263, 17, (char) 16);
        setCharElement(term449263, 18, (char) 16);
        setCharElement(term449263, 19, (char) 16);
        setCharElement(term449263, 20, (char) 16);
        setCharElement(term449263, 21, (char) 16);
        setCharElement(term449263, 22, (char) 16);
        setCharElement(term449263, 23, (char) 16);
        setCharElement(term449263, 24, (char) 16);
        setCharElement(term449263, 25, (char) 16);
        setCharElement(term449263, 26, (char) 16);
        setCharElement(term449263, 27, (char) 16);
        setCharElement(term449263, 28, (char) 16);
        setCharElement(term449263, 29, (char) 16);
        setCharElement(term449263, 30, (char) 16);
        setCharElement(term449263, 31, (char) 16);
        setCharElement(term449263, 32, (char) 16);
        setCharElement(term449263, 33, (char) 16);
        setCharElement(term449263, 34, (char) 16);
        setCharElement(term449263, 35, (char) 16);
        setCharElement(term449263, 36, (char) 16);
        setCharElement(term449263, 37, (char) 16);
        setCharElement(term449263, 38, (char) 16);
        setCharElement(term449263, 39, (char) 16);
        setCharElement(term449263, 40, (char) 16);
        setCharElement(term449263, 41, (char) 16);
        setCharElement(term449263, 42, (char) 16);
        setCharElement(term449263, 43, (char) 16);
        setCharElement(term449263, 44, (char) 16);
        setCharElement(term449263, 45, (char) 16);
        setCharElement(term449263, 46, (char) 16);
        setCharElement(term449263, 47, (char) 16);
        setCharElement(term449263, 48, (char) 16);
        StringBuilder term449777 = new StringBuilder();
        ((StringBuilder) term449777).append(term449263);
        term449717 = newInstance(Class.forName("org.jsoup.parser.Token$Comment"));
        setField(term449717, term449717.getClass(), "data", term449777);
        setBooleanField(term449717, term449717.getClass(), "bogus", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$Comment");
        Object[] args = new Object[1];
        args[0] = term449717;
        try {
            callMethod(klass, "insert", argTypes, term449545, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


