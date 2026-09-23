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

public class XmlTreeBuilder_popStackToClose_551050621155 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term248788;
     Object term249142;

    public XmlTreeBuilder_popStackToClose_551050621155() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term248978 = newInstance(Class.forName("org.jsoup.nodes.PseudoTextElement"));
        Object term249024 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term248978, term248978.getClass(), "tag", term249024);
        Object term249078 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        ArrayList term248906 = new ArrayList();
        ((ArrayList) term248906).add((Object)null);
        ((ArrayList) term248906).add((Object)null);
        ((ArrayList) term248906).add((Object)null);
        ((ArrayList) term248906).add((Object)null);
        ((ArrayList) term248906).add((Object)null);
        ((ArrayList) term248906).add((Object)null);
        ((ArrayList) term248906).add((Object)null);
        ((ArrayList) term248906).add((Object)null);
        ((ArrayList) term248906).add((Object)null);
        ((ArrayList) term248906).add((Object)null);
        ((ArrayList) term248906).add((Object)null);
        ((ArrayList) term248906).add((Object)null);
        ((ArrayList) term248906).add((Object)null);
        ((ArrayList) term248906).add((Object)null);
        ((ArrayList) term248906).add((Object)null);
        ((ArrayList) term248906).add((Object)null);
        ((ArrayList) term248906).add((Object)null);
        ((ArrayList) term248906).add((Object)null);
        ((ArrayList) term248906).add((Object)null);
        ((ArrayList) term248906).add((Object)null);
        ((ArrayList) term248906).add((Object)null);
        ((ArrayList) term248906).add((Object)null);
        ((ArrayList) term248906).add((Object)null);
        ((ArrayList) term248906).add((Object)null);
        ((ArrayList) term248906).add((Object)null);
        ((ArrayList) term248906).add((Object)null);
        ((ArrayList) term248906).add((Object)null);
        ((ArrayList) term248906).add((Object)null);
        ((ArrayList) term248906).add((Object)null);
        ((ArrayList) term248906).add((Object)null);
        ((ArrayList) term248906).add((Object)null);
        ((ArrayList) term248906).add((Object)null);
        ((ArrayList) term248906).add((Object)null);
        ((ArrayList) term248906).add((Object)null);
        ((ArrayList) term248906).add((Object)null);
        ((ArrayList) term248906).add((Object)null);
        ((ArrayList) term248906).add((Object)null);
        ((ArrayList) term248906).add((Object)null);
        ((ArrayList) term248906).add((Object)null);
        ((ArrayList) term248906).add((Object)null);
        ((ArrayList) term248906).add((Object)null);
        ((ArrayList) term248906).add((Object)null);
        ((ArrayList) term248906).add((Object)null);
        ((ArrayList) term248906).add((Object)null);
        ((ArrayList) term248906).add((Object)null);
        ((ArrayList) term248906).add((Object)null);
        ((ArrayList) term248906).add((Object)null);
        ((ArrayList) term248906).add((Object)null);
        ((ArrayList) term248906).add((Object)null);
        ((ArrayList) term248906).add((Object)null);
        ((ArrayList) term248906).add((Object)null);
        ((ArrayList) term248906).add((Object)null);
        ((ArrayList) term248906).add((Object)null);
        ((ArrayList) term248906).add((Object)null);
        ((ArrayList) term248906).add((Object)null);
        ((ArrayList) term248906).add((Object)null);
        ((ArrayList) term248906).add((Object)null);
        ((ArrayList) term248906).add((Object)null);
        ((ArrayList) term248906).add((Object)null);
        ((ArrayList) term248906).add((Object)null);
        ((ArrayList) term248906).add((Object)null);
        ((ArrayList) term248906).add((Object)null);
        ((ArrayList) term248906).add(term248978);
        ((ArrayList) term248906).add(term249078);
        term248788 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        Object term248854 = newInstance(Class.forName("org.jsoup.parser.ParseSettings"));
        setBooleanField(term248854, term248854.getClass(), "preserveTagCase", false);
        setField(term248788, term248788.getClass(), "settings", term248854);
        setField(term248788, term248788.getClass(), "stack", term248906);
        term249142 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        setField(term249142, term249142.getClass(), "tagName", "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$EndTag");
        Object[] args = new Object[1];
        args[0] = term249142;
        try {
            callMethod(klass, "popStackToClose", argTypes, term248788, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


