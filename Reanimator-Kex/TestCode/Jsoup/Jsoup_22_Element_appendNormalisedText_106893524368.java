package org.jsoup.nodes;

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
import static org.jsoup.nodes.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.LinkedHashMap;

public class Element_appendNormalisedText_106893524368 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6732;
     Object term6791;
     Object term6811;

    public Element_appendNormalisedText_106893524368() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term6754 = new HashMap();
        Set<Object> term6863 =  ((Map) term6754).keySet();
        HashSet term6753 = new HashSet((Collection<? extends Object>) term6863);
        ArrayList term6762 = new ArrayList();
        ((ArrayList) term6762).add((Object)null);
        ((ArrayList) term6762).add((Object)null);
        ((ArrayList) term6762).add((Object)null);
        LinkedHashMap term6767 = new LinkedHashMap();
        term6732 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term6733 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term6766 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term6733, term6733.getClass(), "tagName", "BJklinBmhN");
        setBooleanField(term6733, term6733.getClass(), "isBlock", false);
        setBooleanField(term6733, term6733.getClass(), "formatAsBlock", true);
        setBooleanField(term6733, term6733.getClass(), "canContainBlock", false);
        setBooleanField(term6733, term6733.getClass(), "canContainInline", false);
        setBooleanField(term6733, term6733.getClass(), "empty", true);
        setBooleanField(term6733, term6733.getClass(), "selfClosing", true);
        setBooleanField(term6733, term6733.getClass(), "preserveWhitespace", true);
        setField(term6732, term6732.getClass(), "tag", term6733);
        setField(term6732, term6732.getClass(), "classNames", term6753);
        setField(term6732, term6732.getClass(), "parentNode", null);
        setField(term6732, term6732.getClass(), "childNodes", term6762);
        setField(term6766, term6766.getClass(), "attributes", term6767);
        setField(term6732, term6732.getClass(), "attributes", term6766);
        setField(term6732, term6732.getClass(), "baseUri", "BcENaQFYSd");
        setIntField(term6732, term6732.getClass(), "siblingIndex", -227365013);
        term6791 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term6792 = (byte[]) newByteArray(16);
        setField(term6791, term6791.getClass(), "value", term6792);
        setByteField(term6791, term6791.getClass(), "coder", (byte) 89);
        setIntField(term6791, term6791.getClass(), "count", 11724947);
        ArrayList term6824 = new ArrayList();
        ((ArrayList) term6824).add((Object)null);
        ((ArrayList) term6824).add((Object)null);
        ((ArrayList) term6824).add((Object)null);
        ((ArrayList) term6824).add((Object)null);
        ((ArrayList) term6824).add((Object)null);
        LinkedHashMap term6829 = new LinkedHashMap();
        term6811 = newInstance(Class.forName("org.jsoup.nodes.TextNode"));
        Object term6828 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term6811, term6811.getClass(), "text", "POPYycoDBy");
        setField(term6811, term6811.getClass(), "parentNode", null);
        setField(term6811, term6811.getClass(), "childNodes", term6824);
        setField(term6828, term6828.getClass(), "attributes", term6829);
        setField(term6811, term6811.getClass(), "attributes", term6828);
        setField(term6811, term6811.getClass(), "baseUri", "TVxGTjeDcu");
        setIntField(term6811, term6811.getClass(), "siblingIndex", 1953277050);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.StringBuilder");
        argTypes[1] = Class.forName("org.jsoup.nodes.TextNode");
        Object[] args = new Object[2];
        args[0] = term6791;
        args[1] = term6811;
        callMethod(klass, "appendNormalisedText", argTypes, term6732, args);
    }

};


