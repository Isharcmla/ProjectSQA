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

public class XmlTreeBuilder_insert_420854838109 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term122458;
     Object term122730;
     Object term122823;
     Object term122831;

    public XmlTreeBuilder_insert_420854838109() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term122660 = new ArrayList();
        Object[] term122345 = (Object[]) newArray("java.lang.Object", 8);
        Object term122608 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        setElement(term122345, 1, term122345);
        setField(term122608, term122608.getClass(), "childNodes", term122660);
        setElement(term122345, 7, term122608);
        ArrayList term122548 = new ArrayList();
        ((ArrayList) term122548).add((Object)null);
        ((ArrayList) term122548).add((Object)term122345);
        ((ArrayList) term122548).add((Object)null);
        ((ArrayList) term122548).add((Object)null);
        ((ArrayList) term122548).add((Object)null);
        ((ArrayList) term122548).add((Object)null);
        ((ArrayList) term122548).add((Object)null);
        ((ArrayList) term122548).add(term122608);
        term122458 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        setField(term122458, term122458.getClass(), "baseUri", "");
        setField(term122458, term122458.getClass(), "stack", term122548);
        term122730 = newInstance(Class.forName("org.jsoup.parser.Token$Character"));
        setField(term122730, term122730.getClass(), "data", "");
        Object[] term122826 = (Object[]) newArray("java.lang.Object", 8);
        Object[] term122827 = (Object[]) newArray("java.lang.Object", 8);
        Object term122828 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        setElement(term122826, 1, term122827);
        setField(term122828, term122828.getClass(), "elements", null);
        setField(term122828, term122828.getClass(), "tag", null);
        setField(term122828, term122828.getClass(), "parentNode", null);
        setField(term122828, term122828.getClass(), "childNodes", null);
        setField(term122828, term122828.getClass(), "attributes", null);
        setField(term122828, term122828.getClass(), "baseUri", null);
        setIntField(term122828, term122828.getClass(), "siblingIndex", 0);
        setElement(term122826, 7, term122828);
        ArrayList term122824 = new ArrayList();
        ((ArrayList) term122824).add((Object)null);
        ((ArrayList) term122824).add((Object)term122826);
        ((ArrayList) term122824).add((Object)null);
        ((ArrayList) term122824).add((Object)null);
        ((ArrayList) term122824).add((Object)null);
        ((ArrayList) term122824).add((Object)null);
        ((ArrayList) term122824).add((Object)null);
        ((ArrayList) term122824).add(term122828);
        term122823 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        setField(term122823, term122823.getClass(), "reader", null);
        setField(term122823, term122823.getClass(), "tokeniser", null);
        setField(term122823, term122823.getClass(), "doc", null);
        setField(term122823, term122823.getClass(), "stack", term122824);
        setField(term122823, term122823.getClass(), "baseUri", "");
        setField(term122823, term122823.getClass(), "currentToken", null);
        setField(term122823, term122823.getClass(), "errors", null);
        setField(term122823, term122823.getClass(), "start", null);
        setField(term122823, term122823.getClass(), "end", null);
        term122831 = newInstance(Class.forName("org.jsoup.parser.Token$Character"));
        setField(term122831, term122831.getClass(), "data", "");
        setField(term122831, term122831.getClass(), "type", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$Character");
        Object[] args = new Object[1];
        args[0] = term122730;
        callMethod(klass, "insert", argTypes, term122458, args);
        assertTrue(recursiveEquals(term122458, term122823));
        assertTrue(recursiveEquals(term122730, term122831));
    }

};


