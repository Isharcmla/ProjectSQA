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
import java.util.ArrayList;

public class XmlTreeBuilder_popStackToClose_551050621265 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term316891;
     Object term317127;

    public XmlTreeBuilder_popStackToClose_551050621265() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term317063 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        ArrayList term317009 = new ArrayList();
        ((ArrayList) term317009).add((Object)null);
        ((ArrayList) term317009).add((Object)null);
        ((ArrayList) term317009).add((Object)null);
        ((ArrayList) term317009).add((Object)null);
        ((ArrayList) term317009).add((Object)null);
        ((ArrayList) term317009).add((Object)null);
        ((ArrayList) term317009).add((Object)null);
        ((ArrayList) term317009).add((Object)null);
        ((ArrayList) term317009).add((Object)null);
        ((ArrayList) term317009).add((Object)null);
        ((ArrayList) term317009).add((Object)null);
        ((ArrayList) term317009).add(term317063);
        term316891 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        Object term316957 = newInstance(Class.forName("org.jsoup.parser.ParseSettings"));
        setBooleanField(term316957, term316957.getClass(), "preserveTagCase", false);
        setField(term316891, term316891.getClass(), "settings", term316957);
        setField(term316891, term316891.getClass(), "stack", term317009);
        term317127 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        setField(term317127, term317127.getClass(), "tagName", "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$EndTag");
        Object[] args = new Object[1];
        args[0] = term317127;
        try {
            callMethod(klass, "popStackToClose", argTypes, term316891, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


