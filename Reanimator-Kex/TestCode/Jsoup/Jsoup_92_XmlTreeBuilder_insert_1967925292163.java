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

public class XmlTreeBuilder_insert_1967925292163 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term252535;
     Object term252759;
     Object term255823;
     Object term255828;

    public XmlTreeBuilder_insert_1967925292163() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term252693 = new ArrayList();
        Object term252641 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        setField(term252641, term252641.getClass(), "childNodes", term252693);
        ArrayList term252587 = new ArrayList();
        ((ArrayList) term252587).add(term252641);
        term252535 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        setField(term252535, term252535.getClass(), "stack", term252587);
        char[] term250931 = (char[]) newCharArray(490);
        StringBuilder term252819 = new StringBuilder();
        ((StringBuilder) term252819).append(term250931);
        term252759 = newInstance(Class.forName("org.jsoup.parser.Token$Comment"));
        setField(term252759, term252759.getClass(), "data", term252819);
        setBooleanField(term252759, term252759.getClass(), "bogus", false);
        ArrayList term255827 = new ArrayList();
        ((ArrayList) term255827).add((Object)null);
        Object term255826 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        setField(term255826, term255826.getClass(), "outputSettings", null);
        setField(term255826, term255826.getClass(), "parser", null);
        setField(term255826, term255826.getClass(), "quirksMode", null);
        setField(term255826, term255826.getClass(), "location", null);
        setBooleanField(term255826, term255826.getClass(), "updateMetaCharset", false);
        setField(term255826, term255826.getClass(), "tag", null);
        setField(term255826, term255826.getClass(), "shadowChildrenRef", null);
        setField(term255826, term255826.getClass(), "childNodes", term255827);
        setField(term255826, term255826.getClass(), "attributes", null);
        setField(term255826, term255826.getClass(), "baseUri", null);
        setField(term255826, term255826.getClass(), "parentNode", null);
        setIntField(term255826, term255826.getClass(), "siblingIndex", 0);
        ArrayList term255824 = new ArrayList();
        ((ArrayList) term255824).add(term255826);
        term255823 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        setField(term255823, term255823.getClass(), "parser", null);
        setField(term255823, term255823.getClass(), "reader", null);
        setField(term255823, term255823.getClass(), "tokeniser", null);
        setField(term255823, term255823.getClass(), "doc", null);
        setField(term255823, term255823.getClass(), "stack", term255824);
        setField(term255823, term255823.getClass(), "baseUri", null);
        setField(term255823, term255823.getClass(), "currentToken", null);
        setField(term255823, term255823.getClass(), "settings", null);
        setField(term255823, term255823.getClass(), "start", null);
        setField(term255823, term255823.getClass(), "end", null);
        term255828 = newInstance(Class.forName("org.jsoup.parser.Token$Comment"));
        Object term255829 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term255830 = (byte[]) newByteArray(490);
        setField(term255829, term255829.getClass(), "value", term255830);
        setByteField(term255829, term255829.getClass(), "coder", (byte) 0);
        setIntField(term255829, term255829.getClass(), "count", 490);
        setField(term255828, term255828.getClass(), "data", term255829);
        setBooleanField(term255828, term255828.getClass(), "bogus", false);
        setField(term255828, term255828.getClass(), "type", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$Comment");
        Object[] args = new Object[1];
        args[0] = term252759;
        callMethod(klass, "insert", argTypes, term252535, args);
        assertTrue(recursiveEquals(term252535, term255823));
        assertTrue(recursiveEquals(term252759, term255828));
    }

};


