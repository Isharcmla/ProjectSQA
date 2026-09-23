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

public class XmlTreeBuilder_insert_420854838163 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term286593;
     Object term286821;
     Object term286921;
     Object term286926;

    public XmlTreeBuilder_insert_420854838163() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term286751 = new ArrayList();
        Object term286699 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        setField(term286699, term286699.getClass(), "childNodes", term286751);
        ArrayList term286645 = new ArrayList();
        ((ArrayList) term286645).add((Object)null);
        ((ArrayList) term286645).add((Object)null);
        ((ArrayList) term286645).add((Object)null);
        ((ArrayList) term286645).add((Object)null);
        ((ArrayList) term286645).add((Object)null);
        ((ArrayList) term286645).add((Object)null);
        ((ArrayList) term286645).add((Object)null);
        ((ArrayList) term286645).add(term286699);
        term286593 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        setField(term286593, term286593.getClass(), "stack", term286645);
        term286821 = newInstance(Class.forName("org.jsoup.parser.Token$Character"));
        setField(term286821, term286821.getClass(), "data", "");
        ArrayList term286925 = new ArrayList();
        ((ArrayList) term286925).add((Object)null);
        Object term286924 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        setField(term286924, term286924.getClass(), "outputSettings", null);
        setField(term286924, term286924.getClass(), "quirksMode", null);
        setField(term286924, term286924.getClass(), "location", null);
        setBooleanField(term286924, term286924.getClass(), "updateMetaCharset", false);
        setField(term286924, term286924.getClass(), "tag", null);
        setField(term286924, term286924.getClass(), "shadowChildrenRef", null);
        setField(term286924, term286924.getClass(), "childNodes", term286925);
        setField(term286924, term286924.getClass(), "attributes", null);
        setField(term286924, term286924.getClass(), "baseUri", null);
        setField(term286924, term286924.getClass(), "parentNode", null);
        setIntField(term286924, term286924.getClass(), "siblingIndex", 0);
        ArrayList term286922 = new ArrayList();
        ((ArrayList) term286922).add((Object)null);
        ((ArrayList) term286922).add((Object)null);
        ((ArrayList) term286922).add((Object)null);
        ((ArrayList) term286922).add((Object)null);
        ((ArrayList) term286922).add((Object)null);
        ((ArrayList) term286922).add((Object)null);
        ((ArrayList) term286922).add((Object)null);
        ((ArrayList) term286922).add(term286924);
        term286921 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        setField(term286921, term286921.getClass(), "reader", null);
        setField(term286921, term286921.getClass(), "tokeniser", null);
        setField(term286921, term286921.getClass(), "doc", null);
        setField(term286921, term286921.getClass(), "stack", term286922);
        setField(term286921, term286921.getClass(), "baseUri", null);
        setField(term286921, term286921.getClass(), "currentToken", null);
        setField(term286921, term286921.getClass(), "errors", null);
        setField(term286921, term286921.getClass(), "settings", null);
        setField(term286921, term286921.getClass(), "start", null);
        setField(term286921, term286921.getClass(), "end", null);
        term286926 = newInstance(Class.forName("org.jsoup.parser.Token$Character"));
        setField(term286926, term286926.getClass(), "data", "");
        setField(term286926, term286926.getClass(), "type", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$Character");
        Object[] args = new Object[1];
        args[0] = term286821;
        callMethod(klass, "insert", argTypes, term286593, args);
        assertTrue(recursiveEquals(term286593, term286921));
        assertTrue(recursiveEquals(term286821, term286926));
    }

};


