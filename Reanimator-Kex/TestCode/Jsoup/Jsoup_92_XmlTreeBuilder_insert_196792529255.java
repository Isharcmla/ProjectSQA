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
import java.lang.StringBuilder;

public class XmlTreeBuilder_insert_196792529255 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term198377;
     Object term198495;

    public XmlTreeBuilder_insert_196792529255() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term198429 = new ArrayList();
        term198377 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        setField(term198377, term198377.getClass(), "stack", term198429);
        char[] term198021 = (char[]) newCharArray(32);
        setCharElement(term198021, 0, (char) 1);
        setCharElement(term198021, 1, 'm');
        setCharElement(term198021, 2, 'm');
        setCharElement(term198021, 3, 'm');
        setCharElement(term198021, 4, 'm');
        setCharElement(term198021, 5, 'm');
        setCharElement(term198021, 6, 'm');
        setCharElement(term198021, 7, 'm');
        setCharElement(term198021, 8, 'm');
        setCharElement(term198021, 9, 'm');
        setCharElement(term198021, 10, 'm');
        setCharElement(term198021, 11, 'm');
        setCharElement(term198021, 12, 'm');
        setCharElement(term198021, 13, 'm');
        setCharElement(term198021, 14, 'm');
        setCharElement(term198021, 15, 'm');
        setCharElement(term198021, 16, 'm');
        setCharElement(term198021, 17, 'm');
        setCharElement(term198021, 18, 'm');
        setCharElement(term198021, 19, 'm');
        setCharElement(term198021, 20, 'm');
        setCharElement(term198021, 21, 'm');
        setCharElement(term198021, 22, 'm');
        setCharElement(term198021, 23, 'm');
        setCharElement(term198021, 24, 'm');
        setCharElement(term198021, 25, 'm');
        setCharElement(term198021, 26, 'm');
        setCharElement(term198021, 27, 'm');
        setCharElement(term198021, 28, 'm');
        setCharElement(term198021, 29, 'm');
        setCharElement(term198021, 30, 'm');
        setCharElement(term198021, 31, 'm');
        StringBuilder term198555 = new StringBuilder();
        ((StringBuilder) term198555).append(term198021);
        term198495 = newInstance(Class.forName("org.jsoup.parser.Token$Comment"));
        setField(term198495, term198495.getClass(), "data", term198555);
        setBooleanField(term198495, term198495.getClass(), "bogus", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$Comment");
        Object[] args = new Object[1];
        args[0] = term198495;
        try {
            callMethod(klass, "insert", argTypes, term198377, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


