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
import static org.jsoup.nodes.EqualityUtils.*;
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.LinkedHashMap;

public class Element_dataNodes_1579701889109 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1319;
     Object term11921;
     Object term11865;

    public Element_dataNodes_1579701889109() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1341 = new HashMap();
        Set<Object> term11943 =  ((Map) term1341).keySet();
        HashSet term1340 = new HashSet((Collection<? extends Object>) term11943);
        ArrayList term1359 = new ArrayList();
        ((ArrayList) term1359).add((Object)null);
        ((ArrayList) term1359).add((Object)null);
        LinkedHashMap term1364 = new LinkedHashMap();
        term1319 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term1320 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term1363 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term1320, term1320.getClass(), "tagName", "yVMkkQhvmN");
        setBooleanField(term1320, term1320.getClass(), "isBlock", true);
        setBooleanField(term1320, term1320.getClass(), "formatAsBlock", false);
        setBooleanField(term1320, term1320.getClass(), "canContainBlock", false);
        setBooleanField(term1320, term1320.getClass(), "canContainInline", false);
        setBooleanField(term1320, term1320.getClass(), "empty", true);
        setBooleanField(term1320, term1320.getClass(), "selfClosing", true);
        setBooleanField(term1320, term1320.getClass(), "preserveWhitespace", false);
        setField(term1319, term1319.getClass(), "tag", term1320);
        setField(term1319, term1319.getClass(), "classNames", term1340);
        setField(term1319, term1319.getClass(), "parentNode", null);
        setField(term1319, term1319.getClass(), "childNodes", term1359);
        setField(term1363, term1363.getClass(), "attributes", term1364);
        setField(term1319, term1319.getClass(), "attributes", term1363);
        setField(term1319, term1319.getClass(), "baseUri", "MwwjNtdOFT");
        setIntField(term1319, term1319.getClass(), "siblingIndex", 597278769);
        HashMap term11926 = new HashMap();
        Set<Object> term11964 =  ((Map) term11926).keySet();
        HashSet term11925 = new HashSet((Collection<? extends Object>) term11964);
        ArrayList term11927 = new ArrayList();
        ((ArrayList) term11927).add((Object)null);
        ((ArrayList) term11927).add((Object)null);
        LinkedHashMap term11930 = new LinkedHashMap();
        term11921 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term11922 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term11929 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term11922, term11922.getClass(), "tagName", "yVMkkQhvmN");
        setBooleanField(term11922, term11922.getClass(), "isBlock", true);
        setBooleanField(term11922, term11922.getClass(), "formatAsBlock", false);
        setBooleanField(term11922, term11922.getClass(), "canContainBlock", false);
        setBooleanField(term11922, term11922.getClass(), "canContainInline", false);
        setBooleanField(term11922, term11922.getClass(), "empty", true);
        setBooleanField(term11922, term11922.getClass(), "selfClosing", true);
        setBooleanField(term11922, term11922.getClass(), "preserveWhitespace", false);
        setField(term11921, term11921.getClass(), "tag", term11922);
        setField(term11921, term11921.getClass(), "classNames", term11925);
        setField(term11921, term11921.getClass(), "parentNode", null);
        setField(term11921, term11921.getClass(), "childNodes", term11927);
        setField(term11929, term11929.getClass(), "attributes", term11930);
        setField(term11921, term11921.getClass(), "attributes", term11929);
        setField(term11921, term11921.getClass(), "baseUri", "MwwjNtdOFT");
        setIntField(term11921, term11921.getClass(), "siblingIndex", 597278769);
        ArrayList term11866 = new ArrayList();
        term11865 = newInstance(Class.forName("java.util.Collections$UnmodifiableRandomAccessList"));
        setField(term11865, term11865.getClass(), "list", term11866);
        setField(term11865, term11865.getClass(), "c", term11866);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "dataNodes", argTypes, term1319, args);
        assertTrue(recursiveEquals(term1319, term11921));
        assertTrue(recursiveEquals(retValue, term11865));
    }

};


