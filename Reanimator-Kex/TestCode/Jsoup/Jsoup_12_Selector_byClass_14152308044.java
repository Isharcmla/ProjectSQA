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

public class Selector_byClass_14152308044 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1013;

    public Selector_byClass_14152308044() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1037 = new ArrayList();
        ((ArrayList) term1037).add((Object)null);
        ((ArrayList) term1037).add((Object)null);
        ((ArrayList) term1037).add((Object)null);
        ((ArrayList) term1037).add((Object)null);
        ((ArrayList) term1037).add((Object)null);
        ((ArrayList) term1037).add((Object)null);
        ((ArrayList) term1037).add((Object)null);
        ((ArrayList) term1037).add((Object)null);
        ArrayList term1041 = new ArrayList();
        ArrayList term1045 = new ArrayList();
        ((ArrayList) term1045).add((Object)null);
        ((ArrayList) term1045).add((Object)null);
        HashMap term1052 = new HashMap();
        Set<Object> term6940 =  ((Map) term1052).keySet();
        HashSet term1051 = new HashSet((Collection<? extends Object>) term6940);
        ArrayList term1058 = new ArrayList();
        ((ArrayList) term1058).add((Object)null);
        ((ArrayList) term1058).add((Object)null);
        LinkedHashMap term1063 = new LinkedHashMap();
        LinkedHashMap term1083 = new LinkedHashMap();
        Set<Object> term6951 =  ((Map) term1083).keySet();
        LinkedHashSet term1082 = new LinkedHashSet((Collection<? extends Object>) term6951);
        term1013 = newInstance(Class.forName("org.jsoup.select.Selector"));
        Object term1014 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term1015 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term1062 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object term1101 = newInstance(Class.forName("org.jsoup.parser.TokenQueue"));
        setField(term1015, term1015.getClass(), "tagName", "QSrDQfEsTR");
        setBooleanField(term1015, term1015.getClass(), "knownTag", false);
        setBooleanField(term1015, term1015.getClass(), "isBlock", false);
        setBooleanField(term1015, term1015.getClass(), "formatAsBlock", true);
        setBooleanField(term1015, term1015.getClass(), "canContainBlock", false);
        setBooleanField(term1015, term1015.getClass(), "canContainInline", true);
        setBooleanField(term1015, term1015.getClass(), "optionalClosing", true);
        setBooleanField(term1015, term1015.getClass(), "empty", true);
        setBooleanField(term1015, term1015.getClass(), "selfClosing", true);
        setBooleanField(term1015, term1015.getClass(), "preserveWhitespace", true);
        setField(term1015, term1015.getClass(), "ancestors", term1037);
        setField(term1015, term1015.getClass(), "excludes", term1041);
        setField(term1015, term1015.getClass(), "ignoreEndTags", term1045);
        setBooleanField(term1015, term1015.getClass(), "directDescendant", true);
        setBooleanField(term1015, term1015.getClass(), "limitChildren", false);
        setField(term1014, term1014.getClass(), "tag", term1015);
        setField(term1014, term1014.getClass(), "classNames", term1051);
        setField(term1014, term1014.getClass(), "parentNode", null);
        setField(term1014, term1014.getClass(), "childNodes", term1058);
        setField(term1062, term1062.getClass(), "attributes", term1063);
        setField(term1014, term1014.getClass(), "attributes", term1062);
        setField(term1014, term1014.getClass(), "baseUri", "UDaboHZHhz");
        setIntField(term1014, term1014.getClass(), "siblingIndex", 1962444399);
        setField(term1013, term1013.getClass(), "root", term1014);
        setField(term1013, term1013.getClass(), "elements", term1082);
        setField(term1013, term1013.getClass(), "query", "nRvKihUSPj");
        setField(term1101, term1101.getClass(), "queue", "BbNeQJpYPr");
        setIntField(term1101, term1101.getClass(), "pos", 767834723);
        setField(term1013, term1013.getClass(), "tq", term1101);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.select.Selector");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "byClass", argTypes, term1013, args);
            assertTrue(false);
        }
        catch (StringIndexOutOfBoundsException e) {
        }

    }

};


