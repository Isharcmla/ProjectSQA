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

public class Element_parent_836683031102 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term896;
     Object term10675;

    public Element_parent_836683031102() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term920 = new HashMap();
        Set<Object> term10697 =  ((Map) term920).keySet();
        HashSet term919 = new HashSet((Collection<? extends Object>) term10697);
        ArrayList term925 = new ArrayList();
        ((ArrayList) term925).add((Object)null);
        ((ArrayList) term925).add((Object)null);
        LinkedHashMap term930 = new LinkedHashMap();
        term896 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term897 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term929 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term897, term897.getClass(), "tagName", "jUbSRrkrYZ");
        setBooleanField(term897, term897.getClass(), "isBlock", true);
        setBooleanField(term897, term897.getClass(), "formatAsBlock", true);
        setBooleanField(term897, term897.getClass(), "canContainBlock", true);
        setBooleanField(term897, term897.getClass(), "canContainInline", true);
        setBooleanField(term897, term897.getClass(), "empty", false);
        setBooleanField(term897, term897.getClass(), "selfClosing", false);
        setBooleanField(term897, term897.getClass(), "preserveWhitespace", true);
        setBooleanField(term897, term897.getClass(), "formList", true);
        setBooleanField(term897, term897.getClass(), "formSubmit", true);
        setField(term896, term896.getClass(), "tag", term897);
        setField(term896, term896.getClass(), "classNames", term919);
        setField(term896, term896.getClass(), "parentNode", null);
        setField(term896, term896.getClass(), "childNodes", term925);
        setField(term929, term929.getClass(), "attributes", term930);
        setField(term896, term896.getClass(), "attributes", term929);
        setField(term896, term896.getClass(), "baseUri", "PHvxnGHptP");
        setIntField(term896, term896.getClass(), "siblingIndex", 1227103734);
        HashMap term10680 = new HashMap();
        Set<Object> term10718 =  ((Map) term10680).keySet();
        HashSet term10679 = new HashSet((Collection<? extends Object>) term10718);
        ArrayList term10681 = new ArrayList();
        ((ArrayList) term10681).add((Object)null);
        ((ArrayList) term10681).add((Object)null);
        LinkedHashMap term10684 = new LinkedHashMap();
        term10675 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term10676 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term10683 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term10676, term10676.getClass(), "tagName", "jUbSRrkrYZ");
        setBooleanField(term10676, term10676.getClass(), "isBlock", true);
        setBooleanField(term10676, term10676.getClass(), "formatAsBlock", true);
        setBooleanField(term10676, term10676.getClass(), "canContainBlock", true);
        setBooleanField(term10676, term10676.getClass(), "canContainInline", true);
        setBooleanField(term10676, term10676.getClass(), "empty", false);
        setBooleanField(term10676, term10676.getClass(), "selfClosing", false);
        setBooleanField(term10676, term10676.getClass(), "preserveWhitespace", true);
        setBooleanField(term10676, term10676.getClass(), "formList", true);
        setBooleanField(term10676, term10676.getClass(), "formSubmit", true);
        setField(term10675, term10675.getClass(), "tag", term10676);
        setField(term10675, term10675.getClass(), "classNames", term10679);
        setField(term10675, term10675.getClass(), "parentNode", null);
        setField(term10675, term10675.getClass(), "childNodes", term10681);
        setField(term10683, term10683.getClass(), "attributes", term10684);
        setField(term10675, term10675.getClass(), "attributes", term10683);
        setField(term10675, term10675.getClass(), "baseUri", "PHvxnGHptP");
        setIntField(term10675, term10675.getClass(), "siblingIndex", 1227103734);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "parent", argTypes, term896, args);
        assertTrue(recursiveEquals(term896, term10675));
        assertTrue(recursiveEquals(retValue, null));
    }

};


