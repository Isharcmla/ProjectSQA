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

public class Parser_parseCdata_83521874313 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2672;

    public Parser_parseCdata_83521874313() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashSet term2688 = new HashSet();
        ArrayList term2689 = new ArrayList();
        ((ArrayList) term2689).add((Object)null);
        ((ArrayList) term2689).add((Object)null);
        ((ArrayList) term2689).add((Object)null);
        ((ArrayList) term2689).add((Object)null);
        ((ArrayList) term2689).add((Object)null);
        Object term2676 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term2677 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term2692 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term2677, term2677.getClass(), "tagName", null);
        setBooleanField(term2677, term2677.getClass(), "knownTag", true);
        setBooleanField(term2677, term2677.getClass(), "isBlock", true);
        setBooleanField(term2677, term2677.getClass(), "canContainBlock", true);
        setBooleanField(term2677, term2677.getClass(), "canContainInline", false);
        setBooleanField(term2677, term2677.getClass(), "optionalClosing", false);
        setBooleanField(term2677, term2677.getClass(), "empty", false);
        setBooleanField(term2677, term2677.getClass(), "selfClosing", false);
        setBooleanField(term2677, term2677.getClass(), "preserveWhitespace", false);
        setField(term2677, term2677.getClass(), "ancestors", null);
        setField(term2677, term2677.getClass(), "excludes", null);
        setBooleanField(term2677, term2677.getClass(), "directDescendant", true);
        setBooleanField(term2677, term2677.getClass(), "limitChildren", true);
        setField(term2676, term2676.getClass(), "tag", term2677);
        setField(term2676, term2676.getClass(), "classNames", term2688);
        setField(term2676, term2676.getClass(), "parentNode", null);
        setField(term2676, term2676.getClass(), "childNodes", term2689);
        setField(term2692, term2692.getClass(), "attributes", null);
        setField(term2676, term2676.getClass(), "attributes", term2692);
        setField(term2676, term2676.getClass(), "baseUri", "");
        setIntField(term2676, term2676.getClass(), "siblingIndex", -1530420153);
        LinkedList term2673 = new LinkedList();
        ((LinkedList) term2673).add(term2676);
        Class<? extends Object> term2801 = Class.forName((String) "org.jsoup.nodes.Entities$EscapeMode");
        Field term2800 = ((Class) term2801).getDeclaredField((String) "base");
        ((Field) term2800).setAccessible(true);
        Object enum7 = ((Field) term2800).get((Object) null);
        ArrayList term2736 = new ArrayList();
        ((ArrayList) term2736).add((Object)null);
        ((ArrayList) term2736).add((Object)null);
        ((ArrayList) term2736).add((Object)null);
        ArrayList term2740 = new ArrayList();
        ((ArrayList) term2740).add((Object)null);
        ((ArrayList) term2740).add((Object)null);
        ((ArrayList) term2740).add((Object)null);
        ((ArrayList) term2740).add((Object)null);
        ((ArrayList) term2740).add((Object)null);
        HashMap term2747 = new HashMap();
        Set<Object> term3004 =  ((Map) term2747).keySet();
        HashSet term2746 = new HashSet((Collection<? extends Object>) term3004);
        ArrayList term2753 = new ArrayList();
        ((ArrayList) term2753).add((Object)null);
        ((ArrayList) term2753).add((Object)null);
        ((ArrayList) term2753).add((Object)null);
        ((ArrayList) term2753).add((Object)null);
        ((ArrayList) term2753).add((Object)null);
        ((ArrayList) term2753).add((Object)null);
        ((ArrayList) term2753).add((Object)null);
        ((ArrayList) term2753).add((Object)null);
        ((ArrayList) term2753).add((Object)null);
        LinkedHashMap term2758 = new LinkedHashMap();
        term2672 = newInstance(Class.forName("org.jsoup.parser.Parser"));
        Object term2696 = newInstance(Class.forName("org.jsoup.parser.TokenQueue"));
        Object term2710 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        Object term2711 = newInstance(Class.forName("org.jsoup.nodes.Document$OutputSettings"));
        Object term2715 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term2757 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term2672, term2672.getClass(), "stack", term2673);
        setField(term2696, term2696.getClass(), "queue", "nghfqDXyCG");
        setIntField(term2696, term2696.getClass(), "pos", -469968304);
        setField(term2672, term2672.getClass(), "tq", term2696);
        setField(term2711, term2711.getClass(), "escapeMode", enum7);
        setField(term2711, term2711.getClass(), "charset", null);
        setField(term2711, term2711.getClass(), "charsetEncoder", null);
        setField(term2711, term2711.getClass(), "this$0", null);
        setField(term2710, term2710.getClass(), "outputSettings", term2711);
        setField(term2715, term2715.getClass(), "tagName", "EwQBhZjCIT");
        setBooleanField(term2715, term2715.getClass(), "knownTag", true);
        setBooleanField(term2715, term2715.getClass(), "isBlock", false);
        setBooleanField(term2715, term2715.getClass(), "canContainBlock", false);
        setBooleanField(term2715, term2715.getClass(), "canContainInline", false);
        setBooleanField(term2715, term2715.getClass(), "optionalClosing", true);
        setBooleanField(term2715, term2715.getClass(), "empty", false);
        setBooleanField(term2715, term2715.getClass(), "selfClosing", true);
        setBooleanField(term2715, term2715.getClass(), "preserveWhitespace", false);
        setField(term2715, term2715.getClass(), "ancestors", term2736);
        setField(term2715, term2715.getClass(), "excludes", term2740);
        setBooleanField(term2715, term2715.getClass(), "directDescendant", true);
        setBooleanField(term2715, term2715.getClass(), "limitChildren", true);
        setField(term2710, term2710.getClass(), "tag", term2715);
        setField(term2710, term2710.getClass(), "classNames", term2746);
        setField(term2710, term2710.getClass(), "parentNode", null);
        setField(term2710, term2710.getClass(), "childNodes", term2753);
        setField(term2757, term2757.getClass(), "attributes", term2758);
        setField(term2710, term2710.getClass(), "attributes", term2757);
        setField(term2710, term2710.getClass(), "baseUri", "UKAReurpHG");
        setIntField(term2710, term2710.getClass(), "siblingIndex", -1145578966);
        setField(term2672, term2672.getClass(), "doc", term2710);
        setField(term2672, term2672.getClass(), "baseUri", "WVRMUmrljA");
        setBooleanField(term2672, term2672.getClass(), "relaxed", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Parser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "parseCdata", argTypes, term2672, args);
    }

};


