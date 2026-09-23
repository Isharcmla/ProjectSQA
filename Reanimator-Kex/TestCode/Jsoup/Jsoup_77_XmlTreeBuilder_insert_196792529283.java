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

public class XmlTreeBuilder_insert_196792529283 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term215017;
     Object term215189;

    public XmlTreeBuilder_insert_196792529283() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term215123 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        ArrayList term215069 = new ArrayList();
        ((ArrayList) term215069).add((Object)null);
        ((ArrayList) term215069).add((Object)null);
        ((ArrayList) term215069).add((Object)null);
        ((ArrayList) term215069).add(term215123);
        term215017 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        setField(term215017, term215017.getClass(), "stack", term215069);
        char[] term214575 = (char[]) newCharArray(106);
        StringBuilder term215249 = new StringBuilder();
        ((StringBuilder) term215249).append(term214575);
        term215189 = newInstance(Class.forName("org.jsoup.parser.Token$Comment"));
        setField(term215189, term215189.getClass(), "data", term215249);
        setBooleanField(term215189, term215189.getClass(), "bogus", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$Comment");
        Object[] args = new Object[1];
        args[0] = term215189;
        try {
            callMethod(klass, "insert", argTypes, term215017, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


