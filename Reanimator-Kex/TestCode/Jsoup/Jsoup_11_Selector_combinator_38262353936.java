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
import java.lang.NullPointerException;
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

public class Selector_combinator_38262353936 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term561;

    public Selector_combinator_38262353936() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term585 = new ArrayList();
        ((ArrayList) term585).add((Object)null);
        ((ArrayList) term585).add((Object)null);
        ((ArrayList) term585).add((Object)null);
        ((ArrayList) term585).add((Object)null);
        ((ArrayList) term585).add((Object)null);
        ((ArrayList) term585).add((Object)null);
        ArrayList term589 = new ArrayList();
        ((ArrayList) term589).add((Object)null);
        ((ArrayList) term589).add((Object)null);
        ((ArrayList) term589).add((Object)null);
        ((ArrayList) term589).add((Object)null);
        ((ArrayList) term589).add((Object)null);
        ((ArrayList) term589).add((Object)null);
        ArrayList term593 = new ArrayList();
        ((ArrayList) term593).add((Object)null);
        ((ArrayList) term593).add((Object)null);
        ((ArrayList) term593).add((Object)null);
        HashMap term600 = new HashMap();
        Set<Object> term5219 =  ((Map) term600).keySet();
        HashSet term599 = new HashSet((Collection<? extends Object>) term5219);
        ArrayList term606 = new ArrayList();
        ((ArrayList) term606).add((Object)null);
        ((ArrayList) term606).add((Object)null);
        ((ArrayList) term606).add((Object)null);
        ((ArrayList) term606).add((Object)null);
        ((ArrayList) term606).add((Object)null);
        LinkedHashMap term611 = new LinkedHashMap();
        LinkedHashMap term631 = new LinkedHashMap();
        Set<Object> term5230 =  ((Map) term631).keySet();
        LinkedHashSet term630 = new LinkedHashSet((Collection<? extends Object>) term5230);
        term561 = newInstance(Class.forName("org.jsoup.select.Selector"));
        Object term562 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term563 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term610 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object term669 = newInstance(Class.forName("org.jsoup.parser.TokenQueue"));
        setField(term563, term563.getClass(), "tagName", "XqgfKFvPSD");
        setBooleanField(term563, term563.getClass(), "knownTag", true);
        setBooleanField(term563, term563.getClass(), "isBlock", true);
        setBooleanField(term563, term563.getClass(), "formatAsBlock", true);
        setBooleanField(term563, term563.getClass(), "canContainBlock", true);
        setBooleanField(term563, term563.getClass(), "canContainInline", true);
        setBooleanField(term563, term563.getClass(), "optionalClosing", false);
        setBooleanField(term563, term563.getClass(), "empty", false);
        setBooleanField(term563, term563.getClass(), "selfClosing", false);
        setBooleanField(term563, term563.getClass(), "preserveWhitespace", true);
        setField(term563, term563.getClass(), "ancestors", term585);
        setField(term563, term563.getClass(), "excludes", term589);
        setField(term563, term563.getClass(), "ignoreEndTags", term593);
        setBooleanField(term563, term563.getClass(), "directDescendant", false);
        setBooleanField(term563, term563.getClass(), "limitChildren", true);
        setField(term562, term562.getClass(), "tag", term563);
        setField(term562, term562.getClass(), "classNames", term599);
        setField(term562, term562.getClass(), "parentNode", null);
        setField(term562, term562.getClass(), "childNodes", term606);
        setField(term610, term610.getClass(), "attributes", term611);
        setField(term562, term562.getClass(), "attributes", term610);
        setField(term562, term562.getClass(), "baseUri", "ZVecLZMLHF");
        setIntField(term562, term562.getClass(), "siblingIndex", 1725571209);
        setField(term561, term561.getClass(), "root", term562);
        setField(term561, term561.getClass(), "elements", term630);
        setField(term561, term561.getClass(), "query", "HHmNoYxIGj");
        setField(term669, term669.getClass(), "queue", null);
        setIntField(term669, term669.getClass(), "pos", 0);
        setField(term561, term561.getClass(), "tq", term669);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.select.Selector");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "PtirvZmsGt";
        try {
            callMethod(klass, "combinator", argTypes, term561, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


