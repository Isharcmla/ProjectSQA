package org.jsoup.safety;

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
import static org.jsoup.safety.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.jsoup.safety.EqualityUtils.*;
import java.util.HashMap;
import java.util.Map;
import java.lang.Object;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.LinkedHashMap;

public class Whitelist_isSafeAttribute_52849366227 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term568;
     Object term603;
     Object term668;
     Object term12921;
     Object term12926;
     Object term12931;

    public Whitelist_isSafeAttribute_52849366227() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term570 = new HashMap();
        Set<Object> term12944 =  ((Map) term570).keySet();
        HashSet term569 = new HashSet((Collection<? extends Object>) term12944);
        HashMap term575 = new HashMap();
        HashMap term580 = new HashMap();
        HashMap term585 = new HashMap();
        term568 = newInstance(Class.forName("org.jsoup.safety.Whitelist"));
        setField(term568, term568.getClass(), "tagNames", term569);
        setField(term568, term568.getClass(), "attributes", term575);
        setField(term568, term568.getClass(), "enforcedAttributes", term580);
        setField(term568, term568.getClass(), "protocols", term585);
        setBooleanField(term568, term568.getClass(), "preserveRelativeLinks", true);
        HashMap term625 = new HashMap();
        Set<Object> term12965 =  ((Map) term625).keySet();
        HashSet term624 = new HashSet((Collection<? extends Object>) term12965);
        ArrayList term639 = new ArrayList();
        ((ArrayList) term639).add((Object)null);
        LinkedHashMap term644 = new LinkedHashMap();
        term603 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term604 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term643 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term604, term604.getClass(), "tagName", "hNxWaHcfhY");
        setBooleanField(term604, term604.getClass(), "isBlock", false);
        setBooleanField(term604, term604.getClass(), "formatAsBlock", true);
        setBooleanField(term604, term604.getClass(), "canContainBlock", false);
        setBooleanField(term604, term604.getClass(), "canContainInline", true);
        setBooleanField(term604, term604.getClass(), "empty", false);
        setBooleanField(term604, term604.getClass(), "selfClosing", true);
        setBooleanField(term604, term604.getClass(), "preserveWhitespace", false);
        setField(term603, term603.getClass(), "tag", term604);
        setField(term603, term603.getClass(), "classNames", term624);
        setField(term603, term603.getClass(), "parentNode", null);
        setField(term603, term603.getClass(), "childNodes", term639);
        setField(term643, term643.getClass(), "attributes", term644);
        setField(term603, term603.getClass(), "attributes", term643);
        setField(term603, term603.getClass(), "baseUri", "IoAlmYsBwc");
        setIntField(term603, term603.getClass(), "siblingIndex", 568599855);
        term668 = newInstance(Class.forName("org.jsoup.nodes.Attribute"));
        setField(term668, term668.getClass(), "key", "TEParAifyi");
        setField(term668, term668.getClass(), "value", "OWDIEULEFu");
        term12921 = newInstance(Class.forName("org.jsoup.safety.Whitelist$TagName"));
        setField(term12921, term12921.getClass(), "value", ":all");
        term12926 = newInstance(Class.forName("org.jsoup.nodes.Attribute"));
        setField(term12926, term12926.getClass(), "key", "TEParAifyi");
        setField(term12926, term12926.getClass(), "value", "OWDIEULEFu");
        HashMap term12936 = new HashMap();
        Set<Object> term13040 =  ((Map) term12936).keySet();
        HashSet term12935 = new HashSet((Collection<? extends Object>) term13040);
        ArrayList term12937 = new ArrayList();
        ((ArrayList) term12937).add((Object)null);
        LinkedHashMap term12940 = new LinkedHashMap();
        term12931 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term12932 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term12939 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term12932, term12932.getClass(), "tagName", "hNxWaHcfhY");
        setBooleanField(term12932, term12932.getClass(), "isBlock", false);
        setBooleanField(term12932, term12932.getClass(), "formatAsBlock", true);
        setBooleanField(term12932, term12932.getClass(), "canContainBlock", false);
        setBooleanField(term12932, term12932.getClass(), "canContainInline", true);
        setBooleanField(term12932, term12932.getClass(), "empty", false);
        setBooleanField(term12932, term12932.getClass(), "selfClosing", true);
        setBooleanField(term12932, term12932.getClass(), "preserveWhitespace", false);
        setField(term12931, term12931.getClass(), "tag", term12932);
        setField(term12931, term12931.getClass(), "classNames", term12935);
        setField(term12931, term12931.getClass(), "parentNode", null);
        setField(term12931, term12931.getClass(), "childNodes", term12937);
        setField(term12939, term12939.getClass(), "attributes", term12940);
        setField(term12931, term12931.getClass(), "attributes", term12939);
        setField(term12931, term12931.getClass(), "baseUri", "IoAlmYsBwc");
        setIntField(term12931, term12931.getClass(), "siblingIndex", 568599855);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.safety.Whitelist");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("org.jsoup.nodes.Element");
        argTypes[2] = Class.forName("org.jsoup.nodes.Attribute");
        Object[] args = new Object[3];
        args[0] = "pCTimMblYc";
        args[1] = term603;
        args[2] = term668;
        Object retValue = callMethod(klass, "isSafeAttribute", argTypes, term568, args);
        assertTrue(recursiveEquals(term568, term12921));
        assertTrue(recursiveEquals(term603, term12926));
        assertTrue(recursiveEquals(term668, term12931));
        assertTrue(recursiveEquals(retValue, false));
    }

};


