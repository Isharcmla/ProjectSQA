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

public class XmlTreeBuilder_insert_196792529298 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term222403;
     Object term222619;

    public XmlTreeBuilder_insert_196792529298() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term222493 = newInstance(Class.forName("java.lang.Object"));
        Object term222553 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        setField(term222553, term222553.getClass(), "childNodes", null);
        ArrayList term222455 = new ArrayList();
        ((ArrayList) term222455).add(term222493);
        ((ArrayList) term222455).add(term222553);
        term222403 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        setField(term222403, term222403.getClass(), "stack", term222455);
        StringBuilder term222679 = new StringBuilder();
        term222619 = newInstance(Class.forName("org.jsoup.parser.Token$Comment"));
        setField(term222619, term222619.getClass(), "data", term222679);
        setBooleanField(term222619, term222619.getClass(), "bogus", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$Comment");
        Object[] args = new Object[1];
        args[0] = term222619;
        try {
            callMethod(klass, "insert", argTypes, term222403, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


