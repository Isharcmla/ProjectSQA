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

public class XmlTreeBuilder_insert_420854838231 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term369850;
     Object term370096;
     Object term370192;
     Object term370197;

    public XmlTreeBuilder_insert_420854838231() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term370026 = new ArrayList();
        Object term369974 = newInstance(Class.forName("org.jsoup.nodes.PseudoTextElement"));
        setField(term369974, term369974.getClass(), "childNodes", term370026);
        ArrayList term369902 = new ArrayList();
        ((ArrayList) term369902).add((Object)null);
        ((ArrayList) term369902).add((Object)null);
        ((ArrayList) term369902).add((Object)null);
        ((ArrayList) term369902).add((Object)null);
        ((ArrayList) term369902).add((Object)null);
        ((ArrayList) term369902).add((Object)null);
        ((ArrayList) term369902).add((Object)null);
        ((ArrayList) term369902).add(term369974);
        term369850 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        setField(term369850, term369850.getClass(), "stack", term369902);
        term370096 = newInstance(Class.forName("org.jsoup.parser.Token$Character"));
        setField(term370096, term370096.getClass(), "data", "");
        ArrayList term370196 = new ArrayList();
        ((ArrayList) term370196).add((Object)null);
        Object term370195 = newInstance(Class.forName("org.jsoup.nodes.PseudoTextElement"));
        setField(term370195, term370195.getClass(), "tag", null);
        setField(term370195, term370195.getClass(), "shadowChildrenRef", null);
        setField(term370195, term370195.getClass(), "childNodes", term370196);
        setField(term370195, term370195.getClass(), "attributes", null);
        setField(term370195, term370195.getClass(), "baseUri", null);
        setField(term370195, term370195.getClass(), "parentNode", null);
        setIntField(term370195, term370195.getClass(), "siblingIndex", 0);
        ArrayList term370193 = new ArrayList();
        ((ArrayList) term370193).add((Object)null);
        ((ArrayList) term370193).add((Object)null);
        ((ArrayList) term370193).add((Object)null);
        ((ArrayList) term370193).add((Object)null);
        ((ArrayList) term370193).add((Object)null);
        ((ArrayList) term370193).add((Object)null);
        ((ArrayList) term370193).add((Object)null);
        ((ArrayList) term370193).add(term370195);
        term370192 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        setField(term370192, term370192.getClass(), "reader", null);
        setField(term370192, term370192.getClass(), "tokeniser", null);
        setField(term370192, term370192.getClass(), "doc", null);
        setField(term370192, term370192.getClass(), "stack", term370193);
        setField(term370192, term370192.getClass(), "baseUri", null);
        setField(term370192, term370192.getClass(), "currentToken", null);
        setField(term370192, term370192.getClass(), "errors", null);
        setField(term370192, term370192.getClass(), "settings", null);
        setField(term370192, term370192.getClass(), "start", null);
        setField(term370192, term370192.getClass(), "end", null);
        term370197 = newInstance(Class.forName("org.jsoup.parser.Token$Character"));
        setField(term370197, term370197.getClass(), "data", "");
        setField(term370197, term370197.getClass(), "type", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$Character");
        Object[] args = new Object[1];
        args[0] = term370096;
        callMethod(klass, "insert", argTypes, term369850, args);
        assertTrue(recursiveEquals(term369850, term370192));
        assertTrue(recursiveEquals(term370096, term370197));
    }

};


