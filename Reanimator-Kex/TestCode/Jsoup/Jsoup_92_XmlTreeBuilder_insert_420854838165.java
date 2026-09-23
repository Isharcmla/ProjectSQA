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

public class XmlTreeBuilder_insert_420854838165 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term256973;
     Object term257179;

    public XmlTreeBuilder_insert_420854838165() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term257063 = newInstance(Class.forName("java.lang.Object"));
        Object term257117 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        ArrayList term257025 = new ArrayList();
        ((ArrayList) term257025).add(term257063);
        ((ArrayList) term257025).add(term257063);
        ((ArrayList) term257025).add(term257063);
        ((ArrayList) term257025).add(term257063);
        ((ArrayList) term257025).add(term257063);
        ((ArrayList) term257025).add(term257063);
        ((ArrayList) term257025).add(term257063);
        ((ArrayList) term257025).add(term257063);
        ((ArrayList) term257025).add(term257063);
        ((ArrayList) term257025).add(term257063);
        ((ArrayList) term257025).add(term257063);
        ((ArrayList) term257025).add(term257063);
        ((ArrayList) term257025).add(term257063);
        ((ArrayList) term257025).add(term257063);
        ((ArrayList) term257025).add(term257063);
        ((ArrayList) term257025).add(term257063);
        ((ArrayList) term257025).add(term257063);
        ((ArrayList) term257025).add(term257063);
        ((ArrayList) term257025).add(term257063);
        ((ArrayList) term257025).add(term257063);
        ((ArrayList) term257025).add(term257063);
        ((ArrayList) term257025).add(term257063);
        ((ArrayList) term257025).add(term257063);
        ((ArrayList) term257025).add(term257063);
        ((ArrayList) term257025).add(term257063);
        ((ArrayList) term257025).add(term257063);
        ((ArrayList) term257025).add(term257063);
        ((ArrayList) term257025).add(term257063);
        ((ArrayList) term257025).add(term257063);
        ((ArrayList) term257025).add(term257063);
        ((ArrayList) term257025).add(term257063);
        ((ArrayList) term257025).add(term257063);
        ((ArrayList) term257025).add(term257063);
        ((ArrayList) term257025).add(term257063);
        ((ArrayList) term257025).add(term257063);
        ((ArrayList) term257025).add(term257063);
        ((ArrayList) term257025).add(term257063);
        ((ArrayList) term257025).add(term257063);
        ((ArrayList) term257025).add(term257063);
        ((ArrayList) term257025).add(term257063);
        ((ArrayList) term257025).add(term257063);
        ((ArrayList) term257025).add(term257063);
        ((ArrayList) term257025).add(term257063);
        ((ArrayList) term257025).add(term257063);
        ((ArrayList) term257025).add(term257063);
        ((ArrayList) term257025).add(term257063);
        ((ArrayList) term257025).add(term257063);
        ((ArrayList) term257025).add(term257063);
        ((ArrayList) term257025).add(term257063);
        ((ArrayList) term257025).add(term257063);
        ((ArrayList) term257025).add(term257063);
        ((ArrayList) term257025).add(term257063);
        ((ArrayList) term257025).add(term257063);
        ((ArrayList) term257025).add(term257063);
        ((ArrayList) term257025).add(term257063);
        ((ArrayList) term257025).add(term257063);
        ((ArrayList) term257025).add(term257063);
        ((ArrayList) term257025).add(term257063);
        ((ArrayList) term257025).add(term257063);
        ((ArrayList) term257025).add(term257063);
        ((ArrayList) term257025).add(term257063);
        ((ArrayList) term257025).add(term257063);
        ((ArrayList) term257025).add(term257063);
        ((ArrayList) term257025).add(term257117);
        term256973 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        setField(term256973, term256973.getClass(), "stack", term257025);
        term257179 = newInstance(Class.forName("org.jsoup.parser.Token$CData"));
        setField(term257179, term257179.getClass(), "data", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$Character");
        Object[] args = new Object[1];
        args[0] = term257179;
        try {
            callMethod(klass, "insert", argTypes, term256973, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


