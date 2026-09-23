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
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashMap;

public class Parser_parseStartTag_3943534009 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1597;

    public Parser_parseStartTag_3943534009() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedList term1598 = new LinkedList();
        Class<? extends Object> term1706 = Class.forName((String) "org.jsoup.nodes.Entities$EscapeMode");
        Field term1705 = ((Class) term1706).getDeclaredField((String) "extended");
        ((Field) term1705).setAccessible(true);
        Object enum4 = ((Field) term1705).get((Object) null);
        ArrayList term1641 = new ArrayList();
        ((ArrayList) term1641).add((Object)null);
        ((ArrayList) term1641).add((Object)null);
        ((ArrayList) term1641).add((Object)null);
        ((ArrayList) term1641).add((Object)null);
        ArrayList term1645 = new ArrayList();
        HashMap term1652 = new HashMap();
        Set<Object> term1921 =  ((Map) term1652).keySet();
        HashSet term1651 = new HashSet((Collection<? extends Object>) term1921);
        ArrayList term1658 = new ArrayList();
        ((ArrayList) term1658).add((Object)null);
        ((ArrayList) term1658).add((Object)null);
        ((ArrayList) term1658).add((Object)null);
        ((ArrayList) term1658).add((Object)null);
        LinkedHashMap term1663 = new LinkedHashMap();
        term1597 = newInstance(Class.forName("org.jsoup.parser.Parser"));
        Object term1601 = newInstance(Class.forName("org.jsoup.parser.TokenQueue"));
        Object term1615 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        Object term1616 = newInstance(Class.forName("org.jsoup.nodes.Document$OutputSettings"));
        Object term1620 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term1662 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term1597, term1597.getClass(), "stack", term1598);
        setField(term1601, term1601.getClass(), "queue", "mLUZFTfjle");
        setIntField(term1601, term1601.getClass(), "pos", -655067527);
        setField(term1597, term1597.getClass(), "tq", term1601);
        setField(term1616, term1616.getClass(), "escapeMode", enum4);
        setField(term1616, term1616.getClass(), "charset", null);
        setField(term1616, term1616.getClass(), "charsetEncoder", null);
        setField(term1616, term1616.getClass(), "this$0", null);
        setField(term1615, term1615.getClass(), "outputSettings", term1616);
        setField(term1620, term1620.getClass(), "tagName", "xIeFjkHkOe");
        setBooleanField(term1620, term1620.getClass(), "knownTag", true);
        setBooleanField(term1620, term1620.getClass(), "isBlock", true);
        setBooleanField(term1620, term1620.getClass(), "canContainBlock", false);
        setBooleanField(term1620, term1620.getClass(), "canContainInline", true);
        setBooleanField(term1620, term1620.getClass(), "optionalClosing", true);
        setBooleanField(term1620, term1620.getClass(), "empty", false);
        setBooleanField(term1620, term1620.getClass(), "selfClosing", true);
        setBooleanField(term1620, term1620.getClass(), "preserveWhitespace", true);
        setField(term1620, term1620.getClass(), "ancestors", term1641);
        setField(term1620, term1620.getClass(), "excludes", term1645);
        setBooleanField(term1620, term1620.getClass(), "directDescendant", false);
        setBooleanField(term1620, term1620.getClass(), "limitChildren", false);
        setField(term1615, term1615.getClass(), "tag", term1620);
        setField(term1615, term1615.getClass(), "classNames", term1651);
        setField(term1615, term1615.getClass(), "parentNode", null);
        setField(term1615, term1615.getClass(), "childNodes", term1658);
        setField(term1662, term1662.getClass(), "attributes", term1663);
        setField(term1615, term1615.getClass(), "attributes", term1662);
        setField(term1615, term1615.getClass(), "baseUri", "ZzIujlwVsw");
        setIntField(term1615, term1615.getClass(), "siblingIndex", -6029667);
        setField(term1597, term1597.getClass(), "doc", term1615);
        setField(term1597, term1597.getClass(), "baseUri", "LWyEaeIyAo");
        setBooleanField(term1597, term1597.getClass(), "relaxed", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Parser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "parseStartTag", argTypes, term1597, args);
    }

};


