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

public class XmlTreeBuilder_insert_1967925292117 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term233849;
     Object term234021;

    public XmlTreeBuilder_insert_1967925292117() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term233955 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        setField(term233955, term233955.getClass(), "childNodes", null);
        ArrayList term233901 = new ArrayList();
        ((ArrayList) term233901).add((Object)null);
        ((ArrayList) term233901).add((Object)null);
        ((ArrayList) term233901).add((Object)null);
        ((ArrayList) term233901).add(term233955);
        term233849 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        setField(term233849, term233849.getClass(), "stack", term233901);
        char[] term233684 = (char[]) newCharArray(0);
        StringBuilder term234081 = new StringBuilder();
        ((StringBuilder) term234081).append(term233684);
        term234021 = newInstance(Class.forName("org.jsoup.parser.Token$Comment"));
        setField(term234021, term234021.getClass(), "data", term234081);
        setBooleanField(term234021, term234021.getClass(), "bogus", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$Comment");
        Object[] args = new Object[1];
        args[0] = term234021;
        try {
            callMethod(klass, "insert", argTypes, term233849, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


