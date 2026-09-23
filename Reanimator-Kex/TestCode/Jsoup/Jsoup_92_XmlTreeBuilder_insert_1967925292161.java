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

public class XmlTreeBuilder_insert_1967925292161 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term250241;
     Object term250413;

    public XmlTreeBuilder_insert_1967925292161() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term250347 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        setField(term250347, term250347.getClass(), "childNodes", null);
        ArrayList term250293 = new ArrayList();
        ((ArrayList) term250293).add((Object)null);
        ((ArrayList) term250293).add((Object)null);
        ((ArrayList) term250293).add((Object)null);
        ((ArrayList) term250293).add(term250347);
        term250241 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        setField(term250241, term250241.getClass(), "stack", term250293);
        char[] term250075 = (char[]) newCharArray(0);
        StringBuilder term250473 = new StringBuilder();
        ((StringBuilder) term250473).append(term250075);
        term250413 = newInstance(Class.forName("org.jsoup.parser.Token$Comment"));
        setField(term250413, term250413.getClass(), "data", term250473);
        setBooleanField(term250413, term250413.getClass(), "bogus", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$Comment");
        Object[] args = new Object[1];
        args[0] = term250413;
        try {
            callMethod(klass, "insert", argTypes, term250241, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


