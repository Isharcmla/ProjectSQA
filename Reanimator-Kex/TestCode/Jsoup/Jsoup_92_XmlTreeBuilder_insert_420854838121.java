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

public class XmlTreeBuilder_insert_420854838121 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term228570;
     Object term228790;
     Object term228841;
     Object term228846;

    public XmlTreeBuilder_insert_420854838121() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term228728 = new ArrayList();
        Object term228676 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        setField(term228676, term228676.getClass(), "childNodes", term228728);
        ArrayList term228622 = new ArrayList();
        ((ArrayList) term228622).add(term228676);
        term228570 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        setField(term228570, term228570.getClass(), "stack", term228622);
        term228790 = newInstance(Class.forName("org.jsoup.parser.Token$CData"));
        setField(term228790, term228790.getClass(), "data", null);
        ArrayList term228845 = new ArrayList();
        ((ArrayList) term228845).add((Object)null);
        Object term228844 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        setField(term228844, term228844.getClass(), "outputSettings", null);
        setField(term228844, term228844.getClass(), "parser", null);
        setField(term228844, term228844.getClass(), "quirksMode", null);
        setField(term228844, term228844.getClass(), "location", null);
        setBooleanField(term228844, term228844.getClass(), "updateMetaCharset", false);
        setField(term228844, term228844.getClass(), "tag", null);
        setField(term228844, term228844.getClass(), "shadowChildrenRef", null);
        setField(term228844, term228844.getClass(), "childNodes", term228845);
        setField(term228844, term228844.getClass(), "attributes", null);
        setField(term228844, term228844.getClass(), "baseUri", null);
        setField(term228844, term228844.getClass(), "parentNode", null);
        setIntField(term228844, term228844.getClass(), "siblingIndex", 0);
        ArrayList term228842 = new ArrayList();
        ((ArrayList) term228842).add(term228844);
        term228841 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        setField(term228841, term228841.getClass(), "parser", null);
        setField(term228841, term228841.getClass(), "reader", null);
        setField(term228841, term228841.getClass(), "tokeniser", null);
        setField(term228841, term228841.getClass(), "doc", null);
        setField(term228841, term228841.getClass(), "stack", term228842);
        setField(term228841, term228841.getClass(), "baseUri", null);
        setField(term228841, term228841.getClass(), "currentToken", null);
        setField(term228841, term228841.getClass(), "settings", null);
        setField(term228841, term228841.getClass(), "start", null);
        setField(term228841, term228841.getClass(), "end", null);
        term228846 = newInstance(Class.forName("org.jsoup.parser.Token$CData"));
        setField(term228846, term228846.getClass(), "data", null);
        setField(term228846, term228846.getClass(), "type", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$Character");
        Object[] args = new Object[1];
        args[0] = term228790;
        callMethod(klass, "insert", argTypes, term228570, args);
        assertTrue(recursiveEquals(term228570, term228841));
        assertTrue(recursiveEquals(term228790, term228846));
    }

};


