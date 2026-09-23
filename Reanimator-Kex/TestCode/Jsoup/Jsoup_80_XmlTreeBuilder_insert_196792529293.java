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

public class XmlTreeBuilder_insert_196792529293 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term214305;
     Object term214477;

    public XmlTreeBuilder_insert_196792529293() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term214411 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        ArrayList term214357 = new ArrayList();
        ((ArrayList) term214357).add((Object)null);
        ((ArrayList) term214357).add((Object)null);
        ((ArrayList) term214357).add((Object)null);
        ((ArrayList) term214357).add(term214411);
        term214305 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        setField(term214305, term214305.getClass(), "stack", term214357);
        StringBuilder term214537 = new StringBuilder();
        term214477 = newInstance(Class.forName("org.jsoup.parser.Token$Comment"));
        setField(term214477, term214477.getClass(), "data", term214537);
        setBooleanField(term214477, term214477.getClass(), "bogus", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$Comment");
        Object[] args = new Object[1];
        args[0] = term214477;
        try {
            callMethod(klass, "insert", argTypes, term214305, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


