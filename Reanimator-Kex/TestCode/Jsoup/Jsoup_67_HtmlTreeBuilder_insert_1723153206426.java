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
import java.lang.StringBuilder;

public class HtmlTreeBuilder_insert_1723153206426 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term284266;
     Object term284476;

    public HtmlTreeBuilder_insert_1723153206426() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term284356 = newInstance(Class.forName("java.lang.Object"));
        byte[] term284107 = (byte[]) newByteArray(0);
        Object term284410 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        ArrayList term284318 = new ArrayList();
        ((ArrayList) term284318).add(term284356);
        ((ArrayList) term284318).add((Object)null);
        ((ArrayList) term284318).add((Object)null);
        ((ArrayList) term284318).add((Object)null);
        ((ArrayList) term284318).add((Object)null);
        ((ArrayList) term284318).add((Object)null);
        ((ArrayList) term284318).add(term284107);
        ((ArrayList) term284318).add(term284410);
        term284266 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term284266, term284266.getClass(), "stack", term284318);
        setBooleanField(term284266, term284266.getClass(), "fosterInserts", true);
        StringBuilder term284536 = new StringBuilder();
        term284476 = newInstance(Class.forName("org.jsoup.parser.Token$Comment"));
        setField(term284476, term284476.getClass(), "data", term284536);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$Comment");
        Object[] args = new Object[1];
        args[0] = term284476;
        try {
            callMethod(klass, "insert", argTypes, term284266, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


