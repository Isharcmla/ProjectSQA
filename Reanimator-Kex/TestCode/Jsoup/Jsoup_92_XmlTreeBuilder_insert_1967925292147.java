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

public class XmlTreeBuilder_insert_1967925292147 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term244464;
     Object term244688;
     Object term244863;
     Object term244868;

    public XmlTreeBuilder_insert_1967925292147() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term244622 = new ArrayList();
        Object term244570 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        setField(term244570, term244570.getClass(), "childNodes", term244622);
        ArrayList term244516 = new ArrayList();
        ((ArrayList) term244516).add(term244570);
        term244464 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        setField(term244464, term244464.getClass(), "stack", term244516);
        char[] term244290 = (char[]) newCharArray(0);
        StringBuilder term244748 = new StringBuilder();
        ((StringBuilder) term244748).append(term244290);
        term244688 = newInstance(Class.forName("org.jsoup.parser.Token$Comment"));
        setField(term244688, term244688.getClass(), "data", term244748);
        setBooleanField(term244688, term244688.getClass(), "bogus", true);
        ArrayList term244867 = new ArrayList();
        ((ArrayList) term244867).add((Object)null);
        Object term244866 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        setField(term244866, term244866.getClass(), "outputSettings", null);
        setField(term244866, term244866.getClass(), "parser", null);
        setField(term244866, term244866.getClass(), "quirksMode", null);
        setField(term244866, term244866.getClass(), "location", null);
        setBooleanField(term244866, term244866.getClass(), "updateMetaCharset", false);
        setField(term244866, term244866.getClass(), "tag", null);
        setField(term244866, term244866.getClass(), "shadowChildrenRef", null);
        setField(term244866, term244866.getClass(), "childNodes", term244867);
        setField(term244866, term244866.getClass(), "attributes", null);
        setField(term244866, term244866.getClass(), "baseUri", null);
        setField(term244866, term244866.getClass(), "parentNode", null);
        setIntField(term244866, term244866.getClass(), "siblingIndex", 0);
        ArrayList term244864 = new ArrayList();
        ((ArrayList) term244864).add(term244866);
        term244863 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        setField(term244863, term244863.getClass(), "parser", null);
        setField(term244863, term244863.getClass(), "reader", null);
        setField(term244863, term244863.getClass(), "tokeniser", null);
        setField(term244863, term244863.getClass(), "doc", null);
        setField(term244863, term244863.getClass(), "stack", term244864);
        setField(term244863, term244863.getClass(), "baseUri", null);
        setField(term244863, term244863.getClass(), "currentToken", null);
        setField(term244863, term244863.getClass(), "settings", null);
        setField(term244863, term244863.getClass(), "start", null);
        setField(term244863, term244863.getClass(), "end", null);
        term244868 = newInstance(Class.forName("org.jsoup.parser.Token$Comment"));
        Object term244869 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term244870 = (byte[]) newByteArray(16);
        setField(term244869, term244869.getClass(), "value", term244870);
        setByteField(term244869, term244869.getClass(), "coder", (byte) 0);
        setIntField(term244869, term244869.getClass(), "count", 0);
        setField(term244868, term244868.getClass(), "data", term244869);
        setBooleanField(term244868, term244868.getClass(), "bogus", true);
        setField(term244868, term244868.getClass(), "type", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$Comment");
        Object[] args = new Object[1];
        args[0] = term244688;
        callMethod(klass, "insert", argTypes, term244464, args);
        assertTrue(recursiveEquals(term244464, term244863));
        assertTrue(recursiveEquals(term244688, term244868));
    }

};


