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
import java.lang.Boolean;

public class Parser_addChildToParent_71584410929 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1052;
     Object term1138;
     Object term1232;

    public Parser_addChildToParent_71584410929() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedList term1053 = new LinkedList();
        Character term1060 = new Character('D');
        Character term1063 = new Character('Y');
        LinkedList term1057 = new LinkedList();
        ((LinkedList) term1057).add(term1060);
        ((LinkedList) term1057).add(term1063);
        ((LinkedList) term1057).add((Object)null);
        ((LinkedList) term1057).add((Object)null);
        ((LinkedList) term1057).add((Object)null);
        ((LinkedList) term1057).add((Object)null);
        ArrayList term1092 = new ArrayList();
        ((ArrayList) term1092).add((Object)null);
        HashMap term1097 = new HashMap();
        Set<Object> term25605 =  ((Map) term1097).keySet();
        HashSet term1096 = new HashSet((Collection<? extends Object>) term25605);
        ArrayList term1103 = new ArrayList();
        LinkedHashMap term1108 = new LinkedHashMap();
        term1052 = newInstance(Class.forName("org.jsoup.parser.Parser"));
        Object term1056 = newInstance(Class.forName("org.jsoup.parser.TokenQueue"));
        Object term1072 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        Object term1073 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term1107 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term1052, term1052.getClass(), "stack", term1053);
        setField(term1056, term1056.getClass(), "queue", term1057);
        setField(term1052, term1052.getClass(), "tq", term1056);
        setField(term1073, term1073.getClass(), "tagName", "PXdVZyoJyC");
        setBooleanField(term1073, term1073.getClass(), "isBlock", true);
        setBooleanField(term1073, term1073.getClass(), "canContainBlock", false);
        setBooleanField(term1073, term1073.getClass(), "canContainInline", true);
        setBooleanField(term1073, term1073.getClass(), "optionalClosing", true);
        setBooleanField(term1073, term1073.getClass(), "empty", false);
        setBooleanField(term1073, term1073.getClass(), "preserveWhitespace", false);
        setField(term1073, term1073.getClass(), "ancestors", term1092);
        setField(term1072, term1072.getClass(), "tag", term1073);
        setField(term1072, term1072.getClass(), "classNames", term1096);
        setField(term1072, term1072.getClass(), "parentNode", null);
        setField(term1072, term1072.getClass(), "childNodes", term1103);
        setField(term1107, term1107.getClass(), "attributes", term1108);
        setField(term1072, term1072.getClass(), "attributes", term1107);
        setField(term1072, term1072.getClass(), "baseUri", "SPBstwKFVr");
        setField(term1052, term1052.getClass(), "doc", term1072);
        setField(term1052, term1052.getClass(), "baseUri", "WxYUTuqmIq");
        Object term1160 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term1160, term1160.getClass(), "tagName", null);
        setBooleanField(term1160, term1160.getClass(), "isBlock", false);
        setBooleanField(term1160, term1160.getClass(), "canContainBlock", true);
        setBooleanField(term1160, term1160.getClass(), "canContainInline", false);
        setBooleanField(term1160, term1160.getClass(), "optionalClosing", true);
        setBooleanField(term1160, term1160.getClass(), "empty", false);
        setBooleanField(term1160, term1160.getClass(), "preserveWhitespace", false);
        setField(term1160, term1160.getClass(), "ancestors", null);
        Object term1167 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term1167, term1167.getClass(), "tagName", null);
        setBooleanField(term1167, term1167.getClass(), "isBlock", false);
        setBooleanField(term1167, term1167.getClass(), "canContainBlock", true);
        setBooleanField(term1167, term1167.getClass(), "canContainInline", false);
        setBooleanField(term1167, term1167.getClass(), "optionalClosing", false);
        setBooleanField(term1167, term1167.getClass(), "empty", true);
        setBooleanField(term1167, term1167.getClass(), "preserveWhitespace", false);
        setField(term1167, term1167.getClass(), "ancestors", null);
        Object term1174 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term1174, term1174.getClass(), "tagName", null);
        setBooleanField(term1174, term1174.getClass(), "isBlock", true);
        setBooleanField(term1174, term1174.getClass(), "canContainBlock", true);
        setBooleanField(term1174, term1174.getClass(), "canContainInline", true);
        setBooleanField(term1174, term1174.getClass(), "optionalClosing", false);
        setBooleanField(term1174, term1174.getClass(), "empty", true);
        setBooleanField(term1174, term1174.getClass(), "preserveWhitespace", true);
        setField(term1174, term1174.getClass(), "ancestors", null);
        Object term1181 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term1181, term1181.getClass(), "tagName", null);
        setBooleanField(term1181, term1181.getClass(), "isBlock", false);
        setBooleanField(term1181, term1181.getClass(), "canContainBlock", true);
        setBooleanField(term1181, term1181.getClass(), "canContainInline", true);
        setBooleanField(term1181, term1181.getClass(), "optionalClosing", false);
        setBooleanField(term1181, term1181.getClass(), "empty", true);
        setBooleanField(term1181, term1181.getClass(), "preserveWhitespace", true);
        setField(term1181, term1181.getClass(), "ancestors", null);
        ArrayList term1158 = new ArrayList();
        ((ArrayList) term1158).add(term1160);
        ((ArrayList) term1158).add(term1167);
        ((ArrayList) term1158).add(term1160);
        ((ArrayList) term1158).add(term1174);
        ((ArrayList) term1158).add(term1167);
        ((ArrayList) term1158).add(term1167);
        ((ArrayList) term1158).add(term1181);
        HashMap term1191 = new HashMap();
        Set<Object> term25636 =  ((Map) term1191).keySet();
        HashSet term1190 = new HashSet((Collection<? extends Object>) term25636);
        ArrayList term1209 = new ArrayList();
        ((ArrayList) term1209).add((Object)null);
        ((ArrayList) term1209).add((Object)null);
        ((ArrayList) term1209).add((Object)null);
        ((ArrayList) term1209).add((Object)null);
        ((ArrayList) term1209).add((Object)null);
        ((ArrayList) term1209).add((Object)null);
        ((ArrayList) term1209).add((Object)null);
        ((ArrayList) term1209).add((Object)null);
        ((ArrayList) term1209).add((Object)null);
        LinkedHashMap term1214 = new LinkedHashMap();
        term1138 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term1139 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term1213 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term1139, term1139.getClass(), "tagName", "OeQLvhVERT");
        setBooleanField(term1139, term1139.getClass(), "isBlock", false);
        setBooleanField(term1139, term1139.getClass(), "canContainBlock", true);
        setBooleanField(term1139, term1139.getClass(), "canContainInline", false);
        setBooleanField(term1139, term1139.getClass(), "optionalClosing", false);
        setBooleanField(term1139, term1139.getClass(), "empty", true);
        setBooleanField(term1139, term1139.getClass(), "preserveWhitespace", true);
        setField(term1139, term1139.getClass(), "ancestors", term1158);
        setField(term1138, term1138.getClass(), "tag", term1139);
        setField(term1138, term1138.getClass(), "classNames", term1190);
        setField(term1138, term1138.getClass(), "parentNode", null);
        setField(term1138, term1138.getClass(), "childNodes", term1209);
        setField(term1213, term1213.getClass(), "attributes", term1214);
        setField(term1138, term1138.getClass(), "attributes", term1213);
        setField(term1138, term1138.getClass(), "baseUri", "PJcSNDruWd");
        term1232 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Parser");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.jsoup.nodes.Element");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term1138;
        args[1] = term1232;
        try {
            callMethod(klass, "addChildToParent", argTypes, term1052, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


