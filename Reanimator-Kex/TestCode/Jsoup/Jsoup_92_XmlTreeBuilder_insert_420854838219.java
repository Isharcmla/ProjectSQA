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

public class XmlTreeBuilder_insert_420854838219 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term280528;
     Object term280804;
     Object term280852;
     Object term280858;

    public XmlTreeBuilder_insert_420854838219() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term280618 = newInstance(Class.forName("java.lang.Object"));
        ArrayList term280742 = new ArrayList();
        Object term280690 = newInstance(Class.forName("org.jsoup.nodes.PseudoTextElement"));
        setField(term280690, term280690.getClass(), "childNodes", term280742);
        ArrayList term280580 = new ArrayList();
        ((ArrayList) term280580).add(term280618);
        ((ArrayList) term280580).add(term280618);
        ((ArrayList) term280580).add(term280618);
        ((ArrayList) term280580).add(term280690);
        term280528 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        setField(term280528, term280528.getClass(), "stack", term280580);
        term280804 = newInstance(Class.forName("org.jsoup.parser.Token$CData"));
        setField(term280804, term280804.getClass(), "data", null);
        Object term280855 = newInstance(Class.forName("java.lang.Object"));
        ArrayList term280857 = new ArrayList();
        ((ArrayList) term280857).add((Object)null);
        Object term280856 = newInstance(Class.forName("org.jsoup.nodes.PseudoTextElement"));
        setField(term280856, term280856.getClass(), "tag", null);
        setField(term280856, term280856.getClass(), "shadowChildrenRef", null);
        setField(term280856, term280856.getClass(), "childNodes", term280857);
        setField(term280856, term280856.getClass(), "attributes", null);
        setField(term280856, term280856.getClass(), "baseUri", null);
        setField(term280856, term280856.getClass(), "parentNode", null);
        setIntField(term280856, term280856.getClass(), "siblingIndex", 0);
        ArrayList term280853 = new ArrayList();
        ((ArrayList) term280853).add(term280855);
        ((ArrayList) term280853).add(term280855);
        ((ArrayList) term280853).add(term280855);
        ((ArrayList) term280853).add(term280856);
        term280852 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        setField(term280852, term280852.getClass(), "parser", null);
        setField(term280852, term280852.getClass(), "reader", null);
        setField(term280852, term280852.getClass(), "tokeniser", null);
        setField(term280852, term280852.getClass(), "doc", null);
        setField(term280852, term280852.getClass(), "stack", term280853);
        setField(term280852, term280852.getClass(), "baseUri", null);
        setField(term280852, term280852.getClass(), "currentToken", null);
        setField(term280852, term280852.getClass(), "settings", null);
        setField(term280852, term280852.getClass(), "start", null);
        setField(term280852, term280852.getClass(), "end", null);
        term280858 = newInstance(Class.forName("org.jsoup.parser.Token$CData"));
        setField(term280858, term280858.getClass(), "data", null);
        setField(term280858, term280858.getClass(), "type", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$Character");
        Object[] args = new Object[1];
        args[0] = term280804;
        callMethod(klass, "insert", argTypes, term280528, args);
        assertTrue(recursiveEquals(term280528, term280852));
        assertTrue(recursiveEquals(term280804, term280858));
    }

};


