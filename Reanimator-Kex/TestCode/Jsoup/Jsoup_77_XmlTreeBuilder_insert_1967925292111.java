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

public class XmlTreeBuilder_insert_1967925292111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term231792;
     Object term232022;
     Object term232158;
     Object term232163;

    public XmlTreeBuilder_insert_1967925292111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term231956 = new ArrayList();
        Object term231904 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        setField(term231904, term231904.getClass(), "childNodes", term231956);
        ArrayList term231844 = new ArrayList();
        ((ArrayList) term231844).add((Object)null);
        ((ArrayList) term231844).add(term231904);
        term231792 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        setField(term231792, term231792.getClass(), "stack", term231844);
        StringBuilder term232082 = new StringBuilder();
        term232022 = newInstance(Class.forName("org.jsoup.parser.Token$Comment"));
        setField(term232022, term232022.getClass(), "data", term232082);
        setBooleanField(term232022, term232022.getClass(), "bogus", false);
        ArrayList term232162 = new ArrayList();
        ((ArrayList) term232162).add((Object)null);
        Object term232161 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        setField(term232161, term232161.getClass(), "elements", null);
        setField(term232161, term232161.getClass(), "tag", null);
        setField(term232161, term232161.getClass(), "shadowChildrenRef", null);
        setField(term232161, term232161.getClass(), "childNodes", term232162);
        setField(term232161, term232161.getClass(), "attributes", null);
        setField(term232161, term232161.getClass(), "baseUri", null);
        setField(term232161, term232161.getClass(), "parentNode", null);
        setIntField(term232161, term232161.getClass(), "siblingIndex", 0);
        ArrayList term232159 = new ArrayList();
        ((ArrayList) term232159).add((Object)null);
        ((ArrayList) term232159).add(term232161);
        term232158 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        setField(term232158, term232158.getClass(), "reader", null);
        setField(term232158, term232158.getClass(), "tokeniser", null);
        setField(term232158, term232158.getClass(), "doc", null);
        setField(term232158, term232158.getClass(), "stack", term232159);
        setField(term232158, term232158.getClass(), "baseUri", null);
        setField(term232158, term232158.getClass(), "currentToken", null);
        setField(term232158, term232158.getClass(), "errors", null);
        setField(term232158, term232158.getClass(), "settings", null);
        setField(term232158, term232158.getClass(), "start", null);
        setField(term232158, term232158.getClass(), "end", null);
        term232163 = newInstance(Class.forName("org.jsoup.parser.Token$Comment"));
        Object term232164 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term232165 = (byte[]) newByteArray(16);
        setField(term232164, term232164.getClass(), "value", term232165);
        setByteField(term232164, term232164.getClass(), "coder", (byte) 0);
        setIntField(term232164, term232164.getClass(), "count", 0);
        setField(term232163, term232163.getClass(), "data", term232164);
        setBooleanField(term232163, term232163.getClass(), "bogus", false);
        setField(term232163, term232163.getClass(), "type", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$Comment");
        Object[] args = new Object[1];
        args[0] = term232022;
        callMethod(klass, "insert", argTypes, term231792, args);
        assertTrue(recursiveEquals(term231792, term232158));
        assertTrue(recursiveEquals(term232022, term232163));
    }

};


