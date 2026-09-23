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

public class XmlTreeBuilder_insert_196792529281 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term207781;
     Object term208011;
     Object term208180;
     Object term208185;

    public XmlTreeBuilder_insert_196792529281() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term207945 = new ArrayList();
        Object term207893 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        setField(term207893, term207893.getClass(), "childNodes", term207945);
        ArrayList term207833 = new ArrayList();
        ((ArrayList) term207833).add(term207893);
        term207781 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        setField(term207781, term207781.getClass(), "stack", term207833);
        char[] term207609 = (char[]) newCharArray(0);
        StringBuilder term208071 = new StringBuilder();
        ((StringBuilder) term208071).append(term207609);
        term208011 = newInstance(Class.forName("org.jsoup.parser.Token$Comment"));
        setField(term208011, term208011.getClass(), "data", term208071);
        setBooleanField(term208011, term208011.getClass(), "bogus", true);
        ArrayList term208184 = new ArrayList();
        ((ArrayList) term208184).add((Object)null);
        Object term208183 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        setField(term208183, term208183.getClass(), "elements", null);
        setField(term208183, term208183.getClass(), "tag", null);
        setField(term208183, term208183.getClass(), "shadowChildrenRef", null);
        setField(term208183, term208183.getClass(), "childNodes", term208184);
        setField(term208183, term208183.getClass(), "attributes", null);
        setField(term208183, term208183.getClass(), "baseUri", null);
        setField(term208183, term208183.getClass(), "parentNode", null);
        setIntField(term208183, term208183.getClass(), "siblingIndex", 0);
        ArrayList term208181 = new ArrayList();
        ((ArrayList) term208181).add(term208183);
        term208180 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        setField(term208180, term208180.getClass(), "reader", null);
        setField(term208180, term208180.getClass(), "tokeniser", null);
        setField(term208180, term208180.getClass(), "doc", null);
        setField(term208180, term208180.getClass(), "stack", term208181);
        setField(term208180, term208180.getClass(), "baseUri", null);
        setField(term208180, term208180.getClass(), "currentToken", null);
        setField(term208180, term208180.getClass(), "errors", null);
        setField(term208180, term208180.getClass(), "settings", null);
        setField(term208180, term208180.getClass(), "start", null);
        setField(term208180, term208180.getClass(), "end", null);
        term208185 = newInstance(Class.forName("org.jsoup.parser.Token$Comment"));
        Object term208186 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term208187 = (byte[]) newByteArray(16);
        setField(term208186, term208186.getClass(), "value", term208187);
        setByteField(term208186, term208186.getClass(), "coder", (byte) 0);
        setIntField(term208186, term208186.getClass(), "count", 0);
        setField(term208185, term208185.getClass(), "data", term208186);
        setBooleanField(term208185, term208185.getClass(), "bogus", true);
        setField(term208185, term208185.getClass(), "type", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$Comment");
        Object[] args = new Object[1];
        args[0] = term208011;
        callMethod(klass, "insert", argTypes, term207781, args);
        assertTrue(recursiveEquals(term207781, term208180));
        assertTrue(recursiveEquals(term208011, term208185));
    }

};


