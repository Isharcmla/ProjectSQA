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

public class XmlTreeBuilder_popStackToClose_551050621299 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term446985;
     Object term447155;
     Object term447257;
     Object term447260;

    public XmlTreeBuilder_popStackToClose_551050621299() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term447091 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        ArrayList term447037 = new ArrayList();
        ((ArrayList) term447037).add((Object)null);
        ((ArrayList) term447037).add((Object)null);
        ((ArrayList) term447037).add((Object)null);
        ((ArrayList) term447037).add((Object)null);
        ((ArrayList) term447037).add((Object)null);
        ((ArrayList) term447037).add((Object)null);
        ((ArrayList) term447037).add((Object)null);
        ((ArrayList) term447037).add(term447091);
        term446985 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        setField(term446985, term446985.getClass(), "stack", term447037);
        term447155 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        setField(term447155, term447155.getClass(), "tagName", "#document");
        ArrayList term447258 = new ArrayList();
        ((ArrayList) term447258).add((Object)null);
        ((ArrayList) term447258).add((Object)null);
        ((ArrayList) term447258).add((Object)null);
        ((ArrayList) term447258).add((Object)null);
        ((ArrayList) term447258).add((Object)null);
        ((ArrayList) term447258).add((Object)null);
        ((ArrayList) term447258).add((Object)null);
        term447257 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        setField(term447257, term447257.getClass(), "reader", null);
        setField(term447257, term447257.getClass(), "tokeniser", null);
        setField(term447257, term447257.getClass(), "doc", null);
        setField(term447257, term447257.getClass(), "stack", term447258);
        setField(term447257, term447257.getClass(), "baseUri", null);
        setField(term447257, term447257.getClass(), "currentToken", null);
        setField(term447257, term447257.getClass(), "errors", null);
        setField(term447257, term447257.getClass(), "settings", null);
        setField(term447257, term447257.getClass(), "start", null);
        setField(term447257, term447257.getClass(), "end", null);
        term447260 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        setField(term447260, term447260.getClass(), "tagName", "#document");
        setField(term447260, term447260.getClass(), "normalName", null);
        setField(term447260, term447260.getClass(), "pendingAttributeName", null);
        setField(term447260, term447260.getClass(), "pendingAttributeValue", null);
        setField(term447260, term447260.getClass(), "pendingAttributeValueS", null);
        setBooleanField(term447260, term447260.getClass(), "hasEmptyAttributeValue", false);
        setBooleanField(term447260, term447260.getClass(), "hasPendingAttributeValue", false);
        setBooleanField(term447260, term447260.getClass(), "selfClosing", false);
        setField(term447260, term447260.getClass(), "attributes", null);
        setField(term447260, term447260.getClass(), "type", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$EndTag");
        Object[] args = new Object[1];
        args[0] = term447155;
        callMethod(klass, "popStackToClose", argTypes, term446985, args);
        assertTrue(recursiveEquals(term446985, term447257));
        assertTrue(recursiveEquals(term447155, term447260));
    }

};


