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

public class XmlTreeBuilder_popStackToClose_551050621233 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term370424;
     Object term370814;
     Object term370950;
     Object term370953;

    public XmlTreeBuilder_popStackToClose_551050621233() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term370528 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term370574 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term370574, term370574.getClass(), "tagName", "  ");
        setField(term370528, term370528.getClass(), "tag", term370574);
        Object term370666 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        Object term370712 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term370712, term370712.getClass(), "tagName", " ");
        setField(term370666, term370666.getClass(), "tag", term370712);
        ArrayList term370476 = new ArrayList();
        ((ArrayList) term370476).add((Object)null);
        ((ArrayList) term370476).add((Object)null);
        ((ArrayList) term370476).add((Object)null);
        ((ArrayList) term370476).add((Object)null);
        ((ArrayList) term370476).add((Object)null);
        ((ArrayList) term370476).add((Object)null);
        ((ArrayList) term370476).add((Object)null);
        ((ArrayList) term370476).add((Object)null);
        ((ArrayList) term370476).add((Object)null);
        ((ArrayList) term370476).add((Object)null);
        ((ArrayList) term370476).add((Object)null);
        ((ArrayList) term370476).add((Object)null);
        ((ArrayList) term370476).add((Object)null);
        ((ArrayList) term370476).add((Object)null);
        ((ArrayList) term370476).add((Object)null);
        ((ArrayList) term370476).add((Object)null);
        ((ArrayList) term370476).add((Object)null);
        ((ArrayList) term370476).add((Object)null);
        ((ArrayList) term370476).add((Object)null);
        ((ArrayList) term370476).add((Object)null);
        ((ArrayList) term370476).add((Object)null);
        ((ArrayList) term370476).add((Object)null);
        ((ArrayList) term370476).add((Object)null);
        ((ArrayList) term370476).add((Object)null);
        ((ArrayList) term370476).add((Object)null);
        ((ArrayList) term370476).add((Object)null);
        ((ArrayList) term370476).add((Object)null);
        ((ArrayList) term370476).add((Object)null);
        ((ArrayList) term370476).add((Object)null);
        ((ArrayList) term370476).add((Object)null);
        ((ArrayList) term370476).add(term370528);
        ((ArrayList) term370476).add(term370666);
        term370424 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        setField(term370424, term370424.getClass(), "stack", term370476);
        term370814 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        setField(term370814, term370814.getClass(), "tagName", "  ");
        ArrayList term370951 = new ArrayList();
        ((ArrayList) term370951).add((Object)null);
        ((ArrayList) term370951).add((Object)null);
        ((ArrayList) term370951).add((Object)null);
        ((ArrayList) term370951).add((Object)null);
        ((ArrayList) term370951).add((Object)null);
        ((ArrayList) term370951).add((Object)null);
        ((ArrayList) term370951).add((Object)null);
        ((ArrayList) term370951).add((Object)null);
        ((ArrayList) term370951).add((Object)null);
        ((ArrayList) term370951).add((Object)null);
        ((ArrayList) term370951).add((Object)null);
        ((ArrayList) term370951).add((Object)null);
        ((ArrayList) term370951).add((Object)null);
        ((ArrayList) term370951).add((Object)null);
        ((ArrayList) term370951).add((Object)null);
        ((ArrayList) term370951).add((Object)null);
        ((ArrayList) term370951).add((Object)null);
        ((ArrayList) term370951).add((Object)null);
        ((ArrayList) term370951).add((Object)null);
        ((ArrayList) term370951).add((Object)null);
        ((ArrayList) term370951).add((Object)null);
        ((ArrayList) term370951).add((Object)null);
        ((ArrayList) term370951).add((Object)null);
        ((ArrayList) term370951).add((Object)null);
        ((ArrayList) term370951).add((Object)null);
        ((ArrayList) term370951).add((Object)null);
        ((ArrayList) term370951).add((Object)null);
        ((ArrayList) term370951).add((Object)null);
        ((ArrayList) term370951).add((Object)null);
        ((ArrayList) term370951).add((Object)null);
        term370950 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        setField(term370950, term370950.getClass(), "reader", null);
        setField(term370950, term370950.getClass(), "tokeniser", null);
        setField(term370950, term370950.getClass(), "doc", null);
        setField(term370950, term370950.getClass(), "stack", term370951);
        setField(term370950, term370950.getClass(), "baseUri", null);
        setField(term370950, term370950.getClass(), "currentToken", null);
        setField(term370950, term370950.getClass(), "errors", null);
        setField(term370950, term370950.getClass(), "settings", null);
        setField(term370950, term370950.getClass(), "start", null);
        setField(term370950, term370950.getClass(), "end", null);
        term370953 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        setField(term370953, term370953.getClass(), "tagName", "  ");
        setField(term370953, term370953.getClass(), "normalName", null);
        setField(term370953, term370953.getClass(), "pendingAttributeName", null);
        setField(term370953, term370953.getClass(), "pendingAttributeValue", null);
        setField(term370953, term370953.getClass(), "pendingAttributeValueS", null);
        setBooleanField(term370953, term370953.getClass(), "hasEmptyAttributeValue", false);
        setBooleanField(term370953, term370953.getClass(), "hasPendingAttributeValue", false);
        setBooleanField(term370953, term370953.getClass(), "selfClosing", false);
        setField(term370953, term370953.getClass(), "attributes", null);
        setField(term370953, term370953.getClass(), "type", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$EndTag");
        Object[] args = new Object[1];
        args[0] = term370814;
        callMethod(klass, "popStackToClose", argTypes, term370424, args);
        assertTrue(recursiveEquals(term370424, term370950));
        assertTrue(recursiveEquals(term370814, term370953));
    }

};


