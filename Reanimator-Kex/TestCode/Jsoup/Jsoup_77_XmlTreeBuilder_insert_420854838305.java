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

public class XmlTreeBuilder_insert_420854838305 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term448975;
     Object term449201;
     Object term449297;
     Object term449302;

    public XmlTreeBuilder_insert_420854838305() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term449139 = new ArrayList();
        Object term449087 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        setField(term449087, term449087.getClass(), "childNodes", term449139);
        ArrayList term449027 = new ArrayList();
        ((ArrayList) term449027).add((Object)null);
        ((ArrayList) term449027).add((Object)null);
        ((ArrayList) term449027).add((Object)null);
        ((ArrayList) term449027).add((Object)null);
        ((ArrayList) term449027).add((Object)null);
        ((ArrayList) term449027).add((Object)null);
        ((ArrayList) term449027).add((Object)null);
        ((ArrayList) term449027).add((Object)null);
        ((ArrayList) term449027).add((Object)null);
        ((ArrayList) term449027).add((Object)null);
        ((ArrayList) term449027).add((Object)null);
        ((ArrayList) term449027).add((Object)null);
        ((ArrayList) term449027).add((Object)null);
        ((ArrayList) term449027).add((Object)null);
        ((ArrayList) term449027).add((Object)null);
        ((ArrayList) term449027).add((Object)null);
        ((ArrayList) term449027).add((Object)null);
        ((ArrayList) term449027).add((Object)null);
        ((ArrayList) term449027).add((Object)null);
        ((ArrayList) term449027).add((Object)null);
        ((ArrayList) term449027).add((Object)null);
        ((ArrayList) term449027).add((Object)null);
        ((ArrayList) term449027).add((Object)null);
        ((ArrayList) term449027).add((Object)null);
        ((ArrayList) term449027).add((Object)null);
        ((ArrayList) term449027).add((Object)null);
        ((ArrayList) term449027).add((Object)null);
        ((ArrayList) term449027).add((Object)null);
        ((ArrayList) term449027).add((Object)null);
        ((ArrayList) term449027).add((Object)null);
        ((ArrayList) term449027).add((Object)null);
        ((ArrayList) term449027).add((Object)null);
        ((ArrayList) term449027).add((Object)null);
        ((ArrayList) term449027).add((Object)null);
        ((ArrayList) term449027).add((Object)null);
        ((ArrayList) term449027).add((Object)null);
        ((ArrayList) term449027).add((Object)null);
        ((ArrayList) term449027).add((Object)null);
        ((ArrayList) term449027).add((Object)null);
        ((ArrayList) term449027).add((Object)null);
        ((ArrayList) term449027).add((Object)null);
        ((ArrayList) term449027).add(term449087);
        term448975 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        setField(term448975, term448975.getClass(), "stack", term449027);
        term449201 = newInstance(Class.forName("org.jsoup.parser.Token$CData"));
        setField(term449201, term449201.getClass(), "data", "");
        ArrayList term449301 = new ArrayList();
        ((ArrayList) term449301).add((Object)null);
        Object term449300 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        setField(term449300, term449300.getClass(), "elements", null);
        setField(term449300, term449300.getClass(), "tag", null);
        setField(term449300, term449300.getClass(), "shadowChildrenRef", null);
        setField(term449300, term449300.getClass(), "childNodes", term449301);
        setField(term449300, term449300.getClass(), "attributes", null);
        setField(term449300, term449300.getClass(), "baseUri", null);
        setField(term449300, term449300.getClass(), "parentNode", null);
        setIntField(term449300, term449300.getClass(), "siblingIndex", 0);
        ArrayList term449298 = new ArrayList();
        ((ArrayList) term449298).add((Object)null);
        ((ArrayList) term449298).add((Object)null);
        ((ArrayList) term449298).add((Object)null);
        ((ArrayList) term449298).add((Object)null);
        ((ArrayList) term449298).add((Object)null);
        ((ArrayList) term449298).add((Object)null);
        ((ArrayList) term449298).add((Object)null);
        ((ArrayList) term449298).add((Object)null);
        ((ArrayList) term449298).add((Object)null);
        ((ArrayList) term449298).add((Object)null);
        ((ArrayList) term449298).add((Object)null);
        ((ArrayList) term449298).add((Object)null);
        ((ArrayList) term449298).add((Object)null);
        ((ArrayList) term449298).add((Object)null);
        ((ArrayList) term449298).add((Object)null);
        ((ArrayList) term449298).add((Object)null);
        ((ArrayList) term449298).add((Object)null);
        ((ArrayList) term449298).add((Object)null);
        ((ArrayList) term449298).add((Object)null);
        ((ArrayList) term449298).add((Object)null);
        ((ArrayList) term449298).add((Object)null);
        ((ArrayList) term449298).add((Object)null);
        ((ArrayList) term449298).add((Object)null);
        ((ArrayList) term449298).add((Object)null);
        ((ArrayList) term449298).add((Object)null);
        ((ArrayList) term449298).add((Object)null);
        ((ArrayList) term449298).add((Object)null);
        ((ArrayList) term449298).add((Object)null);
        ((ArrayList) term449298).add((Object)null);
        ((ArrayList) term449298).add((Object)null);
        ((ArrayList) term449298).add((Object)null);
        ((ArrayList) term449298).add((Object)null);
        ((ArrayList) term449298).add((Object)null);
        ((ArrayList) term449298).add((Object)null);
        ((ArrayList) term449298).add((Object)null);
        ((ArrayList) term449298).add((Object)null);
        ((ArrayList) term449298).add((Object)null);
        ((ArrayList) term449298).add((Object)null);
        ((ArrayList) term449298).add((Object)null);
        ((ArrayList) term449298).add((Object)null);
        ((ArrayList) term449298).add((Object)null);
        ((ArrayList) term449298).add(term449300);
        term449297 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        setField(term449297, term449297.getClass(), "reader", null);
        setField(term449297, term449297.getClass(), "tokeniser", null);
        setField(term449297, term449297.getClass(), "doc", null);
        setField(term449297, term449297.getClass(), "stack", term449298);
        setField(term449297, term449297.getClass(), "baseUri", null);
        setField(term449297, term449297.getClass(), "currentToken", null);
        setField(term449297, term449297.getClass(), "errors", null);
        setField(term449297, term449297.getClass(), "settings", null);
        setField(term449297, term449297.getClass(), "start", null);
        setField(term449297, term449297.getClass(), "end", null);
        term449302 = newInstance(Class.forName("org.jsoup.parser.Token$CData"));
        setField(term449302, term449302.getClass(), "data", "");
        setField(term449302, term449302.getClass(), "type", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$Character");
        Object[] args = new Object[1];
        args[0] = term449201;
        callMethod(klass, "insert", argTypes, term448975, args);
        assertTrue(recursiveEquals(term448975, term449297));
        assertTrue(recursiveEquals(term449201, term449302));
    }

};


