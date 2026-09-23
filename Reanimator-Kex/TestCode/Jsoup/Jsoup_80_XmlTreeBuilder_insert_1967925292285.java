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

public class XmlTreeBuilder_insert_1967925292285 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term327605;
     Object term327835;
     Object term327971;
     Object term327976;

    public XmlTreeBuilder_insert_1967925292285() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term327769 = new ArrayList();
        Object term327717 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        setField(term327717, term327717.getClass(), "childNodes", term327769);
        ArrayList term327657 = new ArrayList();
        ((ArrayList) term327657).add((Object)null);
        ((ArrayList) term327657).add(term327717);
        term327605 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        setField(term327605, term327605.getClass(), "stack", term327657);
        StringBuilder term327895 = new StringBuilder();
        term327835 = newInstance(Class.forName("org.jsoup.parser.Token$Comment"));
        setField(term327835, term327835.getClass(), "data", term327895);
        setBooleanField(term327835, term327835.getClass(), "bogus", false);
        ArrayList term327975 = new ArrayList();
        ((ArrayList) term327975).add((Object)null);
        Object term327974 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        setField(term327974, term327974.getClass(), "elements", null);
        setField(term327974, term327974.getClass(), "tag", null);
        setField(term327974, term327974.getClass(), "shadowChildrenRef", null);
        setField(term327974, term327974.getClass(), "childNodes", term327975);
        setField(term327974, term327974.getClass(), "attributes", null);
        setField(term327974, term327974.getClass(), "baseUri", null);
        setField(term327974, term327974.getClass(), "parentNode", null);
        setIntField(term327974, term327974.getClass(), "siblingIndex", 0);
        ArrayList term327972 = new ArrayList();
        ((ArrayList) term327972).add((Object)null);
        ((ArrayList) term327972).add(term327974);
        term327971 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        setField(term327971, term327971.getClass(), "reader", null);
        setField(term327971, term327971.getClass(), "tokeniser", null);
        setField(term327971, term327971.getClass(), "doc", null);
        setField(term327971, term327971.getClass(), "stack", term327972);
        setField(term327971, term327971.getClass(), "baseUri", null);
        setField(term327971, term327971.getClass(), "currentToken", null);
        setField(term327971, term327971.getClass(), "errors", null);
        setField(term327971, term327971.getClass(), "settings", null);
        setField(term327971, term327971.getClass(), "start", null);
        setField(term327971, term327971.getClass(), "end", null);
        term327976 = newInstance(Class.forName("org.jsoup.parser.Token$Comment"));
        Object term327977 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term327978 = (byte[]) newByteArray(16);
        setField(term327977, term327977.getClass(), "value", term327978);
        setByteField(term327977, term327977.getClass(), "coder", (byte) 0);
        setIntField(term327977, term327977.getClass(), "count", 0);
        setField(term327976, term327976.getClass(), "data", term327977);
        setBooleanField(term327976, term327976.getClass(), "bogus", false);
        setField(term327976, term327976.getClass(), "type", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$Comment");
        Object[] args = new Object[1];
        args[0] = term327835;
        callMethod(klass, "insert", argTypes, term327605, args);
        assertTrue(recursiveEquals(term327605, term327971));
        assertTrue(recursiveEquals(term327835, term327976));
    }

};


