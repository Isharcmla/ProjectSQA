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

public class XmlTreeBuilder_insert_1967925292665 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term477263;
     Object term477381;

    public XmlTreeBuilder_insert_1967925292665() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term477315 = new ArrayList();
        ((ArrayList) term477315).add((Object)null);
        ((ArrayList) term477315).add((Object)null);
        ((ArrayList) term477315).add((Object)null);
        ((ArrayList) term477315).add((Object)null);
        ((ArrayList) term477315).add((Object)null);
        ((ArrayList) term477315).add((Object)null);
        ((ArrayList) term477315).add((Object)null);
        ((ArrayList) term477315).add((Object)null);
        ((ArrayList) term477315).add((Object)null);
        ((ArrayList) term477315).add((Object)null);
        term477263 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        setField(term477263, term477263.getClass(), "stack", term477315);
        char[] term477120 = (char[]) newCharArray(9);
        setCharElement(term477120, 0, (char) 4096);
        StringBuilder term477441 = new StringBuilder();
        ((StringBuilder) term477441).append(term477120);
        term477381 = newInstance(Class.forName("org.jsoup.parser.Token$Comment"));
        setField(term477381, term477381.getClass(), "data", term477441);
        setBooleanField(term477381, term477381.getClass(), "bogus", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$Comment");
        Object[] args = new Object[1];
        args[0] = term477381;
        try {
            callMethod(klass, "insert", argTypes, term477263, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


