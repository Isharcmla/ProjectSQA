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

public class XmlTreeBuilder_insert_420854838169 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term258132;
     Object term258308;

    public XmlTreeBuilder_insert_420854838169() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term258238 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        ArrayList term258184 = new ArrayList();
        ((ArrayList) term258184).add(term258238);
        term258132 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        setField(term258132, term258132.getClass(), "stack", term258184);
        term258308 = newInstance(Class.forName("org.jsoup.parser.Token$Character"));
        setField(term258308, term258308.getClass(), "data", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$Character");
        Object[] args = new Object[1];
        args[0] = term258308;
        try {
            callMethod(klass, "insert", argTypes, term258132, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


