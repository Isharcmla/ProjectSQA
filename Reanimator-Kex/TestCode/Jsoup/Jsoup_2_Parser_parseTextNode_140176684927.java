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
import java.lang.NullPointerException;
import static org.jsoup.parser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.LinkedList;
import java.lang.Object;
import java.lang.Character;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashMap;

public class Parser_parseTextNode_140176684927 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term781;

    public Parser_parseTextNode_140176684927() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedList term782 = new LinkedList();
        Character term789 = new Character('Q');
        Character term792 = new Character('H');
        LinkedList term786 = new LinkedList();
        ((LinkedList) term786).add(term789);
        ((LinkedList) term786).add(term792);
        ((LinkedList) term786).add((Object)null);
        ((LinkedList) term786).add((Object)null);
        ((LinkedList) term786).add((Object)null);
        ArrayList term821 = new ArrayList();
        ((ArrayList) term821).add((Object)null);
        ((ArrayList) term821).add((Object)null);
        ((ArrayList) term821).add((Object)null);
        ((ArrayList) term821).add((Object)null);
        ((ArrayList) term821).add((Object)null);
        ((ArrayList) term821).add((Object)null);
        HashMap term826 = new HashMap();
        Set<Object> term24461 =  ((Map) term826).keySet();
        HashSet term825 = new HashSet((Collection<? extends Object>) term24461);
        ArrayList term832 = new ArrayList();
        ((ArrayList) term832).add((Object)null);
        ((ArrayList) term832).add((Object)null);
        ((ArrayList) term832).add((Object)null);
        ((ArrayList) term832).add((Object)null);
        ((ArrayList) term832).add((Object)null);
        ((ArrayList) term832).add((Object)null);
        ((ArrayList) term832).add((Object)null);
        ((ArrayList) term832).add((Object)null);
        LinkedHashMap term837 = new LinkedHashMap();
        term781 = newInstance(Class.forName("org.jsoup.parser.Parser"));
        Object term785 = newInstance(Class.forName("org.jsoup.parser.TokenQueue"));
        Object term801 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        Object term802 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term836 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term781, term781.getClass(), "stack", term782);
        setField(term785, term785.getClass(), "queue", term786);
        setField(term781, term781.getClass(), "tq", term785);
        setField(term802, term802.getClass(), "tagName", "UKAReurpHG");
        setBooleanField(term802, term802.getClass(), "isBlock", false);
        setBooleanField(term802, term802.getClass(), "canContainBlock", true);
        setBooleanField(term802, term802.getClass(), "canContainInline", false);
        setBooleanField(term802, term802.getClass(), "optionalClosing", true);
        setBooleanField(term802, term802.getClass(), "empty", false);
        setBooleanField(term802, term802.getClass(), "preserveWhitespace", false);
        setField(term802, term802.getClass(), "ancestors", term821);
        setField(term801, term801.getClass(), "tag", term802);
        setField(term801, term801.getClass(), "classNames", term825);
        setField(term801, term801.getClass(), "parentNode", null);
        setField(term801, term801.getClass(), "childNodes", term832);
        setField(term836, term836.getClass(), "attributes", term837);
        setField(term801, term801.getClass(), "attributes", term836);
        setField(term801, term801.getClass(), "baseUri", "doQLHkjpNm");
        setField(term781, term781.getClass(), "doc", term801);
        setField(term781, term781.getClass(), "baseUri", "lCyLIcSuom");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Parser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "parseTextNode", argTypes, term781, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


