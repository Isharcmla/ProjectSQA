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

public class XmlTreeBuilder_insert_1967925292173 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term255568;
     Object term255792;
     Object term255932;
     Object term255937;

    public XmlTreeBuilder_insert_1967925292173() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term255726 = new ArrayList();
        Object term255674 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        setField(term255674, term255674.getClass(), "childNodes", term255726);
        ArrayList term255620 = new ArrayList();
        ((ArrayList) term255620).add((Object)null);
        ((ArrayList) term255620).add(term255674);
        term255568 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        setField(term255568, term255568.getClass(), "stack", term255620);
        StringBuilder term255852 = new StringBuilder();
        term255792 = newInstance(Class.forName("org.jsoup.parser.Token$Comment"));
        setField(term255792, term255792.getClass(), "data", term255852);
        setBooleanField(term255792, term255792.getClass(), "bogus", false);
        ArrayList term255936 = new ArrayList();
        ((ArrayList) term255936).add((Object)null);
        Object term255935 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        setField(term255935, term255935.getClass(), "outputSettings", null);
        setField(term255935, term255935.getClass(), "quirksMode", null);
        setField(term255935, term255935.getClass(), "location", null);
        setBooleanField(term255935, term255935.getClass(), "updateMetaCharset", false);
        setField(term255935, term255935.getClass(), "tag", null);
        setField(term255935, term255935.getClass(), "shadowChildrenRef", null);
        setField(term255935, term255935.getClass(), "childNodes", term255936);
        setField(term255935, term255935.getClass(), "attributes", null);
        setField(term255935, term255935.getClass(), "baseUri", null);
        setField(term255935, term255935.getClass(), "parentNode", null);
        setIntField(term255935, term255935.getClass(), "siblingIndex", 0);
        ArrayList term255933 = new ArrayList();
        ((ArrayList) term255933).add((Object)null);
        ((ArrayList) term255933).add(term255935);
        term255932 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        setField(term255932, term255932.getClass(), "reader", null);
        setField(term255932, term255932.getClass(), "tokeniser", null);
        setField(term255932, term255932.getClass(), "doc", null);
        setField(term255932, term255932.getClass(), "stack", term255933);
        setField(term255932, term255932.getClass(), "baseUri", null);
        setField(term255932, term255932.getClass(), "currentToken", null);
        setField(term255932, term255932.getClass(), "errors", null);
        setField(term255932, term255932.getClass(), "settings", null);
        setField(term255932, term255932.getClass(), "start", null);
        setField(term255932, term255932.getClass(), "end", null);
        term255937 = newInstance(Class.forName("org.jsoup.parser.Token$Comment"));
        Object term255938 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term255939 = (byte[]) newByteArray(16);
        setField(term255938, term255938.getClass(), "value", term255939);
        setByteField(term255938, term255938.getClass(), "coder", (byte) 0);
        setIntField(term255938, term255938.getClass(), "count", 0);
        setField(term255937, term255937.getClass(), "data", term255938);
        setBooleanField(term255937, term255937.getClass(), "bogus", false);
        setField(term255937, term255937.getClass(), "type", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$Comment");
        Object[] args = new Object[1];
        args[0] = term255792;
        callMethod(klass, "insert", argTypes, term255568, args);
        assertTrue(recursiveEquals(term255568, term255932));
        assertTrue(recursiveEquals(term255792, term255937));
    }

};


