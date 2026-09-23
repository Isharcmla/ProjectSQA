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
import static org.jsoup.parser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.jsoup.parser.EqualityUtils.*;
import java.util.ArrayList;
import java.lang.Object;

public class XmlTreeBuilder_insert_42085483879 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term213000;
     Object term213246;
     Object term213342;
     Object term213347;

    public XmlTreeBuilder_insert_42085483879() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term213176 = new ArrayList();
        Object term213124 = newInstance(Class.forName("org.jsoup.nodes.PseudoTextElement"));
        setField(term213124, term213124.getClass(), "childNodes", term213176);
        ArrayList term213052 = new ArrayList();
        ((ArrayList) term213052).add((Object)null);
        ((ArrayList) term213052).add((Object)null);
        ((ArrayList) term213052).add((Object)null);
        ((ArrayList) term213052).add((Object)null);
        ((ArrayList) term213052).add((Object)null);
        ((ArrayList) term213052).add((Object)null);
        ((ArrayList) term213052).add((Object)null);
        ((ArrayList) term213052).add((Object)null);
        ((ArrayList) term213052).add((Object)null);
        ((ArrayList) term213052).add((Object)null);
        ((ArrayList) term213052).add((Object)null);
        ((ArrayList) term213052).add((Object)null);
        ((ArrayList) term213052).add((Object)null);
        ((ArrayList) term213052).add((Object)null);
        ((ArrayList) term213052).add((Object)null);
        ((ArrayList) term213052).add((Object)null);
        ((ArrayList) term213052).add((Object)null);
        ((ArrayList) term213052).add((Object)null);
        ((ArrayList) term213052).add((Object)null);
        ((ArrayList) term213052).add((Object)null);
        ((ArrayList) term213052).add((Object)null);
        ((ArrayList) term213052).add((Object)null);
        ((ArrayList) term213052).add((Object)null);
        ((ArrayList) term213052).add((Object)null);
        ((ArrayList) term213052).add((Object)null);
        ((ArrayList) term213052).add((Object)null);
        ((ArrayList) term213052).add((Object)null);
        ((ArrayList) term213052).add((Object)null);
        ((ArrayList) term213052).add((Object)null);
        ((ArrayList) term213052).add((Object)null);
        ((ArrayList) term213052).add((Object)null);
        ((ArrayList) term213052).add((Object)null);
        ((ArrayList) term213052).add((Object)null);
        ((ArrayList) term213052).add((Object)null);
        ((ArrayList) term213052).add((Object)null);
        ((ArrayList) term213052).add((Object)null);
        ((ArrayList) term213052).add((Object)null);
        ((ArrayList) term213052).add((Object)null);
        ((ArrayList) term213052).add((Object)null);
        ((ArrayList) term213052).add((Object)null);
        ((ArrayList) term213052).add((Object)null);
        ((ArrayList) term213052).add((Object)null);
        ((ArrayList) term213052).add((Object)null);
        ((ArrayList) term213052).add((Object)null);
        ((ArrayList) term213052).add((Object)null);
        ((ArrayList) term213052).add((Object)null);
        ((ArrayList) term213052).add((Object)null);
        ((ArrayList) term213052).add(term213124);
        term213000 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        setField(term213000, term213000.getClass(), "stack", term213052);
        term213246 = newInstance(Class.forName("org.jsoup.parser.Token$Character"));
        setField(term213246, term213246.getClass(), "data", "");
        ArrayList term213346 = new ArrayList();
        ((ArrayList) term213346).add((Object)null);
        Object term213345 = newInstance(Class.forName("org.jsoup.nodes.PseudoTextElement"));
        setField(term213345, term213345.getClass(), "tag", null);
        setField(term213345, term213345.getClass(), "shadowChildrenRef", null);
        setField(term213345, term213345.getClass(), "childNodes", term213346);
        setField(term213345, term213345.getClass(), "attributes", null);
        setField(term213345, term213345.getClass(), "baseUri", null);
        setField(term213345, term213345.getClass(), "parentNode", null);
        setIntField(term213345, term213345.getClass(), "siblingIndex", 0);
        ArrayList term213343 = new ArrayList();
        ((ArrayList) term213343).add((Object)null);
        ((ArrayList) term213343).add((Object)null);
        ((ArrayList) term213343).add((Object)null);
        ((ArrayList) term213343).add((Object)null);
        ((ArrayList) term213343).add((Object)null);
        ((ArrayList) term213343).add((Object)null);
        ((ArrayList) term213343).add((Object)null);
        ((ArrayList) term213343).add((Object)null);
        ((ArrayList) term213343).add((Object)null);
        ((ArrayList) term213343).add((Object)null);
        ((ArrayList) term213343).add((Object)null);
        ((ArrayList) term213343).add((Object)null);
        ((ArrayList) term213343).add((Object)null);
        ((ArrayList) term213343).add((Object)null);
        ((ArrayList) term213343).add((Object)null);
        ((ArrayList) term213343).add((Object)null);
        ((ArrayList) term213343).add((Object)null);
        ((ArrayList) term213343).add((Object)null);
        ((ArrayList) term213343).add((Object)null);
        ((ArrayList) term213343).add((Object)null);
        ((ArrayList) term213343).add((Object)null);
        ((ArrayList) term213343).add((Object)null);
        ((ArrayList) term213343).add((Object)null);
        ((ArrayList) term213343).add((Object)null);
        ((ArrayList) term213343).add((Object)null);
        ((ArrayList) term213343).add((Object)null);
        ((ArrayList) term213343).add((Object)null);
        ((ArrayList) term213343).add((Object)null);
        ((ArrayList) term213343).add((Object)null);
        ((ArrayList) term213343).add((Object)null);
        ((ArrayList) term213343).add((Object)null);
        ((ArrayList) term213343).add((Object)null);
        ((ArrayList) term213343).add((Object)null);
        ((ArrayList) term213343).add((Object)null);
        ((ArrayList) term213343).add((Object)null);
        ((ArrayList) term213343).add((Object)null);
        ((ArrayList) term213343).add((Object)null);
        ((ArrayList) term213343).add((Object)null);
        ((ArrayList) term213343).add((Object)null);
        ((ArrayList) term213343).add((Object)null);
        ((ArrayList) term213343).add((Object)null);
        ((ArrayList) term213343).add((Object)null);
        ((ArrayList) term213343).add((Object)null);
        ((ArrayList) term213343).add((Object)null);
        ((ArrayList) term213343).add((Object)null);
        ((ArrayList) term213343).add((Object)null);
        ((ArrayList) term213343).add((Object)null);
        ((ArrayList) term213343).add(term213345);
        term213342 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        setField(term213342, term213342.getClass(), "reader", null);
        setField(term213342, term213342.getClass(), "tokeniser", null);
        setField(term213342, term213342.getClass(), "doc", null);
        setField(term213342, term213342.getClass(), "stack", term213343);
        setField(term213342, term213342.getClass(), "baseUri", null);
        setField(term213342, term213342.getClass(), "currentToken", null);
        setField(term213342, term213342.getClass(), "errors", null);
        setField(term213342, term213342.getClass(), "settings", null);
        setField(term213342, term213342.getClass(), "start", null);
        setField(term213342, term213342.getClass(), "end", null);
        term213347 = newInstance(Class.forName("org.jsoup.parser.Token$Character"));
        setField(term213347, term213347.getClass(), "data", "");
        setField(term213347, term213347.getClass(), "type", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$Character");
        Object[] args = new Object[1];
        args[0] = term213246;
        callMethod(klass, "insert", argTypes, term213000, args);
        assertTrue(recursiveEquals(term213000, term213342));
        assertTrue(recursiveEquals(term213246, term213347));
    }

};


