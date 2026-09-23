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

public class XmlTreeBuilder_popStackToClose_551050621355 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term357013;
     Object term357395;

    public XmlTreeBuilder_popStackToClose_551050621355() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term357223 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        Object term357277 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        Object term357331 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        ArrayList term357131 = new ArrayList();
        ((ArrayList) term357131).add("");
        ((ArrayList) term357131).add((Object)null);
        ((ArrayList) term357131).add((Object)null);
        ((ArrayList) term357131).add((Object)null);
        ((ArrayList) term357131).add((Object)null);
        ((ArrayList) term357131).add((Object)null);
        ((ArrayList) term357131).add((Object)null);
        ((ArrayList) term357131).add((Object)null);
        ((ArrayList) term357131).add((Object)null);
        ((ArrayList) term357131).add((Object)null);
        ((ArrayList) term357131).add((Object)null);
        ((ArrayList) term357131).add((Object)null);
        ((ArrayList) term357131).add((Object)null);
        ((ArrayList) term357131).add((Object)null);
        ((ArrayList) term357131).add((Object)null);
        ((ArrayList) term357131).add((Object)null);
        ((ArrayList) term357131).add((Object)null);
        ((ArrayList) term357131).add((Object)null);
        ((ArrayList) term357131).add((Object)null);
        ((ArrayList) term357131).add((Object)null);
        ((ArrayList) term357131).add((Object)null);
        ((ArrayList) term357131).add((Object)null);
        ((ArrayList) term357131).add((Object)null);
        ((ArrayList) term357131).add((Object)null);
        ((ArrayList) term357131).add((Object)null);
        ((ArrayList) term357131).add((Object)null);
        ((ArrayList) term357131).add((Object)null);
        ((ArrayList) term357131).add((Object)null);
        ((ArrayList) term357131).add((Object)null);
        ((ArrayList) term357131).add((Object)null);
        ((ArrayList) term357131).add((Object)null);
        ((ArrayList) term357131).add((Object)null);
        ((ArrayList) term357131).add((Object)null);
        ((ArrayList) term357131).add((Object)null);
        ((ArrayList) term357131).add((Object)null);
        ((ArrayList) term357131).add((Object)null);
        ((ArrayList) term357131).add((Object)null);
        ((ArrayList) term357131).add((Object)null);
        ((ArrayList) term357131).add((Object)null);
        ((ArrayList) term357131).add((Object)null);
        ((ArrayList) term357131).add((Object)null);
        ((ArrayList) term357131).add((Object)null);
        ((ArrayList) term357131).add((Object)null);
        ((ArrayList) term357131).add((Object)null);
        ((ArrayList) term357131).add((Object)null);
        ((ArrayList) term357131).add((Object)null);
        ((ArrayList) term357131).add((Object)null);
        ((ArrayList) term357131).add((Object)null);
        ((ArrayList) term357131).add((Object)null);
        ((ArrayList) term357131).add((Object)null);
        ((ArrayList) term357131).add((Object)null);
        ((ArrayList) term357131).add((Object)null);
        ((ArrayList) term357131).add((Object)null);
        ((ArrayList) term357131).add((Object)null);
        ((ArrayList) term357131).add((Object)null);
        ((ArrayList) term357131).add((Object)null);
        ((ArrayList) term357131).add((Object)null);
        ((ArrayList) term357131).add((Object)null);
        ((ArrayList) term357131).add((Object)null);
        ((ArrayList) term357131).add((Object)null);
        ((ArrayList) term357131).add((Object)null);
        ((ArrayList) term357131).add((Object)null);
        ((ArrayList) term357131).add((Object)null);
        ((ArrayList) term357131).add((Object)null);
        ((ArrayList) term357131).add((Object)null);
        ((ArrayList) term357131).add((Object)null);
        ((ArrayList) term357131).add((Object)null);
        ((ArrayList) term357131).add((Object)null);
        ((ArrayList) term357131).add((Object)null);
        ((ArrayList) term357131).add((Object)null);
        ((ArrayList) term357131).add((Object)null);
        ((ArrayList) term357131).add((Object)null);
        ((ArrayList) term357131).add((Object)null);
        ((ArrayList) term357131).add((Object)null);
        ((ArrayList) term357131).add((Object)null);
        ((ArrayList) term357131).add((Object)null);
        ((ArrayList) term357131).add((Object)null);
        ((ArrayList) term357131).add((Object)null);
        ((ArrayList) term357131).add((Object)null);
        ((ArrayList) term357131).add((Object)null);
        ((ArrayList) term357131).add((Object)null);
        ((ArrayList) term357131).add((Object)null);
        ((ArrayList) term357131).add((Object)null);
        ((ArrayList) term357131).add((Object)null);
        ((ArrayList) term357131).add((Object)null);
        ((ArrayList) term357131).add((Object)null);
        ((ArrayList) term357131).add((Object)null);
        ((ArrayList) term357131).add((Object)null);
        ((ArrayList) term357131).add((Object)null);
        ((ArrayList) term357131).add((Object)null);
        ((ArrayList) term357131).add((Object)null);
        ((ArrayList) term357131).add((Object)null);
        ((ArrayList) term357131).add((Object)null);
        ((ArrayList) term357131).add((Object)null);
        ((ArrayList) term357131).add((Object)null);
        ((ArrayList) term357131).add((Object)null);
        ((ArrayList) term357131).add((Object)null);
        ((ArrayList) term357131).add((Object)null);
        ((ArrayList) term357131).add((Object)null);
        ((ArrayList) term357131).add((Object)null);
        ((ArrayList) term357131).add((Object)null);
        ((ArrayList) term357131).add((Object)null);
        ((ArrayList) term357131).add((Object)null);
        ((ArrayList) term357131).add((Object)null);
        ((ArrayList) term357131).add((Object)null);
        ((ArrayList) term357131).add((Object)null);
        ((ArrayList) term357131).add((Object)null);
        ((ArrayList) term357131).add((Object)null);
        ((ArrayList) term357131).add((Object)null);
        ((ArrayList) term357131).add((Object)null);
        ((ArrayList) term357131).add((Object)null);
        ((ArrayList) term357131).add((Object)null);
        ((ArrayList) term357131).add((Object)null);
        ((ArrayList) term357131).add((Object)null);
        ((ArrayList) term357131).add((Object)null);
        ((ArrayList) term357131).add((Object)null);
        ((ArrayList) term357131).add((Object)null);
        ((ArrayList) term357131).add((Object)null);
        ((ArrayList) term357131).add((Object)null);
        ((ArrayList) term357131).add((Object)null);
        ((ArrayList) term357131).add((Object)null);
        ((ArrayList) term357131).add((Object)null);
        ((ArrayList) term357131).add((Object)null);
        ((ArrayList) term357131).add((Object)null);
        ((ArrayList) term357131).add((Object)null);
        ((ArrayList) term357131).add(term357223);
        ((ArrayList) term357131).add(term357277);
        ((ArrayList) term357131).add(term357331);
        term357013 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        Object term357079 = newInstance(Class.forName("org.jsoup.parser.ParseSettings"));
        setBooleanField(term357079, term357079.getClass(), "preserveTagCase", false);
        setField(term357013, term357013.getClass(), "settings", term357079);
        setField(term357013, term357013.getClass(), "stack", term357131);
        term357395 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        setField(term357395, term357395.getClass(), "tagName", "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$EndTag");
        Object[] args = new Object[1];
        args[0] = term357395;
        try {
            callMethod(klass, "popStackToClose", argTypes, term357013, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


