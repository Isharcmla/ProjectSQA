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

public class XmlTreeBuilder_insert_1967925292297 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term331667;
     Object term331839;

    public XmlTreeBuilder_insert_1967925292297() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term331773 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        setField(term331773, term331773.getClass(), "childNodes", null);
        ArrayList term331719 = new ArrayList();
        ((ArrayList) term331719).add((Object)null);
        ((ArrayList) term331719).add((Object)null);
        ((ArrayList) term331719).add((Object)null);
        ((ArrayList) term331719).add(term331773);
        term331667 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        setField(term331667, term331667.getClass(), "stack", term331719);
        char[] term331503 = (char[]) newCharArray(0);
        StringBuilder term331899 = new StringBuilder();
        ((StringBuilder) term331899).append(term331503);
        term331839 = newInstance(Class.forName("org.jsoup.parser.Token$Comment"));
        setField(term331839, term331839.getClass(), "data", term331899);
        setBooleanField(term331839, term331839.getClass(), "bogus", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$Comment");
        Object[] args = new Object[1];
        args[0] = term331839;
        try {
            callMethod(klass, "insert", argTypes, term331667, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


