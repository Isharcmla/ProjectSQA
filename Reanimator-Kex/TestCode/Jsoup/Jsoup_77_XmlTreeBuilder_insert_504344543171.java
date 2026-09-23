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
import java.lang.Object;
import java.lang.StringBuilder;

public class XmlTreeBuilder_insert_504344543171 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term291461;
     Object term291593;

    public XmlTreeBuilder_insert_504344543171() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term291461 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        Object term291527 = newInstance(Class.forName("org.jsoup.parser.ParseSettings"));
        setBooleanField(term291527, term291527.getClass(), "preserveTagCase", true);
        setField(term291461, term291461.getClass(), "settings", term291527);
        StringBuilder term291653 = new StringBuilder();
        StringBuilder term291713 = new StringBuilder();
        StringBuilder term291773 = new StringBuilder();
        term291593 = newInstance(Class.forName("org.jsoup.parser.Token$Doctype"));
        setField(term291593, term291593.getClass(), "name", term291653);
        setField(term291593, term291593.getClass(), "publicIdentifier", term291713);
        setField(term291593, term291593.getClass(), "systemIdentifier", term291773);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$Doctype");
        Object[] args = new Object[1];
        args[0] = term291593;
        try {
            callMethod(klass, "insert", argTypes, term291461, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


