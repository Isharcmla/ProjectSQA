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

public class Selector_byId_87010500140 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term877;

    public Selector_byId_87010500140() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term901 = new ArrayList();
        ((ArrayList) term901).add((Object)null);
        ((ArrayList) term901).add((Object)null);
        ((ArrayList) term901).add((Object)null);
        ((ArrayList) term901).add((Object)null);
        ((ArrayList) term901).add((Object)null);
        ((ArrayList) term901).add((Object)null);
        ArrayList term905 = new ArrayList();
        ArrayList term909 = new ArrayList();
        ((ArrayList) term909).add((Object)null);
        ((ArrayList) term909).add((Object)null);
        ((ArrayList) term909).add((Object)null);
        ((ArrayList) term909).add((Object)null);
        HashMap term916 = new HashMap();
        Set<Object> term6423 =  ((Map) term916).keySet();
        HashSet term915 = new HashSet((Collection<? extends Object>) term6423);
        ArrayList term922 = new ArrayList();
        ((ArrayList) term922).add((Object)null);
        ((ArrayList) term922).add((Object)null);
        ((ArrayList) term922).add((Object)null);
        ((ArrayList) term922).add((Object)null);
        ((ArrayList) term922).add((Object)null);
        ((ArrayList) term922).add((Object)null);
        ((ArrayList) term922).add((Object)null);
        ((ArrayList) term922).add((Object)null);
        ((ArrayList) term922).add((Object)null);
        LinkedHashMap term927 = new LinkedHashMap();
        LinkedHashMap term947 = new LinkedHashMap();
        Set<Object> term6434 =  ((Map) term947).keySet();
        LinkedHashSet term946 = new LinkedHashSet((Collection<? extends Object>) term6434);
        term877 = newInstance(Class.forName("org.jsoup.select.Selector"));
        Object term878 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term879 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term926 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object term977 = newInstance(Class.forName("org.jsoup.parser.TokenQueue"));
        setField(term879, term879.getClass(), "tagName", "NBrvVzvQHe");
        setBooleanField(term879, term879.getClass(), "knownTag", false);
        setBooleanField(term879, term879.getClass(), "isBlock", false);
        setBooleanField(term879, term879.getClass(), "formatAsBlock", true);
        setBooleanField(term879, term879.getClass(), "canContainBlock", true);
        setBooleanField(term879, term879.getClass(), "canContainInline", false);
        setBooleanField(term879, term879.getClass(), "optionalClosing", true);
        setBooleanField(term879, term879.getClass(), "empty", true);
        setBooleanField(term879, term879.getClass(), "selfClosing", false);
        setBooleanField(term879, term879.getClass(), "preserveWhitespace", false);
        setField(term879, term879.getClass(), "ancestors", term901);
        setField(term879, term879.getClass(), "excludes", term905);
        setField(term879, term879.getClass(), "ignoreEndTags", term909);
        setBooleanField(term879, term879.getClass(), "directDescendant", false);
        setBooleanField(term879, term879.getClass(), "limitChildren", true);
        setField(term878, term878.getClass(), "tag", term879);
        setField(term878, term878.getClass(), "classNames", term915);
        setField(term878, term878.getClass(), "parentNode", null);
        setField(term878, term878.getClass(), "childNodes", term922);
        setField(term926, term926.getClass(), "attributes", term927);
        setField(term878, term878.getClass(), "attributes", term926);
        setField(term878, term878.getClass(), "baseUri", "EKjQdtKxAM");
        setIntField(term878, term878.getClass(), "siblingIndex", -1087774327);
        setField(term877, term877.getClass(), "root", term878);
        setField(term877, term877.getClass(), "elements", term946);
        setField(term877, term877.getClass(), "query", "ZfBIVGBQOE");
        setField(term977, term977.getClass(), "queue", "QSrDQfEsTR");
        setIntField(term977, term977.getClass(), "pos", 679763016);
        setField(term877, term877.getClass(), "tq", term977);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.select.Selector");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "byId", argTypes, term877, args);
            assertTrue(false);
        }
        catch (StringIndexOutOfBoundsException e) {
        }

    }

};


