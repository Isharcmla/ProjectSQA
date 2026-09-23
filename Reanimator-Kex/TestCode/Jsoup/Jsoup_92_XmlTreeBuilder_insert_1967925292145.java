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

public class XmlTreeBuilder_insert_1967925292145 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term239670;
     Object term239860;

    public XmlTreeBuilder_insert_1967925292145() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term239794 = newInstance(Class.forName("org.jsoup.nodes.PseudoTextElement"));
        ArrayList term239722 = new ArrayList();
        ((ArrayList) term239722).add((Object)null);
        ((ArrayList) term239722).add((Object)null);
        ((ArrayList) term239722).add((Object)null);
        ((ArrayList) term239722).add((Object)null);
        ((ArrayList) term239722).add((Object)null);
        ((ArrayList) term239722).add((Object)null);
        ((ArrayList) term239722).add((Object)null);
        ((ArrayList) term239722).add((Object)null);
        ((ArrayList) term239722).add((Object)null);
        ((ArrayList) term239722).add((Object)null);
        ((ArrayList) term239722).add((Object)null);
        ((ArrayList) term239722).add((Object)null);
        ((ArrayList) term239722).add((Object)null);
        ((ArrayList) term239722).add((Object)null);
        ((ArrayList) term239722).add((Object)null);
        ((ArrayList) term239722).add(term239794);
        term239670 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        setField(term239670, term239670.getClass(), "stack", term239722);
        char[] term238054 = (char[]) newCharArray(497);
        StringBuilder term239920 = new StringBuilder();
        ((StringBuilder) term239920).append(term238054);
        term239860 = newInstance(Class.forName("org.jsoup.parser.Token$Comment"));
        setField(term239860, term239860.getClass(), "data", term239920);
        setBooleanField(term239860, term239860.getClass(), "bogus", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$Comment");
        Object[] args = new Object[1];
        args[0] = term239860;
        try {
            callMethod(klass, "insert", argTypes, term239670, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


