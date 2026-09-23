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

public class Parser_last_113336966819 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4997;

    public Parser_last_113336966819() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedList term4998 = new LinkedList();
        Class<? extends Object> term5106 = Class.forName((String) "org.jsoup.nodes.Entities$EscapeMode");
        Field term5105 = ((Class) term5106).getDeclaredField((String) "extended");
        ((Field) term5105).setAccessible(true);
        Object enum12 = ((Field) term5105).get((Object) null);
        ArrayList term5041 = new ArrayList();
        ((ArrayList) term5041).add((Object)null);
        ((ArrayList) term5041).add((Object)null);
        ArrayList term5045 = new ArrayList();
        ((ArrayList) term5045).add((Object)null);
        ((ArrayList) term5045).add((Object)null);
        ((ArrayList) term5045).add((Object)null);
        ((ArrayList) term5045).add((Object)null);
        ((ArrayList) term5045).add((Object)null);
        ((ArrayList) term5045).add((Object)null);
        ((ArrayList) term5045).add((Object)null);
        HashMap term5052 = new HashMap();
        Set<Object> term5321 =  ((Map) term5052).keySet();
        HashSet term5051 = new HashSet((Collection<? extends Object>) term5321);
        ArrayList term5058 = new ArrayList();
        ((ArrayList) term5058).add((Object)null);
        ((ArrayList) term5058).add((Object)null);
        ((ArrayList) term5058).add((Object)null);
        ((ArrayList) term5058).add((Object)null);
        ((ArrayList) term5058).add((Object)null);
        ((ArrayList) term5058).add((Object)null);
        ((ArrayList) term5058).add((Object)null);
        ((ArrayList) term5058).add((Object)null);
        LinkedHashMap term5063 = new LinkedHashMap();
        term4997 = newInstance(Class.forName("org.jsoup.parser.Parser"));
        Object term5001 = newInstance(Class.forName("org.jsoup.parser.TokenQueue"));
        Object term5015 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        Object term5016 = newInstance(Class.forName("org.jsoup.nodes.Document$OutputSettings"));
        Object term5020 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term5062 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term4997, term4997.getClass(), "stack", term4998);
        setField(term5001, term5001.getClass(), "queue", "fVdTcjgHdw");
        setIntField(term5001, term5001.getClass(), "pos", -2095575670);
        setField(term4997, term4997.getClass(), "tq", term5001);
        setField(term5016, term5016.getClass(), "escapeMode", enum12);
        setField(term5016, term5016.getClass(), "charset", null);
        setField(term5016, term5016.getClass(), "charsetEncoder", null);
        setField(term5016, term5016.getClass(), "this$0", null);
        setField(term5015, term5015.getClass(), "outputSettings", term5016);
        setField(term5020, term5020.getClass(), "tagName", "wwAwLLcLPp");
        setBooleanField(term5020, term5020.getClass(), "knownTag", true);
        setBooleanField(term5020, term5020.getClass(), "isBlock", false);
        setBooleanField(term5020, term5020.getClass(), "canContainBlock", false);
        setBooleanField(term5020, term5020.getClass(), "canContainInline", true);
        setBooleanField(term5020, term5020.getClass(), "optionalClosing", true);
        setBooleanField(term5020, term5020.getClass(), "empty", true);
        setBooleanField(term5020, term5020.getClass(), "selfClosing", true);
        setBooleanField(term5020, term5020.getClass(), "preserveWhitespace", false);
        setField(term5020, term5020.getClass(), "ancestors", term5041);
        setField(term5020, term5020.getClass(), "excludes", term5045);
        setBooleanField(term5020, term5020.getClass(), "directDescendant", false);
        setBooleanField(term5020, term5020.getClass(), "limitChildren", false);
        setField(term5015, term5015.getClass(), "tag", term5020);
        setField(term5015, term5015.getClass(), "classNames", term5051);
        setField(term5015, term5015.getClass(), "parentNode", null);
        setField(term5015, term5015.getClass(), "childNodes", term5058);
        setField(term5062, term5062.getClass(), "attributes", term5063);
        setField(term5015, term5015.getClass(), "attributes", term5062);
        setField(term5015, term5015.getClass(), "baseUri", "kVAmKknVln");
        setIntField(term5015, term5015.getClass(), "siblingIndex", 1225272962);
        setField(term4997, term4997.getClass(), "doc", term5015);
        setField(term4997, term4997.getClass(), "baseUri", "MRFLbEGYKG");
        setBooleanField(term4997, term4997.getClass(), "relaxed", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Parser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "last", argTypes, term4997, args);
    }

};


