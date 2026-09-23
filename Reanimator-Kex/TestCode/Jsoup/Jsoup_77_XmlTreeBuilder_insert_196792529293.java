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
     Object term220948;
     Object term221120;

    public XmlTreeBuilder_insert_196792529293() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term221054 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        ArrayList term221000 = new ArrayList();
        ((ArrayList) term221000).add((Object)null);
        ((ArrayList) term221000).add((Object)null);
        ((ArrayList) term221000).add((Object)null);
        ((ArrayList) term221000).add(term221054);
        term220948 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        setField(term220948, term220948.getClass(), "stack", term221000);
        StringBuilder term221180 = new StringBuilder();
        term221120 = newInstance(Class.forName("org.jsoup.parser.Token$Comment"));
        setField(term221120, term221120.getClass(), "data", term221180);
        setBooleanField(term221120, term221120.getClass(), "bogus", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$Comment");
        Object[] args = new Object[1];
        args[0] = term221120;
        try {
            callMethod(klass, "insert", argTypes, term220948, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


