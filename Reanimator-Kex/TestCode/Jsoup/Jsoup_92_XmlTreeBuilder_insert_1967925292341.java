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

public class XmlTreeBuilder_insert_1967925292341 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term336983;
     Object term337199;

    public XmlTreeBuilder_insert_1967925292341() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term337073 = newInstance(Class.forName("java.lang.Object"));
        Object term337133 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        setField(term337133, term337133.getClass(), "childNodes", null);
        ArrayList term337035 = new ArrayList();
        ((ArrayList) term337035).add(term337073);
        ((ArrayList) term337035).add(term337133);
        term336983 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        setField(term336983, term336983.getClass(), "stack", term337035);
        StringBuilder term337259 = new StringBuilder();
        term337199 = newInstance(Class.forName("org.jsoup.parser.Token$Comment"));
        setField(term337199, term337199.getClass(), "data", term337259);
        setBooleanField(term337199, term337199.getClass(), "bogus", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$Comment");
        Object[] args = new Object[1];
        args[0] = term337199;
        try {
            callMethod(klass, "insert", argTypes, term336983, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


