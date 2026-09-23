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

public class XmlTreeBuilder_popStackToClose_551050621127 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term235712;
     Object term236002;

    public XmlTreeBuilder_popStackToClose_551050621127() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term235884 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        Object term235938 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        ArrayList term235830 = new ArrayList();
        ((ArrayList) term235830).add((Object)null);
        ((ArrayList) term235830).add((Object)null);
        ((ArrayList) term235830).add((Object)null);
        ((ArrayList) term235830).add((Object)null);
        ((ArrayList) term235830).add((Object)null);
        ((ArrayList) term235830).add((Object)null);
        ((ArrayList) term235830).add((Object)null);
        ((ArrayList) term235830).add((Object)null);
        ((ArrayList) term235830).add((Object)null);
        ((ArrayList) term235830).add((Object)null);
        ((ArrayList) term235830).add((Object)null);
        ((ArrayList) term235830).add((Object)null);
        ((ArrayList) term235830).add((Object)null);
        ((ArrayList) term235830).add((Object)null);
        ((ArrayList) term235830).add((Object)null);
        ((ArrayList) term235830).add((Object)null);
        ((ArrayList) term235830).add((Object)null);
        ((ArrayList) term235830).add((Object)null);
        ((ArrayList) term235830).add((Object)null);
        ((ArrayList) term235830).add((Object)null);
        ((ArrayList) term235830).add((Object)null);
        ((ArrayList) term235830).add((Object)null);
        ((ArrayList) term235830).add((Object)null);
        ((ArrayList) term235830).add((Object)null);
        ((ArrayList) term235830).add((Object)null);
        ((ArrayList) term235830).add((Object)null);
        ((ArrayList) term235830).add((Object)null);
        ((ArrayList) term235830).add((Object)null);
        ((ArrayList) term235830).add((Object)null);
        ((ArrayList) term235830).add((Object)null);
        ((ArrayList) term235830).add(term235884);
        ((ArrayList) term235830).add(term235938);
        term235712 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        Object term235778 = newInstance(Class.forName("org.jsoup.parser.ParseSettings"));
        setBooleanField(term235778, term235778.getClass(), "preserveTagCase", false);
        setField(term235712, term235712.getClass(), "settings", term235778);
        setField(term235712, term235712.getClass(), "stack", term235830);
        term236002 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        setField(term236002, term236002.getClass(), "tagName", "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$EndTag");
        Object[] args = new Object[1];
        args[0] = term236002;
        try {
            callMethod(klass, "popStackToClose", argTypes, term235712, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


