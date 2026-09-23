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

public class Selector_findElements_175762179940 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term705;

    public Selector_findElements_175762179940() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term729 = new ArrayList();
        ((ArrayList) term729).add((Object)null);
        ArrayList term733 = new ArrayList();
        ((ArrayList) term733).add((Object)null);
        ((ArrayList) term733).add((Object)null);
        ((ArrayList) term733).add((Object)null);
        ArrayList term737 = new ArrayList();
        ((ArrayList) term737).add((Object)null);
        ((ArrayList) term737).add((Object)null);
        ((ArrayList) term737).add((Object)null);
        HashMap term744 = new HashMap();
        Set<Object> term5732 =  ((Map) term744).keySet();
        HashSet term743 = new HashSet((Collection<? extends Object>) term5732);
        ArrayList term750 = new ArrayList();
        ((ArrayList) term750).add((Object)null);
        ((ArrayList) term750).add((Object)null);
        ((ArrayList) term750).add((Object)null);
        ((ArrayList) term750).add((Object)null);
        ((ArrayList) term750).add((Object)null);
        ((ArrayList) term750).add((Object)null);
        LinkedHashMap term755 = new LinkedHashMap();
        LinkedHashMap term775 = new LinkedHashMap();
        Set<Object> term5743 =  ((Map) term775).keySet();
        LinkedHashSet term774 = new LinkedHashSet((Collection<? extends Object>) term5743);
        term705 = newInstance(Class.forName("org.jsoup.select.Selector"));
        Object term706 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term707 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term754 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object term799 = newInstance(Class.forName("org.jsoup.parser.TokenQueue"));
        setField(term707, term707.getClass(), "tagName", "PtirvZmsGt");
        setBooleanField(term707, term707.getClass(), "knownTag", false);
        setBooleanField(term707, term707.getClass(), "isBlock", false);
        setBooleanField(term707, term707.getClass(), "formatAsBlock", true);
        setBooleanField(term707, term707.getClass(), "canContainBlock", true);
        setBooleanField(term707, term707.getClass(), "canContainInline", true);
        setBooleanField(term707, term707.getClass(), "optionalClosing", false);
        setBooleanField(term707, term707.getClass(), "empty", true);
        setBooleanField(term707, term707.getClass(), "selfClosing", true);
        setBooleanField(term707, term707.getClass(), "preserveWhitespace", true);
        setField(term707, term707.getClass(), "ancestors", term729);
        setField(term707, term707.getClass(), "excludes", term733);
        setField(term707, term707.getClass(), "ignoreEndTags", term737);
        setBooleanField(term707, term707.getClass(), "directDescendant", false);
        setBooleanField(term707, term707.getClass(), "limitChildren", false);
        setField(term706, term706.getClass(), "tag", term707);
        setField(term706, term706.getClass(), "classNames", term743);
        setField(term706, term706.getClass(), "parentNode", null);
        setField(term706, term706.getClass(), "childNodes", term750);
        setField(term754, term754.getClass(), "attributes", term755);
        setField(term706, term706.getClass(), "attributes", term754);
        setField(term706, term706.getClass(), "baseUri", "DSNsTGYXDF");
        setIntField(term706, term706.getClass(), "siblingIndex", 1622346318);
        setField(term705, term705.getClass(), "root", term706);
        setField(term705, term705.getClass(), "elements", term774);
        setField(term705, term705.getClass(), "query", "vwbEQQNQrx");
        setField(term799, term799.getClass(), "queue", "xtftXXMbem");
        setIntField(term799, term799.getClass(), "pos", -655067527);
        setField(term705, term705.getClass(), "tq", term799);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.select.Selector");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "findElements", argTypes, term705, args);
            assertTrue(false);
        }
        catch (StringIndexOutOfBoundsException e) {
        }

    }

};


