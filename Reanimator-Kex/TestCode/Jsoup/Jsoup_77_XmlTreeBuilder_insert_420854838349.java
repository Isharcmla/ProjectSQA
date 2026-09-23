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

public class XmlTreeBuilder_insert_420854838349 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term469647;
     Object term469867;
     Object term469918;
     Object term469923;

    public XmlTreeBuilder_insert_420854838349() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term469805 = new ArrayList();
        Object term469753 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        setField(term469753, term469753.getClass(), "childNodes", term469805);
        ArrayList term469699 = new ArrayList();
        ((ArrayList) term469699).add(term469753);
        term469647 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        setField(term469647, term469647.getClass(), "stack", term469699);
        term469867 = newInstance(Class.forName("org.jsoup.parser.Token$CData"));
        setField(term469867, term469867.getClass(), "data", null);
        ArrayList term469922 = new ArrayList();
        ((ArrayList) term469922).add((Object)null);
        Object term469921 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        setField(term469921, term469921.getClass(), "outputSettings", null);
        setField(term469921, term469921.getClass(), "quirksMode", null);
        setField(term469921, term469921.getClass(), "location", null);
        setBooleanField(term469921, term469921.getClass(), "updateMetaCharset", false);
        setField(term469921, term469921.getClass(), "tag", null);
        setField(term469921, term469921.getClass(), "shadowChildrenRef", null);
        setField(term469921, term469921.getClass(), "childNodes", term469922);
        setField(term469921, term469921.getClass(), "attributes", null);
        setField(term469921, term469921.getClass(), "baseUri", null);
        setField(term469921, term469921.getClass(), "parentNode", null);
        setIntField(term469921, term469921.getClass(), "siblingIndex", 0);
        ArrayList term469919 = new ArrayList();
        ((ArrayList) term469919).add(term469921);
        term469918 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        setField(term469918, term469918.getClass(), "reader", null);
        setField(term469918, term469918.getClass(), "tokeniser", null);
        setField(term469918, term469918.getClass(), "doc", null);
        setField(term469918, term469918.getClass(), "stack", term469919);
        setField(term469918, term469918.getClass(), "baseUri", null);
        setField(term469918, term469918.getClass(), "currentToken", null);
        setField(term469918, term469918.getClass(), "errors", null);
        setField(term469918, term469918.getClass(), "settings", null);
        setField(term469918, term469918.getClass(), "start", null);
        setField(term469918, term469918.getClass(), "end", null);
        term469923 = newInstance(Class.forName("org.jsoup.parser.Token$CData"));
        setField(term469923, term469923.getClass(), "data", null);
        setField(term469923, term469923.getClass(), "type", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$Character");
        Object[] args = new Object[1];
        args[0] = term469867;
        callMethod(klass, "insert", argTypes, term469647, args);
        assertTrue(recursiveEquals(term469647, term469918));
        assertTrue(recursiveEquals(term469867, term469923));
    }

};


