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
import java.util.LinkedList;
import java.lang.Object;
import java.util.HashSet;
import java.util.ArrayList;
import java.lang.String;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.LinkedHashMap;

public class Parser_parse_1658204304 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term179;

    public Parser_parse_1658204304() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashSet term195 = new HashSet();
        ArrayList term196 = new ArrayList();
        ((ArrayList) term196).add((Object)null);
        ((ArrayList) term196).add((Object)null);
        ((ArrayList) term196).add((Object)null);
        ((ArrayList) term196).add((Object)null);
        ((ArrayList) term196).add((Object)null);
        ((ArrayList) term196).add((Object)null);
        ((ArrayList) term196).add((Object)null);
        ((ArrayList) term196).add((Object)null);
        Object term183 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term184 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term199 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term184, term184.getClass(), "tagName", null);
        setBooleanField(term184, term184.getClass(), "knownTag", false);
        setBooleanField(term184, term184.getClass(), "isBlock", false);
        setBooleanField(term184, term184.getClass(), "canContainBlock", false);
        setBooleanField(term184, term184.getClass(), "canContainInline", true);
        setBooleanField(term184, term184.getClass(), "optionalClosing", true);
        setBooleanField(term184, term184.getClass(), "empty", true);
        setBooleanField(term184, term184.getClass(), "selfClosing", true);
        setBooleanField(term184, term184.getClass(), "preserveWhitespace", false);
        setField(term184, term184.getClass(), "ancestors", null);
        setField(term184, term184.getClass(), "excludes", null);
        setBooleanField(term184, term184.getClass(), "directDescendant", true);
        setBooleanField(term184, term184.getClass(), "limitChildren", false);
        setField(term183, term183.getClass(), "tag", term184);
        setField(term183, term183.getClass(), "classNames", term195);
        setField(term183, term183.getClass(), "parentNode", null);
        setField(term183, term183.getClass(), "childNodes", term196);
        setField(term199, term199.getClass(), "attributes", null);
        setField(term183, term183.getClass(), "attributes", term199);
        setField(term183, term183.getClass(), "baseUri", "");
        setIntField(term183, term183.getClass(), "siblingIndex", 568599855);
        Object term203 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        setField(term203, term203.getClass(), "tag", null);
        setField(term203, term203.getClass(), "classNames", null);
        setField(term203, term203.getClass(), "parentNode", null);
        setField(term203, term203.getClass(), "childNodes", null);
        setField(term203, term203.getClass(), "attributes", null);
        setField(term203, term203.getClass(), "baseUri", null);
        setIntField(term203, term203.getClass(), "siblingIndex", 1162663216);
        LinkedList term180 = new LinkedList();
        ((LinkedList) term180).add(term183);
        ((LinkedList) term180).add(term203);
        ((LinkedList) term180).add((Object)null);
        ((LinkedList) term180).add((Object)null);
        ((LinkedList) term180).add((Object)null);
        Class<? extends Object> term324 = Class.forName((String) "org.jsoup.nodes.Entities$EscapeMode");
        Field term323 = ((Class) term324).getDeclaredField((String) "base");
        ((Field) term323).setAccessible(true);
        Object enum0 = ((Field) term323).get((Object) null);
        HashMap term250 = new HashMap();
        Set<Object> term517 =  ((Map) term250).keySet();
        HashSet term249 = new HashSet((Collection<? extends Object>) term517);
        ArrayList term256 = new ArrayList();
        ((ArrayList) term256).add((Object)null);
        ((ArrayList) term256).add((Object)null);
        ((ArrayList) term256).add((Object)null);
        ((ArrayList) term256).add((Object)null);
        ((ArrayList) term256).add((Object)null);
        ((ArrayList) term256).add((Object)null);
        ((ArrayList) term256).add((Object)null);
        LinkedHashMap term261 = new LinkedHashMap();
        term179 = newInstance(Class.forName("org.jsoup.parser.Parser"));
        Object term230 = newInstance(Class.forName("org.jsoup.parser.TokenQueue"));
        Object term244 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        Object term245 = newInstance(Class.forName("org.jsoup.nodes.Document$OutputSettings"));
        Object term260 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term179, term179.getClass(), "stack", term180);
        setField(term230, term230.getClass(), "queue", "aKnKipADSo");
        setIntField(term230, term230.getClass(), "pos", -616727354);
        setField(term179, term179.getClass(), "tq", term230);
        setField(term245, term245.getClass(), "escapeMode", enum0);
        setField(term245, term245.getClass(), "charset", null);
        setField(term245, term245.getClass(), "charsetEncoder", null);
        setField(term245, term245.getClass(), "this$0", null);
        setField(term244, term244.getClass(), "outputSettings", term245);
        setField(term244, term244.getClass(), "tag", term184);
        setField(term244, term244.getClass(), "classNames", term249);
        setField(term244, term244.getClass(), "parentNode", null);
        setField(term244, term244.getClass(), "childNodes", term256);
        setField(term260, term260.getClass(), "attributes", term261);
        setField(term244, term244.getClass(), "attributes", term260);
        setField(term244, term244.getClass(), "baseUri", "hxCBltsObl");
        setIntField(term244, term244.getClass(), "siblingIndex", -1955890973);
        setField(term179, term179.getClass(), "doc", term244);
        setField(term179, term179.getClass(), "baseUri", "BndsHwAFMv");
        setBooleanField(term179, term179.getClass(), "relaxed", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Parser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "parse", argTypes, term179, args);
    }

};


