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

public class Parser_parseXmlDecl_16186162676 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term915;

    public Parser_parseXmlDecl_16186162676() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashSet term931 = new HashSet();
        ArrayList term932 = new ArrayList();
        ((ArrayList) term932).add((Object)null);
        Object term919 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term920 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term935 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term920, term920.getClass(), "tagName", null);
        setBooleanField(term920, term920.getClass(), "knownTag", false);
        setBooleanField(term920, term920.getClass(), "isBlock", true);
        setBooleanField(term920, term920.getClass(), "canContainBlock", true);
        setBooleanField(term920, term920.getClass(), "canContainInline", false);
        setBooleanField(term920, term920.getClass(), "optionalClosing", true);
        setBooleanField(term920, term920.getClass(), "empty", true);
        setBooleanField(term920, term920.getClass(), "selfClosing", false);
        setBooleanField(term920, term920.getClass(), "preserveWhitespace", false);
        setField(term920, term920.getClass(), "ancestors", null);
        setField(term920, term920.getClass(), "excludes", null);
        setBooleanField(term920, term920.getClass(), "directDescendant", true);
        setBooleanField(term920, term920.getClass(), "limitChildren", false);
        setField(term919, term919.getClass(), "tag", term920);
        setField(term919, term919.getClass(), "classNames", term931);
        setField(term919, term919.getClass(), "parentNode", null);
        setField(term919, term919.getClass(), "childNodes", term932);
        setField(term935, term935.getClass(), "attributes", null);
        setField(term919, term919.getClass(), "attributes", term935);
        setField(term919, term919.getClass(), "baseUri", "");
        setIntField(term919, term919.getClass(), "siblingIndex", -883034806);
        Object term939 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        setField(term939, term939.getClass(), "tag", term920);
        setField(term939, term939.getClass(), "classNames", null);
        setField(term939, term939.getClass(), "parentNode", null);
        setField(term939, term939.getClass(), "childNodes", null);
        setField(term939, term939.getClass(), "attributes", null);
        setField(term939, term939.getClass(), "baseUri", null);
        setIntField(term939, term939.getClass(), "siblingIndex", 1585847225);
        LinkedList term916 = new LinkedList();
        ((LinkedList) term916).add(term919);
        ((LinkedList) term916).add(term939);
        Class<? extends Object> term1016 = Class.forName((String) "org.jsoup.nodes.Entities$EscapeMode");
        Field term1015 = ((Class) term1016).getDeclaredField((String) "base");
        ((Field) term1015).setAccessible(true);
        Object enum2 = ((Field) term1015).get((Object) null);
        HashMap term962 = new HashMap();
        Set<Object> term1209 =  ((Map) term962).keySet();
        HashSet term961 = new HashSet((Collection<? extends Object>) term1209);
        ArrayList term968 = new ArrayList();
        LinkedHashMap term973 = new LinkedHashMap();
        term915 = newInstance(Class.forName("org.jsoup.parser.Parser"));
        Object term942 = newInstance(Class.forName("org.jsoup.parser.TokenQueue"));
        Object term956 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        Object term957 = newInstance(Class.forName("org.jsoup.nodes.Document$OutputSettings"));
        Object term972 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term915, term915.getClass(), "stack", term916);
        setField(term942, term942.getClass(), "queue", "XqgfKFvPSD");
        setIntField(term942, term942.getClass(), "pos", 597278769);
        setField(term915, term915.getClass(), "tq", term942);
        setField(term957, term957.getClass(), "escapeMode", enum2);
        setField(term957, term957.getClass(), "charset", null);
        setField(term957, term957.getClass(), "charsetEncoder", null);
        setField(term957, term957.getClass(), "this$0", null);
        setField(term956, term956.getClass(), "outputSettings", term957);
        setField(term956, term956.getClass(), "tag", term920);
        setField(term956, term956.getClass(), "classNames", term961);
        setField(term956, term956.getClass(), "parentNode", null);
        setField(term956, term956.getClass(), "childNodes", term968);
        setField(term972, term972.getClass(), "attributes", term973);
        setField(term956, term956.getClass(), "attributes", term972);
        setField(term956, term956.getClass(), "baseUri", "QXzGXbEXMu");
        setIntField(term956, term956.getClass(), "siblingIndex", -1685132342);
        setField(term915, term915.getClass(), "doc", term956);
        setField(term915, term915.getClass(), "baseUri", "qxSDVejjiY");
        setBooleanField(term915, term915.getClass(), "relaxed", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Parser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "parseXmlDecl", argTypes, term915, args);
    }

};


