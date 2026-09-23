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
import java.lang.ClassCastException;
import static org.jsoup.parser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;

public class XmlTreeBuilder_popStackToClose_551050621677 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term481160;
     Object term481516;

    public XmlTreeBuilder_popStackToClose_551050621677() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term481344 = newInstance(Class.forName("org.jsoup.parser.ParseSettings"));
        Object term481398 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        Object term481452 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        ArrayList term481278 = new ArrayList();
        ((ArrayList) term481278).add((Object)null);
        ((ArrayList) term481278).add((Object)null);
        ((ArrayList) term481278).add((Object)null);
        ((ArrayList) term481278).add((Object)null);
        ((ArrayList) term481278).add((Object)null);
        ((ArrayList) term481278).add((Object)null);
        ((ArrayList) term481278).add((Object)null);
        ((ArrayList) term481278).add((Object)null);
        ((ArrayList) term481278).add((Object)null);
        ((ArrayList) term481278).add((Object)null);
        ((ArrayList) term481278).add((Object)null);
        ((ArrayList) term481278).add((Object)null);
        ((ArrayList) term481278).add((Object)null);
        ((ArrayList) term481278).add((Object)null);
        ((ArrayList) term481278).add((Object)null);
        ((ArrayList) term481278).add((Object)null);
        ((ArrayList) term481278).add((Object)null);
        ((ArrayList) term481278).add((Object)null);
        ((ArrayList) term481278).add((Object)null);
        ((ArrayList) term481278).add((Object)null);
        ((ArrayList) term481278).add((Object)null);
        ((ArrayList) term481278).add((Object)null);
        ((ArrayList) term481278).add((Object)null);
        ((ArrayList) term481278).add((Object)null);
        ((ArrayList) term481278).add((Object)null);
        ((ArrayList) term481278).add((Object)null);
        ((ArrayList) term481278).add((Object)null);
        ((ArrayList) term481278).add((Object)null);
        ((ArrayList) term481278).add((Object)null);
        ((ArrayList) term481278).add((Object)null);
        ((ArrayList) term481278).add((Object)null);
        ((ArrayList) term481278).add((Object)null);
        ((ArrayList) term481278).add((Object)null);
        ((ArrayList) term481278).add((Object)null);
        ((ArrayList) term481278).add((Object)null);
        ((ArrayList) term481278).add((Object)null);
        ((ArrayList) term481278).add((Object)null);
        ((ArrayList) term481278).add((Object)null);
        ((ArrayList) term481278).add((Object)null);
        ((ArrayList) term481278).add((Object)null);
        ((ArrayList) term481278).add((Object)null);
        ((ArrayList) term481278).add((Object)null);
        ((ArrayList) term481278).add((Object)null);
        ((ArrayList) term481278).add((Object)null);
        ((ArrayList) term481278).add((Object)null);
        ((ArrayList) term481278).add((Object)null);
        ((ArrayList) term481278).add((Object)null);
        ((ArrayList) term481278).add((Object)null);
        ((ArrayList) term481278).add((Object)null);
        ((ArrayList) term481278).add((Object)null);
        ((ArrayList) term481278).add((Object)null);
        ((ArrayList) term481278).add((Object)null);
        ((ArrayList) term481278).add((Object)null);
        ((ArrayList) term481278).add((Object)null);
        ((ArrayList) term481278).add((Object)null);
        ((ArrayList) term481278).add((Object)null);
        ((ArrayList) term481278).add((Object)null);
        ((ArrayList) term481278).add((Object)null);
        ((ArrayList) term481278).add((Object)null);
        ((ArrayList) term481278).add((Object)null);
        ((ArrayList) term481278).add((Object)null);
        ((ArrayList) term481278).add((Object)null);
        ((ArrayList) term481278).add((Object)null);
        ((ArrayList) term481278).add((Object)null);
        ((ArrayList) term481278).add((Object)null);
        ((ArrayList) term481278).add((Object)null);
        ((ArrayList) term481278).add((Object)null);
        ((ArrayList) term481278).add((Object)null);
        ((ArrayList) term481278).add((Object)null);
        ((ArrayList) term481278).add((Object)null);
        ((ArrayList) term481278).add((Object)null);
        ((ArrayList) term481278).add((Object)null);
        ((ArrayList) term481278).add((Object)null);
        ((ArrayList) term481278).add((Object)null);
        ((ArrayList) term481278).add((Object)null);
        ((ArrayList) term481278).add((Object)null);
        ((ArrayList) term481278).add((Object)null);
        ((ArrayList) term481278).add((Object)null);
        ((ArrayList) term481278).add((Object)null);
        ((ArrayList) term481278).add((Object)null);
        ((ArrayList) term481278).add((Object)null);
        ((ArrayList) term481278).add((Object)null);
        ((ArrayList) term481278).add((Object)null);
        ((ArrayList) term481278).add((Object)null);
        ((ArrayList) term481278).add((Object)null);
        ((ArrayList) term481278).add((Object)null);
        ((ArrayList) term481278).add((Object)null);
        ((ArrayList) term481278).add((Object)null);
        ((ArrayList) term481278).add((Object)null);
        ((ArrayList) term481278).add((Object)null);
        ((ArrayList) term481278).add((Object)null);
        ((ArrayList) term481278).add((Object)null);
        ((ArrayList) term481278).add((Object)null);
        ((ArrayList) term481278).add((Object)null);
        ((ArrayList) term481278).add((Object)null);
        ((ArrayList) term481278).add((Object)null);
        ((ArrayList) term481278).add((Object)null);
        ((ArrayList) term481278).add((Object)null);
        ((ArrayList) term481278).add((Object)null);
        ((ArrayList) term481278).add((Object)null);
        ((ArrayList) term481278).add((Object)null);
        ((ArrayList) term481278).add((Object)null);
        ((ArrayList) term481278).add((Object)null);
        ((ArrayList) term481278).add((Object)null);
        ((ArrayList) term481278).add((Object)null);
        ((ArrayList) term481278).add((Object)null);
        ((ArrayList) term481278).add((Object)null);
        ((ArrayList) term481278).add((Object)null);
        ((ArrayList) term481278).add((Object)null);
        ((ArrayList) term481278).add((Object)null);
        ((ArrayList) term481278).add((Object)null);
        ((ArrayList) term481278).add((Object)null);
        ((ArrayList) term481278).add((Object)null);
        ((ArrayList) term481278).add((Object)null);
        ((ArrayList) term481278).add((Object)null);
        ((ArrayList) term481278).add((Object)null);
        ((ArrayList) term481278).add((Object)null);
        ((ArrayList) term481278).add((Object)null);
        ((ArrayList) term481278).add((Object)null);
        ((ArrayList) term481278).add((Object)null);
        ((ArrayList) term481278).add((Object)null);
        ((ArrayList) term481278).add((Object)null);
        ((ArrayList) term481278).add((Object)null);
        ((ArrayList) term481278).add((Object)null);
        ((ArrayList) term481278).add((Object)null);
        ((ArrayList) term481278).add(term481344);
        ((ArrayList) term481278).add(term481398);
        ((ArrayList) term481278).add(term481452);
        term481160 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        Object term481226 = newInstance(Class.forName("org.jsoup.parser.ParseSettings"));
        setBooleanField(term481226, term481226.getClass(), "preserveTagCase", false);
        setField(term481160, term481160.getClass(), "settings", term481226);
        setField(term481160, term481160.getClass(), "stack", term481278);
        term481516 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        setField(term481516, term481516.getClass(), "tagName", "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$EndTag");
        Object[] args = new Object[1];
        args[0] = term481516;
        try {
            callMethod(klass, "popStackToClose", argTypes, term481160, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


