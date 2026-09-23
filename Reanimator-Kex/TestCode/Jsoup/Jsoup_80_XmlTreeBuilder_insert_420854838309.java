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

public class XmlTreeBuilder_insert_420854838309 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term336964;
     Object term337170;

    public XmlTreeBuilder_insert_420854838309() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term337054 = newInstance(Class.forName("java.lang.Object"));
        Object term337108 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        ArrayList term337016 = new ArrayList();
        ((ArrayList) term337016).add(term337054);
        ((ArrayList) term337016).add(term337054);
        ((ArrayList) term337016).add(term337054);
        ((ArrayList) term337016).add(term337054);
        ((ArrayList) term337016).add(term337054);
        ((ArrayList) term337016).add(term337054);
        ((ArrayList) term337016).add(term337054);
        ((ArrayList) term337016).add(term337054);
        ((ArrayList) term337016).add(term337054);
        ((ArrayList) term337016).add(term337054);
        ((ArrayList) term337016).add(term337054);
        ((ArrayList) term337016).add(term337054);
        ((ArrayList) term337016).add(term337054);
        ((ArrayList) term337016).add(term337054);
        ((ArrayList) term337016).add(term337054);
        ((ArrayList) term337016).add(term337054);
        ((ArrayList) term337016).add(term337054);
        ((ArrayList) term337016).add(term337054);
        ((ArrayList) term337016).add(term337054);
        ((ArrayList) term337016).add(term337054);
        ((ArrayList) term337016).add(term337054);
        ((ArrayList) term337016).add(term337054);
        ((ArrayList) term337016).add(term337054);
        ((ArrayList) term337016).add(term337054);
        ((ArrayList) term337016).add(term337054);
        ((ArrayList) term337016).add(term337054);
        ((ArrayList) term337016).add(term337054);
        ((ArrayList) term337016).add(term337054);
        ((ArrayList) term337016).add(term337054);
        ((ArrayList) term337016).add(term337054);
        ((ArrayList) term337016).add(term337054);
        ((ArrayList) term337016).add(term337054);
        ((ArrayList) term337016).add(term337054);
        ((ArrayList) term337016).add(term337054);
        ((ArrayList) term337016).add(term337054);
        ((ArrayList) term337016).add(term337054);
        ((ArrayList) term337016).add(term337054);
        ((ArrayList) term337016).add(term337054);
        ((ArrayList) term337016).add(term337054);
        ((ArrayList) term337016).add(term337054);
        ((ArrayList) term337016).add(term337054);
        ((ArrayList) term337016).add(term337054);
        ((ArrayList) term337016).add(term337054);
        ((ArrayList) term337016).add(term337054);
        ((ArrayList) term337016).add(term337054);
        ((ArrayList) term337016).add(term337054);
        ((ArrayList) term337016).add(term337054);
        ((ArrayList) term337016).add(term337054);
        ((ArrayList) term337016).add(term337054);
        ((ArrayList) term337016).add(term337054);
        ((ArrayList) term337016).add(term337054);
        ((ArrayList) term337016).add(term337054);
        ((ArrayList) term337016).add(term337054);
        ((ArrayList) term337016).add(term337054);
        ((ArrayList) term337016).add(term337054);
        ((ArrayList) term337016).add(term337054);
        ((ArrayList) term337016).add(term337054);
        ((ArrayList) term337016).add(term337054);
        ((ArrayList) term337016).add(term337054);
        ((ArrayList) term337016).add(term337054);
        ((ArrayList) term337016).add(term337054);
        ((ArrayList) term337016).add(term337054);
        ((ArrayList) term337016).add(term337054);
        ((ArrayList) term337016).add(term337108);
        term336964 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        setField(term336964, term336964.getClass(), "stack", term337016);
        term337170 = newInstance(Class.forName("org.jsoup.parser.Token$CData"));
        setField(term337170, term337170.getClass(), "data", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$Character");
        Object[] args = new Object[1];
        args[0] = term337170;
        try {
            callMethod(klass, "insert", argTypes, term336964, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


