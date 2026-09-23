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

public class XmlTreeBuilder_popStackToClose_551050621707 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term560053;
     Object term560435;

    public XmlTreeBuilder_popStackToClose_551050621707() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term560263 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        Object term560317 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        Object term560371 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        ArrayList term560171 = new ArrayList();
        ((ArrayList) term560171).add("");
        ((ArrayList) term560171).add((Object)null);
        ((ArrayList) term560171).add((Object)null);
        ((ArrayList) term560171).add((Object)null);
        ((ArrayList) term560171).add((Object)null);
        ((ArrayList) term560171).add((Object)null);
        ((ArrayList) term560171).add((Object)null);
        ((ArrayList) term560171).add((Object)null);
        ((ArrayList) term560171).add((Object)null);
        ((ArrayList) term560171).add((Object)null);
        ((ArrayList) term560171).add((Object)null);
        ((ArrayList) term560171).add((Object)null);
        ((ArrayList) term560171).add((Object)null);
        ((ArrayList) term560171).add((Object)null);
        ((ArrayList) term560171).add((Object)null);
        ((ArrayList) term560171).add((Object)null);
        ((ArrayList) term560171).add((Object)null);
        ((ArrayList) term560171).add((Object)null);
        ((ArrayList) term560171).add((Object)null);
        ((ArrayList) term560171).add((Object)null);
        ((ArrayList) term560171).add((Object)null);
        ((ArrayList) term560171).add((Object)null);
        ((ArrayList) term560171).add((Object)null);
        ((ArrayList) term560171).add((Object)null);
        ((ArrayList) term560171).add((Object)null);
        ((ArrayList) term560171).add((Object)null);
        ((ArrayList) term560171).add((Object)null);
        ((ArrayList) term560171).add((Object)null);
        ((ArrayList) term560171).add((Object)null);
        ((ArrayList) term560171).add((Object)null);
        ((ArrayList) term560171).add((Object)null);
        ((ArrayList) term560171).add((Object)null);
        ((ArrayList) term560171).add((Object)null);
        ((ArrayList) term560171).add((Object)null);
        ((ArrayList) term560171).add((Object)null);
        ((ArrayList) term560171).add((Object)null);
        ((ArrayList) term560171).add((Object)null);
        ((ArrayList) term560171).add((Object)null);
        ((ArrayList) term560171).add((Object)null);
        ((ArrayList) term560171).add((Object)null);
        ((ArrayList) term560171).add((Object)null);
        ((ArrayList) term560171).add((Object)null);
        ((ArrayList) term560171).add((Object)null);
        ((ArrayList) term560171).add((Object)null);
        ((ArrayList) term560171).add((Object)null);
        ((ArrayList) term560171).add((Object)null);
        ((ArrayList) term560171).add((Object)null);
        ((ArrayList) term560171).add((Object)null);
        ((ArrayList) term560171).add((Object)null);
        ((ArrayList) term560171).add((Object)null);
        ((ArrayList) term560171).add((Object)null);
        ((ArrayList) term560171).add((Object)null);
        ((ArrayList) term560171).add((Object)null);
        ((ArrayList) term560171).add((Object)null);
        ((ArrayList) term560171).add((Object)null);
        ((ArrayList) term560171).add((Object)null);
        ((ArrayList) term560171).add((Object)null);
        ((ArrayList) term560171).add((Object)null);
        ((ArrayList) term560171).add((Object)null);
        ((ArrayList) term560171).add((Object)null);
        ((ArrayList) term560171).add((Object)null);
        ((ArrayList) term560171).add((Object)null);
        ((ArrayList) term560171).add((Object)null);
        ((ArrayList) term560171).add((Object)null);
        ((ArrayList) term560171).add((Object)null);
        ((ArrayList) term560171).add((Object)null);
        ((ArrayList) term560171).add((Object)null);
        ((ArrayList) term560171).add((Object)null);
        ((ArrayList) term560171).add((Object)null);
        ((ArrayList) term560171).add((Object)null);
        ((ArrayList) term560171).add((Object)null);
        ((ArrayList) term560171).add((Object)null);
        ((ArrayList) term560171).add((Object)null);
        ((ArrayList) term560171).add((Object)null);
        ((ArrayList) term560171).add((Object)null);
        ((ArrayList) term560171).add((Object)null);
        ((ArrayList) term560171).add((Object)null);
        ((ArrayList) term560171).add((Object)null);
        ((ArrayList) term560171).add((Object)null);
        ((ArrayList) term560171).add((Object)null);
        ((ArrayList) term560171).add((Object)null);
        ((ArrayList) term560171).add((Object)null);
        ((ArrayList) term560171).add((Object)null);
        ((ArrayList) term560171).add((Object)null);
        ((ArrayList) term560171).add((Object)null);
        ((ArrayList) term560171).add((Object)null);
        ((ArrayList) term560171).add((Object)null);
        ((ArrayList) term560171).add((Object)null);
        ((ArrayList) term560171).add((Object)null);
        ((ArrayList) term560171).add((Object)null);
        ((ArrayList) term560171).add((Object)null);
        ((ArrayList) term560171).add((Object)null);
        ((ArrayList) term560171).add((Object)null);
        ((ArrayList) term560171).add((Object)null);
        ((ArrayList) term560171).add((Object)null);
        ((ArrayList) term560171).add((Object)null);
        ((ArrayList) term560171).add((Object)null);
        ((ArrayList) term560171).add((Object)null);
        ((ArrayList) term560171).add((Object)null);
        ((ArrayList) term560171).add((Object)null);
        ((ArrayList) term560171).add((Object)null);
        ((ArrayList) term560171).add((Object)null);
        ((ArrayList) term560171).add((Object)null);
        ((ArrayList) term560171).add((Object)null);
        ((ArrayList) term560171).add((Object)null);
        ((ArrayList) term560171).add((Object)null);
        ((ArrayList) term560171).add((Object)null);
        ((ArrayList) term560171).add((Object)null);
        ((ArrayList) term560171).add((Object)null);
        ((ArrayList) term560171).add((Object)null);
        ((ArrayList) term560171).add((Object)null);
        ((ArrayList) term560171).add((Object)null);
        ((ArrayList) term560171).add((Object)null);
        ((ArrayList) term560171).add((Object)null);
        ((ArrayList) term560171).add((Object)null);
        ((ArrayList) term560171).add((Object)null);
        ((ArrayList) term560171).add((Object)null);
        ((ArrayList) term560171).add((Object)null);
        ((ArrayList) term560171).add((Object)null);
        ((ArrayList) term560171).add((Object)null);
        ((ArrayList) term560171).add((Object)null);
        ((ArrayList) term560171).add((Object)null);
        ((ArrayList) term560171).add((Object)null);
        ((ArrayList) term560171).add((Object)null);
        ((ArrayList) term560171).add((Object)null);
        ((ArrayList) term560171).add(term560263);
        ((ArrayList) term560171).add(term560317);
        ((ArrayList) term560171).add(term560371);
        term560053 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        Object term560119 = newInstance(Class.forName("org.jsoup.parser.ParseSettings"));
        setBooleanField(term560119, term560119.getClass(), "preserveTagCase", false);
        setField(term560053, term560053.getClass(), "settings", term560119);
        setField(term560053, term560053.getClass(), "stack", term560171);
        term560435 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        setField(term560435, term560435.getClass(), "tagName", "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$EndTag");
        Object[] args = new Object[1];
        args[0] = term560435;
        try {
            callMethod(klass, "popStackToClose", argTypes, term560053, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


