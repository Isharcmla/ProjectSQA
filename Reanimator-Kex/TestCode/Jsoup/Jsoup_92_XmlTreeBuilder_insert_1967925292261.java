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
import java.lang.StringBuilder;

public class XmlTreeBuilder_insert_1967925292261 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term298091;
     Object term298333;
     Object term298469;
     Object term298474;

    public XmlTreeBuilder_insert_1967925292261() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term298267 = new ArrayList();
        Object term298215 = newInstance(Class.forName("org.jsoup.nodes.PseudoTextElement"));
        setField(term298215, term298215.getClass(), "childNodes", term298267);
        ArrayList term298143 = new ArrayList();
        ((ArrayList) term298143).add((Object)null);
        ((ArrayList) term298143).add(term298215);
        term298091 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        setField(term298091, term298091.getClass(), "stack", term298143);
        StringBuilder term298393 = new StringBuilder();
        term298333 = newInstance(Class.forName("org.jsoup.parser.Token$Comment"));
        setField(term298333, term298333.getClass(), "data", term298393);
        setBooleanField(term298333, term298333.getClass(), "bogus", false);
        ArrayList term298473 = new ArrayList();
        ((ArrayList) term298473).add((Object)null);
        Object term298472 = newInstance(Class.forName("org.jsoup.nodes.PseudoTextElement"));
        setField(term298472, term298472.getClass(), "tag", null);
        setField(term298472, term298472.getClass(), "shadowChildrenRef", null);
        setField(term298472, term298472.getClass(), "childNodes", term298473);
        setField(term298472, term298472.getClass(), "attributes", null);
        setField(term298472, term298472.getClass(), "baseUri", null);
        setField(term298472, term298472.getClass(), "parentNode", null);
        setIntField(term298472, term298472.getClass(), "siblingIndex", 0);
        ArrayList term298470 = new ArrayList();
        ((ArrayList) term298470).add((Object)null);
        ((ArrayList) term298470).add(term298472);
        term298469 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        setField(term298469, term298469.getClass(), "parser", null);
        setField(term298469, term298469.getClass(), "reader", null);
        setField(term298469, term298469.getClass(), "tokeniser", null);
        setField(term298469, term298469.getClass(), "doc", null);
        setField(term298469, term298469.getClass(), "stack", term298470);
        setField(term298469, term298469.getClass(), "baseUri", null);
        setField(term298469, term298469.getClass(), "currentToken", null);
        setField(term298469, term298469.getClass(), "settings", null);
        setField(term298469, term298469.getClass(), "start", null);
        setField(term298469, term298469.getClass(), "end", null);
        term298474 = newInstance(Class.forName("org.jsoup.parser.Token$Comment"));
        Object term298475 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term298476 = (byte[]) newByteArray(16);
        setField(term298475, term298475.getClass(), "value", term298476);
        setByteField(term298475, term298475.getClass(), "coder", (byte) 0);
        setIntField(term298475, term298475.getClass(), "count", 0);
        setField(term298474, term298474.getClass(), "data", term298475);
        setBooleanField(term298474, term298474.getClass(), "bogus", false);
        setField(term298474, term298474.getClass(), "type", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$Comment");
        Object[] args = new Object[1];
        args[0] = term298333;
        callMethod(klass, "insert", argTypes, term298091, args);
        assertTrue(recursiveEquals(term298091, term298469));
        assertTrue(recursiveEquals(term298333, term298474));
    }

};


