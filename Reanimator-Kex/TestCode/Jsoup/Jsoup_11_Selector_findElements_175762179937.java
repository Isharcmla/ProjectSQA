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

public class Selector_findElements_175762179937 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term725;

    public Selector_findElements_175762179937() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term749 = new ArrayList();
        ((ArrayList) term749).add((Object)null);
        ArrayList term753 = new ArrayList();
        ((ArrayList) term753).add((Object)null);
        ((ArrayList) term753).add((Object)null);
        ((ArrayList) term753).add((Object)null);
        ArrayList term757 = new ArrayList();
        ((ArrayList) term757).add((Object)null);
        ((ArrayList) term757).add((Object)null);
        ((ArrayList) term757).add((Object)null);
        HashMap term764 = new HashMap();
        Set<Object> term5571 =  ((Map) term764).keySet();
        HashSet term763 = new HashSet((Collection<? extends Object>) term5571);
        ArrayList term770 = new ArrayList();
        ((ArrayList) term770).add((Object)null);
        ((ArrayList) term770).add((Object)null);
        ((ArrayList) term770).add((Object)null);
        ((ArrayList) term770).add((Object)null);
        ((ArrayList) term770).add((Object)null);
        ((ArrayList) term770).add((Object)null);
        LinkedHashMap term775 = new LinkedHashMap();
        LinkedHashMap term795 = new LinkedHashMap();
        Set<Object> term5582 =  ((Map) term795).keySet();
        LinkedHashSet term794 = new LinkedHashSet((Collection<? extends Object>) term5582);
        term725 = newInstance(Class.forName("org.jsoup.select.Selector"));
        Object term726 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term727 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term774 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object term819 = newInstance(Class.forName("org.jsoup.parser.TokenQueue"));
        setField(term727, term727.getClass(), "tagName", "HWkpTmtlrc");
        setBooleanField(term727, term727.getClass(), "knownTag", false);
        setBooleanField(term727, term727.getClass(), "isBlock", false);
        setBooleanField(term727, term727.getClass(), "formatAsBlock", true);
        setBooleanField(term727, term727.getClass(), "canContainBlock", true);
        setBooleanField(term727, term727.getClass(), "canContainInline", true);
        setBooleanField(term727, term727.getClass(), "optionalClosing", false);
        setBooleanField(term727, term727.getClass(), "empty", true);
        setBooleanField(term727, term727.getClass(), "selfClosing", true);
        setBooleanField(term727, term727.getClass(), "preserveWhitespace", true);
        setField(term727, term727.getClass(), "ancestors", term749);
        setField(term727, term727.getClass(), "excludes", term753);
        setField(term727, term727.getClass(), "ignoreEndTags", term757);
        setBooleanField(term727, term727.getClass(), "directDescendant", false);
        setBooleanField(term727, term727.getClass(), "limitChildren", false);
        setField(term726, term726.getClass(), "tag", term727);
        setField(term726, term726.getClass(), "classNames", term763);
        setField(term726, term726.getClass(), "parentNode", null);
        setField(term726, term726.getClass(), "childNodes", term770);
        setField(term774, term774.getClass(), "attributes", term775);
        setField(term726, term726.getClass(), "attributes", term774);
        setField(term726, term726.getClass(), "baseUri", "sQvGcVjdEx");
        setIntField(term726, term726.getClass(), "siblingIndex", 1622346318);
        setField(term725, term725.getClass(), "root", term726);
        setField(term725, term725.getClass(), "elements", term794);
        setField(term725, term725.getClass(), "query", "xtftXXMbem");
        setField(term819, term819.getClass(), "queue", "cudZvLMQon");
        setIntField(term819, term819.getClass(), "pos", -655067527);
        setField(term725, term725.getClass(), "tq", term819);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.select.Selector");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "findElements", argTypes, term725, args);
            assertTrue(false);
        }
        catch (StringIndexOutOfBoundsException e) {
        }

    }

};


