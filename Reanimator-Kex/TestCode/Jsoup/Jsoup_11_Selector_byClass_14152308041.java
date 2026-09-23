package org.jsoup.select;

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
import java.lang.StringIndexOutOfBoundsException;
import static org.jsoup.select.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

public class Selector_byClass_14152308041 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1033;

    public Selector_byClass_14152308041() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1057 = new ArrayList();
        ((ArrayList) term1057).add((Object)null);
        ((ArrayList) term1057).add((Object)null);
        ((ArrayList) term1057).add((Object)null);
        ((ArrayList) term1057).add((Object)null);
        ((ArrayList) term1057).add((Object)null);
        ((ArrayList) term1057).add((Object)null);
        ((ArrayList) term1057).add((Object)null);
        ((ArrayList) term1057).add((Object)null);
        ArrayList term1061 = new ArrayList();
        ArrayList term1065 = new ArrayList();
        ((ArrayList) term1065).add((Object)null);
        ((ArrayList) term1065).add((Object)null);
        HashMap term1072 = new HashMap();
        Set<Object> term6779 =  ((Map) term1072).keySet();
        HashSet term1071 = new HashSet((Collection<? extends Object>) term6779);
        ArrayList term1078 = new ArrayList();
        ((ArrayList) term1078).add((Object)null);
        ((ArrayList) term1078).add((Object)null);
        LinkedHashMap term1083 = new LinkedHashMap();
        LinkedHashMap term1103 = new LinkedHashMap();
        Set<Object> term6790 =  ((Map) term1103).keySet();
        LinkedHashSet term1102 = new LinkedHashSet((Collection<? extends Object>) term6790);
        term1033 = newInstance(Class.forName("org.jsoup.select.Selector"));
        Object term1034 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term1035 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term1082 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object term1121 = newInstance(Class.forName("org.jsoup.parser.TokenQueue"));
        setField(term1035, term1035.getClass(), "tagName", "PsqusYmejD");
        setBooleanField(term1035, term1035.getClass(), "knownTag", false);
        setBooleanField(term1035, term1035.getClass(), "isBlock", false);
        setBooleanField(term1035, term1035.getClass(), "formatAsBlock", true);
        setBooleanField(term1035, term1035.getClass(), "canContainBlock", false);
        setBooleanField(term1035, term1035.getClass(), "canContainInline", true);
        setBooleanField(term1035, term1035.getClass(), "optionalClosing", true);
        setBooleanField(term1035, term1035.getClass(), "empty", true);
        setBooleanField(term1035, term1035.getClass(), "selfClosing", true);
        setBooleanField(term1035, term1035.getClass(), "preserveWhitespace", true);
        setField(term1035, term1035.getClass(), "ancestors", term1057);
        setField(term1035, term1035.getClass(), "excludes", term1061);
        setField(term1035, term1035.getClass(), "ignoreEndTags", term1065);
        setBooleanField(term1035, term1035.getClass(), "directDescendant", true);
        setBooleanField(term1035, term1035.getClass(), "limitChildren", false);
        setField(term1034, term1034.getClass(), "tag", term1035);
        setField(term1034, term1034.getClass(), "classNames", term1071);
        setField(term1034, term1034.getClass(), "parentNode", null);
        setField(term1034, term1034.getClass(), "childNodes", term1078);
        setField(term1082, term1082.getClass(), "attributes", term1083);
        setField(term1034, term1034.getClass(), "attributes", term1082);
        setField(term1034, term1034.getClass(), "baseUri", "nRvKihUSPj");
        setIntField(term1034, term1034.getClass(), "siblingIndex", 1962444399);
        setField(term1033, term1033.getClass(), "root", term1034);
        setField(term1033, term1033.getClass(), "elements", term1102);
        setField(term1033, term1033.getClass(), "query", "BbNeQJpYPr");
        setField(term1121, term1121.getClass(), "queue", "riMtzCoxNj");
        setIntField(term1121, term1121.getClass(), "pos", 767834723);
        setField(term1033, term1033.getClass(), "tq", term1121);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.select.Selector");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "byClass", argTypes, term1033, args);
            assertTrue(false);
        }
        catch (StringIndexOutOfBoundsException e) {
        }

    }

};


